<%--
  Created by IntelliJ IDEA.
  User: berinle
  Date: Sep 19, 2010
  Time: 9:26:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Proof of Concept</title></head>
  <body>

  <!--
  <form action="<%= request.getContextPath()%>/servlet/unknown" method="post">
    <table>
        <tr>
            <td>Pick auction: </td>
            <td>
                <select name="auction_type">
                    <option value="-1">-Pick auction-</option>
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
   -->
  
   <form name="f" action="<%=request.getContextPath()%>/mini/unknown" method="post">
      <table>
        <tr>
            <td colspan="2">Spring Integration</td>
        </tr>
        <tr>
            <td><a href="/mini/foo/home">Foo Home</a></td> <br>
            <td><a href="/mini/bar/home">Bar Home</a></td>
        </tr>


        <tr>
           <td>Pick auction type: </td>
            <td>
                <select name="auction_type">
                    <option value="-1">-Pick auction-</option>
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