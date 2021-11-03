/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentação;

import aplicacao.Fachada;
import dominio.Horario;
import dominio.Turma;
import infraestrutura.RepositorioTurmaBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kathleen
 */
public class VisualizarHorarioProfServlet extends HttpServlet {

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

        Fachada f = Fachada.getInstance();
        
        
       // RepositorioTurmaBD rt = new RepositorioTurmaBD();
        Turma t = Turma.FabricaTurma(0, request.getParameter("turno"), request.getParameter("serie"),
                request.getParameter("anoLetivo"), request.getParameter("classe"), null, null, null, null, null);
        int c = f.pesquisarTurma(t);
        
        
        Horario h = Horario.FabricaHorario(8, c, "hora", "dia", "materia");
        f.adicionarHorario(h);
        //Horario hr = new Horario();

        try {

            int cod = Integer.parseInt(request.getParameter("cod"));
            int codTurma = f.pesquisarTurma(t);
            //int codTurma = Integer.parseInt(request.getParameter("codTurma"));
            String hora = request.getParameter("hora");
            String dia = request.getParameter("dia");
            String materia = request.getParameter("materia");
            Horario hr = Horario.FabricaHorario(cod, codTurma, hora, dia, materia);
            
          /*  String hora1 = request.getParameter("hora");
            String dia1 = request.getParameter("dia");
            String disciplina1 = request.getParameter("materia1");
            Horario hr1 = Horario.FabricaHorario(cod, codTurma, hora1, dia1, disciplina1);*/
            
    

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VisualizarHorarioProfServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + h.toString() + "</h1>");
            out.println("<h1>" + hr.toString() + "</h1>");
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
