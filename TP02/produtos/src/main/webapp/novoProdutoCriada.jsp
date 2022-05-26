<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<! –-
SWII5- Trabalho Prático 02
VITOR HUGO CHAVES SILVA REIS CB3012115
ANTONIO RODRIGUES DANTAS JUNIOR CB3010775 
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <c:if test="${not empty produto }">
        Produto ${produto} cadastrado com sucesso!
    </c:if>
    <c:if test="${ empty produto }">
        Nenhum produto cadastrado!
    </c:if>
 

</body>
</html>