package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testeJavascript_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("    <html dir=\"ltr\" lang=\"pt-BR\">\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("            <title>Pegar valores dos inputs com javaScript</title>\n");
      out.write("        </head>\n");
      out.write("        <script>\n");
      out.write("            //crio uma função init qu\n");
      out.write("            function chama(){\n");
      out.write("                \n");
      out.write("                // pegamos o elemento com id enviar e assim que clicar nele chama a função pega\n");
      out.write("                document.getElementById(\"enviar\").onclick = pega;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            // crio  a função que pega o valor dos campos\n");
      out.write("            function pega(){\n");
      out.write("                \n");
      out.write("                //pego o campo nome\n");
      out.write("                var nome  = document.getElementById(\"pesquisa\").value;\n");
      out.write("                \n");
      out.write("                // pego o campo idade\n");
      out.write("                //var idade = document.getElementById(\"idade\").value;\n");
      out.write("                \n");
      out.write("                // exibo em um alert só para testar\n");
      out.write("                alert(nome);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <!-- chamo a função chama() assim que a pagina é carregada -->\n");
      out.write("        <body onload=\"chama()\">\n");
      out.write("            <div id=\"tudo\" name=\"tudo\" >\n");
      out.write("                <form id=\"formEnviar\" name=\"formEnviar\" action=\"Cadastro\">\n");
      out.write("                    <input type=\"text\" id=\"pesquisa\" name=\"pesquisa\">\n");
      out.write("                    <input type=\"submit\" value=\"Enviar\" id=\"enviar\" name=\"enviar\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("</body>\n");
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
