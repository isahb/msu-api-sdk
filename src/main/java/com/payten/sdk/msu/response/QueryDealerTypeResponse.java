package com.payten.sdk.msu.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.DealerType;

public class QueryDealerTypeResponse extends ApiResponse {
	@JsonProperty(value = "dealerTypeList")
	@XmlElementWrapper(name = "dealerTypeList")
	@XmlElement(name = "dealerType")
	private List<DealerType> dealerTypes;

	public List<DealerType> getDealerTypes() {
		return dealerTypes;
	}
}