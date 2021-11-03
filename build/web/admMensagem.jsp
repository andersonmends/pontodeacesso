<%-- 
    Document   : admMensagem
    Created on : 19/06/2012, 15:56:40
    Author     : Anderson
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="aplicacao.Fachada"%>
<%@page import="dominio.Turma"%>
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
                                    <div id="box_mensagem">
                                        <h3>Mensagem</h3><br/>
                                        <ul>
                                            <li><a href="#">Nova</a></li><br/>
                                            <li><a href="admCaixaMensagem.jsp">Caixa de Entrada</a></li><br/>
                                            <li><a href="#">Enviadas</a></li>

                                        </ul>
                                    </div>
                                    <div id="mensagem">
                                        <h3 align="center">Enviar Mensagem</h3>
                                        <form action="EnviarMensagem" method="POST">
                                            <%!Turma t = Turma.FabricaTurma();
                                            %>

                                            <% Fachada f = Fachada.getInstance();
                                                ArrayList<Turma> turmas = f.recuperarTurmas();
                                            %>
                                            <label>Para</label><br />
                                            <select  style=" width: 100%" multiple name="turmas" id="turmas">

                                                <%
                                                    for (int i = 0; i < turmas.size(); i++) {
                                                        out.println("<option value=\"" + i + "\">Serie: " + turmas.get(i).getSerie() + ""
                                                                + turmas.get(i).getClasse() + " - "
                                                                + turmas.get(i).getTurno() + " - "
                                                                + turmas.get(i).getAnoLetivo()
                                                                + "</option>");
                                                    }

                                                %>
                                                <option>kjhdgafhjkgdfh</option>
                                                <option>kjshjkghfgsdjhfgshj</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>
                                                <option>kjhsjhgfjskgjkf</option>

                                            </select>

                                            <label>Assunto</label><br/>

                                            <input type="text" name="assunto" id="assunto" class="texto" style=" width: 100%" /><br />
                                            <label>Mensagem</label><br />
                                            <textarea name="text_msg" id="text_msg" style=" height: 150px; width: 400px; resize: none"></textarea><br />
                                            <input name="enviar" type="submit" value="Enviar" id="enviar" />
                                        </form>
                                    </div>

                                </div>
                            </div>
                            <div class="clear"></div>
                            <div id="rodape"></div>


                        </div>

                </body>
                </html>

