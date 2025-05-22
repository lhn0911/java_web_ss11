<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/19/2025
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Thông tin người dùng đã nhập:</h2>

<p><strong>Tên:</strong> ${user.name}</p>
<p><strong>Email:</strong> ${user.email}</p>
<p><strong>Số điện thoại:</strong> ${user.phone}</p>
<p><strong>Mật khẩu:</strong> ${user.password}</p>
<p><strong>Trạng thái:</strong>${user.status}</p>
</body>
</html>
