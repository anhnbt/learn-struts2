<%-- 
    Document   : index
    Created on : Dec 3, 2021, 4:37:59 PM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome to Struts 2!</h1>
        <p><a href="<s:url action='hello' />">Hello World</a></p>
        
        <s:url action="hello" var="helloLink">
            <s:param name="userName">AnhNBT</s:param>
        </s:url>
            
        <p><a href="${helloLink}">Hello AnhNBT</a></p>
        
        <s:url action="registerInput" var="registerInputLink" />
        <p><s:a href="%{registerInputLink}">Please register</s:a> for our prize drawing.</p>
        
        <s:url action="registerInput" var="registerInputLinkVI">
            <s:param name="request_locale">vi</s:param>
        </s:url>
        <p><s:a href="%{registerInputLinkVI}">Vui lòng đăng ký</s:a> để rút thăm trúng thưởng.</p>
        
        <s:form action="hello">
            <s:textfield name="userName" label="Your name" />
            <s:submit value="Submit" />
        </s:form>
        <p>
            <s:if test="'foo' in {'foo','bar'}">
                muhahaha
            </s:if>
            <s:else>
                boo
            </s:else>
        </p>
        <p>
            <s:if test="'foo' not in {'foo','bar'}">
                muhahaha
            </s:if>
            <s:else>
                boo
            </s:else>
        </p>
        <hr />
        <s:text name="contact" />
    </body>
</html>
