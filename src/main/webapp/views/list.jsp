<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/23/2025
  Time: 5:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách danh mục sản phẩm</h2>

<a href="${pageContext.request.contextPath}/categories/add">Thêm danh mục mới</a>
<br/><br/>

<table border="1" cellpadding="8" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Tên danh mục</th>
        <th>Trạng thái</th>
        <th>Hành động</th>
    </tr>
    <c:forEach var="category" items="${categories}">
        <tr>
            <td>${category.id}</td>
            <td>${category.categoryName}</td>
            <td><c:choose>
                <c:when test="${category.status}">Hoạt động</c:when>
                <c:otherwise>Không hoạt động</c:otherwise>
            </c:choose></td>
            <td>
                <!-- Để sau nếu có chức năng sửa/xóa -->
                <a href="#">Sửa</a> |
                <a href="#">Xóa</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
