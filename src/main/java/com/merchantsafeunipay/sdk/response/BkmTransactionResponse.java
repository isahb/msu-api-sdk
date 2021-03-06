package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BkmTransactionResponse extends ApiResponse {
    private String bkmToken;

    public String getBkmToken() {
        return bkmToken;
    }

    public void setBkmToken(String bkmToken) {
        this.bkmToken = bkmToken;
    }
}