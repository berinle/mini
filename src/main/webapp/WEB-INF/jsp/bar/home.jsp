<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>BAR start page</title></head>
  <body>

  <form action="/mini/bar/placeBid" method="post">
  <table>
  <c:forEach items="${items}" var="item">
      <tr>
          <td><c:out value="${item.name}"/></td>
          <td>
              <input type="checkbox" name="bid"/>
          </td>
      </tr>
  </c:forEach>
      <tr>
          <td colspan="2">
            <input type="submit" value="Submit"/>
          </td>
      </tr>
  </table>
  </form>
  </body>
</html>    