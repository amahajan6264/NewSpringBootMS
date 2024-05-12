<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <h1><spring:message code="welcome.message"/></h1>
    <form action="submitForm" method="post">
        <input type="submit" value="<spring:message code="button.submit"/>" />
        <input type="button" value="<spring:message code="button.cancel"/>" />
    </form>
</body>
</html>
	