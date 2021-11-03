
package apresentação;

import aplicacao.Fachada;
import dominio.Administrador;
import dominio.Aluno;
import dominio.Pessoa;
import dominio.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServ extends HttpServlet {

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
                response.sendRedirect("login.jsp?msg=Verifique os campos vazios.");
            }
            
            int loginMat = Integer.parseInt(login);
            Fachada f = Fachada.getInstance();
            Aluno a = f.pesquisarAluno(loginMat);
            Administrador adm = f.pesquisarAdministrador(loginMat);
            Professor prof = f.pesquisarProfessor(loginMat);
            
            
            if (!(a == null)) {
                if (a.getPessoa().getSenha().equals(senha)) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("usuario", a);
                    response.sendRedirect("homeAluno.jsp");
                    
                } else {
                    response.sendRedirect("login.jsp?msg=Login ou senha incorretos.");
                }
            }
            if (!(adm == null)) {
                if (adm.getPessoa().getSenha().equals(senha)) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("usuario", adm);
                    response.sendRedirect("homeAdm.jsp");
                    
                } else {
                    response.sendRedirect("login.jsp?msg=Login ou senha incorretos.");
                }
            }
            if (!(prof == null)) {
                if (prof.getPessoa().getSenha().equals(senha)) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("usuario", adm);
                    response.sendRedirect("homeProf.jsp");
                    
                } else {
                    response.sendRedirect("login.jsp?msg=Login ou senha incorretos.");
                }
            } else {
                response.sendRedirect("login.jsp?msg=Login ou senha incorretos.");
            }


            // Pessoa pes = f.pesquisarPessoaPorMatricula(loginMat);

            
            
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
