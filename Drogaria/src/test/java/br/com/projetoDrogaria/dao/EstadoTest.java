package br.com.projetoDrogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoDrogaria.domain.Estado;

public class EstadoTest {
	@Test
	@Ignore
	public void salvar(){
		Estado estado= new Estado();
		estado.setNome("Ceará");
		estado.setSigla("CE");
		EstadoDAO dao = new EstadoDAO();
		dao.salvar(estado);
		
	}
	@Test
	@Ignore
	public void listar(){
		EstadoDAO dao = new EstadoDAO();
		List<Estado> resultado = dao.listar();
		
		for (Estado estado : resultado) {
			System.out.println("Estado: " +estado.getNome() + " Sigla: " + estado.getSigla());
		}
	}
	@Test
	@Ignore
	public void buscar(){
		EstadoDAO dao = new EstadoDAO();
		Estado estado = dao.buscar(1L);
		
		System.out.println(estado.getNome());
		
	}@Test
	@Ignore
	public void excluir(){
		EstadoDAO dao = new EstadoDAO();
		Estado estado = dao.buscar(3L);
		dao.excluir(estado);
		
		
	}
	@Test
	public void editar(){
		EstadoDAO dao = new EstadoDAO();
		Estado estado = dao.buscar(4L);
		estado.setNome("Ceará");
		dao.editar(estado);
	
	}

}
