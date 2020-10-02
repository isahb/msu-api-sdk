package com.payten.msu.sdk.response.model;


import com.payten.msu.sdk.request.enumerated.Status;

public class PaymentSystemRule {
	private String ruleCode;
	private String ruleScope;
	private Status status;
	private String paymentSystemList;

	public String getRuleCode() {
		return ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}
	
	public String getRuleScope() {
		return ruleScope;
	}

	public void setRuleScope(String ruleScope) {
		this.ruleScope = ruleScope;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getPaymentSystemList() {
		return paymentSystemList;
	}

	public void setPaymentSystemList(String paymentSystemList) {
		this.paymentSystemList = paymentSystemList;
	}

	public PaymentSystemRule() {}
}