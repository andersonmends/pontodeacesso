package apresentação;

import aplicacao.Fachada;
import dominio.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

public class CadastroProfessorServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();





        //Verifica se há campos essenciais em branco e se as senhas coincidem
        if ((request.getParameter("matricula").equals("") || request.getParameter("nome").equals("")
                || request.getParameter("cpf").equals("") || request.getParameter("rg").equals("")
                || request.getParameter("orEx").equals("") || request.getParameter("email").equals("")
                || request.getParameter("textSenha").equals("")) || (!request.getParameter("textSenha").equals(request.getParameter("textSenhaCnf")))) {
            try {

                if (request.getParameter("tipoCadastro").equals("primeiroCadastro")) {
                    response.sendRedirect("cadastrarProfessor.jsp?msg=Verifique os campos vazios (*).");

                }
                if (request.getParameter("tipoCadastro").equals("editarCadastro")) {
                    response.sendRedirect("editarCadastroProfessor.jsp?msg=Verifique os campos vazios (*).");

                }

            } finally {
                out.close();
            }
        } else {

            try {
                Fachada f = Fachada.getInstance();
                //Requests: pega os dados dos campos 
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
                String dataAdmissao = request.getParameter("dataadm");
                String titulacao = request.getParameter("titulo");


                //Cria os objetos com os dados passados


                Endereco end = new Endereco(cep, num, estado, bairro, cidade, logradouro);
                Documentos doc = new Documentos(cpf, rg, orEx, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, "2012-02-06", email, telefone1, telefone2, login, nome, senha, sexo, null, end, doc);

                Professor pf = Professor.FabricaProfessor(dataAdmissao, titulacao, 48, p);


                f.adicionarProfessor(pf);
                if (request.getParameter("tipoCadastro").equals("primeiroCadastro")) {
                    response.sendRedirect("cadastrarProfessor.jsp?msg=Professor cadastrado.");

                }
                if (request.getParameter("tipoCadastro").equals("editarCadastro")) {
                    response.sendRedirect("cadastrarProfessor.jsp?msg=Professor atualizado.");

                }


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
