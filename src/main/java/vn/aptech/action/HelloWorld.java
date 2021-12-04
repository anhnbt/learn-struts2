/*
 * Copyright 2021 by AnhNBT
 */
package vn.aptech.action;

import com.opensymphony.xwork2.ActionSupport;
import vn.aptech.model.MessageStore;

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class HelloWorld extends ActionSupport {

    private MessageStore messageStore;
    private String userName;
    private static int helloCount = 0;

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();
        if (userName != null) {
            messageStore.setMessage(messageStore.getMessage() + " " + userName);
        }
        helloCount++;

        return SUCCESS;
    }

    @Override
    public void validate() {
        super.validate(); //To change body of generated methods, choose Tools | Templates.
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the helloCount
     */
    public int getHelloCount() {
        return helloCount;
    }

    /**
     * @param helloCount the helloCount to set
     */
    public void setHelloCount(int helloCount) {
        this.helloCount = helloCount;
    }

}
