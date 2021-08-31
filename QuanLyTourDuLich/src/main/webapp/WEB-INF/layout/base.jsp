<%-- 
    Document   : base
    Created on : 29 Aug 2021, 14:01:37
    Author     : ntpth
--%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
        <title><tiles:insertAttribute name="title" /></title>
    </head>
    <body>
        <tiles:insertAttribute name="header" /> 
        <tiles:insertAttribute name="content" /> 
        <tiles:insertAttribute name="footer" />
    </body>
</html>
