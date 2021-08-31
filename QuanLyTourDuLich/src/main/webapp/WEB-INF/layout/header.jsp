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
            <a class="nav-link" href="#">Trang chủ</a>
        </li>
        <c:if test="${pageContext.request.userPrincipal.name == null}">
           <li class="nav-item active">
                <a class="nav-link text-danger" href="<c:url value="/login"/>">Dang nhap</a>
            </li> 
            <li class="nav-item active">
                <a class="nav-link text-danger" href="<c:url value="/register"/>">Dang ky</a>
            </li>
        </c:if>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <li class="nav-item active">
                <a class="nav-link text-danger" href="<c:url value="/login"/>">${pageContext.request.userPrincipal.name}</a>
            </li> 
        </c:if>
    </ul>
</nav>

