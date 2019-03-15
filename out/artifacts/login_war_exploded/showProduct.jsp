<%--
  Created by IntelliJ IDEA.
  User: Tomas
  Date: 3/15/2019
  Time: 2:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--  <%@ page import="bean.Product" %>  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Show Products</title>
</head>
<body>
<table>
    <tr>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Product Description</th>
        <th>Product Price</th>
    </tr>
    <c:forEach items="${products}" var="product">
       <tr>
          <td><c:out value="${product.id}"/></td>
           <td><c:out value="${product.name}"/></td>
           <td><c:out value="${product.desc}"/></td>
           <td><c:out value="${product.price}"/></td>
       </tr>
    </c:forEach>
</table>
</body>
</html>
