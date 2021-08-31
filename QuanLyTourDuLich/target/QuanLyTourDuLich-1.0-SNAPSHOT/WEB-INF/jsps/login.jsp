<%-- 
    Document   : login
    Created on : 30 Aug 2021, 13:52:33
    Author     : ntpth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center text-danger"> DANG NHAP </h1>
<c:if test="${param.error != null}">
    <div class="alert alert-danger">
        Da co loi xay ra. Vui long quay lai sau
    </div>
</c:if>
<c:url value="/login" var="action" />
<form method="post" action="${action}">
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="username" name="password" class="form-control"/>
    </div>
    <div class="form-group">
        <input type="submit" value="DANG NHAP" class="btn btn-danger" />
    </div>
</form>
