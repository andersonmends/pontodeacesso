package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarTurma_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("                            <li><a href=\"adm_calendario.html\">Calendário</a></li>\n");
      out.write("                            <li><a href=\"adm_consultas.html\">Consultas</a></li>\n");
      out.write("                            <li><a href=\"home.html\">Sair</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"conteudo\">\n");
      out.write("                        <fieldset id=\"combo\">\n");
      out.write("                            <ul><label> Tipos de cadastro :</label>\n");
      out.write("                                <li><a href=\"cadastrarAluno.jsp\" >Aluno</a></li>\n");
      out.write("                                <li><a href=\"cadastrarProfessor.jsp\" >Professor</a></li>\n");
      out.write("                                <li><a href=\"cadastrarTurma.jsp\" >Turma</a></li>\n");
      out.write("                                <li><a href=\"cadastrarDisciplina.jsp\" >Disciplina</a></li>\n");
      out.write("                                <li><a href=\"cadastrarHorario.jsp\" >Horário</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </fieldset><br />\n");
      out.write("                        <form id=\"cadastrarTurma\" name=\"cadastrarTurma \"action=\"CadastroTurmaServlet\" method=\"GET\">\n");
      out.write("                            <fieldset id=\"turma\" class=\"coluna\">\n");
      out.write("\n");
      out.write("                                <br /><label>Código*</label>\n");
      out.write("                                <input id=\"codTurma\" name=\"codTurma\" type =\"text\" class=\"texto\" maxlength=\"12\" />\n");
      out.write("\n");
      out.write("                                <br /><label>Turno*</label>\n");
      out.write("                                <input id=\"turnoTurma\" name=\"turnoTurma\" type =\"text\" class=\"texto\" maxlength=\"12\" />\n");
      out.write("\n");
      out.write("                                <br /><label>Série*</label>\n");
      out.write("                                <input id=\"serieTurma\" name=\"serieTurma\" type =\"text\" class=\"texto\" maxlength=\"12\" />\n");
      out.write("\n");
      out.write("                                <br /><label>Classe*</label>\n");
      out.write("                                <input id=\"sclasseTurma\" name=\"classeTurma\" type =\"text\" class=\"texto\" maxlength=\"2\" />\n");
      out.write("\n");
      out.write("                                <br /><label>Ano Letivo*</label>\n");
      out.write("                                <input id=\"anoTurma\" name=\"anoTurma\" type =\"text\" class=\"texto\" maxlength=\"4\" /><br />\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("\n");
      out.write("                                <input name=\"tipoCadastro\" id=\"tipoCadastro\" type=\"text\" hidden value=\"primeiroCadastro\" />\n");
      out.write("                                <input id=\"btSalvarTurma\" class=\"button\" type=\"submit\" value=\"Cadastrar Turma\"/>\n");
      out.write("                                \n");
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
      out.write("                            </fieldset>\n");
      out.write("\n");
      out.write("                        </form>\n");
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
