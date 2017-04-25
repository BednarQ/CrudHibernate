<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
	<title>List of Locals</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
		<h2>Local lists</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
		<table>
		<col width="130">
 		
			<tr>
				<th>Nazwa</th>
				<th>Numer Telefonu</th>
				<th>Email</th>
				<th>Ulica</th>
				<th>Miasto</th>
				<th>OcenaID</th>
				<th>Ocena</th>
			</tr>
			<c:forEach var="tempLocal" items="${locals}">
			
				<tr>
					<td>${tempLocal.name }</td>
					<td>${tempLocal.phone_number }</td>
					<td>${tempLocal.email }</td>
					<td>${tempLocal.street }</td>
					<td>${tempLocal.city }</td>
					<td>${tempLocal.idRating}</td>
					<td>${tempLocal.rating}</td>
					
				</tr>
			</c:forEach>
		</table>
		
		</div>
	</div>
</body>
</html>