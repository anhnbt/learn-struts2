/*
 * Copyright 2021 by AnhNBT
 */
package vn.aptech.model;

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Hello Struts User";
    }

    public MessageStore(String message) {
        this.message = message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message + " (from toString)";
    }
}
