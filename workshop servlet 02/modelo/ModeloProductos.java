package co.edu.sena.modelo;

import java.sql.*;
import java.util.*;
import java.util.Date;
import javax.sql.DataSource;

/**
 *
 * @author PMELENDEZ
 */
public class ModeloProductos {
    
    private DataSource origenDatos;
    
    public ModeloProductos(DataSource origenDatos){
           this.origenDatos = origenDatos;
    }
    
    public List<Productos> getProductos() throws Exception{
           
        List<Productos> productos = new ArrayList<>();
        Connection miConexion = null;
        Statement miStatement = null;
        ResultSet miResulset = null;
        
      //  try{
            miConexion = origenDatos.getConnection(); 
            String miSql = "SELECT * FROM PRODUCTOS";
            miStatement = miConexion.createStatement();
            miResulset = miStatement.executeQuery(miSql);
            while(miResulset.next()){
              String cArt =  miResulset.getString("CODIGOARTICULO");
              String seccion =  miResulset.getString("SECCION");
              String n_art =  miResulset.getString("NOMBREARTICULO");
              Double precio =  miResulset.getDouble("PRECIO");
              Date fecha =  miResulset.getDate("FECHA"); //import java.util.Date;
              int importado = miResulset.getInt("IMPORTADO");
              String porigen =  miResulset.getString("PAISDEORIGEN");
              String foto =  miResulset.getString("FOTO");
 
              Productos temProd =  new Productos(cArt,seccion,n_art,precio,fecha,
                        importado,porigen,foto);   
              productos.add(temProd);
           }         
    //    }catch(Exception ex){ex.printStackTrace();}      
     return  productos;
    }
}
