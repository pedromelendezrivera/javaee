
         //leer los datos del formulario actualizaProductov2
        String CodArticulo = request.getParameter("cArt");
        String seccion = request.getParameter("seccion");
        String NombreArticulo = request.getParameter("nArt");
        Date fecha = null;
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha = formatofecha.parse(request.getParameter("fecha"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        double Precio = Double.parseDouble(request.getParameter("precio"));
        int Importado = Integer.parseInt(request.getParameter("importado"));
        String PaisOrigen = request.getParameter("pOrig");
        //crear un objeto de tipo producto con la informacion del formulario
        Productos productoActualizado = new Productos(CodArticulo,seccion,NombreArticulo,Precio,fecha,Importado,PaisOrigen,null);
        //actualizar la BBDD con la informacion del objeto producto
        modeloProductos.actualizarProducto(productoActualizado);
        //Volver a listar con la informacion actualizada
        obtenerProductos(request,response); 
