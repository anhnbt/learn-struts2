/*
 * Copyright 2021 by AnhNBT
 */
package vn.aptech.exceptions;

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class SecurityBreachException extends Exception {

    public SecurityBreachException() {
        super("Security Exception");
    }

    public SecurityBreachException(String message) {
        super(message);
    }

}
