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
<h1><c:out value="Spring Boot Demo!!"/></h1>
<b>Today Date is : </b><c:out value="${today}"></c:out> <br/>
<c:forEach var="count" begin="1" end="10" step="2">
	<b>Hello World..<c:out value="${count}" /></b><br/>
</c:forEach>

<c:set var="income" scope="application" value="${4000*2}"/>  
<c:out value="${income}"/>  
</body>
</html>