<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>            
            
<div class="table-responsive">
<table class="mt-3 table table table-striped">
    <thead>
        <tr>
            <th>UUID</th>
            <th>Descrição</th>
            <th>Tipo do Beacon</th>
            <th>Área do Beacon</th>
            <th>Major</th>
            <th>Minor</th>
            <th>TxPower</th>
            <th>Ações</th>
        </tr>
    </thead>
    
    <tbody>
        <c:forEach var="beacon" items="${beacons}">
        <tr>
            <td>${beacon.uuid}</td>
            <td>${beacon.descricao}</td>
            <td>${beacon.tipoBeacon.descricao}</td>
            <td>${beacon.areaBeacon.descricao}</td>
            <td>${beacon.major}</td>
            <td>${beacon.minor}</td>
            <td>${beacon.txPower}</td>
            <td>
                <a href="#" class="btn btn-info">Editar</a>
                <a href="#" class="btn btn-danger">Excluir</a>
            </td>
        </tr>
                    
        </c:forEach>
    </tbody>
    
</table>
</div>
