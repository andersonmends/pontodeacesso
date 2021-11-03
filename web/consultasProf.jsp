<%-- 
    Document   : consultas
    Created on : 09/06/2012, 14:57:11
    Author     : Lucas
--%>

<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="dominio.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dominio.Pessoa"%>
<%@page import="dominio.Horario"%>
<%@page import="dominio.Disciplina"%>
<%@page import="aplicacao.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="utf-8" />
              <title>Ponto de Acesso - Consultas</title>
            <link rel="stylesheet" type="text/css" href="style_adm_consultas.css" />
            <link rel="icon" href="favicon.gif" type="image/gif">
                </head>

                <body>
                    <div id="tudo">
                        <div id="topo"><a href="home.html"><img src="logo.jpg" /></a></div>
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
                                        <li><a href="home_adm.html">Home</a></li>
                                        <li><a href="adm_cadastros.html">Cadastrar</a></li>
                                        <li><a href="adm_noticias.html">Notícias</a></li>
                                        <li><a href="adm_mensagens.html">Mensagens</a></li>
                                        <li><a href="adm_calendario.html">Calendário</a></li>
                                        <li><a href="adm_consultas.html">Consultas</a></li>
                                        <li><a href="home.html">Sair</a></li>
                                    </ul>
                                </div>
                                <div id="conteudo">

                                    <div id="consulta">
                                        <form id="consulta" action="consultasAluno.jsp">
                                            <label><h1>Consulta</h1></label>

                                            <input id="pesquisa" class="texto" />
                                            <input type="submit" class="lupa" value="">
                                                <br />

                                                <label>Pesquisar por: </label> 

                                                <select id="tipo" class="cbox">
                                                    <option value="mat">Matrícula</option>
                                                    <option value="nome">Nome</option>
                                                    <option value="ano">Ano</option>
                                                    <option value="mat">Matrícula</option>
                                                </select>
                                                <select id="tipo" name="tipo" class="cbox">
                                                    <option value="aluno">Aluno</option>
                                                    <option value="professor">Professor</option>
                                                    <option value="turma">Turma</option>
                                                    <option value="disciplina">Disciplina</option>
                                                </select>

                                        </form>

                                    </div>

                                    <div id="resultado" name="resultado" >
                                        Professor pesquisado:
                                        <%= request.getParameter("pesquisa")%>






                                    </div>
                                </div>
                            </div>
                            <div class="clear"></div>
                            <div id="rodape"></div>


                        </div>

                </body>
                </html>