<%-- 
    Document   : error
    Created on : Dec 4, 2021, 10:44:28 AM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exception Handling - Error</title>
    </head>
    <body>
        <h4>The application has malfunctioned.</h4>

        <p> Please contact technical support with the following information:</p>

        <!-- the exception and exceptionStack bean properties
        were created by Struts2's Exception Interceptor (see page 89) -->
        <h4>Exception Name: <s:property value="exception"/></h4>
        <h4>Exception Details: <s:property value="exceptionStack"/></h4>


        <p><a href="index.jsp">Return to the home page.</a></p>
    </body>
</html>
