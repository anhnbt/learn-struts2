<%-- 
    Document   : thankyou
    Created on : Dec 4, 2021, 7:07:52 AM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Successful</title>
    </head>
    <body>
        <h1><s:text name="thankyou"></s:text>.</h1>
        <p>Your registration information: <s:property value="personBean" /></p>
        <p><a href="<s:url action='index' />">Return to home page</a>.</p>
    </body>
</html>
