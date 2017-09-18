package br.com.projetoDrogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoDrogaria.domain.Cidade;
import br.com.projetoDrogaria.domain.Estado;

public class CidadeTest {
	@Test
	@Ignore
	public void salvar() {
		Cidade cidade = new Cidade();
		Estado estado = new Estado();
		EstadoDAO daoEstado = new EstadoDAO();
		CidadeDAO daoCidade = new CidadeDAO();
		estado = daoEstado.buscar(4L);
	
		cidade.setNome("Quixadá");
		cidade.setEstado(estado);
		daoCidade.salvar(cidade);
		
	
	}@Test
	@Ignore
	public void listar() {
		CidadeDAO daoCidade = new CidadeDAO();
		List<Cidade> resultado;
		resultado = daoCidade.listar();
		
		for(Cidade cidade: resultado) {
			System.out.println("Nome cidade: " + cidade.getNome());
			System.out.println("Nome Estado: " + cidade.getEstado().getNome());
			System.out.println();
		}
		
		
	}@Test
	@Ignore
	public void buscar(){
		CidadeDAO daoCidade = new CidadeDAO();
		Cidade cidade = daoCidade.buscar(1L);
		System.out.println("Nome cidade: " + cidade.getNome());
		System.out.println("Nome Estado: " + cidade.getEstado().getNome());
		System.out.println();
	
	}@Test
	@Ignore
	public void excluir() {
		
		CidadeDAO daoCidade = new CidadeDAO();
		Cidade cidade = daoCidade.buscar(3L);
		daoCidade.excluir(cidade);
		
	}@Test
	@Ignore
	public void editar() {
		CidadeDAO daoCidade = new CidadeDAO();
		Cidade cidade = daoCidade.buscar(4L);
		cidade.setNome("Quixeramobim");
		daoCidade.editar(cidade);
		
		
	}
	
	
}
