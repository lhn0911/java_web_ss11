<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/23/2025
  Time: 12:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Đăng Ký</h2>

<form:form method="POST" modelAttribute="user">
    <div>
        <form:label path="name">Tên:</form:label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </div>

    <div>
        <form:label path="email">Email:</form:label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </div>

    <div>
        <form:label path="password">Mật khẩu:</form:label>
        <form:password path="password"/>
        <form:errors path="password" cssClass="error"/>
    </div>

    <div>
        <button type="submit">Đăng ký</button>
    </div>
</form:form>
</body>
</html>
