package br.com.projetoDrogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoDrogaria.domain.Fabricante;
import br.com.projetoDrogaria.domain.Produto;

public class ProdutoTest {
	@Test
	@Ignore
	public void salvar() {
		Produto produto = new Produto();
		FabricanteDAO daoFabricante = new FabricanteDAO();
		Fabricante fabricante;
		fabricante = daoFabricante.buscar(1L);	
		produto.setDescricao("Diclofenato");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("12.50"));
		produto.setQuantidade(new Short("1"));
		ProdutoDAO daoProduto = new ProdutoDAO();
		daoProduto.salvar(produto);
		
	}@Test
	public void listar() {
		ProdutoDAO daoProduto = new ProdutoDAO();
		List<Produto> resultado = daoProduto.listar();
		
		for(Produto produto: resultado) {
			System.out.println("Produto: " + produto.getDescricao());
			System.out.println("Fabricante: "+ produto.getFabricante().getDescricao());
		}
		
	}
	
}
