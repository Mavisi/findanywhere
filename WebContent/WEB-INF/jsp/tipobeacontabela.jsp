<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="table-responsive">
<table class="mt-3 table table table-striped">
    <thead>
        <tr>
            <th>Descricao</th>
            <th>Layout</th>
            <th>Ações</th>
        </tr>
    </thead>
    
    <tbody>
        <c:forEach var="tipobeacon" items="${tipobeacons}">
        <tr>
            <td>${tipobeacon.descricao}</td>
            <td>${tipobeacon.layout}</td>
            <td>
                <a href="#" class="btn btn-info">Editar</a>
                <a href="#" class="btn btn-danger">Excluir</a>
            </td>
        </tr>
        </c:forEach>
    </tbody>
    
</table>
</div>
