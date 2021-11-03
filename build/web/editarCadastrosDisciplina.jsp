<%-- 
    Document   : admCadastros
    Created on : 13/06/2012, 17:33:58
    Author     : Lucas
--%>

<%@page import="org.apache.catalina.connector.Request"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
        <title>Ponto de Acesso - Cadastros</title>
        <link rel="stylesheet" type="text/css" href="style_adm_cadastros.css" />
        <link rel="icon" href="favicon.gif" type="image/gif" />

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
                        <form id="cadastrarDisciplina" name="cadastrarDisciplina" action="AlterarDisciplina" method="GET" class="disciplina" >
                            <fieldset id="combo">
                                <ul><label> Tipos de cadastro :</label>
                                    <li><a href="cadastrarAluno.jsp" >Aluno</a></li>
                                    <li><a href="cadastrarProfessor.jsp" >Professor</a></li>
                                    <li><a href="cadastrarTurma.jsp" >Turma</a></li>
                                    <li><a href="cadastrarDisciplina.jsp" >Disciplina</a></li>
                                    <li><a href="cadastrarHorario.jsp" >Horário</a></li>
                                </ul>
                            </fieldset><br />

                            <fieldset id="disciplina" name="disciplina" >
                                <label>Nome da Disciplina*</label>
                                <input id="nomeDisciplina" name="nomeDisciplina" type="text" class="texto" maxlength="34" value="<%= request.getParameter("nomeDisciplina")%>"/>

                                <br /><label>Código*</label>
                                <input id="codDisciplina" name="codDisciplina" type="text" class="texto" maxlength="12" readonly="true" value="<%= request.getParameter("codDisciplina")%>"/>

                                <br /><label>Descrição</label>  <br />
                                <textarea id="descricaoDisciplina" name="descricaoDisciplina" maxlength="256" ><%= request.getParameter("descricaoDisciplina")%></textarea>    

                                <br /><label>Carga Horária</label>
                                <input id="chDisciplina" name="chDisciplina" type ="text" class="texto" maxlength="12" value="<%= request.getParameter("chDisciplina")%>"/>

                                <br /><label>Horário</label><br />
                                <input id="horarioDisciplina" name="horarioDisciplina" type ="text" class="texto" maxlength="12" />

                                <% int codDisc = Integer.parseInt(request.getParameter("codDisciplina"));%>
                                <input name="codAntigo" id="codAntigo" type="text"  hidden maxlength="12" value="<%= codDisc%>" />

                                <br />
                                <br />

                                <input name="tipoCadastro" id="tipoCadastro" type="text" hidden value="editarCadastro" />
                                <input id="btSalvarDisciplina" class="button" type="submit" value="Atualizar Disciplina"/>

                                <% String msg = "";%>
                                <% msg = request.getParameter("msg");%>
                                <% if (msg == null) {
                                        msg = "";
                                    }%>
                                <h5><%= msg%></h5>
                                <% if (!(msg == null || msg.equals(""))) {%>
                                <script>
                                    alert("<%= msg%>")
                                </script>
                                <%}%>

                            </fieldset>


                        </form>

                    </div>

                </div>
            </div>
            <div class="clear"></div>
            <div id="rodape"></div>

        </div>

    </body>
</html>

