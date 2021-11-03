<%-- 
    Document   : admCadastros
    Created on : 13/06/2012, 17:33:58
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="utf-8" />
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
                            <li><a href="homeAdm.jsp">Home</a></li>
                            <li><a href="adm_cadastros.html">Cadastrar</a></li>
                            <li><a href="adm_noticias.html">Notícias</a></li>
                            <li><a href="adm_mensagens.html">Mensagens</a></li>
                            <li><a href="adm_calendario.html">Calendário</a></li>
                            <li><a href="adm_consultas.html">Consultas</a></li>
                            <li><a href="home.html">Sair</a></li>
                        </ul>
                    </div>
                    <div id="conteudo">
                        <fieldset id="combo">
                            <ul><label> Tipos de cadastro :</label>
                                <li><a href="cadastrarAluno.jsp" >Aluno</a></li>
                                <li><a href="cadastrarProfessor.jsp" >Professor</a></li>
                                <li><a href="cadastrarTurma.jsp" >Turma</a></li>
                                <li><a href="cadastrarDisciplina.jsp" >Disciplina</a></li>
                                <li><a href="cadastrarHorario.jsp" >Horário</a></li>
                            </ul>
                        </fieldset><br />
                        <form id="cadastrarTurma" name="cadastrarTurma "action="CadastroTurmaServlet" method="GET">
                            <fieldset id="turma" class="coluna">

                                <br /><label>Código*</label>
                                <input id="codTurma" name="codTurma" type ="text" class="texto" maxlength="12" />

                                <br /><label>Turno*</label>
                                <input id="turnoTurma" name="turnoTurma" type ="text" class="texto" maxlength="12" />

                                <br /><label>Série*</label>
                                <input id="serieTurma" name="serieTurma" type ="text" class="texto" maxlength="12" />

                                <br /><label>Classe*</label>
                                <input id="sclasseTurma" name="classeTurma" type ="text" class="texto" maxlength="2" />

                                <br /><label>Ano Letivo*</label>
                                <input id="anoTurma" name="anoTurma" type ="text" class="texto" maxlength="4" /><br />
                                <br />
                                <br />

                                <input name="tipoCadastro" id="tipoCadastro" type="text" hidden value="primeiroCadastro" />
                                <input id="btSalvarTurma" class="button" type="submit" value="Cadastrar Turma"/>
                                
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

