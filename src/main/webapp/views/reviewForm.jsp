<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/23/2025
  Time: 3:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Đánh Giá Sản Phẩm</h2>
<form:form modelAttribute="reviewDto" method="post">
    <label>Tên:</label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/><br/>

    <label>Email:</label>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/><br/>

    <label>Đánh giá (1-5 sao):</label>
    <form:input path="rating" type="number" min="1" max="5"/>
    <form:errors path="rating" cssClass="error"/><br/>

    <label>Bình luận:</label><br/>
    <form:textarea path="comment" rows="4" cols="40"/>
    <form:errors path="comment" cssClass="error"/><br/>

    <input type="submit" value="Gửi đánh giá"/>
</form:form>
</body>
</html>
