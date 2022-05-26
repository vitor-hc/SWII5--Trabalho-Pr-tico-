package br.com.tp02.produto.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
SWII5- Trabalho Prático 02
VITOR HUGO CHAVES SILVA REIS CB3012115
ANTONIO RODRIGUES DANTAS JUNIOR CB3010775 
*/
@WebServlet("/ListaProdutos")
public class ListaProdutosServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		Produtos banco=new Produtos();
		List<Produto> lista=banco.getProdutos();
		
		request.setAttribute("produto", lista);
		
		RequestDispatcher rd=request.getRequestDispatcher("/listaProdutos.jsp");
		rd.forward(request, response);
	
	}
	

	
}
