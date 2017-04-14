package com.ulic.core.config.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data
public class ConfigSystem implements Serializable {
	/**
     * 配置编号
     */
    @Id
    @Column(name = "config_system_id")
    private Long configSystemId;

    /**
     * 配置项分类，系统：sys,第三方：third ,功能是否启用：feature,对外提供的服务：service
     */
    @Column(name = "config_system_category")
    private String configSystemCategory;

    /**
     * 配置项模块
     */
    @Column(name = "config_system_section")
    private String configSystemSection;

    /**
     * 配置key
     */
    @Column(name = "config_system_key")
    private String configSystemKey;

    /**
     * 配置值
     */
    @Column(name = "config_system_value")
    private String configSystemValue;

    /**
     * 备注
     */
    @Column(name = "config_system_remark")
    private String configSystemRemark;

    /**
     * 是否只读，0：可以修改，1：只读
     */
    @Column(name = "config_system_readonly")
    private Integer configSystemReadonly;

    /**
     * 版本管理
     */
    private Integer version;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 修改人
     */
    private String editor;

    /**
     * 修改时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;

}