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
            <div id="topo"><a href="homeAdm.jsp"><img src="logo.jpg" /></a></div>
            <div id="conteudo-geral">
                <div id="painel_dados">
                    <div id="dados">
                        <div id="foto"></div>
                        <p><% String nome = session.getAttribute("nome").toString();%>
                            <%= nome%>
                            <br />
                            murhail@hotmail.com
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
                        <form id="cadastrarAluno" name="cadastrarAluno" action="AlterarAluno" method="GET">

                            <fieldset id="combo">
                                <ul><label> Tipos de cadastro :</label>
                                    <li><a href="cadastrarAluno.jsp" >Aluno</a></li>
                                    <li><a href="cadastrarProfessor.jsp" >Professor</a></li>
                                    <li><a href="cadastrarTurma.jsp" >Turma</a></li>
                                    <li><a href="cadastrarDisciplina.jsp" >Disciplina</a></li>
                                    <li><a href="cadastrarHorario.jsp" >Horário</a></li>
                                </ul>

                            </fieldset><br />
                            <fieldset id="aluno1" name="aluno1">

                                <label>Turma* </label> <br />

                                <select name="turmaAnoAluno" id="turmaAnoAluno" class="cbox">
                                    <option value="2000">2000</option>
                                    <option value="2001">2001</option>
                                    <option value="2002">2002</option>
                                    <option value="2003">2003</option>
                                    <option value="2004">2004</option>
                                    <option value="2005">2005</option>
                                    <option value="2006">2006</option>
                                    <option value="2007">2007</option>
                                    <option value="2008">2008</option>
                                    <option value="2009">2009</option>
                                    <option value="2010">2010</option>
                                    <option value="2011">2011</option>
                                    <option value="2012">2012</option>

                                </select>

                                <select name="turmaTurnoAluno" id="turmaTurnoAluno" class="cbox">
                                    <option value="Manhã">Manhã</option>
                                    <option value="Tarde">Tarde</option>
                                    <option value="Noite">Noite</option>
                                </select>
                                <select name="turmaClasseAluno" id="turmaClasseAluno" class="cbox">
                                    <option value="A">A</option>
                                    <option value="B">B</option>
                                    <option value="C">C</option>
                                    <option value="D">D</option>
                                </select>

                                <select name="turmaSerieAluno" id="turmaSerieAluno" class="cbox">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                </select>



                                <label>Matrícula*</label>
                                <input id="matricula" name="matricula" type ="text" class="texto" maxlength="24" value="<%= request.getParameter("codAluno")%>" readonly="true"/>

                                <br /><label>Nome* </label>
                                <input id="nome" name="nome" type = "text" class="texto" maxlength="52" value="<%= request.getParameter("nomeAluno")%>" />

                                <br /><label>Sexo</label>
                                <input type="radio" name="sexo" id="sexo"
                                       value="M" <%if (request.getParameter("sexoAluno").equals("m") || request.getParameter("sexoAluno").equals("M")) {
                                               out.print("checked");
                                           }
                                       %>/> Masculino
                                <input type= "radio" name="sexo" id="sexo"
                                       value="F" <%if (request.getParameter("sexoAluno").equals("f") || request.getParameter("sexoAluno").equals("F")) {
                                               out.print("checked");
                                           }
                                       %>/>Feminino

                                <br /><label> CPF* </label>
                                <input id="cpf" name="cpf" type = "text" class="texto" maxlength="11" value="<%= request.getParameter("cpfAluno")%>"/>

                                <br /><label> RG* </label>
                                <input id="rg" name="rg" type = "text" class="texto" maxlength="7" value="<%= request.getParameter("rgAluno")%>" />

                                <br /><label>Orgão Exp*</label>
                                <input id="orEx" name="orEx" type = "text" class="texto" maxlength="5" value="<%= request.getParameter("orgExpAluno")%>" />

                                <br /> <label> Data de nascimento* </label><br />
                                <select name="dtNascDia" class="cbox">
                                    <option value="0">01</option>
                                    <option value="1" selected>02</option>
                                    <option value="2">03</option>
                                    <option value="3">04</option>
                                    <option value="4">05</option>
                                    <option value="4">06</option>
                                    <option value="4">07</option>
                                    <option value="4">08</option>
                                    <option value="4">09</option>
                                    <option value="2">10</option>
                                    <option value="3">11</option>
                                    <option value="4">12</option>
                                    <option value="4">13</option>
                                    <option value="4">14</option>
                                    <option value="4">15</option>
                                    <option value="4">16</option>
                                    <option value="2">17</option>
                                    <option value="3">18</option>
                                    <option value="4">19</option>
                                    <option value="4">20</option>
                                    <option value="4">21</option>
                                    <option value="4">22</option>
                                    <option value="4">23</option>
                                    <option value="2">24</option>
                                    <option value="3">25</option>
                                    <option value="4">26</option>
                                    <option value="4">27</option>
                                    <option value="4">28</option>
                                    <option value="4">29</option>
                                    <option value="4">30</option>
                                    <option value="4">31</option>
                                </select>


                                <select name="dtNascMes" class="cbox">
                                    <option value="0">Janeiro</option>
                                    <option value="1" selected>Fevereiro</option>
                                    <option value="2">Março</option>
                                    <option value="3">Abril</option>
                                    <option value="4">Maio</option>
                                    <option value="2">Junho</option>
                                    <option value="3">Julho</option>
                                    <option value="4">Agosto</option>
                                    <option value="2">Setembro</option>
                                    <option value="3">Outubro</option>
                                    <option value="4">Novembro</option>
                                    <option value="4">Dezembro</option>
                                </select>

                                <select name="dtNascAno" class="cbox">
                                    <option value="2">1986</option>
                                    <option value="3">1987</option>
                                    <option value="4">1988</option>
                                    <option value="0">1989</option>
                                    <option value="1" selected>1990</option>
                                    <option value="2">1991</option>
                                    <option value="3">1992</option>
                                    <option value="4">1993</option>
                                    <option value="2">1994</option>
                                    <option value="3">1995</option>
                                    <option value="4">1996</option>
                                    <option value="2">1997</option>
                                    <option value="3">1998</option>
                                    <option value="4">1999</option>
                                    <option value="2">2000</option>
                                    <option value="3">2001</option>
                                    <option value="4">2002</option>
                                    <option value="2">2003</option>
                                    <option value="3">2004</option>
                                    <option value="4">2005</option>
                                    <option value="2">2006</option>
                                    <option value="3">2007</option>
                                    <option value="4">2008</option>
                                </select> 

                                <br /><label>Nome do pai </label>
                                <input id="nomePai" name="nomePai" type = "text" class="texto" maxlength="54" value="<%= request.getParameter("paiAluno")%>" />

                                <br /><label>Nome da Mãe </label>
                                <input id="nomeMae" name="nomeMae" type = "text" class="texto" maxlength="54" value="<%= request.getParameter("maeAluno")%>" />


                            </fieldset>

                            <fieldset id="aluno2" name="aluno2">

                                <label> Logradouro </label>
                                <input id="logradouro" name="logradouro" type = "text" class="texto" maxlength="54" value="<%= request.getParameter("ruaAluno")%>"/>

                                <br /><label> Número </label>
                                <input id="numero" name="numero" type = "text" class="texto" maxlength="5" value="<%= request.getParameter("numAluno")%>"/>

                                <br /><label> Bairro </label>
                                <input id="bairro" name="bairro" type = "text" class="texto" maxlength="24" value="<%= request.getParameter("bairroAluno")%>"/> 

                                <br /><label> Cidade </label><br />
                                <input id="cidade" name="cidade" type = "text" class="texto" maxlength="24" value="<%= request.getParameter("cidadeAluno")%>"/>

                                <label> Estado </label><br />
                                <input id="estado" name="estado" type = "text" class="texto" maxlength="2" value="<%= request.getParameter("estadoAluno")%>"/>

                                <br /><label> Complemento </label>
                                <input id="complemento" name="complemento" type = "text" class="texto" maxlength="12" />

                                <br /><label> CEP </label>
                                <input id="cep" name="cep" type = "text" class="texto" maxlength="8" value="<%= request.getParameter("cepAluno")%>"/>

                                <br /><label> Telefone Fixo </label>
                                <input id= "telefone1" name="telefone1" type = "text" class="texto" maxlength="10" value="<%= request.getParameter("tel1Aluno")%>"/>

                                <br /><label> Telefone Celular</label>
                                <input id= "telefone2" name="telefone2" type = "text" class="texto" maxlength="10" value="<%= request.getParameter("tel2Aluno")%>"/>

                                <br /><label> E-mail* </label>
                                <input id="email" name="email" type = "text" class="texto" maxlength="52"  value="<%= request.getParameter("emailAluno")%>"/>

                                <br /><label>Senha*</label>
                                <input name="textSenha" id="textSenha" type="password" class="texto" maxlength="12" />

                                <br /><label>Confirmar Senha*</label>
                                <input name="textSenhaCnf" id="textSenhaCnf" type="password" class="texto" maxlength="12" />
                                <br />
                                <br />

                                <% int codAlunoAntigo = Integer.parseInt(request.getParameter("codAluno"));%>
                                <% String cepAlunoAntigo = request.getParameter("cepAluno");%>
                                <% String numAlunoAntigo = request.getParameter("numAluno");%>

                                <input name="codAntigo" id="codAntigo" type="text" hidden maxlength="12" value="<%= codAlunoAntigo%>" />
                                <input name="cepAntigo" id="cepAntigo" type="text" hidden maxlength="12" value="<%= cepAlunoAntigo%>" />
                                <input name="numAntigo" id="numAntigo" type="text" hidden maxlength="12" value="<%= numAlunoAntigo%>" />
                                
                                
                                <input name="tipoCadastro" id="tipoCadastro" type="text" hidden value="editarCadastro" />
                                <input id="btSalvarAluno" class="button" type="submit" value="Atualizar Aluno"/>

                                
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

