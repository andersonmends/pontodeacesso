package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import aplicacao.Fachada;
import dominio.Turma;
import java.util.ArrayList;

public final class cadastrarAluno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int cod = 0;
 String primeiro = "";
 String ultimo = "";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"utf-8\" />\n");
      out.write("              <title>Ponto de Acesso - Cadastros</title>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"style_adm_cadastros.css\" />\n");
      out.write("            <link rel=\"icon\" href=\"favicon.gif\" type=\"image/gif\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tudo\">\n");
      out.write("            <div id=\"topo\"><a href=\"home.html\"><img src=\"logo.jpg\" /></a></div>\n");
      out.write("            <div id=\"conteudo-geral\">\n");
      out.write("                <div id=\"painel_dados\">\n");
      out.write("                    <div id=\"dados\">\n");
      out.write("                        <div id=\"foto\"></div>\n");
      out.write("                        <p>Lucas Emanuel\n");
      out.write("                            <br />\n");
      out.write("                            murhail@hotmail.com\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"painel_conteudo\">\n");
      out.write("                    <div id=\"menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"homeAdm.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"adm_cadastros.html\">Cadastrar</a></li>\n");
      out.write("                            <li><a href=\"adm_noticias.html\">Notícias</a></li>\n");
      out.write("                            <li><a href=\"adm_mensagens.html\">Mensagens</a></li>\n");
      out.write("                            <li><a href=\"adm_calendario.jsp\">Calendário</a></li>\n");
      out.write("                            <li><a href=\"consultas.jsp\">Consultas</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\">Sair</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"conteudo\">\n");
      out.write("                        <form id=\"cadastrarAluno\" name=\"cadastrarAluno\" action=\"CadastroAlunoServlet\" method=\"GET\">\n");
      out.write("\n");
      out.write("                            <fieldset id=\"combo\">\n");
      out.write("                                <ul><label> Tipos de cadastro :</label>\n");
      out.write("                                    <li><a href=\"cadastrarAluno.jsp\" >Aluno</a></li>\n");
      out.write("                                    <li><a href=\"cadastrarProfessor.jsp\" >Professor</a></li>\n");
      out.write("                                    <li><a href=\"cadastrarTurma.jsp\" >Turma</a></li>\n");
      out.write("                                    <li><a href=\"cadastrarDisciplina.jsp\" >Disciplina</a></li>\n");
      out.write("                                    <li><a href=\"cadastrarHorario.jsp\" >Horário</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </fieldset><br />\n");
      out.write("                            <fieldset id=\"aluno1\" name=\"aluno1\">\n");
      out.write("\n");
      out.write("                                <label>Turma* </label>\n");
      out.write("                                <select name=\"turmaCodAluno\" id=\"turmaCodAluno\" class=\"cbox\" >\n");
      out.write("                                    ");
 Fachada f = Fachada.getInstance();
      out.write("\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    ");
 ArrayList<Turma> pf = f.recuperarTurmas();
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    ");
 for (int i = 0; i < pf.size(); i++) {
                                            cod = pf.get(i).getCod();

                                            primeiro += "<option value=\"" + cod + "\">" + cod + "</option>";

                                        }
      out.write(" \n");
      out.write("                                    ");
      out.print( primeiro);
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <select id=\"soCod\" name=\"soCod\" class=\"cbox\">\n");
      out.write("                                    ");
 for (int i = 0; i < pf.size(); i++) {
                                            cod = pf.get(i).getCod();
                                            String serie = pf.get(i).getSerie();
                                            String turno = pf.get(i).getTurno();
                                            String ano = pf.get(i).getAnoLetivo();
                                            String classe = pf.get(i).getClasse();
                                            ultimo += "<option value=\"" + cod + "\">" + cod + " - " + serie + "º " + classe + " " + turno + " " + ano + "</option>";
                                        }
      out.write(" \n");
      out.write("\n");
      out.write("                                    ");
      out.print( ultimo);
      out.write("\n");
      out.write("                                </select><br />\n");
      out.write("                                <br />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <label>Matrícula*</label>\n");
      out.write("                                <input id=\"matricula\" name=\"matricula\" type = \"text\" class=\"texto\" maxlength=\"24\" />\n");
      out.write("\n");
      out.write("                                <br /><label>Nome* </label>\n");
      out.write("                                <input id=\"nome\" name=\"nome\" type = \"text\" class=\"texto\" maxlength=\"52\"  />\n");
      out.write("\n");
      out.write("                                <br /><label>Sexo</label>\n");
      out.write("                                <input type=\"radio\" name=\"sexo\" id=\"sexo\"\n");
      out.write("                                       value=\"M\" /> Masculino\n");
      out.write("                                <input type= \"radio\" name=\"sexo\" id=\"sexo\"\n");
      out.write("                                       value=\"F\" /> Feminino\n");
      out.write("\n");
      out.write("                                <br /><label> CPF* </label>\n");
      out.write("                                <input id=\"cpf\" name=\"cpf\" type = \"text\" class=\"texto\" maxlength=\"11\"  />\n");
      out.write("\n");
      out.write("                                <br /><label> RG* </label>\n");
      out.write("                                <input id=\"rg\" name=\"rg\" type = \"text\" class=\"texto\" maxlength=\"7\"  />\n");
      out.write("\n");
      out.write("                                <br /><label>Orgão Exp*</label>\n");
      out.write("                                <input id=\"orEx\" name=\"orEx\" type = \"text\" class=\"texto\" maxlength=\"5\"  />\n");
      out.write("\n");
      out.write("                                <br /> <label> Data de nascimento* </label><br />\n");
      out.write("                                <select name=\"dtNascDia\" class=\"cbox\">\n");
      out.write("                                    <option value=\"0\">01</option>\n");
      out.write("                                    <option value=\"1\" selected>02</option>\n");
      out.write("                                    <option value=\"2\">03</option>\n");
      out.write("                                    <option value=\"3\">04</option>\n");
      out.write("                                    <option value=\"4\">05</option>\n");
      out.write("                                    <option value=\"4\">06</option>\n");
      out.write("                                    <option value=\"4\">07</option>\n");
      out.write("                                    <option value=\"4\">08</option>\n");
      out.write("                                    <option value=\"4\">09</option>\n");
      out.write("                                    <option value=\"2\">10</option>\n");
      out.write("                                    <option value=\"3\">11</option>\n");
      out.write("                                    <option value=\"4\">12</option>\n");
      out.write("                                    <option value=\"4\">13</option>\n");
      out.write("                                    <option value=\"4\">14</option>\n");
      out.write("                                    <option value=\"4\">15</option>\n");
      out.write("                                    <option value=\"4\">16</option>\n");
      out.write("                                    <option value=\"2\">17</option>\n");
      out.write("                                    <option value=\"3\">18</option>\n");
      out.write("                                    <option value=\"4\">19</option>\n");
      out.write("                                    <option value=\"4\">20</option>\n");
      out.write("                                    <option value=\"4\">21</option>\n");
      out.write("                                    <option value=\"4\">22</option>\n");
      out.write("                                    <option value=\"4\">23</option>\n");
      out.write("                                    <option value=\"2\">24</option>\n");
      out.write("                                    <option value=\"3\">25</option>\n");
      out.write("                                    <option value=\"4\">26</option>\n");
      out.write("                                    <option value=\"4\">27</option>\n");
      out.write("                                    <option value=\"4\">28</option>\n");
      out.write("                                    <option value=\"4\">29</option>\n");
      out.write("                                    <option value=\"4\">30</option>\n");
      out.write("                                    <option value=\"4\">31</option>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <select name=\"dtNascMes\" class=\"cbox\">\n");
      out.write("                                    <option value=\"0\">Janeiro</option>\n");
      out.write("                                    <option value=\"1\" selected>Fevereiro</option>\n");
      out.write("                                    <option value=\"2\">Março</option>\n");
      out.write("                                    <option value=\"3\">Abril</option>\n");
      out.write("                                    <option value=\"4\">Maio</option>\n");
      out.write("                                    <option value=\"2\">Junho</option>\n");
      out.write("                                    <option value=\"3\">Julho</option>\n");
      out.write("                                    <option value=\"4\">Agosto</option>\n");
      out.write("                                    <option value=\"2\">Setembro</option>\n");
      out.write("                                    <option value=\"3\">Outubro</option>\n");
      out.write("                                    <option value=\"4\">Novembro</option>\n");
      out.write("                                    <option value=\"4\">Dezembro</option>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("                                <select name=\"dtNascAno\" class=\"cbox\">\n");
      out.write("                                    <option value=\"2\">1986</option>\n");
      out.write("                                    <option value=\"3\">1987</option>\n");
      out.write("                                    <option value=\"4\">1988</option>\n");
      out.write("                                    <option value=\"0\">1989</option>\n");
      out.write("                                    <option value=\"1\" selected>1990</option>\n");
      out.write("                                    <option value=\"2\">1991</option>\n");
      out.write("                                    <option value=\"3\">1992</option>\n");
      out.write("                                    <option value=\"4\">1993</option>\n");
      out.write("                                    <option value=\"2\">1994</option>\n");
      out.write("                                    <option value=\"3\">1995</option>\n");
      out.write("                                    <option value=\"4\">1996</option>\n");
      out.write("                                    <option value=\"2\">1997</option>\n");
      out.write("                                    <option value=\"3\">1998</option>\n");
      out.write("                                    <option value=\"4\">1999</option>\n");
      out.write("                                    <option value=\"2\">2000</option>\n");
      out.write("                                    <option value=\"3\">2001</option>\n");
      out.write("                                    <option value=\"4\">2002</option>\n");
      out.write("                                    <option value=\"2\">2003</option>\n");
      out.write("                                    <option value=\"3\">2004</option>\n");
      out.write("                                    <option value=\"4\">2005</option>\n");
      out.write("                                    <option value=\"2\">2006</option>\n");
      out.write("                                    <option value=\"3\">2007</option>\n");
      out.write("                                    <option value=\"4\">2008</option>\n");
      out.write("                                </select> \n");
      out.write("\n");
      out.write("                                <br /><label>Nome do pai </label>\n");
      out.write("                                <input id=\"nomePai\" name=\"nomePai\" type = \"text\" class=\"texto\" maxlength=\"54\" />\n");
      out.write("\n");
      out.write("                                <br /><label>Nome da Mãe </label>\n");
      out.write("                                <input id=\"nomeMae\" name=\"nomeMae\" type = \"text\" class=\"texto\" maxlength=\"54\" />\n");
      out.write("\n");
      out.write("                                <br /><label> Logradouro </label>\n");
      out.write("                                <input id=\"logradouro\" name=\"logradouro\" type = \"text\" class=\"texto\" maxlength=\"54\" />\n");
      out.write("\n");
      out.write("                                <br /><label> Número </label>\n");
      out.write("                                <input id=\"numero\" name=\"numero\" type = \"text\" class=\"texto\" maxlength=\"5\" />\n");
      out.write("\n");
      out.write("                                <br /><label> Bairro </label>\n");
      out.write("                                <input id=\"bairro\" name=\"bairro\" type = \"text\" class=\"texto\" maxlength=\"24\" /> \n");
      out.write("\n");
      out.write("                            </fieldset>\n");
      out.write("\n");
      out.write("                            <fieldset id=\"aluno2\" name=\"aluno2\">\n");
      out.write("\n");
      out.write("                                <br /><label> Cidade </label><br />\n");
      out.write("                                <input id=\"cidade\" name=\"cidade\" type = \"text\" class=\"texto\" maxlength=\"24\" />\n");
      out.write("\n");
      out.write("                                <label> Estado </label><br />\n");
      out.write("                                <input id=\"estado\" name=\"estado\" type = \"text\" class=\"texto\" maxlength=\"2\" />\n");
      out.write("\n");
      out.write("                                <br /><label> Complemento </label>\n");
      out.write("                                <input id=\"complemento\" name=\"complemento\" type = \"text\" class=\"texto\" maxlength=\"12\" />\n");
      out.write("\n");
      out.write("                                <br /><label> CEP </label>\n");
      out.write("                                <input id=\"cep\" name=\"cep\" type = \"text\" class=\"texto\" maxlength=\"8\" />\n");
      out.write("\n");
      out.write("                                <br /><label> Telefone Fixo </label>\n");
      out.write("                                <input id= \"telefone1\" name=\"telefone1\" type = \"text\" class=\"texto\" maxlength=\"10\" />\n");
      out.write("\n");
      out.write("                                <br /><label> Telefone Celular</label>\n");
      out.write("                                <input id= \"telefone2\" name=\"telefone2\" type = \"text\" class=\"texto\" maxlength=\"10\" />\n");
      out.write("\n");
      out.write("                                <br /><label> E-mail* </label>\n");
      out.write("                                <input id=\"email\" name=\"email\" type = \"text\" class=\"texto\" maxlength=\"52\"  />\n");
      out.write("\n");
      out.write("                                <br /><label>Senha*</label>\n");
      out.write("                                <input name=\"textSenha\" id=\"textSenha\" type=\"password\" class=\"texto\" maxlength=\"12\" />\n");
      out.write("\n");
      out.write("                                <br /><label>Confirmar Senha*</label>\n");
      out.write("                                <input name=\"textSenhaCnf\" id=\"textSenhaCnf\" type=\"password\" class=\"texto\" maxlength=\"12\" />\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("\n");
      out.write("                                <input name=\"tipoCadastro\" id=\"tipoCadastro\" type=\"text\" hidden value=\"primeiroCadastro\" />\n");
      out.write("                                <input id=\"btSalvarAluno\" class=\"button\" type=\"submit\" value=\"Cadastrar Aluno\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 String msg = "";
      out.write("\n");
      out.write("                                ");
 msg = request.getParameter("msg");
      out.write("\n");
      out.write("                                ");
 if (msg == null) {
                                        msg = "";
                                    }
      out.write("\n");
      out.write("                                <h5>");
      out.print( msg);
      out.write("</h5>\n");
      out.write("                                ");
 if (!(msg == null || msg.equals(""))) {
      out.write("\n");
      out.write("                                <script>\n");
      out.write("                                    alert(\"");
      out.print( msg);
      out.write("\")\n");
      out.write("                                </script>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </fieldset>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <div id=\"rodape\"></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
