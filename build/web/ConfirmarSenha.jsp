<%-- 
    Document   : ConfirmarSenha
    Created on : 12/09/2018, 09:31:20
    Author     : internet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
 <meta charset="utf-8">
 <title>Alterar Senha</title>    
</head>
    <style>
        #campo{
            width: 400px;
            height: 200px;
            text-align: center;
           margin-top: 20%;
            font-size: 14px;
        }
        
 </style>
<body>
   
        
    <center>
        <div id="campo">
            <p>NOVA SENHA</p>
        <form action="MudarSenha" method="get">
        <input name="NovaSenha" placeholder="Nova Senha"><br><br>
            
            <input name="ConfirmaNovaSenha" placeholder="Confirmação Nova Senha"><br><br>
            <input type="submit" name="Alterar" value="Alterar">
        </form>
        </div> 
        
    </center>
</body>
</html>