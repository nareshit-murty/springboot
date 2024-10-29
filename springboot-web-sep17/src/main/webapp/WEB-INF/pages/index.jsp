<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL Demo!!!</h1>
<c:set var="salary" scope="application" value="${1000}"/>
<c:set var="salary" scope="session" value="${2000}"/>
<b>Application Salary : </b><c:out value="${applicationScope.salary}"/><br/>
<b>Session Salary : </b><c:out value="${sessionScope.salary}"/><br/>
<a href="showValues">Show values</a>
</body>
</html>