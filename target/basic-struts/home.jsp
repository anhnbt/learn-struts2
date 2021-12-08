<%-- 
    Document   : home
    Created on : Dec 4, 2021, 3:18:10 PM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello, ${username}!</h1>
        <table border="1">
            <s:iterator value="users">
                <tr>
                    <td><s:property value="id" /></td>
                    <td><s:property value="username" /></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
