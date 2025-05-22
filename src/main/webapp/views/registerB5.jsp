<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/23/2025
  Time: 2:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Đăng Ký</h2>
<form:form modelAttribute="userDto" method="post">
    <label>Tên:</label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/><br/>

    <label>Email:</label>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/><br/>

    <label>Số điện thoại:</label>
    <form:input path="phone"/>
    <form:errors path="phone" cssClass="error"/><br/>

    <label>Mật khẩu:</label>
    <form:password path="password"/>
    <form:errors path="password" cssClass="error"/><br/>

    <label>Vai trò:</label>
    <form:select path="role">
        <form:option value="">--Chọn vai trò--</form:option>
        <form:option value="user">Người dùng</form:option>
        <form:option value="admin">Quản trị viên</form:option>
    </form:select>
    <form:errors path="role" cssClass="error"/><br/>

    <label>Mã xác thực (chỉ admin):</label>
    <form:input path="adminCode"/>
    <form:errors path="adminCode" cssClass="error"/><br/>

    <input type="submit" value="Đăng ký"/>
</form:form>
</body>
</html>
