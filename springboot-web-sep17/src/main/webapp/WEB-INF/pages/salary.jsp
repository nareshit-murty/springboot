<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Salary Demo</h1>
	<b>Application Salary : </b>
	<c:out value="${applicationScope.salary}" />
	<br />
	<b>Session Salary : </b>
	<c:out value="${sessionScope.salary}" />
	<br />

	<c:if test="${sessionScope.salary >= 2000}">
		<b>My salary is:</b>
		<c:out value="${salary}" />
	</c:if>


	<c:catch var="abc">
		<%
		int x = 5 / 0;
		%>
	</c:catch>

	<c:if test="${abc != null}">
		<p>
			The exception is : ${abc} <br /> There is an exception:
			${abc.message}
		</p>
	</c:if>

	<c:choose>
		<c:when test="${sessionScope.salary <= 0}">
            Salary is very low to survive.
         </c:when>
		<c:when test="${sessionScope.salary > 1000}">
            Salary is very good.
         </c:when>
		<c:otherwise>
            No comment sir...
         </c:otherwise>
	</c:choose>
	<br/>
	 <c:forTokens items = "Zara#nuha#roshy,Murty" delims = "#" var = "name">
         <c:out value = "${name}"/><p>
      </c:forTokens>
      
      <c:import var="data" url="https://www.google.com/"/>
      <c:out value="${data}" />
</body>
</html>