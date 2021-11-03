package apresentação;

import aplicacao.Fachada;
import dominio.Turma;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlterarTurma extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            if (request.getParameter("codTurma").equals("") || request.getParameter("turnoTurma").equals("") || request.getParameter("serieTurma").equals("")
                    || request.getParameter("anoTurma").equals("")) {
                try {

                    if (request.getParameter("tipoCadastro").equals("primeiroCadastro")) {
                        response.sendRedirect("cadastrarTurma.jsp?msg=Verifique os campos vazios (*).");

                    }
                    if (request.getParameter("tipoCadastro").equals("editarCadastro")) {
                        response.sendRedirect("editarCadastroTurma.jsp?msg=Verifique os campos vazios (*).");

                    }

                } finally {
                    out.close();
                }
            } else {
                try {


                    int codAntigo = Integer.parseInt(request.getParameter("codTurma"));

                    String serie = request.getParameter("serieTurma");
                    String turno = request.getParameter("turnoTurma");
                    String ano = request.getParameter("anoTurma");
                    String classe = request.getParameter("classeTurma");

                    Turma t = Turma.FabricaTurma(codAntigo, turno, serie, classe, ano, null, null, null, null, null);
                    Fachada f = Fachada.getInstance();

                    f.alterarTurma(t, codAntigo);

                    if (request.getParameter("tipoCadastro").equals("primeiroCadastro")) {
                        response.sendRedirect("cadastrarTurma.jsp?msg=Turma cadastrada.");

                    }
                    if (request.getParameter("tipoCadastro").equals("editarCadastro")) {
                        response.sendRedirect("cadastrarTurma.jsp?msg=Turma atualizada.");

                    }

                } finally {
                    out.close();
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
