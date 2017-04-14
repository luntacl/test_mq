package com.ulic.core.batchhandler;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.ulic.common.util.OkHttpUtil;
import com.ulic.core.batch.disruptor.SimplyDisruptorBatch;
import com.ulic.core.config.service.ConfigSystemService;
import com.ulic.core.proposal.bean.Proposal;
import com.ulic.core.proposal.service.ProposalService;
import com.ulic.core.sms.bean.SmsTemplate;
import com.ulic.core.sms.service.SmsTemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liutao on 2017/4/13.
 */
@Slf4j
@Component
public class SmsBatchHandler extends SimplyDisruptorBatch<String> {
    @Autowired
    private ProposalService proposalService;

    @Resource(name = "configSystemServiceImpl")
    private ConfigSystemService configSystemService;

    @Resource(name = "smsTemplateServiceImpl")
    private SmsTemplateService templateService;
    @Autowired
    private OkHttpUtil httpUtil;

    @Override
    public void handle(String value) {
        this.sendMessage(value);
    }

    /**
     * TODO 此方法有待完善
     * @param policyno
     */
    private void sendMessage(String policyno) {
        Proposal proposal = proposalService.findPhoneByProposalFromId(policyno);
        if (proposal != null) {
            String phone = proposal.getHolderPhone();
            String appName = proposal.getHolderName();
            if (!Strings.isNullOrEmpty(phone)) {
                Map<String, Object> mapData = new HashMap<>();
                SmsTemplate smsTemplate = templateService.findByTemplateId("001");//TODO tmplateId 后期方式后期定方案
                String message = smsTemplate.getSmsTemplateContent();
                message = message.replaceAll("policyno", policyno);
                message = message.replaceAll("appName", appName);
                mapData.put("noticeTypeID", "200006");
                mapData.put("contxt", message);
                mapData.put("sourceCode", "C");
                mapData.put("immediatelySendFlag", "Y");
                mapData.put("others", "others");
                mapData.put("mobile", phone);
                String SMSserviceUrl = configSystemService.getValueByKey("sms", "url");
                String jsonData = JSON.toJSONString(mapData);
                try {
                    httpUtil.post(SMSserviceUrl, jsonData);
                } catch (IOException e) {
                    log.debug("发送短信失败：{}",jsonData);
                }
            }
        }
    }

}
