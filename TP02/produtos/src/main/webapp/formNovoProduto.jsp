<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<! –-
SWII5- Trabalho Prático 02
VITOR HUGO CHAVES SILVA REIS CB3012115
ANTONIO RODRIGUES DANTAS JUNIOR CB3010775 
-->
<c:url value="/NovoProduto" var="linkServletNovoProduto" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkServletNovoProduto }" method="post">
	
		Nome:<input type="text" name="nome" />
		Descricao:<input type="text" name="descricao" />
		Unidade compradas:<input type="number" name="unidadeCompra" />		
		Quantidade prevista do mes:<input type="number" step='0.01' placeholder='0.00'  name="qtdPrevistoMes"/>
		Preco maximo comprado:<input type="number" step='0.01' placeholder='0.00' name="precoMaxComprado"/>
		<input type="submit"/>  <br/><br/> <br/><br/> 
		
		   <a href="/produtos/ListaProdutos }">Mostrar Produto</a>    


	</form>
</body>
</html>