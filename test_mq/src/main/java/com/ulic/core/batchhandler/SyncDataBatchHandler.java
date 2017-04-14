package com.ulic.core.batchhandler;

import com.ulic.core.batch.disruptor.SimplyDisruptorBatch;
import org.springframework.stereotype.Component;

/**
 * Created by liutao on 2017/4/13.
 */
@Component
public class SyncDataBatchHandler extends SimplyDisruptorBatch<String> {

    @Override
    public void handle(String value) {
        syncDataToCore(value);
    }

    private void syncDataToCore(String value) {

    }
}
