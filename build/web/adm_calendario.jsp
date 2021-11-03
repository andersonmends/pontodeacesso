<%-- 
    Document   : calendario
    Created on : 27/05/2012, 21:38:14
    Author     : Waléria Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calendário</title>
        <link rel="stylesheet" type="text/css" href="style_calendario.css" />
        <link rel="icon" href="favicon.gif" type="image/gif">
        <link rel="stylesheet" href="js/Untitled-1.css" type="text/css">
        <link rel="stylesheet" href="js/jquery-ui.css" type="text/css">
        <script src="js/jquery-1.7.2.js"></script>
        <script src="js/jquery.ui.core.js"></script>
        <script src="js/jquery.ui.widget.js"></script>
        <script src="js/jquery.ui.datepicker.js"></script>
        <link rel="stylesheet" href="js/demos.css">
        <script>
            $(function() {
                $( "#datepicker" ).datepicker();
            });
        </script>
        <style>
            #datepicker{
                float: left;

            }
            #box_calendario{
                width: 200px;
            }
        </style>

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
                            <li><a href="cadastrarAluno.jsp">Cadastrar</a></li>
                            <li><a href="adm_noticias.html">Notícias</a></li>
                            <li><a href="adm_mensagens.html">Mensagens</a></li>
                            <li><a href="adm_calendario.html">Calendário</a></li>
                            <li><a href="consultas.jsp">Consultas</a></li>
                            <li><a href="login.jsp">Sair</a></li>
                        </ul>
                    </div>
                    <div id="conteudo">
                        <div id="calendario">
                            <div id="funcoes">
                                <li><a href="#">&DoubleRightArrow; Cadastrar</a></li>
                                <li><a href="#">&DoubleRightArrow; Alterar</a></li>
                                <li><a href="#">&DoubleRightArrow; Excluir</a></li>
                            </div>


                            <div id="box_calendario">
                                <h1>Calendário</h1>
                                <form action="CadastroCalendarioServlet" method="post">
                                    <div id="parte1">
                                        <label>Data</label><br />
                                        <input type="text" name="data" id="datepicker" class="texto"/> <br /> 
                                        <label>Turma</label> <br />
                                        <input type="checkbox" id="turma1" name="turma1"> 1º ano</input>
                                        <input type="checkbox" id="turma2" name="turma2"> 2º ano</input>
                                        <input type="checkbox" id="turma3" name="turma3"> 3º ano</input>
                                    </div>
                                    <div id="parte2">
                                        <label>Evento</label> <br /> 
                                        <textarea type="text" name="evento" id="evento" class="texto"></textarea><br />
                                        <input name="cadastrar" type="submit" value="Cadastrar" id="cadastrar" />
                                    </div>
                                </form>
                            </div>
                        </div>


                    </div>
                </div>
                <div class="clear"></div>
                <div id="rodape"></div>


            </div>

    </body>
</html>
