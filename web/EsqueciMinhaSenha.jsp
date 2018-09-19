<%-- 
    Document   : EsqueciMinhaSenha
    Created on : 12/09/2018, 09:31:46
    Author     : internet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Esqueci minha senha</title>
        <meta charset="utf-8">
        

        
    </head>
    <style>
        body{
            margin-top :20%;
            
        }
    #campo{
        width: 400px;
        height: 200px;
        background-color: #F2F2F2;
        text-align: center;
        
        font-size: 14px;
        }
        #email{
            width:230px;
        }
    </style>
    <body>
        
        <center>
        <div id="campo">
            <br><br>
        <p>Digite seu e-mail para redefinição de senha<p>
        <form action="EviarEmail" method="get">
        <input type="email" id="email" name="email" placeholder ="Digite seu E-mail"><br><br>   
            
        <input type="submit" name="enviar" value="Enviar">
            
        </form>
        </div>
        </center>
    </body>

</html>