<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="list" value="${sessionScope.data}"></c:set>
<c:set var="len" value="${fun:length(list)}"></c:set>
[<c:forEach items="${sessionScope.data}" var="i" varStatus="j">
{"stateid":"${i.sid}","sn":"${i.stateName}"}
<c:if test="${j.count ne len}">,</c:if>
</c:forEach>]