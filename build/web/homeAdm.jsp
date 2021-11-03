<%-- 
    Document   : homeAluno
    Created on : 09/06/2012, 14:57:11
    Author     : Lucas
--%>

<%@page import="dominio.Administrador"%>
<%@page import="dominio.Pessoa"%>
<%@page import="dominio.Horario"%>
<%@page import="dominio.Disciplina"%>
<%@page import="aplicacao.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="utf-8" />
              <title>Ponto de Acesso - Home</title>
            <link rel="stylesheet" type="text/css" href="style_home_aluno.css" />
            <link rel="icon" href="favicon.gif" type="image/gif">
                </head>

                <body>
                    <div id="tudo">
                        <div id="topo"><a href="homeAdm.jsp"><img src="logo.jpg" /></a></div>
                        <div id="conteudo-geral">
                            <div id="painel_dados">
                                <div id="dados">
                                    <div id="foto"></div>
                                    <p><h2><% Administrador adm = (Administrador) session.getAttribute("usuario");%>
                                            <% String nomeUsuario = adm.getPessoa().getNome();%>
                                            <% String emailUsuario = adm.getPessoa().getEmail();%>
                                            <% String idadeUsuario = adm.getPessoa().getDocumentos().getDtNasc();%>
                                            <%= nomeUsuario%></h2>                 
                                        <br />
                                        <%= emailUsuario%>
                                        <%= idadeUsuario%> 
                                    </p>
                                </div>

                            </div>

                            <div id="painel_conteudo">
                                <div id="menu">
                                    <ul>
                                        <li><a href="homeAdm.jsp">Home</a></li>
                                        <li><a href="cadastrarAluno.jsp">Cadastrar</a></li>
                                        <li><a href="adm_noticias.html">Notícias</a></li>
                                        <li><a href="adm_mensagens.html">Mensagens</a></li>
                                        <li><a href="adm_calendario.html">Calendário</a></li>
                                        <li><a href="consultas.jsp">Consultas</a></li>
                                        <li><a href="login.jsp">Sair</a></li>
                                    </ul>
                                </div>
                                <div id="conteudo">






                                </div>
                            </div>
                            <div class="clear"></div>
                            <div id="rodape"></div>


                        </div>

                </body>
                </html>