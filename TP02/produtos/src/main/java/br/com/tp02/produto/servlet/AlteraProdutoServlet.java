package br.com.tp02.produto.servlet;

import java.io.IOException;

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
@WebServlet("/AlteraProduto")
public class AlteraProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterar produto");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		String nomeProduto = request.getParameter("nome");		
		String paramDescricaoProduto = request.getParameter("descricao");		
		String paramUnidade = request.getParameter("unidadeCompra");
		int unidadeCompra = Integer.parseInt(paramUnidade);		
		String paramQtdPrevistaMes = request.getParameter("qtdPrevistoMes");
		double qtdPrevistoMes = Double.parseDouble(paramQtdPrevistaMes);		
		String paramPrecoMaxComprado = request.getParameter("precoMaxComprado");
		double precoMaxComprado =Double.parseDouble(paramPrecoMaxComprado);

		
		
		
		
	  
		
		

		System.out.println(id);
		Banco banco = new Banco();
		Produto produto = banco.buscarProdutoPeloId(id);
		produto.setNome(nomeProduto);
		produto.setDescricao(paramDescricaoProduto);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		response.sendRedirect("ListaProdutos");

	}

}
