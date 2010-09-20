<%--
  Created by IntelliJ IDEA.
  User: berinle
  Date: Sep 19, 2010
  Time: 9:26:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Simple jsp page</title></head>
  <body>
  <form action="<%= request.getContextPath()%>/servlet/foo" method="post">
    <table>
        <tr>
            <td>Pick auction: </td>
            <td>
                <select name="auction_type">
                    <option value="smr">SMR</option>
                    <option value="reverse">Reverse</option>
                </select>
            </td>
            <td>
                <input type="submit" value="Go >>"/>
            </td>
        </tr>
    </table>
    </form>
  </body>
</html>