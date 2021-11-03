/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentação;

import aplicacao.Fachada;
import dominio.Horario;
import dominio.Turma;
import infraestrutura.RepositorioPessoaBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas
 */
public class Testecod extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {


            String turno = request.getParameter("turno");
            String serie = request.getParameter("serie");
            String classe = request.getParameter("classe");
            String ano = request.getParameter("ano");


            String hora1 = request.getParameter("hora1");
            String dia1 = request.getParameter("dia1");
            String disciplina1 = request.getParameter("disciplina1");


            Fachada f = Fachada.getInstance();
            Turma tf = Turma.FabricaTurma(42, turno, serie, classe, ano, null, null, null, null, null);

            int codd = f.pesquisarTurma(tf);

            Horario hr = Horario.FabricaHorario(150, codd, hora1, dia1, disciplina1);
            try {
                f.adicionarHorario(hr);
            } catch (Exception ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Testecod</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Código apos pegar no banco :" + ex.getMessage() + "</h1>");
                
                out.println("</body>");
                out.println("</html>");
            }




            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Testecod</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Código apos pegar no banco :" + codd + "</h1>");
            out.println("<h1>Turma :" + tf.toString() + "</h1>");
            out.println("<h1>Horario :" + hr.toString() + "</h1>");
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
