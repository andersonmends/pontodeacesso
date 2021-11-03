package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dominio.Pessoa;
import dominio.Horario;
import dominio.Disciplina;
import aplicacao.Fachada;

public final class consultas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function ajaxInit(){\n");
      out.write("        var xmlhttp;\n");
      out.write("\n");
      out.write("        try{\n");
      out.write("            xmlhttp = new XMLHttpRequest();\n");
      out.write("        }catch(ee){\n");
      out.write("            try{\n");
      out.write("                xmlhttp = new ActiveXObject (\"Msxml2.XMLHTTP\") ;\n");
      out.write("            }catch(e){\n");
      out.write("                try{\n");
      out.write("                    xmlhttp = new ActiveXObject (\"Microsoft.XMLHTTP\") ;\n");
      out.write("                }catch(E){\n");
      out.write("                    xmlhttp = null;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return xmlhttp;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function carregar(component, nome){\n");
      out.write("        var ajax = ajaxInit();\n");
      out.write("        document.getElementById(component).innerHTML = \"Carregando...\";\n");
      out.write("        \n");
      out.write("        //var enviado = nome + campos;\n");
      out.write("        if(ajax){\n");
      out.write("            ajax.open('GET',nome,true);\n");
      out.write("            ajax.onreadystatechange = function(){\n");
      out.write("                if(ajax.readyState == 4){\n");
      out.write("                    if(ajax.status == 200){\n");
      out.write("                        document.getElementById(component).innerHTML = ajax.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("                \n");
      out.write("        ajax.send(null);\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    //crio uma função init qu\n");
      out.write("    function chama(){\n");
      out.write("                \n");
      out.write("        // pegamos o elemento com id enviar e assim que clicar nele chama a função pega\n");
      out.write("        document.getElementById(\"enviar\").onclick = pega;\n");
      out.write("    }\n");
      out.write("            \n");
      out.write("    // crio  a função que pega o valor dos campos\n");
      out.write("    function pega(){\n");
      out.write("                \n");
      out.write("        //pego o campo nome\n");
      out.write("        var pesquisa  = document.getElementById(\"pesquisa\").value;\n");
      out.write("        var tipo = document.getElementById(\"tipo\").value;\n");
      out.write("        var chave = document.getElementById(\"chave\").value;        \n");
      out.write("        // pego o campo idade\n");
      out.write("        //var idade = document.getElementById(\"idade\").value;\n");
      out.write("                \n");
      out.write("        // exibo em um alert só para testar\n");
      out.write("        //alert(pesquisa + \" \" + tipo + \" \" + chave);\n");
      out.write("        carregar('resultado','Cadastro?pesquisa='+pesquisa+'&tipo='+tipo+'&chave='+chave);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("            \n");
      out.write("</script>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"utf-8\" />\n");
      out.write("              <title>Ponto de Acesso - Consultas</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style_adm_consultas.css\" />\n");
      out.write("        <link rel=\"icon\" href=\"favicon.gif\" type=\"image/gif\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"chama()\">\n");
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
      out.write("\n");
      out.write("                        <div id=\"consulta\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <form id=\"consulta\" >\n");
      out.write("\n");
      out.write("                                <label><h1>Consulta</h1></label>\n");
      out.write("\n");
      out.write("                                <input id=\"pesquisa\" name=\"pesquisa\" class=\"texto\" />\n");
      out.write("                                <input type=\"button\" class=\"lupa\" value=\"\" id=\"enviar\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <br />\n");
      out.write("\n");
      out.write("                                <label> Pesquisar </label> \n");
      out.write("                                <select id=\"tipo\" name=\"tipo\" class=\"cbox\">\n");
      out.write("                                    <option value=\"aluno\">Aluno</option>\n");
      out.write("                                    <option value=\"professor\">Professor</option>\n");
      out.write("                                    <option value=\"turma\">Turma</option>\n");
      out.write("                                    <option value=\"disciplina\">Disciplina</option>\n");
      out.write("                                </select>\n");
      out.write("                                <label> por  </label> \n");
      out.write("                                <select id=\"chave\" name=\"chave\" class=\"cbox\">\n");
      out.write("                                    <option value=\"mat\">Matrícula/Código</option>\n");
      out.write("                                    <option value=\"nome\">Nome</option>\n");
      out.write("                                    <option value=\"ano\">Ano</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"resultado1\" name=\"resultado\" >\n");
      out.write("\n");
      out.write("                            <div id=\"resultado\" name=\"resultado\" >\n");
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
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div id=\"rodape\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
