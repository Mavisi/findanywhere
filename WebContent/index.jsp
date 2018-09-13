<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>FindAnywhere</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/signin.css">
    <link rel="stylesheet" href="css/custom.css">
</head>

<body class="text-center">
    <form class="form-signin" method="post">
        <img src="img/logo.png" alt="" width="80" height="80">
        <span class="mb-4" style="display:block;">FindAnywhere</span>
        
        <label for="nomeUsuario" class="sr-only">Nome de usuário</label>
        <input type="text" name="nomeUsuario" class="form-control" placeholder="Nome de usuário" required autofocus>
        <label for="senha" class="sr-only">Senha</label>
        <input type="password" name="senha" class="form-control" placeholder="Senha" required>

        <div class="ml-1" style="display:flex;justify-content:flex-start;">
            <small class="form-text text-muted">
            <a href="#">Esqueceu sua senha?</a>
            </small>
        </div>

        <div style="display:flex;justify-content:flex-end;">
            <button class="btn btn-primary" type="submit">entrar</button>
        </div>

        <p class="mt-3">Não tenha uma conta? <a href="#">Cadastra-se</a></p>
    </form>
</body>

</html>
