<%-- 
    Document   : admCadastros
    Created on : 13/06/2012, 17:33:58
    Author     : Lucas
--%>

<%@page import="aplicacao.Fachada"%>
<%@page import="dominio.Turma"%>
<%@page import="java.util.ArrayList"%>
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
                            <li><a href="adm_calendario.jsp">Calendário</a></li>
                            <li><a href="consultas.jsp">Consultas</a></li>
                            <li><a href="login.jsp">Sair</a></li>
                        </ul>
                    </div>
                    <div id="conteudo">
                        <form id="cadastrarAluno" name="cadastrarAluno" action="CadastroAlunoServlet" method="GET">

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

                                <label>Turma* </label>
                                <select name="turmaCodAluno" id="turmaCodAluno" class="cbox" >
                                    <% Fachada f = Fachada.getInstance();%>
                                    <%! int cod = 0;%>
                                    <%! String primeiro = "";%>
                                    <%! String ultimo = "";%>
                                    <% ArrayList<Turma> pf = f.recuperarTurmas();%>


                                    <% for (int i = 0; i < pf.size(); i++) {
                                            cod = pf.get(i).getCod();

                                            primeiro += "<option value=\"" + cod + "\">" + cod + "</option>";

                                        }%> 
                                    <%= primeiro%>
                                </select>
                                <select id="soCod" name="soCod" class="cbox">
                                    <% for (int i = 0; i < pf.size(); i++) {
                                            cod = pf.get(i).getCod();
                                            String serie = pf.get(i).getSerie();
                                            String turno = pf.get(i).getTurno();
                                            String ano = pf.get(i).getAnoLetivo();
                                            String classe = pf.get(i).getClasse();
                                            ultimo += "<option value=\"" + cod + "\">" + cod + " - " + serie + "º " + classe + " " + turno + " " + ano + "</option>";
                                        }%> 

                                    <%= ultimo%>
                                </select><br />
                                <br />






                                <label>Matrícula*</label>
                                <input id="matricula" name="matricula" type = "text" class="texto" maxlength="24" />

                                <br /><label>Nome* </label>
                                <input id="nome" name="nome" type = "text" class="texto" maxlength="52"  />

                                <br /><label>Sexo</label>
                                <input type="radio" name="sexo" id="sexo"
                                       value="M" /> Masculino
                                <input type= "radio" name="sexo" id="sexo"
                                       value="F" /> Feminino

                                <br /><label> CPF* </label>
                                <input id="cpf" name="cpf" type = "text" class="texto" maxlength="11"  />

                                <br /><label> RG* </label>
                                <input id="rg" name="rg" type = "text" class="texto" maxlength="7"  />

                                <br /><label>Orgão Exp*</label>
                                <input id="orEx" name="orEx" type = "text" class="texto" maxlength="5"  />

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
                                <input id="nomePai" name="nomePai" type = "text" class="texto" maxlength="54" />

                                <br /><label>Nome da Mãe </label>
                                <input id="nomeMae" name="nomeMae" type = "text" class="texto" maxlength="54" />

                                <br /><label> Logradouro </label>
                                <input id="logradouro" name="logradouro" type = "text" class="texto" maxlength="54" />

                                <br /><label> Número </label>
                                <input id="numero" name="numero" type = "text" class="texto" maxlength="5" />

                                <br /><label> Bairro </label>
                                <input id="bairro" name="bairro" type = "text" class="texto" maxlength="24" /> 

                            </fieldset>

                            <fieldset id="aluno2" name="aluno2">

                                <br /><label> Cidade </label><br />
                                <input id="cidade" name="cidade" type = "text" class="texto" maxlength="24" />

                                <label> Estado </label><br />
                                <input id="estado" name="estado" type = "text" class="texto" maxlength="2" />

                                <br /><label> Complemento </label>
                                <input id="complemento" name="complemento" type = "text" class="texto" maxlength="12" />

                                <br /><label> CEP </label>
                                <input id="cep" name="cep" type = "text" class="texto" maxlength="8" />

                                <br /><label> Telefone Fixo </label>
                                <input id= "telefone1" name="telefone1" type = "text" class="texto" maxlength="10" />

                                <br /><label> Telefone Celular</label>
                                <input id= "telefone2" name="telefone2" type = "text" class="texto" maxlength="10" />

                                <br /><label> E-mail* </label>
                                <input id="email" name="email" type = "text" class="texto" maxlength="52"  />

                                <br /><label>Senha*</label>
                                <input name="textSenha" id="textSenha" type="password" class="texto" maxlength="12" />

                                <br /><label>Confirmar Senha*</label>
                                <input name="textSenhaCnf" id="textSenhaCnf" type="password" class="texto" maxlength="12" />
                                <br />
                                <br />
                                <br />

                                <input name="tipoCadastro" id="tipoCadastro" type="text" hidden value="primeiroCadastro" />
                                <input id="btSalvarAluno" class="button" type="submit" value="Cadastrar Aluno"/>


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

