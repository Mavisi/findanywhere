<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<select name="tipoBeacon" class="selectpicker" data-width="100%" required="required">
    <option value="" selected>Selecione</option>
    <c:forEach var="tipoBeacon" items="${tipoBeacons}">
        <option value="${tipoBeacon.id}">${tipoBeacon.descricao}</option>
    </c:forEach>
</select>  
