<%-- 
    Document   : listaProductosv4
    Created on : 14/05/2018, 03:27:34 PM
    Author     : PMELENDEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/hojaestilo.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <table width="200" border="0">
        <tr>
          <td>CODIGO</td>
          <td>SECCION</td>
          <td>NOMBRE</td>
          <td>FECHA</td>
          <td>PRECION</td>
          <td>IMPORTADO</td>
          <td>PAIS ORIGEN</td>
        </tr>
        <c:forEach var="tempProd" items="${LISTAPRODUCTOS}">       
         <tr>
            <td>${tempProd.cArt}</td>
            <td>${tempProd.seccion}</td>
            <td>${tempProd.nArt}</td>
            <td>${tempProd.fecha}</td>
            <td>${tempProd.precio}</td>
            <td>${tempProd.importado}</td>
            <td>${tempProd.pOrg}</td>
         </tr>
         </c:forEach>
      </table>
        <div id="contenedorBoton">
            <input type="button" value="Insertar registro" onclick="window.location.href='inserta_producto.jsp'"/>         
        </div>  
    </body>
</html>
