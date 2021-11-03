package apresentação;

import aplicacao.Fachada;
import dominio.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlterarAluno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if ((request.getParameter("matricula").equals("") || request.getParameter("nome").equals("")
                || request.getParameter("cpf").equals("") || request.getParameter("rg").equals("")
                || request.getParameter("orEx").equals("") || request.getParameter("email").equals("")
                || request.getParameter("textSenha").equals("")) || (!request.getParameter("textSenha").equals(request.getParameter("textSenhaCnf")))) {
            try {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet CadastroAlunoServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Campos obrigatórios em branco ou senhas não coincidem </h1>");
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
        } else {
            try {


                Fachada f = Fachada.getInstance();
                int codAntigo = Integer.parseInt(request.getParameter("codAntigo"));
                String cepAntigo = request.getParameter("cepAntigo");
                String numAntigo = request.getParameter("numAntigo");

                long mat = Long.parseLong(request.getParameter("matricula"));
                String nome = request.getParameter("nome");
                String sexo = request.getParameter("sexo");
                String cpf = request.getParameter("cpf");
                String rg = request.getParameter("rg");
                String orEx = request.getParameter("orEx");
                String dtNasc = request.getParameter("dtNascAno") + "-" + request.getParameter("dtNascMes") + "-" + request.getParameter("dtNascDia");
                String logradouro = request.getParameter("logradouro");
                String num = request.getParameter("numero");
                String bairro = request.getParameter("bairro");
                String cidade = request.getParameter("cidade");
                String estado = request.getParameter("estado");
                String cep = request.getParameter("cep");
                String complemento = request.getParameter("complemento");
                String telefone1 = request.getParameter("telefone1");
                String telefone2 = request.getParameter("telefone2");
                String email = request.getParameter("email");
                String login = request.getParameter("matricula");
                String senha = request.getParameter("textSenha");
                String nomeMae = request.getParameter("nomeMae");
                String nomePai = request.getParameter("nomePai");
                String serieTurma = request.getParameter("turmaSerieAluno");
                String turnoTurma = request.getParameter("turmaTurnoAluno");
                String classeTurma = request.getParameter("turmaClasseAluno");
                String anoTurma = request.getParameter("turmaAnoAluno");


                //Cria os objetos com os dados passados
                int codT = f.pesquisarTurma(Turma.FabricaTurma(0, turnoTurma, serieTurma, classeTurma, anoTurma, null, null, null, null, null));

                Turma t = Turma.FabricaTurma(codT, turnoTurma, serieTurma, classeTurma, anoTurma, null, null, null, null, null);
                Endereco end = new Endereco(cep, num, estado, bairro, cidade, logradouro);
                Documentos doc = new Documentos(cpf, rg, orEx, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, "2012-02-06", email, telefone1, telefone2, login, nome, senha, sexo, null, end, doc);
                Aluno a = Aluno.FabricaAluno(nomeMae, nomePai, t, null, mat, "2012-02-06", email, telefone1, telefone2, login, nome, senha, sexo, null, end, cpf, rg, orEx, dtNasc);


                f.alterarAluno(a, cepAntigo, numAntigo, codAntigo);






                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet AlterarAluno</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>dados do aluno a ser alterado" + mat + " - " + codAntigo + " - " + cepAntigo + " - " + numAntigo + "</h1>");
                out.println("<h1>Aluno depois de pegar do jsp: " + a.toString() + "</h1>");
                out.println("<h1>Aluno depois de alterado e puxado do banco: " + f.pesquisarAluno(codAntigo) + "</h1>");
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
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
