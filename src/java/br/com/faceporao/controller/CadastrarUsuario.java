/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faceporao.controller;

import br.com.faceporao.dao.DaoUsuario;
import br.com.faceporao.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas Ramos
 */
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {

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
        
        String nome = request.getParameter("nome");
        String usuario = request.getParameter("usuario");
        String sobrenome = request.getParameter("sobrenome");
        String sexo = request.getParameter("sexo");
        // dataNascimento =new Date (request.getParameter("dtnasc"));
        String senha = request.getParameter("senha");
        String confirmarsenha = request.getParameter("confirmarsenha");
        
        Usuario usu = new Usuario();
        
        usu.setUsuario(request.getParameter("nome"));
        usu.setUsuario(request.getParameter("usuario"));
        usu.setUsuario(request.getParameter("sobrenome"));
        usu.setUsuario(request.getParameter("sexo"));
        //usu.setDataNascimento(dataNascimento);
        usu.setUsuario(request.getParameter("senha"));
        
        
        DaoUsuario daousu = new DaoUsuario();
        if(daousu.cadastrar(usu) == true){
            response.sendRedirect("Login.jsp");
        }
        else{
            response.sendRedirect("Cadastro.jsp");
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
