<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<select name="area" class="selectpicker" data-width="100%" required="required">
    <option value="" selected>Selecione</option>
    <c:forEach var="area" items="${areas}">
	    <option value="${area.id}">${area.descricao}</option>
    </c:forEach>
</select>  
