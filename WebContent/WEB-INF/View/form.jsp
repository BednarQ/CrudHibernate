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

<form name="list" action="list" method="get">
	Ocena<br>
    <select name="ocena">
    <option value="100" SELECTED>100</option>
    <option value="101">101</option>
    <option value="102">102</option>
    <option value="103">103</option>
    <option value="104">104</option>
    <option value="105">105</option>
    <option value="106">106</option>
</select><br>
    Miasto<br>
    <input name="city" type="text"/><br><br>
    <input type="submit" value="Submit">
<form>

</body>
</html>