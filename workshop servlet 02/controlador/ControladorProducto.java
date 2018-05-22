package co.edu.sena.controlador;


import co.edu.sena.modelo.ModeloProductos;
import co.edu.sena.modelo.Productos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author PMELENDEZ
 */
public class ControladorProducto extends HttpServlet {

     private ModeloProductos modeloProductos;
     //definir o establecer el SataSource
     @Resource(name="jdbc/Productos") 
     private DataSource miPool;

     @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
       
        try{
             modeloProductos = new ModeloProductos(miPool);
            
            }catch(Exception ex){ex.printStackTrace();}   
       
    }
 

     
     
     
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
    
             //obtener el parametro del formulario
        String elComando = request.getParameter("instruccion");
        
       //si no se envia parametro listar productos
        if(elComando == null)
           elComando = "listar"; 
        
        //redirigir el flujo de ejecución al metodo adecuado 
        switch(elComando){
            case "listar":
               obtenerProductos(request,response);
               break;
            case "insertarProducto":
                agregarProductos(request,response);
                break;
            case "cargar":
        {
            try {
                cargaProductos(request,response);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
                break;
            case "actualizarProducto":
                actualizaProducto(request,response);
                break;
                
            case "eliminarProducto":
        {
            try {
                eliminarProducto(request,response);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
                break;
                
            default:
               obtenerProductos(request,response);  
        }  
         
         
         
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
