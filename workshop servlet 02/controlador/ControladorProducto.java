
       Connection miConexion = null;  
         PreparedStatement miStatement = null;
         try {
            //obtener la conexion
            miConexion = origenDatos.getConnection();
             //crear la insruccion sql
            String miSQL = "INSERT INTO PRODUCTOS (CODIGOARTICULO,SECCION,NOMBREARTICULO,PRECIO,"
                    + "FECHA,IMPORTADO,PAISDEORIGEN,FOTO) VALUES (?,?,?,?,?,?,?,?)"; 

            miStatement = miConexion.prepareStatement(miSQL);   
            //establecer parametros del producto
            miStatement.setString(1, nuevoProducto.getcArt());
            miStatement.setString(2, nuevoProducto.getSeccion());
            miStatement.setString(3, nuevoProducto.getnArt());
            miStatement.setDouble(4, nuevoProducto.getPrecio());
            java.util.Date utilDate = nuevoProducto.getFecha();
            java.sql.Date fechaConvertida = new java.sql.Date(utilDate.getTime());
            miStatement.setDate(5,fechaConvertida);
            miStatement.setInt(6, nuevoProducto.getImportado());
            miStatement.setString(7, nuevoProducto.getpOrg());
            miStatement.setString(8, nuevoProducto.getFoto());

        //ejecutar la instruccion sql
            miStatement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            miStatement.close();
            miConexion.close();
        }
