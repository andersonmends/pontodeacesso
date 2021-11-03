/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentação;

import aplicacao.Fachada;
import dominio.Mensagem;
import dominio.Pessoa;
import infraestrutura.RepositorioMensagemBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.h2.engine.Session;

/**
 *
 * @author Anderson
 */
public class EnviarMensagem extends HttpServlet {

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
            Pessoa p = Pessoa.FabricaPessoa(1, null, null, null, null, null, null, null, null, null, null, null);

            // Aqui só é tirar o cometário na hora de rodas normal pelo Home.html            
//            HttpSession session = request.getSession(true);
//            session = request.getSession();
//            p = (Pessoa) session.getAttribute("usuario");
            
            ///String teste = request.getParameter("turmas").charAt(index);
                      
            String destino = request.getParameter("destino");
            String remetente = p.getNome();
            String assunto = request.getParameter("assunto");
            String texto = request.getParameter("text_msg");
            int cod = 2;
            

            Mensagem msg = Mensagem.FabricaMensagem(null, destino, remetente, assunto, texto, cod);
            
            Fachada f = Fachada.getInstance();
                     
            f.adicionarMensagem(msg); 
            
            response.sendRedirect("admMensagem.jsp");
            
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
