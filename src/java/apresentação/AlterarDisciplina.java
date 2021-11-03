package apresentação;

import aplicacao.Fachada;
import dominio.Disciplina;
import infraestrutura.RepositorioNoticiaBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlterarDisciplina extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            if (request.getParameter("nomeDisciplina").equals("") || request.getParameter("codDisciplina").equals("")) {
                try {

                    if (request.getParameter("tipoCadastro").equals("primeiroCadastro")) {
                        response.sendRedirect("cadastrarDisciplina.jsp?msg=Verifique os campos vazios (*).");

                    }
                    if (request.getParameter("tipoCadastro").equals("editarCadastro")) {
                        response.sendRedirect("editarCadastroDisciplina.jsp?msg=Verifique os campos vazios (*).");

                    }

                } finally {
                    out.close();
                }
            } else {
                try {


                    String horario = request.getParameter("horarioDisciplina");
                    int cod = Integer.parseInt(request.getParameter("codDisciplina"));
                    String descricao = request.getParameter("descricaoDisciplina");
                    int ch = Integer.parseInt(request.getParameter("chDisciplina"));
                    String nome = request.getParameter("nomeDisciplina");
                    int codAntigo = Integer.parseInt(request.getParameter("codAntigo"));
                    Disciplina d = Disciplina.FabricaDisciplina(cod, descricao, ch, nome, null, null, null);

                    Fachada f = Fachada.getInstance();
                    f.alterarDisciplina(d, cod);

                    if (request.getParameter("tipoCadastro").equals("primeiroCadastro")) {
                        response.sendRedirect("cadastrarDisciplina.jsp?msg=Disciplina atualizada.");

                    }
                    if (request.getParameter("tipoCadastro").equals("editarCadastro")) {
                        response.sendRedirect("editarCadastroDisciplina.jsp?msg=Disciplina atualizada.");

                    }
                } catch (Exception e) {
                    System.out.println(e.getClass() + " " + e.getMessage());
                }
            }
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
