package com.ulic.core.config.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ConfigBusiness implements Serializable {

	private String businessType;

	private String businessValue;

	private String remark;

	private Integer version;

	private String creator;

	private Date createdTime;

	private String editor;

	private Date updatedTime;

	private static final long serialVersionUID = 1L;

}