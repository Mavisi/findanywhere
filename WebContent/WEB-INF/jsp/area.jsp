<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link rel="stylesheet" href="css/custom.css">
</head>

<body>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">FindAnywhere</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            
            <div class="collapse navbar-collapse" id="navbar">
                <ul class="navbar-nav ml-auto">

                    <li class="nav-item">
                        <a href="inicio.jsp" class="nav-link">Início</a>
                    </li>
                    
                    <li class="nav-item dropdown">
                       <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown">
                           Pessoas
                       </a>
                       
                       <div class="dropdown-menu">
                           <a href="tipopessoa.jsp" class="dropdown-item">Tipos de Pessoas</a>
                           <a href="pessoa.jsp" class="dropdown-item">Pessoa</a>
                       </div>
                       
                    </li>
                    
                    <li class="nav-item">
                        <a href="grupo.jsp" class="nav-link">Grupos de Controle</a>
                    </li>

                    <li class="nav-item">
                        <a href="area.jsp" class="nav-link active">Áreas</a>
                    </li>
                    
                    <li class="nav-item dropdown">
                       <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown">
                           Beacons
                       </a>
                       
                       <div class="dropdown-menu">
                           <a href="tipobeacon.jsp" class="dropdown-item">Tipo de Beacons</a>
                           <a href="beacon.jsp" class="dropdown-item">Beacon</a>
                       </div>
                       
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown">
                            [Nome do Usuário]
                        </a>
                       
                        <div class="dropdown-menu">
                            <a href="#" class="dropdown-item">Sair</a>
                        </div>
                    </li>
                    
                </ul>
            </div>
        </div>
    </nav>
    
    <section>
        <div class="container mt-4">
            <h1 class="h2">Áreas</h1>
            
            <a class="btn btn-primary mt-3" data-toggle="collapse" href="#cadastro" role="button" aria-expanded="false">
                Cadastrar Área
            </a>
        
            <div class="collapse mt-2 col-md-6 mx-auto" id="cadastro">
                <div class="card card-body">
                    
                    <h4 class="h5 text-center">Cadastro de Área</h4>
                    
                    <form method="post" action="<c:url value="area?acao=cadastro"/>">
    
                        <div class="form-group">
                            <label for="descricao">Descrição</label>
                            <input class="form-control" type="text" name="descricao" required="required">    
                        </div>
                        
                        <div class="d-flex justify-content-end">
                           <button type="submit" class="btn btn-primary">cadastrar</button>
                        </div>
                    </form>
                </div>
            </div>
            
        <c:import url="/area?acao=listagem&view=areatabela.jsp"></c:import>
                    
        </div>
    </section>
    
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js" ></script>
    <script src="js/bootstrap.min.js"></script>
    
</body>

</html>
