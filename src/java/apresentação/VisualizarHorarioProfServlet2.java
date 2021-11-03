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
 * @author Kathleen Sandy
 */
public class VisualizarHorarioProfServlet2 extends HttpServlet {

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

        try {
            Turma tt = Turma.FabricaTurma(1, request.getParameter("turno"), request.getParameter("serie"),
                    request.getParameter("anoLetivo"), request.getParameter("classe"), null, null, null, null, null);

            int c = f.pesquisarTurma(tt);
            int cod = Integer.parseInt(request.getParameter("cod"));
           
            
            String hora = request.getParameter("hora");
            String dia = request.getParameter("dia");
            String materia = request.getParameter("materia");
            String turno = request.getParameter("turno");
            String serie = request.getParameter("serie");
            String anoLetivo = request.getParameter("anoLetivo");
            String classe = request.getParameter("classe");
            Horario hr = Horario.FabricaHorario(200, c, hora, dia, materia);
            
//
//            String hora1 = request.getParameter("hora");
//            String dia1 = request.getParameter("dia1");
//            String disciplina1 = request.getParameter("materia1");
//            Horario hr1 = Horario.FabricaHorario(1, 1, hora1, dia1, disciplina1);
//
//            String hora2 = request.getParameter("hora");
//            String dia2 = request.getParameter("dia2");
//            String disciplina2 = request.getParameter("materia2");
//            Horario hr2 = Horario.FabricaHorario(2, 2, hora2, dia2, disciplina2);
//
//            String hora3 = request.getParameter("hora");
//            String dia3 = request.getParameter("dia3");
//            String disciplina3 = request.getParameter("materia3");
//            Horario hr3 = Horario.FabricaHorario(3, 3, hora3, dia3, disciplina3);
//
//            String hora4 = request.getParameter("hora");
//            String dia4 = request.getParameter("dia4");
//            String disciplina4 = request.getParameter("materia4");
//            Horario hr4 = Horario.FabricaHorario(4, 4, hora4, dia4, disciplina4);
//
//            String hora5 = request.getParameter("hora");
//            String dia5 = request.getParameter("dia5");
//            String disciplina5 = request.getParameter("materia5");
//            Horario hr5 = Horario.FabricaHorario(5, 5, hora5, dia5, disciplina5);
//
//            String hora6 = request.getParameter("hora1");
//            String dia6 = request.getParameter("dia");
//            String disciplina6 = request.getParameter("materia6");
//            Horario hr6 = Horario.FabricaHorario(6, 6, hora6, dia6, disciplina6);
//
//            String hora7 = request.getParameter("hora1");
//            String dia7 = request.getParameter("dia1");
//            String disciplina7 = request.getParameter("materia7");
//            Horario hr7 = Horario.FabricaHorario(7, 7, hora7, dia7, disciplina7);
//
//            String hora8 = request.getParameter("hora1");
//            String dia8 = request.getParameter("dia2");
//            String disciplina8 = request.getParameter("materia8");
//            Horario hr8 = Horario.FabricaHorario(8, 8, hora8, dia8, disciplina8);
//
//            String hora9 = request.getParameter("hora1");
//            String dia9 = request.getParameter("dia3");
//            String disciplina9 = request.getParameter("materia9");
//            Horario hr9 = Horario.FabricaHorario(9, 9, hora9, dia9, disciplina9);
//
//            String hora10 = request.getParameter("hora1");
//            String dia10 = request.getParameter("dia4");
//            String disciplina10 = request.getParameter("materia10");
//            Horario hr10 = Horario.FabricaHorario(10, 10, hora10, dia10, disciplina10);
//
//            String hora11 = request.getParameter("hora1");
//            String dia11 = request.getParameter("dia5");
//            String disciplina11 = request.getParameter("materia11");
//            Horario hr11 = Horario.FabricaHorario(11, 11, hora11, dia11, disciplina11);
//
//            String hora12 = request.getParameter("hora2");
//            String dia12 = request.getParameter("dia");
//            String disciplina12 = request.getParameter("materia12");
//            Horario hr12 = Horario.FabricaHorario(12, 12, hora12, dia12, disciplina12);
//
//            String hora13 = request.getParameter("hora2");
//            String dia13 = request.getParameter("dia1");
//            String disciplina13 = request.getParameter("materia13");
//            Horario hr13 = Horario.FabricaHorario(13, 13, hora13, dia13, disciplina13);
//
//            String hora14 = request.getParameter("hora2");
//            String dia14 = request.getParameter("dia2");
//            String disciplina14 = request.getParameter("materia14");
//            Horario hr14 = Horario.FabricaHorario(14, 14, hora14, dia14, disciplina14);
//
//            String hora15 = request.getParameter("hora2");
//            String dia15 = request.getParameter("dia3");
//            String disciplina15 = request.getParameter("materia15");
//            Horario hr15 = Horario.FabricaHorario(15, 15, hora15, dia15, disciplina15);
//
//            String hora16 = request.getParameter("hora2");
//            String dia16 = request.getParameter("dia4");
//            String disciplina16 = request.getParameter("materia16");
//            Horario hr16 = Horario.FabricaHorario(16, 16, hora16, dia16, disciplina16);
//
//            String hora17 = request.getParameter("hora2");
//            String dia17 = request.getParameter("dia5");
//            String disciplina17 = request.getParameter("materia17");
//            Horario hr17 = Horario.FabricaHorario(17, 17, hora17, dia17, disciplina17);
//
//            String hora18 = request.getParameter("hora3");
//            String dia18 = request.getParameter("dia");
//            String disciplina18 = request.getParameter("materia18");
//            Horario hr18 = Horario.FabricaHorario(18, 18, hora18, dia18, disciplina18);
//
//            String hora19 = request.getParameter("hora3");
//            String dia19 = request.getParameter("dia1");
//            String disciplina19 = request.getParameter("materia19");
//            Horario hr19 = Horario.FabricaHorario(19, 19, hora19, dia19, disciplina19);
//
//            String hora20 = request.getParameter("hora3");
//            String dia20 = request.getParameter("dia2");
//            String disciplina20 = request.getParameter("materia20");
//            Horario hr20 = Horario.FabricaHorario(20, 20, hora20, dia20, disciplina20);
//
//            String hora21 = request.getParameter("hora3");
//            String dia21 = request.getParameter("dia3");
//            String disciplina21 = request.getParameter("materia21");
//            Horario hr21 = Horario.FabricaHorario(21, 21, hora21, dia21, disciplina21);
//
//            String hora22 = request.getParameter("hora3");
//            String dia22 = request.getParameter("dia4");
//            String disciplina22 = request.getParameter("materia22");
//            Horario hr22 = Horario.FabricaHorario(22, 22, hora22, dia22, disciplina22);
//
//            String hora23 = request.getParameter("hora3");
//            String dia23 = request.getParameter("dia5");
//            String disciplina23 = request.getParameter("materia23");
//            Horario hr23 = Horario.FabricaHorario(23, 23, hora23, dia23, disciplina23);
//
//            String hora24 = request.getParameter("hora4");
//            String dia24 = request.getParameter("dia");
//            String disciplina24 = request.getParameter("materia24");
//            Horario hr24 = Horario.FabricaHorario(24, 24, hora24, dia24, disciplina24);
//
//            String hora25 = request.getParameter("hora4");
//            String dia25 = request.getParameter("dia1");
//            String disciplina25 = request.getParameter("materia25");
//            Horario hr25 = Horario.FabricaHorario(25, 25, hora25, dia25, disciplina25);
//
//            String hora26 = request.getParameter("hora4");
//            String dia26 = request.getParameter("dia2");
//            String disciplina26 = request.getParameter("materia26");
//            Horario hr26 = Horario.FabricaHorario(26, 26, hora26, dia26, disciplina26);
//
//            String hora27 = request.getParameter("hora4");
//            String dia27 = request.getParameter("dia3");
//            String disciplina27 = request.getParameter("materia27");
//            Horario hr27 = Horario.FabricaHorario(27, 27, hora27, dia27, disciplina27);
//
//            String hora28 = request.getParameter("hora4");
//            String dia28 = request.getParameter("dia4");
//            String disciplina28 = request.getParameter("materia28");
//            Horario hr28 = Horario.FabricaHorario(28, 28, hora28, dia28, disciplina28);
//
//            String hora29 = request.getParameter("hora4");
//            String dia29 = request.getParameter("dia5");
//            String disciplina29 = request.getParameter("materia29");
//            Horario hr29 = Horario.FabricaHorario(29, 29, hora29, dia29, disciplina29);
//
//            String hora30 = request.getParameter("hora5");
//            String dia30 = request.getParameter("dia");
//            String disciplina30 = request.getParameter("materia30");
//            Horario hr30 = Horario.FabricaHorario(30, 30, hora30, dia30, disciplina30);
//
//            String hora31 = request.getParameter("hora5");
//            String dia31 = request.getParameter("dia1");
//            String disciplina31 = request.getParameter("materia31");
//            Horario hr31 = Horario.FabricaHorario(31, 31, hora31, dia31, disciplina31);
//
//            String hora32 = request.getParameter("hora5");
//            String dia32 = request.getParameter("dia2");
//            String disciplina32 = request.getParameter("materia32");
//            Horario hr32 = Horario.FabricaHorario(32, 32, hora32, dia32, disciplina32);
//
//            String hora33 = request.getParameter("hora5");
//            String dia33 = request.getParameter("dia3");
//            String disciplina33 = request.getParameter("materia33");
//            Horario hr33 = Horario.FabricaHorario(33, 33, hora33, dia33, disciplina33);
//
//
//            String hora34 = request.getParameter("hora5");
//            String dia34 = request.getParameter("dia4");
//            String disciplina34 = request.getParameter("materia34");
//            Horario hr34 = Horario.FabricaHorario(34, 34, hora34, dia34, disciplina34);
//
//            String hora35 = request.getParameter("hora5");
//            String dia35 = request.getParameter("dia5");
//            String disciplina35 = request.getParameter("materia35");
//            Horario hr35 = Horario.FabricaHorario(35, 35, hora35, dia35, disciplina35);

            // Horario h = Horario.FabricaHorario(8, c, "hora", "dia", "materia");
//            f.adicionarHorario(hr);
//            f.adicionarHorario(hr1);
//            f.adicionarHorario(hr2);
//            f.adicionarHorario(hr3);
//            f.adicionarHorario(hr4);
//            f.adicionarHorario(hr5);
//            f.adicionarHorario(hr6);
//            f.adicionarHorario(hr7);
//            f.adicionarHorario(hr8);
//            f.adicionarHorario(hr9);
//            f.adicionarHorario(hr10);
//            f.adicionarHorario(hr11);
//            f.adicionarHorario(hr12);
//            f.adicionarHorario(hr13);
//            f.adicionarHorario(hr14);
//            f.adicionarHorario(hr15);
//            f.adicionarHorario(hr16);
//            f.adicionarHorario(hr17);
//            f.adicionarHorario(hr18);
//            f.adicionarHorario(hr19);
//            f.adicionarHorario(hr20);
//            f.adicionarHorario(hr21);
//            f.adicionarHorario(hr22);
//            f.adicionarHorario(hr23);
//            f.adicionarHorario(hr24);
//            f.adicionarHorario(hr25);
//            f.adicionarHorario(hr26);
//            f.adicionarHorario(hr27);
//            f.adicionarHorario(hr28);
//            f.adicionarHorario(hr29);
//            f.adicionarHorario(hr30);
//            f.adicionarHorario(hr31);
//            f.adicionarHorario(hr32);
//            f.adicionarHorario(hr33);
//            f.adicionarHorario(hr34);
//            f.adicionarHorario(hr35);

            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VisualizarHorarioProfServlet2</title>");
            out.println("</head>");
            out.println("<body>");

            //out.println("<h1>" + hr.toString() +  "</h1>");
            out.println("<h1>" + c + "</h1>");
//            out.println("<h1>" + hr1.toString() + "</h1>");
//            out.println("<h1>" + hr2.toString() + "</h1>");
//            out.println("<h1>" + hr3.toString() + "</h1>");
//            out.println("<h1>" + hr4.toString() + "</h1>");
//            out.println("<h1>" + hr5.toString() + "</h1>");
//            out.println("<h1>" + hr6.toString() + "</h1>");
//            out.println("<h1>" + hr7.toString() + "</h1>");
//            out.println("<h1>" + hr8.toString() + "</h1>");
//            out.println("<h1>" + hr9.toString() + "</h1>");
//            out.println("<h1>" + hr10.toString() + "</h1>");
//            out.println("<h1>" + hr11.toString() + "</h1>");
//            out.println("<h1>" + hr12.toString() + "</h1>");
//            out.println("<h1>" + hr13.toString() + "</h1>");
//            out.println("<h1>" + hr14.toString() + "</h1>");
//            out.println("<h1>" + hr15.toString() + "</h1>");
//            out.println("<h1>" + hr16.toString() + "</h1>");
//            out.println("<h1>" + hr17.toString() + "</h1>");
//            out.println("<h1>" + hr18.toString() + "</h1>");
//            out.println("<h1>" + hr19.toString() + "</h1>");
//            out.println("<h1>" + hr20.toString() + "</h1>");
//            out.println("<h1>" + hr21.toString() + "</h1>");
//            out.println("<h1>" + hr22.toString() + "</h1>");
//            out.println("<h1>" + hr23.toString() + "</h1>");
//            out.println("<h1>" + hr24.toString() + "</h1>");
//            out.println("<h1>" + hr25.toString() + "</h1>");
//            out.println("<h1>" + hr26.toString() + "</h1>");
//            out.println("<h1>" + hr27.toString() + "</h1>");
//            out.println("<h1>" + hr28.toString() + "</h1>");
//            out.println("<h1>" + hr29.toString() + "</h1>");
//            out.println("<h1>" + hr30.toString() + "</h1>");
//            out.println("<h1>" + hr31.toString() + "</h1>");
//            out.println("<h1>" + hr32.toString() + "</h1>");
//            out.println("<h1>" + hr33.toString() + "</h1>");
//            out.println("<h1>" + hr34.toString() + "</h1>");
//            out.println("<h1>" + hr35.toString() + "</h1>");

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
