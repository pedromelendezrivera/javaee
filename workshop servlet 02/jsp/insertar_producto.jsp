<%-- 
    Document   : inserta_producto
    Created on : 22/05/2018, 08:42:54 AM
    Author     : ADSI1324116
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
          <form name="form1" action="ControladorProducto" method="get">
            <input type="hidden" name="instruccion" value="insertarProducto">    
           <h3>Insertar Registros</h3>
            <table width="369" border="1">
              <tr>
                <td width="142">Codigo Artículo</td>
                <td width="211"><input type="text" name="cArt" id="cArt" /></td>
              </tr>
              <tr>
                <td>Sección</td>
                <td><input type="text" name="seccion" id="seccion" /></td>
              </tr>
              <tr>
                <td>Nombre Artículo</td>
                <td><input type="text" name="nArt" id="nArt" /></td>
              </tr>
              <tr>
                <td>Fecha</td>
                <td><input type="text" name="fecha" id="fecha" /></td>
              </tr>
              <tr>
                <td>Precio</td>
                <td><input type="text" name="precio" id="precio" /></td>
              </tr>
              <tr>
                <td>Importado</td>
                <td><input type="text" name="importado" id="importado" /></td>
              </tr>
              <tr>
                <td>Pais Origen</td>
                <td><input type="text" name="pOrig" id="pOrig" /></td>
              </tr>
              <tr>
                <td><input type="submit" name="Enviar" id="Enviar" value="Enviar" /></td>
                <td><input type="reset" name="borrar" id="borrar" value="Limpiar" /></td>
              </tr>
         </table>
      </form>
        
    </body>
</html>
