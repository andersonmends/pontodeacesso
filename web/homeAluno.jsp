<%-- 
    Document   : homeAluno
    Created on : 09/06/2012, 14:57:11
    Author     : Lucas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dominio.Mensagem"%>
<%@page import="dominio.Aluno"%>
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
                        <div id="topo"><a href="homeAluno.jsp"><img src="logo.jpg" /></a></div>
                        <div id="conteudo-geral">
                            <div id="painel_dados">
                                <div id="dados">
                                    <div id="foto"></div>
                                    <p><% Aluno a = (Aluno) session.getAttribute("usuario");%>
                                        <% Fachada f = Fachada.getInstance();%> 
                                        <% String nomeUsuario = a.getPessoa().getNome();%> 
                                        <% String emailUsuario = a.getPessoa().getEmail();%>
                                        <% int codAluno = (int) a.getPessoa().getMatPessoa();%>
                                        <h2><%= nomeUsuario%></h2>
                                        <%= emailUsuario%>
                                        <a href="editarCadastrosAluno.jsp">Editar</a>
                                        <br />

                                    </p>
                                </div>

                            </div>

                            <div id="painel_conteudo">
                                <div id="menu">
                                    <ul>
                                        <li><a href="homeAluno.jsp">Home</a></li>
                                        <li><a href="viusualizarNotasAluno.jsp">Notas</a></li>
                                        <li><a href="adm_noticias.html">Notícias</a></li>
                                        <li><a href="adm_mensagens.html">Mensagens</a></li>
                                        <li><a href="adm_calendario.html">Calendário</a></li>
                                        <li><a href="login.jsp">Sair</a></li>
                                    </ul>
                                </div>
                                <div id="conteudo">
                                    <div id="boxmsgs" name="boxmsgs" class="boxes" >
                                        <h2><a href="mensagensAluno.jsp" >Mensagens</a></h2><p>
                                            <a href="mensagensAluno.jsp">
                                                <% ArrayList<Mensagem> mensagens = f.pesquisarMensagensPorAluno(codAluno);%>

                                                <% Mensagem mensagem = mensagens.get(mensagens.size() - 1);%>
                                                <h3><%= mensagem.getAssunto()%>   </h3><p>
                                                    <%= mensagem.getTexto()%>
                                            </a>
                                        </p>
                                    </div>
                                    <div id = "boxnoticias" name = "boxnoticias" class ="boxes" >





                                        <h2><a href="noticiasAluno.jsp" >Notícias</a></h2><p>
                                            <a href="noticiasAluno.jsp" >
                                                Verifique suas configurações de DNS. Entre em contato com seu administrador de rede se não souber o que isso significa.
                                                Tente desativar a previsão da rede seguindo estas etapas: acesse o menu de ferramentas
                                            </a>
                                        </p>
                                    </div>


                                    <div id="boxhorarios" name="boxhorarios" class  

                                         ="boxes" >
                                        <h2><a href="horariosAluno.jsp" >Horários</a></h2><p>
                                            <a href="horariosAluno.jsp" >
                                                Verifique suas configurações de DNS. Entre em contato com seu administrador de rede se não souber o que isso significa.
                                                Tente desativar a previsão da rede seguindo estas etapas: acesse o menu de ferramentas
                                            </a>
                                        </p>
                                    </div>
                                    <div id="boxnotas" name="boxnotas" class  

                                         ="boxes" >
                                        <h2><a href="notasAluno.jsp" >Notas</a></h2><p>
                                            <a href="notasAluno.jsp" >
                                                Verifique suas configurações de DNS. Entre em contato com seu administrador de rede se não souber o que isso significa.
                                                Tente desativar a previsão da rede seguindo estas etapas: acesse o menu de ferramentas
                                            </a>
                                        </p>
                                    </div>










                                </div>
                            </div>
                            <div class  




                                 ="clear"></div>
                            <div id="rodape"></div>


                        </div>

                </body>
                </html>