<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: taras.pikh
  Date: 16.06.2022
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Category</title>
</head>
<body>
<jsp:include page="template/_header.jsp"/>
<div class="form_block">
  <table>
    <thead>
      <tr><th>Create Category</th></tr>
    </thead>
    <tbody>
    <form:form action="/save_category" method="POST" modelAttribute="category">
      <tr>
        <td>Name: <form:input path="name"/></td>
      </tr>
      <tr>
        <td><input type="submit" name="Save Category"></td>
      </tr>
    </form:form>
    </tbody>
  </table>
</div>
</body>
</html>
