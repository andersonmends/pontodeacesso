package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dominio.Pessoa;
import dominio.Horario;
import dominio.Disciplina;
import aplicacao.Fachada;

public final class homeProf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"utf-8\" />\n");
      out.write("              <title>Ponto de Acesso - Home</title>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"style_home_aluno.css\" />\n");
      out.write("            <link rel=\"icon\" href=\"favicon.gif\" type=\"image/gif\">\n");
      out.write("                </head>\n");
      out.write("\n");
      out.write("                <body>\n");
      out.write("                    <div id=\"tudo\">\n");
      out.write("                        <div id=\"topo\"><a href=\"homeAdm.jsp\"><img src=\"logo.jpg\" /></a></div>\n");
      out.write("                        <div id=\"conteudo-geral\">\n");
      out.write("                            <div id=\"painel_dados\">\n");
      out.write("                                <div id=\"dados\">\n");
      out.write("                                    <div id=\"foto\"></div>\n");
      out.write("                                    <p>Lucas Emanuel\n");
      out.write("                                        <br />\n");
      out.write("                                        murhail@hotmail.com\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div id=\"painel_conteudo\">\n");
      out.write("                                <div id=\"menu\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"homeAdm.jsp\">Home</a></li>\n");
      out.write("                                        <li><a href=\"cadastrarAluno.jsp\">Cadastrar</a></li>\n");
      out.write("                                        <li><a href=\"adm_noticias.html\">Notícias</a></li>\n");
      out.write("                                        <li><a href=\"adm_mensagens.html\">Mensagens</a></li>\n");
      out.write("                                        <li><a href=\"adm_calendario.html\">Calendário</a></li>\n");
      out.write("                                        <li><a href=\"consultas.jsp\">Consultas</a></li>\n");
      out.write("                                        <li><a href=\"login.jsp\">Sair</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"conteudo\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clear\"></div>\n");
      out.write("                            <div id=\"rodape\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                </body>\n");
      out.write("                </html>");
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
