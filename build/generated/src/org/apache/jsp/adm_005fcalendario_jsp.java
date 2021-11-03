package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adm_005fcalendario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calendário</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style_calendario.css\" />\n");
      out.write("        <link rel=\"icon\" href=\"favicon.gif\" type=\"image/gif\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/Untitled-1.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/jquery-ui.css\" type=\"text/css\">\n");
      out.write("        <script src=\"js/jquery-1.7.2.js\"></script>\n");
      out.write("        <script src=\"js/jquery.ui.core.js\"></script>\n");
      out.write("        <script src=\"js/jquery.ui.widget.js\"></script>\n");
      out.write("        <script src=\"js/jquery.ui.datepicker.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/demos.css\">\n");
      out.write("        <script>\n");
      out.write("            $(function() {\n");
      out.write("                $( \"#datepicker\" ).datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            #datepicker{\n");
      out.write("                float: left;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #box_calendario{\n");
      out.write("                width: 200px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
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
      out.write("                            <li><a href=\"home_adm.html\">Home</a></li>\n");
      out.write("                            <li><a href=\"cadastrarAluno.jsp\">Cadastrar</a></li>\n");
      out.write("                            <li><a href=\"adm_noticias.html\">Notícias</a></li>\n");
      out.write("                            <li><a href=\"adm_mensagens.html\">Mensagens</a></li>\n");
      out.write("                            <li><a href=\"adm_calendario.html\">Calendário</a></li>\n");
      out.write("                            <li><a href=\"consultas.jsp\">Consultas</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\">Sair</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"conteudo\">\n");
      out.write("                        <div id=\"calendario\">\n");
      out.write("                            <div id=\"funcoes\">\n");
      out.write("                                <li><a href=\"#\">&DoubleRightArrow; Cadastrar</a></li>\n");
      out.write("                                <li><a href=\"#\">&DoubleRightArrow; Alterar</a></li>\n");
      out.write("                                <li><a href=\"#\">&DoubleRightArrow; Excluir</a></li>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"box_calendario\">\n");
      out.write("                                <h1>Calendário</h1>\n");
      out.write("                                <form action=\"CadastroCalendarioServlet\" method=\"post\">\n");
      out.write("                                    <div id=\"parte1\">\n");
      out.write("                                        <label>Data</label><br />\n");
      out.write("                                        <input type=\"text\" name=\"data\" id=\"datepicker\" class=\"texto\"/> <br /> \n");
      out.write("                                        <label>Turma</label> <br />\n");
      out.write("                                        <input type=\"checkbox\" id=\"turma1\" name=\"turma1\"> 1º ano</input>\n");
      out.write("                                        <input type=\"checkbox\" id=\"turma2\" name=\"turma2\"> 2º ano</input>\n");
      out.write("                                        <input type=\"checkbox\" id=\"turma3\" name=\"turma3\"> 3º ano</input>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"parte2\">\n");
      out.write("                                        <label>Evento</label> <br /> \n");
      out.write("                                        <textarea type=\"text\" name=\"evento\" id=\"evento\" class=\"texto\"></textarea><br />\n");
      out.write("                                        <input name=\"cadastrar\" type=\"submit\" value=\"Cadastrar\" id=\"cadastrar\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div id=\"rodape\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
