/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentação;

import aplicacao.Fachada;
import dominio.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anderson
 */
public class LoginServlets extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
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
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login</title>");
            out.println("</head>");
            out.println("<body>");

            String login = request.getParameter("textLogin");
            String senha = (request.getParameter("textSenha"));
            if (login.equals("") || senha.equals("")) {
                out.println("<label>Digite login e senha </label></br>");
                out.println("<a href=\"home.html\">voltar</label>");

            }

            int loginMat = Integer.parseInt(login);
            Fachada f = Fachada.getInstance();
            Pessoa pes = f.pesquisarPessoaPorMatricula(loginMat);

            if (pes.getSenha().equals(senha)) {
                HttpSession sessao = request.getSession(true);
                sessao.setAttribute("usuario", pes);
                response.sendRedirect("admCadastros.jsp");

            }
            else{
                out.println("<label>Digite login e senha </label></br>");
                out.println("<a href=\"home.html\">voltar</label>");
            }


            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
