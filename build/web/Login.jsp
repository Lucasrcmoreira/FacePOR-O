<%-- 
    Document   : Login
    Created on : 12/09/2018, 09:43:44
    Author     : internet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
      <form action="LoginUsuario"  method="post">
			Usuario: <input type="text" name="email"  /><br>
			Senha:   <input type="password" name="senha" /><br>
			         <input type="submit" value="entrar" /><br>
							 <input type="reset" value="Limpar"> <br>
						<p><a href="#">Esqueci Minha Senha</a></p>	 
							 
               
</form> 
    </body>
</html>
