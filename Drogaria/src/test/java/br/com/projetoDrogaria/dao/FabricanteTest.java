package br.com.projetoDrogaria.dao;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoDrogaria.domain.Fabricante;

public class FabricanteTest {
	@Test
	@Ignore
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Unicatolica Quixada");
		FabricanteDAO dao = new FabricanteDAO();
		dao.salvar(fabricante);
	}

	@Test
	@Ignore
	public void listar() {
		FabricanteDAO dao = new FabricanteDAO();
		List<Fabricante> resultado = dao.listar();
		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getDescricao());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		FabricanteDAO dao = new FabricanteDAO();
		Fabricante fabricante = dao.buscar(1L);

		System.out.println(fabricante.getDescricao());
	}

	@Test
	@Ignore
	public void excluir() {
		FabricanteDAO dao = new FabricanteDAO();
		Fabricante fabricante = dao.buscar(2L);
		dao.excluir(fabricante);
	}

	@Test
	public void editar() {
		FabricanteDAO dao = new FabricanteDAO();
		Fabricante fabricante = dao.buscar(3L);
		fabricante.setDescricao("Unicatólica Ceará");
		dao.editar(fabricante);
	}

}
