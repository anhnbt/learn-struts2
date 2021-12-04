<%-- 
    Document   : HelloWorld
    Created on : Dec 3, 2021, 6:11:47 PM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World!</title>
    </head>
    <body>
        <h1><s:text name="greeting" /></h1>
        <h2><s:property value="messageStore.message" /></h2>
        <p>I've said hello <s:property value="helloCount" /> times!</p>
        <p><s:property value="messageStore" /></p>
        <p><a href="<s:url action='index' />">Home Page</a></p>
    </body>
</html>
