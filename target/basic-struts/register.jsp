<%-- 
    Document   : register
    Created on : Dec 4, 2021, 6:58:30 AM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register for a prize by completing this form.</h1>
        <s:if test="hasFieldErrors() || hasActionErrors() || hasActionMessages()">
            <s:fielderror/>
            <s:actionerror/>
            <s:actionmessage/>
        </s:if>
        <s:form action="register">
            <s:textfield name="personBean.firstName" key="personBean.firstName"></s:textfield>
            <s:textfield name="personBean.lastName" key="personBean.lastName"></s:textfield>
            <s:textfield name="personBean.email" key="personBean.email"></s:textfield>
            <s:textfield name="personBean.age" key="personBean.age"></s:textfield>
            <s:submit/>
        </s:form>
    </body>
</html>
