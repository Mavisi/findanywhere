<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="table-responsive">
<table class="mt-3 table table table-striped">
    <thead>
        <tr>
            <th>Descricao</th>
            <th>Beacons</th>
            <th>Ações</th>
        </tr>
    </thead>
    
    <tbody>
        <c:forEach var="area" items="${areas}">
            <tr>
                <td>${area.descricao}</td>
                <td>${area.beaconsExtenso}</td>
                <td>
                    <a href="area?acao=obtencao&id=${area.id}&view=areaedicao.jsp" class="btn btn-info">Editar</a>
                    <a href="area?acao=exclusao&id=${area.id}" class="btn btn-danger">Excluir</a>
                </td>
            </tr>
        </c:forEach>        
    </tbody>
    
</table>
</div>
