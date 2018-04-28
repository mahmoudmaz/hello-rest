package com.maziad.hellorest.model;

public class BasicMessage {
    public BasicMessage() {
    }

    public BasicMessage(String message) {

        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {

        return message;
    }

    String message;

}
