
 Productos elProducto = null;
        Connection miConexion = null; 
        PreparedStatement miStatement = null;        
        ResultSet miResultset = null;
        String cArticulo = codigoArticulo; 
    
     try{       
         //establece la conexion con la base de datos
          miConexion = origenDatos.getConnection();

         //crea sql que busque el producto
//         String sql = "SELECT * FROM PRODUCTOS WHERE CODIGOARTICULO=?";   
         String sql = "SELECT * FROM PRODUCTOS WHERE CODIGOARTICULO=?";   
         
        //crea la consulta preparada
          miStatement = miConexion.prepareStatement(sql);
          
        //establece los parametros
          miStatement.setString(1, cArticulo);
        
          //ejecuta la consulta
          miResultset = miStatement.executeQuery();
          
        //obTener los datos de respuesta
         if(miResultset.next()){
              String cArt =  miResultset.getString("CODIGOARTICULO");
              String seccion =  miResultset.getString("SECCION");
              String n_art =  miResultset.getString("NOMBREARTICULO");
              Double precio =  miResultset.getDouble("PRECIO");
              Date fecha =  miResultset.getDate("FECHA"); //import java.util.Date;
              int importado = miResultset.getInt("IMPORTADO");
              String porigen =  miResultset.getString("PAISDEORIGEN");
              String foto =  miResultset.getString("FOTO");
 
              elProducto =  new Productos(cArt,seccion,n_art,precio,fecha,importado,porigen,foto); 
              
         }else{
           throw new Exception("No se encontro el producto con código: "+cArticulo);  
         }   
 
        }catch(Exception ex){ex.printStackTrace();}
         finally{
            miStatement.close();
            miConexion.close();
        }
       return elProducto; 
