<!DOCTYPE html>
<html>
    <head>
        <title> Cadastro </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container" id="cadastro">
            
            <form action="CadastrarUsuario" method="post"> 
                Usuario:             <input type="text" name="usuario" placeholder="Digite seu usuário" required=""> <br>
                Nome:                <input type="text" name="nome" placeholder="Nome"> <br>
                Sobrenome:           <input type="text" name="sobrenome" placeholder="Sobrenome"> <br>
                sexo:                <input type="radio" name="sexo" value="m"> Masculino 
                                     <input type="radio" name="sexo" value="f"> Feminino <br>
                Data de nascimento:  <input type="date" name="dtnasc" placeholder="dd/mm/aaaa"> <br>
                senha:               <input type="password" name="senha" placeholder="Digite sua senha" required=""> <br>
                Confirmar senha:     <input type="password" name="confirmarsenha" placeholder="Confirme sua senha" required=""> <br>
                                     <input type="submit" value="Inscreva-se">
            </form>  
        </div>
    </body>
</html>