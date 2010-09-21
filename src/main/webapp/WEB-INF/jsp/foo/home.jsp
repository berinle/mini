<%--
  Created by IntelliJ IDEA.
  User: berinle
  Date: Sep 19, 2010
  Time: 8:32:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
  <head><title>FOO start page</title></head>
  <body>

  <table>
  <c:forEach items="${items}" var="item">
      <tr>
          <td><c:out value="${item.name}"/></td>
          <td>
              <select name="price">
                  <option value=""></option>
                  <option value=""></option>
                  <option value=""></option>
                  <option value=""></option>
              </select>
          </td>
      </tr>

  </c:forEach>
  </table>
  </body>
</html>    