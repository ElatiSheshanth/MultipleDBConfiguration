package com.app.entity.common;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "SubscriptionPlans")
public class SubscriptionPlans {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "plan_id", unique = true, nullable = false)
	private Long planId;

	@ApiModelProperty(required = true)
	@Column(name = "plan_name", length = 255)
	private String planName;

	@ApiModelProperty(required = true)
	@Column(name = "plan_description", length = 255)
	private String planDescription;

	@ApiModelProperty(required = true, notes = "allowed values 7,14,30,60,90", position=1)
	@Column(name = "validity_in_days")
	private Integer validityInDays;

	@ApiModelProperty(required = true)
	@Column(name = "plan_charges", length = 6, precision = 2)
	private BigDecimal planCharges;

	@ApiModelProperty(required = true, allowableValues = "INR,USD")
	@Column(name = "plan_currency", length = 3)
	private String planCurrency;

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}

	public Integer getValidityInDays() {
		return validityInDays;
	}

	public void setValidityInDays(Integer validityInDays) {
		this.validityInDays = validityInDays;
	}

	public BigDecimal getPlanCharges() {
		return planCharges;
	}

	public void setPlanCharges(BigDecimal planCharges) {
		this.planCharges = planCharges;
	}

	public String getPlanCurrency() {
		return planCurrency;
	}

	public void setPlanCurrency(String planCurrency) {
		this.planCurrency = planCurrency;
	}

}
