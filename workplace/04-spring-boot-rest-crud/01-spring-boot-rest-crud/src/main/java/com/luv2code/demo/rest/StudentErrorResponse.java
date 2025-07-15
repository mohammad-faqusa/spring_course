package com.luv2code.demo.rest;

public class StudentErrorResponse {
    
    private int status; 
    private String message;
    private long stamp;

    public StudentErrorResponse() {}

    public StudentErrorResponse(int status, String message, long stamp) {
        this.status = status;
        this.message = message;
        this.stamp = stamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getStamp() {
        return stamp;
    }

    public void setStamp(long stamp) {
        this.stamp = stamp;
    }
}
