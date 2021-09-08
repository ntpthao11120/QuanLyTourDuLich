<%-- 
    Document   : header
    Created on : 29 Aug 2021, 13:58:55
    Author     : ntpth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="/">Trang chủ</a>
        </li>
        <c:forEach var="cat" items="${categories}">
            <li class="nav-item active">
                <a class="nav-link" href="/">${cat.name}</a>
            </li>
        </c:forEach>
        <li class="nav-item active">
            <a class="nav-link" href="<c:url value="/cart" />">GIO HANG</a>
        </li>
        <c:if test="${pageContext.request.userPrincipal.name == null}">
            <li class="nav-item active">
                <a class="nav-link text-danger" href="<c:url value="/login" />">DANG NHAP</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link text-danger" href="<c:url value="/register" />">DANG KY</a>
            </li>
        </c:if>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <li class="nav-item active">
                <a class="nav-link text-danger" href="<c:url value="/" />">${pageContext.request.userPrincipal.name}</a>
            </li>
            
        </c:if>
        
    </ul>
</nav>

