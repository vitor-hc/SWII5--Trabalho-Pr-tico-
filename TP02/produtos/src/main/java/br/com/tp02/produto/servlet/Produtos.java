package br.com.tp02.produto.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
SWII5- Trabalho Prático 02
VITOR HUGO CHAVES SILVA REIS CB3012115
ANTONIO RODRIGUES DANTAS JUNIOR CB3010775 
*/
public class Produtos {

	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

static {
		
		Produto produto1=new Produto();
		produto1.setId(chaveSequencial++);
		produto1.setNome("Chocolate");
		produto1.setDescricao("Barra 90g");
		produto1.setUnidadeCompra(1);
		produto1.setPrecoMaxComprado(3);
		produto1.setQtdPrevistoMes(24);
		lista.add(produto1);
		
		Produto produto2=new Produto();
		produto2.setId(chaveSequencial++);
		produto2.setNome("Salgadinho");
		produto2.setDescricao("Pacote 50g");
		produto2.setUnidadeCompra(1);
		produto2.setPrecoMaxComprado(1.5);
		produto2.setQtdPrevistoMes(30);
		lista.add(produto2);
		
	}
	
	// adicionar produto
	public void adicionar(Produto produto) {
		produto.setId(Produtos.chaveSequencial++);
		Produtos.lista.add(produto);

	}

	// listar produto
	public List<Produto> getProdutos() {
		return Produtos.lista;

	}

	// remover produto
	public void removerProduto(long  id) {
		Iterator<Produto> it= lista.iterator();
		while(it.hasNext()){
			
			Produto pdt=it.next();
			
			if(pdt.getId()==id) {
				it.remove();
			}
			
		}
	}
	
	//retornar empresas
	public Produto buscarProdutoPeloId(long id) {
		for(Produto produto:lista) {
			if(produto.getId()==id) {
				return produto;
			}
		}
		return null;
		
	}

}
