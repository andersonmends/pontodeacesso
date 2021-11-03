package apresentação;

import aplicacao.Fachada;
import dominio.Aluno;
import dominio.Disciplina;
import dominio.Professor;
import dominio.Turma;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cadastro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Fachada f = Fachada.getInstance();

            //Aluno
            if (request.getParameter("tipo").equals("aluno")) {

                if (request.getParameter("chave").equals("mat") && !request.getParameter("pesquisa").equals("")) {
                    Aluno a = f.pesquisarAluno(Integer.parseInt(request.getParameter("pesquisa")));
                    if (a.getPessoa().getMatPessoa() <= 0) {

                        out.println("Nenhum aluno encontrado.");
                    } else {

                        out.println("<h2>" + a.getPessoa().getNome() + "     <a href=\"editarCadastrosAluno.jsp?codAluno=" + a.getPessoa().getMatPessoa()
                                + "&nomeAluno=" + a.getPessoa().getNome()
                                + "&sexoAluno=" + a.getPessoa().getSexo()
                                + "&cpfAluno=" + a.getPessoa().getDocumentos().getCpf()
                                + "&rgAluno=" + a.getPessoa().getDocumentos().getRg()
                                + "&orgExpAluno=" + a.getPessoa().getDocumentos().getOrExp()
                                + "&dtNascAluno=" + a.getPessoa().getDocumentos().getDtNasc()
                                + "&paiAluno=" + a.getNomePai()
                                + "&maeAluno=" + a.getNomeMae()
                                + "&ruaAluno=" + a.getPessoa().getEndereco().getRua()
                                + "&numAluno=" + a.getPessoa().getEndereco().getNum()
                                + "&bairroAluno=" + a.getPessoa().getEndereco().getBairro()
                                + "&cidadeAluno=" + a.getPessoa().getEndereco().getCidade()
                                + "&estadoAluno=" + a.getPessoa().getEndereco().getEstado()
                                + "&cepAluno=" + a.getPessoa().getEndereco().getCEP()
                                + "&tel1Aluno=" + a.getPessoa().getTel1()
                                + "&tel2Aluno=" + a.getPessoa().getTel2()
                                + "&emailAluno=" + a.getPessoa().getEmail()
                                + "\">Alterar</a>     <a href=\"removerAluno?codAluno=" + a.getPessoa().getMatPessoa() + "\">Excluir</a></h2>");
                        out.println(a);

                    }
                }


                if (request.getParameter("chave").equals("nome")) {
                    ArrayList<Aluno> a = f.pesquisarAlunoPorNome(request.getParameter("pesquisa"));
                    if (a.isEmpty()) {
                        out.println("Nenhum aluno encontrado.");
                    } else {

                        for (int i = 0; i < a.size(); i++) {
                            out.println("<h2>" + a.get(i).getPessoa().getNome() + "     <a href=\"editarCadastrosAluno.jsp?codAluno=" + a.get(i).getPessoa().getMatPessoa()
                                    + "&nomeAluno=" + a.get(i).getPessoa().getNome()
                                    + "&sexoAluno=" + a.get(i).getPessoa().getSexo()
                                    + "&cpfAluno=" + a.get(i).getPessoa().getDocumentos().getCpf()
                                    + "&rgAluno=" + a.get(i).getPessoa().getDocumentos().getRg()
                                    + "&orgExpAluno=" + a.get(i).getPessoa().getDocumentos().getOrExp()
                                    + "&dtNascAluno=" + a.get(i).getPessoa().getDocumentos().getDtNasc()
                                    + "&paiAluno=" + a.get(i).getNomePai()
                                    + "&maeAluno=" + a.get(i).getNomeMae()
                                    + "&ruaAluno=" + a.get(i).getPessoa().getEndereco().getRua()
                                    + "&numAluno=" + a.get(i).getPessoa().getEndereco().getNum()
                                    + "&bairroAluno=" + a.get(i).getPessoa().getEndereco().getBairro()
                                    + "&cidadeAluno=" + a.get(i).getPessoa().getEndereco().getCidade()
                                    + "&estadoAluno=" + a.get(i).getPessoa().getEndereco().getEstado()
                                    + "&cepAluno=" + a.get(i).getPessoa().getEndereco().getCEP()
                                    + "&tel1Aluno=" + a.get(i).getPessoa().getTel1()
                                    + "&tel2Aluno=" + a.get(i).getPessoa().getTel2()
                                    + "&emailAluno=" + a.get(i).getPessoa().getEmail()
                                    + "\">Alterar</a>     <a href=\"removerAluno?codAluno=" + a.get(i).getPessoa().getMatPessoa() + "\">Excluir</a></h2>");
                            out.println(a.get(i).getPessoa());

                        }
                    }
                }


                if (request.getParameter("chave").equals("ano")) {
                    ArrayList<Aluno> a = f.pesquisarAlunoPorAno(request.getParameter("pesquisa"));
                    if (a.isEmpty()) {
                        out.println("Nenhum aluno encontrado.");
                    } else {
                        String lista = "";
                        for (int i = 0; i < a.size(); i++) {
                            out.println("<h2>" + a.get(i).getPessoa().getNome() + "     <a href=\"editarCadastrosAluno.jsp?codAluno=" + a.get(i).getPessoa().getMatPessoa()
                                    + "&nomeAluno=" + a.get(i).getPessoa().getNome()
                                    + "&sexoAluno=" + a.get(i).getPessoa().getSexo()
                                    + "&cpfAluno=" + a.get(i).getPessoa().getDocumentos().getCpf()
                                    + "&rgAluno=" + a.get(i).getPessoa().getDocumentos().getRg()
                                    + "&orgExpAluno=" + a.get(i).getPessoa().getDocumentos().getOrExp()
                                    + "&dtNascAluno=" + a.get(i).getPessoa().getDocumentos().getDtNasc()
                                    + "&paiAluno=" + a.get(i).getNomePai()
                                    + "&maeAluno=" + a.get(i).getNomeMae()
                                    + "&ruaAluno=" + a.get(i).getPessoa().getEndereco().getRua()
                                    + "&numAluno=" + a.get(i).getPessoa().getEndereco().getNum()
                                    + "&bairroAluno=" + a.get(i).getPessoa().getEndereco().getBairro()
                                    + "&cidadeAluno=" + a.get(i).getPessoa().getEndereco().getCidade()
                                    + "&estadoAluno=" + a.get(i).getPessoa().getEndereco().getEstado()
                                    + "&cepAluno=" + a.get(i).getPessoa().getEndereco().getCEP()
                                    + "&tel1Aluno=" + a.get(i).getPessoa().getTel1()
                                    + "&tel2Aluno=" + a.get(i).getPessoa().getTel2()
                                    + "&emailAluno=" + a.get(i).getPessoa().getEmail()
                                    + "\">Alterar</a>     <a href=\"removerAluno?codAluno=" + a.get(i).getPessoa().getMatPessoa() + "\">Excluir</a></h2>");
                            out.println(a.get(i).getPessoa());

                        }

                        out.println(lista);
                    }
                }

            }

            //Turma
            if (request.getParameter("tipo").equals("turma")) {

                if (request.getParameter("chave").equals("mat") && !request.getParameter("pesquisa").equals("")) {
                    Turma t = f.pesquisarTurmaPorCod(Integer.parseInt(request.getParameter("pesquisa")));
                    if (t.getCod() <= 0) {
                        out.println("Nenhuma turma encontrada.");
                    } else {

                        out.println("<h2>" + t.getSerie() + "º " + t.getClasse() + "     <a href=\"editarCadastrosTurma.jsp?codTurma=" + t.getCod()
                                + "&serieTurma=" + t.getSerie()
                                + "&anoTurma=" + t.getAnoLetivo()
                                + "&classeTurma=" + t.getClasse()
                                + "&turnoTurma=" + t.getTurno()
                                + "\">Alterar</a>     <a href=\"RemoverTurma?codTurma=" + t.getCod() + "\">Excluir</a></h2>");
                        out.println(t);
                    }

                }

                if (request.getParameter("chave").equals("nome") && !request.getParameter("pesquisa").equals("")) {
                    ArrayList<Turma> turmas = f.pesquisarTurmaPorNome(request.getParameter("pesquisa"));
                    if (turmas.isEmpty()) {
                        out.println("Nenhuma turma encontrada.");
                    } else {
                        for (int i = 0; i < turmas.size(); i++) {
                            out.println("<h2>" + turmas.get(i).getSerie() + "º " + turmas.get(i).getClasse() + "     <a href=\"editarCadastrosTurma.jsp?codTurma=" + turmas.get(i).getCod()
                                    + "&serieTurma=" + turmas.get(i).getSerie()
                                    + "&anoTurma=" + turmas.get(i).getAnoLetivo()
                                    + "&classeTurma=" + turmas.get(i).getClasse()
                                    + "&turnoTurma=" + turmas.get(i).getTurno()
                                    + "\">Alterar</a>     <a href=\"RemoverTurma?codTurma=" + turmas.get(i).getCod() + "\">Excluir</a></h2>");
                            out.println(turmas.get(i));
                        }

                    }

                }

                if (request.getParameter("chave").equals("ano") && !request.getParameter("pesquisa").equals("")) {
                    ArrayList<Turma> turmas = f.pesquisarTurmaPorAno(request.getParameter("pesquisa"));
                    if (turmas.isEmpty()) {
                        out.println("Nenhuma turma encontrada.");
                    } else {
                        for (int i = 0; i < turmas.size(); i++) {
                            out.println("<h2>" + turmas.get(i).getSerie() + "º " + turmas.get(i).getClasse() + "     <a href=\"editarCadastrosTurma.jsp?codTurma=" + turmas.get(i).getCod()
                                    + "&serieTurma=" + turmas.get(i).getSerie()
                                    + "&anoTurma=" + turmas.get(i).getAnoLetivo()
                                    + "&classeTurma=" + turmas.get(i).getClasse()
                                    + "&turnoTurma=" + turmas.get(i).getTurno()
                                    + "\">Alterar</a>     <a href=\"RemoverTurma?codTurma=" + turmas.get(i).getCod() + "\">Excluir</a></h2>");
                            out.println(turmas.get(i));
                        }
                    }

                } else if (request.getParameter("pesquisa").equals("")) {
                    out.println("Nenhuma turma encontrada.");
                }


            }

            //Professor
            if (request.getParameter("tipo").equals("professor")) {
                if (request.getParameter("chave").equals("mat") && !request.getParameter("pesquisa").equals("")) {
                    Professor a = f.pesquisarProfessor(Integer.parseInt(request.getParameter("pesquisa")));
                    if (a.getPessoa().getMatPessoa() <= 0 || a == null) {
                        out.println("Nenhum professor encontrado.");
                    } else {
                        out.println("<h2>" + a.getPessoa().getNome() + "     <a href=\"editarCadastrosProfessor.jsp?codAluno=" + a.getPessoa().getMatPessoa()
                                + "&nomeAluno=" + a.getPessoa().getNome()
                                + "&sexoAluno=" + a.getPessoa().getSexo()
                                + "&cpfAluno=" + a.getPessoa().getDocumentos().getCpf()
                                + "&rgAluno=" + a.getPessoa().getDocumentos().getRg()
                                + "&orgExpAluno=" + a.getPessoa().getDocumentos().getOrExp()
                                + "&dtNascAluno=" + a.getPessoa().getDocumentos().getDtNasc()
                                + "&ruaAluno=" + a.getPessoa().getEndereco().getRua()
                                + "&numAluno=" + a.getPessoa().getEndereco().getNum()
                                + "&bairroAluno=" + a.getPessoa().getEndereco().getBairro()
                                + "&cidadeAluno=" + a.getPessoa().getEndereco().getCidade()
                                + "&estadoAluno=" + a.getPessoa().getEndereco().getEstado()
                                + "&cepAluno=" + a.getPessoa().getEndereco().getCEP()
                                + "&tel1Aluno=" + a.getPessoa().getTel1()
                                + "&tel2Aluno=" + a.getPessoa().getTel2()
                                + "&emailAluno=" + a.getPessoa().getEmail()
                                + "\">Alterar</a>     <a href=\"RemoverProfessor?codProf=" + a.getPessoa().getMatPessoa() + "\">Excluir</a></h2>");
                        out.println(a);
                    }

                }


                if (request.getParameter("chave").equals("nome") && !request.getParameter("pesquisa").equals("")) {
                    ArrayList<Professor> profs = f.pesquisarProfessorPorNome(request.getParameter("pesquisa"));
                    if (profs.isEmpty()) {
                        out.println("Nenhum professor encontrado.");
                    } else {

                        for (int i = 0; i < profs.size(); i++) {

                            out.println("<h2>" + profs.get(i).getPessoa().getNome() + "     <a href=\"editarCadastrosProfessor.jsp?codAluno=" + profs.get(i).getPessoa().getMatPessoa()
                                    + "&nomeAluno=" + profs.get(i).getPessoa().getNome()
                                    + "&sexoAluno=" + profs.get(i).getPessoa().getSexo()
                                    + "&cpfAluno=" + profs.get(i).getPessoa().getDocumentos().getCpf()
                                    + "&rgAluno=" + profs.get(i).getPessoa().getDocumentos().getRg()
                                    + "&orgExpAluno=" + profs.get(i).getPessoa().getDocumentos().getOrExp()
                                    + "&dtNascAluno=" + profs.get(i).getPessoa().getDocumentos().getDtNasc()
                                    + "&ruaAluno=" + profs.get(i).getPessoa().getEndereco().getRua()
                                    + "&numAluno=" + profs.get(i).getPessoa().getEndereco().getNum()
                                    + "&bairroAluno=" + profs.get(i).getPessoa().getEndereco().getBairro()
                                    + "&cidadeAluno=" + profs.get(i).getPessoa().getEndereco().getCidade()
                                    + "&estadoAluno=" + profs.get(i).getPessoa().getEndereco().getEstado()
                                    + "&cepAluno=" + profs.get(i).getPessoa().getEndereco().getCEP()
                                    + "&tel1Aluno=" + profs.get(i).getPessoa().getTel1()
                                    + "&tel2Aluno=" + profs.get(i).getPessoa().getTel2()
                                    + "&emailAluno=" + profs.get(i).getPessoa().getEmail()
                                    + "\">Alterar</a>     <a href=\"RemoverProfessor?codProf=" + profs.get(i).getPessoa().getMatPessoa() + "\">Excluir</a></h2>");
                            out.println(profs.get(i));

                        }



                    }

                }

                if (request.getParameter("chave").equals("ano") && !request.getParameter("pesquisa").equals("")) {
                    ArrayList<Professor> profs = f.pesquisarProfessorPorAno(request.getParameter("pesquisa"));
                    if (profs.isEmpty()) {
                        out.println("Nenhum professor encontrado.");
                    } else {


                        for (int i = 0; i < profs.size(); i++) {

                            out.println("<h2>" + profs.get(i).getPessoa().getNome() + "     <a href=\"editarCadastrosProfessor.jsp?codAluno=" + profs.get(i).getPessoa().getMatPessoa()
                                    + "&nomeAluno=" + profs.get(i).getPessoa().getNome()
                                    + "&sexoAluno=" + profs.get(i).getPessoa().getSexo()
                                    + "&cpfAluno=" + profs.get(i).getPessoa().getDocumentos().getCpf()
                                    + "&rgAluno=" + profs.get(i).getPessoa().getDocumentos().getRg()
                                    + "&orgExpAluno=" + profs.get(i).getPessoa().getDocumentos().getOrExp()
                                    + "&dtNascAluno=" + profs.get(i).getPessoa().getDocumentos().getDtNasc()
                                    + "&ruaAluno=" + profs.get(i).getPessoa().getEndereco().getRua()
                                    + "&numAluno=" + profs.get(i).getPessoa().getEndereco().getNum()
                                    + "&bairroAluno=" + profs.get(i).getPessoa().getEndereco().getBairro()
                                    + "&cidadeAluno=" + profs.get(i).getPessoa().getEndereco().getCidade()
                                    + "&estadoAluno=" + profs.get(i).getPessoa().getEndereco().getEstado()
                                    + "&cepAluno=" + profs.get(i).getPessoa().getEndereco().getCEP()
                                    + "&tel1Aluno=" + profs.get(i).getPessoa().getTel1()
                                    + "&tel2Aluno=" + profs.get(i).getPessoa().getTel2()
                                    + "&emailAluno=" + profs.get(i).getPessoa().getEmail()
                                    + "\">Alterar</a>     <a href=\"RemoverProfessor?codProf=" + profs.get(i).getPessoa().getMatPessoa() + "\">Excluir</a></h2>");
                            out.println(profs.get(i));

                        }

                    }

                } else if (request.getParameter("pesquisa").equals("")) {
                    out.println("Campo digitado incorretamente.");
                }

            }

            //Disciplina
            if (request.getParameter("tipo").equals("disciplina")) {
                if (request.getParameter("chave").equals("mat") && !request.getParameter("pesquisa").equals("")) {
                    Disciplina disc = f.pesquisarDisciplina(Integer.parseInt(request.getParameter("pesquisa")));
                    if (disc.getCod() <= 0 || disc == null) {
                        out.println("Nenhuma disciplina encontrada.");
                    } else {
                        out.println("<h2>" + disc.getNome() + "     <a href=\"editarCadastrosDisciplina.jsp?codDisciplina=" + disc.getCod()
                                + "&nomeDisciplina=" + disc.getNome()
                                + "&descricaoDisciplina=" + disc.getDescricao()
                                + "&chDisciplina=" + disc.getCargaHoraria()
                                + "\">Alterar</a>     <a href=\"RemoverDisciplina?codDisciplina=" + disc.getCod() + "\">Excluir</a></h2>");
                        out.println(disc);

                    }

                }

                if (request.getParameter("chave").equals("nome") && !request.getParameter("pesquisa").equals("")) {
                    ArrayList<Disciplina> disc = f.pesquisarDisciplinasPorNome(request.getParameter("pesquisa"));
                    if (disc.isEmpty() || disc == null) {
                        out.println("Nenhuma disciplina encontrada.");
                    } else {
                        for (int i = 0; i < disc.size(); i++) {
                            out.println("<h2>" + disc.get(i).getNome() + "     <a href=\"editarCadastrosDisciplina.jsp?codDisciplina=" + disc.get(i).getCod()
                                    + "&nomeDisciplina=" + disc.get(i).getNome()
                                    + "&descricaoDisciplina=" + disc.get(i).getDescricao()
                                    + "&chDisciplina=" + disc.get(i).getCargaHoraria()
                                    + "\">Alterar</a>     <a href=\"RemoverDisciplina?codDisciplina=" + disc.get(i).getCod() + "\">Excluir</a></h2>");
                            out.println(disc.get(i));
                        }

                    }

                }

                if (request.getParameter("chave").equals("ano")) {

                    out.println("Este tipo de pesquisa não pode ser realizada.");
                } else if (request.getParameter("pesquisa").equals("")) {
                    out.println("Nenhuma disciplina encontrada.");
                }

            } else if (request.getParameter("pesquisa").equals("")) {
                out.println("Campo digitado incorretamente.");
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
