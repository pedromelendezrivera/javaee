               Connection miConexion = null; 
        PreparedStatement miStatement = null;
        try {
            //establecer la conexion
            miConexion = origenDatos.getConnection();
            //crear sentencia SQL
            String sql = "UPDATE PRODUCTOS SET SECCION =?, NOMBREARTICULO=?, PRECIO=?, FECHA=?, IMPORTADO=?, "
                    + "PAISDEORIGEN=? WHERE CODIGOARTICULO=?";
            //crear la consulta preparada
            miStatement = miConexion.prepareCall(sql);
            //Establecer los parametros
            miStatement.setString(1, productoActualizado.getSeccion());
            miStatement.setString(2, productoActualizado.getnArt());
            miStatement.setDouble(3, productoActualizado.getPrecio());
            java.util.Date utilDate = productoActualizado.getFecha();
            java.sql.Date fechaConvertida = new java.sql.Date(utilDate.getTime());
            miStatement.setDate(4,fechaConvertida);
            miStatement.setInt(5, productoActualizado.getImportado());
            miStatement.setString(6, productoActualizado.getpOrg());  
            miStatement.setString(7, productoActualizado.getcArt());
            //Ejecutar la consulta SQL
            miStatement.execute();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }finally{
            miStatement.close();
            miConexion.close();
        }
    
