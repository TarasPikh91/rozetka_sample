<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: taras.pikh
  Date: 16.06.2022
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
</head>
<body>
    <jsp:include page="template/_header.jsp"/>
    <div>
        <table>
            <thead><tr><th>Categories</th></tr></thead>
            <tbody>
                <c:forEach var="category" items="${categories}">
                    <tr>
                        <td>Category Name: ${category.name}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div><a href="/add_category">Add Category</a></div>
    </div>
</body>
</html>
