<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="jakarta.tags.sql"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="dataSource" driver="com.mysql.cj.jdbc.Driver"
		user="root" password="techno"
		url="jdbc:mysql://localhost/nareshit-2pm" />
	<sql:query  dataSource="${dataSource}" var="rs">
		select * from employee
	</sql:query>
	<table>
	
	<c:forEach items="${rs.rows}" var="row">
		<tr>
			<td><c:out value="${row.id}" /></td>
			<td><c:out value="${row.name}" /></td>
			<td><c:out value="${row.address}" /></td>
			<td><c:out value="${row.salary}" /></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>