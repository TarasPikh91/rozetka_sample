<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: taras.pikh
  Date: 08.06.2022
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rozetka Sample</title>
</head>
<body>
    <jsp:include page="template/_header.jsp"/>
    <div class="main-page">
        <table>
            <tbody>
            <tr>
                <td class="filter_block"></td>
                <td class="products_block">
                    <c:forEach var="product" items="${products}">
                        <div class="product_item">
                            <img src="${product.imageUrl}"/>
                            <span>${product.name}</span>
                            <span>${product.price}</span>
                        </div>
                    </c:forEach>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
