
package co.edu.sena.productos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;
import javax.sql.DataSource;

/**
 *
 * @author PMELENDEZ
 */
public class ServletPruebas extends HttpServlet {
 //definir o establecer el SataSource
     @Resource(name="jdbc/Productos") 
     private DataSource miPool;
     
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     /*   
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection miConexion = null;
        Statement miStatement = null;
        ResultSet miResulset = null;
        
        try{
            miConexion = miPool.getConnection(); 
            String miSql = "select * fron productos";
            miStatement = miConexion.createStatement();
            miResulset = miStatement.executeQuery(miSql);
        
            while(miResulset.next()){
               String nombreArticulo =  miResulset.getNString(3);
               out.println(nombreArticulo);
            }
            
        }catch(Exception ex){}
     */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        
        Connection miConexion = null;
        Statement miStatement = null;
        ResultSet miResulset = null;
        
        try{
            miConexion = miPool.getConnection(); 
            String miSql = "select * from productos";
            miStatement = miConexion.createStatement();
            miResulset = miStatement.executeQuery(miSql);
            while(miResulset.next()){
               String nombre_Articulo =  miResulset.getString(3);
               out.println(nombre_Articulo);
           }         
        }catch(Exception ex){ex.printStackTrace();}   
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
