package com.teleapps.zoomcustomer.model;

public class ResponseMessage<T> {

    private int statusCode;
    private String message;
    private T responseBody;

    
    public ResponseMessage(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
    
    
    public ResponseMessage(int statusCode, String message, T responseBody) {
        this.statusCode = statusCode;
        this.message = message;
        this.responseBody = responseBody;
    }
    

    public int getstatusCode() {
        return statusCode;
    }

    public void setstatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(T responseBody) {
        this.responseBody = responseBody;
    }

    public ResponseMessage() {
    }
}
