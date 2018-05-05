package com.controlador;

import com.modelo.DaoEmpleado;
import com.modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Nombre de la clase: ProcesarEmpleado Fecha de creacion: 22-4-2018 CopyRight:
 * FuturoDesarrollador de S.A de C.V. Version: 1.0
 *
 * @author Ernesto Rosales
 */
public class ProcesarEmpleado extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        RequestDispatcher rd = null;
        Empleado emp = new Empleado();
        DaoEmpleado daoEmp = new DaoEmpleado();
        String msj = "Datos invalidos";
        try {
            emp.setIdempleado(Integer.parseInt(request.getParameter("txtId")));
            emp.setNombre(request.getParameter("txtNombre"));
            emp.setDui(request.getParameter("txtDui"));
            emp.setNit(request.getParameter("txtNit"));
            emp.setLicencia(Integer.parseInt(request.getParameter("txtLicencia")));
            emp.setDireccion(request.getParameter("txtDireccion"));
            emp.setTel(request.getParameter("txtTelefono"));

            if (request.getParameter("btnInsertar") != null) {
                daoEmp.insertar(emp);
                msj = "Datos Ingresados correctamente";
            } else if (request.getParameter("btnModificar") != null) {
                daoEmp.actualizar(emp);
                msj = "Datos Modificados correctamente";
            } else if (request.getParameter("btnEliminar") != null) {
                daoEmp.eliminar(emp);
                msj = "Datos Eliminados correctamente";
            }

            rd = request.getRequestDispatcher("GestionarEmpleados.jsp");
            request.setAttribute("msj", msj);

        } catch (Exception e) {
            rd = request.getRequestDispatcher("GestionarEmpleados.jsp");
            request.setAttribute("msj", msj);
        }
        rd.forward(request, response);
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
        processRequest(request, response);
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
