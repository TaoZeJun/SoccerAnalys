package com.kuangquanshui.soccer.rpc.model;

import java.io.Serializable;

public class MessageReponse implements Serializable {
    private String messageId ;
    private int reponseCode;
    private  String errorMessage;
    private Object resultDesc;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public int getReponseCode() {
        return reponseCode;
    }

    public void setReponseCode(int reponseCode) {
        this.reponseCode = reponseCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(Object resultDesc) {
        this.resultDesc = resultDesc;
    }
}
