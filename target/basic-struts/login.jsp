<%-- 
    Document   : login
    Created on : Dec 4, 2021, 10:44:12 AM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <p>Please login</p>
        <s:actionerror/>
        <s:form action="login">
            <s:textfield name="username" label="Your username"></s:textfield>
            <s:password name="password" label="Your password"></s:password>
            <s:submit/>
        </s:form>

        <p><a href="index.jsp">Return to the home page.</a></p>
        <hr>
        <s:debug/>
    </body>
</html>
