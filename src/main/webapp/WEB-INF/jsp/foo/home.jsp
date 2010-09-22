<%--
  Created by IntelliJ IDEA.
  User: berinle
  Date: Sep 19, 2010
  Time: 8:32:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
  <head><title>FOO start page</title></head>
  <body>

  <form action="/mini/foo/placeBid" method="post">
  <table>
  <c:forEach items="${items}" var="item">
      <tr>
          <td><c:out value="${item.name}"/></td>
          <td>
              <select name="price">
                  <option value=""></option>
                  <option value=""><c:out value="${item.price}"/></option>
                  <option value=""><c:out value="${item.price+10}"/></option>
                  <option value=""><c:out value="${item.price+20}"/></option>
                  <option value=""><c:out value="${item.price+30}"/></option>
              </select>
          </td>
      </tr>

  </c:forEach>
      <tr>
          <td colspan="2">
            <input type="submit" value="Place Bid >>"/>
          </td>
      </tr>
  </table>
  </form>
  </body>
</html>    