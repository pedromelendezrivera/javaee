

      Connection miConexion = null; 
        PreparedStatement miStatement = null;
        try {
            //establecer la conexion con la bbdd
            miConexion = origenDatos.getConnection();
            //crear instruccion SQL de eliminacion
            String sql = "DELETE FROM PRODUCTOS WHERE CODIGOARTICULO=?";    
            //preparar la consulta
            miStatement=miConexion.prepareStatement(sql);
            //establecer parametro de consulta
            miStatement.setString(1,codArticulo);
            //ejecutar sentencia sql
            miStatement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            miStatement.close();
            miConexion.close();
        }
        
    }
