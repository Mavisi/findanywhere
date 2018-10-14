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
        <c:forEach var="tipoBeacon" items="${tipoBeacons}">
        <tr>
            <td>${tipoBeacon.descricao}</td>
            <td>${tipoBeacon.layout}</td>
            <td>
                <a href="tipobeacon?acao=obtencao&id=${tipoBeacon.id}&view=tipobeaconedicao.jsp" class="btn btn-info">Editar</a>
                <a href="tipobeacon?acao=exclusao&id=${tipoBeacon.id}" class="btn btn-danger">Excluir</a>
            </td>
        </tr>
        </c:forEach>
    </tbody>
    
</table>
</div>
