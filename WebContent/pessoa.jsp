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
                       <a class="nav-link dropdown-toggle active" href="#" role="button" data-toggle="dropdown">
                           Pessoas
                       </a>
                       
                       <div class="dropdown-menu">
                           <a href="tipopessoa.jsp" class="dropdown-item">Tipos de Pessoas</a>
                           <a href="#" class="dropdown-item">Pessoa</a>
                       </div>
                       
                    </li>
                    
                    <li class="nav-item">
                        <a href="#" class="nav-link">Grupos de Controle</a>
                    </li>

                    <li class="nav-item">
                        <a href="area.jsp" class="nav-link">Áreas</a>
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
            <h1 class="h2">Pessoas</h1>
            
            <a class="btn btn-primary mt-3" data-toggle="collapse" href="#cadastro" role="button" aria-expanded="false">
                Cadastrar Pessoa
            </a>
        
            <div class="collapse mt-2 col-md-6 mx-auto" id="cadastro">
                <div class="card card-body">
                    
                    <h4 class="h5 text-center">Cadastro de Pessoa</h4>
                    
                    <form method="post" action="/">
                        
                        <div class="form-group">
                            <label for="nome">Nome</label>
                            <input class="form-control" type="text" name="nome">    
                        </div>
                        
                        <div class="form-group">
                            <label>Tipo de pessoa</label>
                            <select name="tipoPessoa" class="custom-select">
                                <option>Selecione</option>
                                <option>Funcionário</option>
                                <option>Gerente</option>
                                <option>Visitante</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="cpf">CPF</label>
                            <input class="form-control" type="text" name="cpf">    
                        </div>

                        <div class="form-group">
                            <label for="telefone">Telefone</label>
                            <input class="form-control" type="text" name="telefone">    
                        </div>

                        <div class="form-group">
                            <label for="enderecoBluetooth">Endereço Bluetooth</label>
                            <input class="form-control" type="text" name="enderecoBluetooth">    
                        </div>
    
                        <div class="d-flex justify-content-end">
                           <button type="submit" class="btn btn-primary">cadastrar</button>
                        </div>
                    </form>
                </div>
            </div>
            
            <div class="table-responsive">
            <table class="mt-3 table table table-striped">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Tipo de pessoa</th>
                        <th>CPF</th>
                        <th>Telefone</th>
                        <th>Endereço Bluetooth</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                
                <tbody>
                    <tr>
                        <td>Marcos Vinicius</td>
                        <td>Gerente</td>
                        <td>123.321.024-45</td>
                        <td>(71) 99999-9999</td>
                        <td>00-04-61-02-AA-FF</td>
                        <td>
                            <a href="#" class="btn btn-info">Editar</a>
                            <a href="#" class="btn btn-danger">Excluir</a>
                        </td>
                    </tr>
                    
                </tbody>
                
            </table>
            </div>
            
        </div>
    </section>
    
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js" ></script>
    <script src="js/bootstrap.min.js"></script>
    
</body>

</html>
