<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/19/2025
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>User Form</h2>
<form:form modelAttribute="user" method="post">
    <p>Name: <form:input path="name"/> <form:errors path="name" cssClass="error"/></p>
    <p>Email: <form:input path="email"/> <form:errors path="email" cssClass="error"/></p>
    <p>Phone: <form:input path="phone"/> <form:errors path="phone" cssClass="error"/></p>
    <p>Password: <form:password path="password"/> <form:errors path="password" cssClass="error"/></p>
    <p>Status:
        <form:radiobutton path="status" value="true"/> True
        <form:radiobutton path="status" value="false"/> False
        <form:errors path="status" cssClass="error"/>
    </p>
    <p><input type="submit" value="Submit"/></p>
</form:form>
</body>
</html>
