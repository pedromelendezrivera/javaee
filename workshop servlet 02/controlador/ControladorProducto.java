

 <!--LINK´PARA CADA PRODUCTO CON SU CAMPO CLAVE actualizar -->   
         <c:url var="linkTemp" value="ControladorProducto">
             <c:param name="instruccion" value="cargar"></c:param>    
             <c:param name="CArticulo" value="${tempProd.cArt}"></c:param>                 
         </c:url>  
   
        <!--LINK´PARA CADA PRODUCTO CON SU CAMPO CLAVE eliminar -->   
         <c:url var="linkTempEliminar" value="ControladorProducto">
             <c:param name="instruccion" value="eliminarProducto"></c:param>    
             <c:param name="CArticulo" value="${tempProd.cArt}"></c:param>                 
         </c:url>           
         
                     
