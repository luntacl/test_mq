package com.ulic.core.config.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class ConfigTemplate implements Serializable {

	private String templateId;

    private String templateType;

    private String templateContent;

    private String remark;

    private String creator;

    private Date createdTime;
    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;
   
}