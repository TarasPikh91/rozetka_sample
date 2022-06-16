<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: taras.pikh
  Date: 08.06.2022
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
    <jsp:include page="template/_header.jsp"/>
    <div class="form_block">
        <table>
            <tbody>
                <form:form action="/save_product" method="POST" modelAttribute="product">
                    <tr>
                        <td>Name: <form:input path="name"/></td>
                    </tr>
                    <tr>
                        <td>Price: <form:input path="price"/></td>
                    </tr>
                    <tr>
                        <td>
                            <form:select path="categories">
                                <c:forEach var="category" items="${categories}">
                                    <form:option value="${category.id}">${category.name}</form:option>
                                </c:forEach>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>Image URL: <form:input path="imageUrl"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="Save Product"></td>
                    </tr>
                </form:form>
            </tbody>
        </table>
    </div>
</body>
</html>
