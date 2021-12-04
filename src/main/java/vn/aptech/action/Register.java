/*
 * Copyright 2021 by AnhNBT
 */
package vn.aptech.action;

import com.opensymphony.xwork2.ActionSupport;
import vn.aptech.exceptions.SecurityBreachException;
import vn.aptech.model.Person;

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class Register extends ActionSupport {

    private Person personBean;

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }

    @Override
    public void validate() {
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }

        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older.");
        }
    }

    public void throwException() throws Exception {

        throw new Exception("Exception thrown from throwException");

    }

    public void throwNullPointerException() throws NullPointerException {

        throw new NullPointerException("Null Pointer Exception thrown from "
                + Register.class.toString());
    }

    public void throwSecurityException() throws SecurityBreachException {

        throw new SecurityBreachException(
                "Security breach exception thrown from throwSecurityException");
    }

    /**
     * @return the personBean
     */
    public Person getPersonBean() {
        return personBean;
    }

    /**
     * @param person the personBean to set
     */
    public void setPersonBean(Person person) {
        personBean = person;
    }

}
