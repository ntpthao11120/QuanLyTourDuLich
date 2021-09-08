<%-- 
    Document   : index
    Created on : 30 Aug 2021, 14:18:38
    Author     : ntpth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:message code="label.home" />
<h1 class="text-center text-danger">DANH MUC SAN PHAM</h1>
<form action="">
    <div class="row">
        <div class="col-md-11">
            <input class="form-control" type="text" name="kw" placeholder="Nhap tu khoa..."/>
        </div>
        <div class="col-md-1">
            <input type="submit" value="Search" class="btn btn-danger"/>
        </div>
    </div>
</form>
<div>
    <ul class="pagination">
        <c:forEach begin="1" end="${Math.ceil(counter / 2)}" var="i">
            <li class="page-item"><a class="page-link" href="<c:url value="/" />?page=${i}">${i}</a></li>
        </c:forEach>
    </ul>
</div>
<div class="row">
    <c:forEach var="t" items="${tours}">
        <div class="card col-md-4">
            <div class="card-body">
                <c:if test="${t.image != null && t.image.startsWith('https') == true}">
                    <img class="img-fluid" src="<c:url value="${t.image}"/>" alt="${t.name}" />
                </c:if>
                <c:if test="${t.image == null || t.image.startsWith('https') == false}">
                    <img class="img-fluid" src="<c:url value="/images/vinh-ha-long.jpg"/>" alt="${t.name}" />
                </c:if>
                
            </div>
            <div class="card-footer">
                <h3>${t.name}</h3>
                <p>Gia nguoi lon: ${t.adultPrice}VND</p>
                <p>Gia tre em: ${t.childPrice}VND</p>
            </div>
        </div>
    </c:forEach>
</div>