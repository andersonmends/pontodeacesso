package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Ponto de Acesso - Login</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style_login.css\"/>\n");
      out.write("        <link rel=\"icon\" href=\"favicon.gif\" type=\"image/gif\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"geral\">\n");
      out.write("\n");
      out.write("            <div id=\"topo\"><p><img src=\"logo.jpg\" align=\"middle\" />\n");
      out.write("                </p></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"conteudo-geral\">\n");
      out.write("\n");
      out.write("                <div id=\"conteudo-cima\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"conteudo-baixo\">\n");
      out.write("                    <div id=\"divLogin\" class=\"login\" align=\"center\">\n");
      out.write("                        <br  />\n");
      out.write("                        <br  />\n");
      out.write("                        <br  />\n");
      out.write("                        <br  />\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form id=\"formLogin\" method=\"POST\" action=\"LoginServ\">\n");
      out.write("                            <br  />\n");
      out.write("                            <label>Login</label>\n");
      out.write("                            <input name=\"textLogin\" type=\"text\" class=\"texto\" />\n");
      out.write("                            <br />\n");
      out.write("                            <label>Senha</label>\n");
      out.write("\n");
      out.write("                            <input name=\"textSenha\" type=\"password\" class=\"texto\" />\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <button name=\"enviar\" type=\"submit\" class=\"button\">Entrar</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
 String msg = request.getParameter("msg");
      out.write("\n");
      out.write("                    ");
 if (msg == null) {
                        } else {
      out.write("\n");
      out.write("                    <font color=\"red\">");
      out.print( msg);
      out.write("</font>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"rodape\">\n");
      out.write("                <p>\n");
      out.write("                    <img src=\"OniSystem_logo.gif\" /><br />\n");
      out.write("                    <br />\n");
      out.write("                    2012 - OniSystem ®\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
