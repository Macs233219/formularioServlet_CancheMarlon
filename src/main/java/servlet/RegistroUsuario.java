/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marlon
 */
public class RegistroUsuario extends HttpServlet {

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

        boolean valido = true;

        // Obtiene los parámetros de la petición
        String nombre = request.getParameter("fistname");
        String apellido = request.getParameter("lastname");
        String correo = request.getParameter("email");
        String genero = request.getParameter("gender");

        String[] listaPasatiempos = request.getParameterValues("hobbies");
        String pasatiempos = "";
        if (listaPasatiempos != null) {
            for (String pasatiempo : listaPasatiempos) {
                pasatiempos += " " + pasatiempo;
            }
        }

        String contrasena = request.getParameter("password");
        String confirmarContrasena = request.getParameter("confirmPassword");
        String puesto = request.getParameter("occupation");
        String ingreso = request.getParameter("income");
        String edad = request.getParameter("age");
        String foto = request.getParameter("archivo");
        String biografia = request.getParameter("bio");

        // Valida la información del formulario
        if (nombre.isBlank()) {
            valido = false;
        }
        if (apellido.isBlank()) {
            valido = false;
        }
        if (correo.isBlank()) {
            valido = false;
        }
        if (genero == null) {
            valido = false;
        }
        if (puesto.isBlank()) {
            valido = false;
        }
        if (edad.isBlank()) {
            valido = false;
        }
        if (foto.isBlank()) {
            valido = false;
        }
        if (biografia.isBlank()) {
            valido = false;
        }
        if (!foto.endsWith(".jpg") && !foto.endsWith(".png")) {
            valido = false;
        }
        if (!(contrasena.equals(confirmarContrasena))) {
            valido = false;
        }
        
        // Direcciona a la nueva página
        if (valido) {
            // Establece el JSP de destino
            String destino = "resultado.jsp";

            request.setAttribute("nombre", nombre);
            request.setAttribute("apellido", apellido);
            request.setAttribute("correo", correo);
            request.setAttribute("genero", genero);
            request.setAttribute("pasatiempos", pasatiempos);
            request.setAttribute("puesto", puesto);
            request.setAttribute("ingreso", ingreso);
            request.setAttribute("foto", foto);
            request.setAttribute("edad", edad);
            request.setAttribute("biografia", biografia);

            System.out.println("VÁLIDO");

            RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
            dispatcher.forward(request, response);
        } else {
            // Establece el JSP de destino
            String destino = "formularioInvalido.jsp";

            System.out.println("INVÁLIDO");

            RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
            dispatcher.forward(request, response);
        }
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
