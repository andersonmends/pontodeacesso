<%-- 
    Document   : login
    Created on : 22/06/2012, 18:30:11
    Author     : Lucas
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Ponto de Acesso - Login</title>
        <link rel="stylesheet" type="text/css" href="style_login.css"/>
        <link rel="icon" href="favicon.gif" type="image/gif">
    </head>

    <body>

        <div id="geral">

            <div id="topo"><p><img src="logo.jpg" align="middle" />
                </p></div>


            <div id="conteudo-geral">

                <div id="conteudo-cima">
                </div>

                <div id="conteudo-baixo">
                    <div id="divLogin" class="login" align="center">
                        <br  />
                        <br  />
                        <br  />
                        <br  />


                        <form id="formLogin" method="POST" action="LoginServ">
                            <br  />
                            <label>Login</label>
                            <input name="textLogin" type="text" class="texto" />
                            <br />
                            <label>Senha</label>

                            <input name="textSenha" type="password" class="texto" />
                            </p>



                            <button name="enviar" type="submit" class="button">Entrar</button>
                        </form>

                    </div>
                    <% String msg = request.getParameter("msg");%>
                    <% if (msg == null) {
                        } else {%>
                    <font color="red"><%= msg%></font>
                    <%}%>
                </div>
                <div class="clear"></div>

            </div>
            <div id="rodape">
                <p>
                    <img src="OniSystem_logo.gif" /><br />
                    <br />
                    2012 - OniSystem ®
                </p>
            </div>



        </div>


    </body>
</html>
