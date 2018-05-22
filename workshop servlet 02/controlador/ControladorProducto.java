

      //leer el CArticulo que viene del listado
            String codigoArticulo = request.getParameter("CArticulo");
           
            //enviar CArticulo al modelo
             Productos elProducto = modeloProductos.getProducto(codigoArticulo);
     //        elProducto =  new Productos("a","b","c",10,null,1,"d","e");   
             
             request.setAttribute("ProductoActualizar", elProducto);
        
            //Enviar producto al formulario de actualizar (jsp)
             RequestDispatcher miDispatcher = request.getRequestDispatcher("/actualizaProductov2.jsp");
             miDispatcher.forward(request, response);
                     
