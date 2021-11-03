<%-- 
    Document   : consultas
    Created on : 09/06/2012, 14:57:11
    Author     : Lucas
--%>

<%@page import="dominio.Pessoa"%>
<%@page import="dominio.Horario"%>
<%@page import="dominio.Disciplina"%>
<%@page import="aplicacao.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript">
    function ajaxInit(){
        var xmlhttp;

        try{
            xmlhttp = new XMLHttpRequest();
        }catch(ee){
            try{
                xmlhttp = new ActiveXObject ("Msxml2.XMLHTTP") ;
            }catch(e){
                try{
                    xmlhttp = new ActiveXObject ("Microsoft.XMLHTTP") ;
                }catch(E){
                    xmlhttp = null;
                }
            }
        }

        return xmlhttp;
    }

    function carregar(component, nome){
        var ajax = ajaxInit();
        document.getElementById(component).innerHTML = "Carregando...";
        
        //var enviado = nome + campos;
        if(ajax){
            ajax.open('GET',nome,true);
            ajax.onreadystatechange = function(){
                if(ajax.readyState == 4){
                    if(ajax.status == 200){
                        document.getElementById(component).innerHTML = ajax.responseText;
                    }
                }
            }
        }
                
        ajax.send(null);
    }
	
</script>

<script>
    //crio uma função init qu
    function chama(){
                
        // pegamos o elemento com id enviar e assim que clicar nele chama a função pega
        document.getElementById("enviar").onclick = pega;
    }
            
    // crio  a função que pega o valor dos campos
    function pega(){
                
        //pego o campo nome
        var pesquisa  = document.getElementById("pesquisa").value;
        var tipo = document.getElementById("tipo").value;
        var chave = document.getElementById("chave").value;        
        // pego o campo idade
        //var idade = document.getElementById("idade").value;
                
        // exibo em um alert só para testar
        //alert(pesquisa + " " + tipo + " " + chave);
        carregar('resultado','Cadastro?pesquisa='+pesquisa+'&tipo='+tipo+'&chave='+chave);
        
    }
            
</script>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="utf-8" />
              <title>Ponto de Acesso - Consultas</title>
        <link rel="stylesheet" type="text/css" href="style_adm_consultas.css" />
        <link rel="icon" href="favicon.gif" type="image/gif">
    </head>

    <body onload="chama()">
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

                        <div id="consulta">


                            <form id="consulta" >

                                <label><h1>Consulta</h1></label>

                                <input id="pesquisa" name="pesquisa" class="texto" />
                                <input type="button" class="lupa" value="" id="enviar"/>


                                <br />

                                <label> Pesquisar </label> 
                                <select id="tipo" name="tipo" class="cbox">
                                    <option value="aluno">Aluno</option>
                                    <option value="professor">Professor</option>
                                    <option value="turma">Turma</option>
                                    <option value="disciplina">Disciplina</option>
                                </select>
                                <label> por  </label> 
                                <select id="chave" name="chave" class="cbox">
                                    <option value="mat">Matrícula/Código</option>
                                    <option value="nome">Nome</option>
                                    <option value="ano">Ano</option>

                                </select>


                            </form>

                        </div>

                        <div id="resultado1" name="resultado" >

                            <div id="resultado" name="resultado" >


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
                            </div>






                        </div>
                    </div>
                </div>
                <div class="clear"></div>
                <div id="rodape"></div>


            </div>

    </body>
</html>