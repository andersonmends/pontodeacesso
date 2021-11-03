<%-- 
    Document   : admMensagem
    Created on : 19/06/2012, 15:56:40
    Author     : Anderson
--%>

<%@page import="dominio.Pessoa"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dominio.Mensagem"%>
<%@page import="aplicacao.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="utf-8" />
              <title>Ponto de Acesso - Página Inicial</title>
            <link rel="stylesheet" type="text/css" href="style_adm_mensagens.css" />
            <link rel="icon" href="favicon.gif" type="image/gif">
                </head>

                <body>
                    <div id="tudo">
                        <div id="topo"><a href="admHome.jsp"><img src="logo.jpg" /></a></div>
                        <div id="conteudo-geral">
                            <div id="painel_dados">
                                <div id="dados">
                                    <div id="foto"></div>
                                    <p>Lucas Emanuel
                                        <br />
                                        murhail@hotmail.com
                                    </p>
                                </div>

                            </div>

                            <div id="painel_conteudo">
                                <div id="menu">
                                    <ul>
                                        <li><a href="homeAdm.jsp">Home</a></li>
                                        <li><a href="adm_cadastros.html">Cadastrar</a></li>
                                        <li><a href="adm_noticias.html">Notícias</a></li>
                                        <li><a href="adm_mensagens.html">Mensagens</a></li>
                                        <li><a href="adm_calendario.html">Calendário</a></li>
                                        <li><a href="consultas.jsp">Consultas</a></li>
                                        <li><a href="login.jsp">Sair</a></li>
                                    </ul>
                                </div>
                                <div id="conteudo">
                                    <div>
                                        <label style=" font-size: 14px">Remetente</label><br/>
                                        <input style=" font-size: 14px" type="text" readonly value="<%=request.getParameter("remetente")%>" size="107"/>
                                        <label style=" font-size: 14px">Assunto</label><br/>
                                        <input style=" font-size: 14px" type="text" readonly value="<%=request.getParameter("assunto")%>" size="107"/>
                                        <br/><br/>
                                        <textarea id="mensagem2" readonly> <%=request.getParameter("texto")%> </textarea>                                     

                                    </div>


                                </div>

                            </div>
                        </div>
                        <div class="clear"></div>
                        <div id="rodape"></div>


                    </div>

                </body>
                </html>

