package br.com.projetoDrogaria.dao;


import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoDrogaria.domain.Cliente;
import br.com.projetoDrogaria.domain.Pessoa;

public class ClienteTest {

	@Test
	@Ignore
	public void salvar() {
		PessoaDAO daoPessoa = new PessoaDAO();
		Pessoa pessoa = daoPessoa.buscar(1L);

		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new Date());
		// data com mascara BR
		// cliente.setDataCadastro(new
		// SimpleDateFormat("dd/MM/yyyy").parse("12/12/12"));
		cliente.setLiberado(true);
		cliente.setPessoa(pessoa);
		ClienteDAO daoCliente = new ClienteDAO();
		daoCliente.salvar(cliente);
	}
	@Test
	public void listar() {
		ClienteDAO daoCliente = new ClienteDAO();
		List<Cliente> resultado = daoCliente.listar();

		for (Cliente cliente : resultado) {
			System.out.println("Data cadastro : " + cliente.getDataCadastro());
			System.out.println("Nome Cliente: " + cliente.getPessoa().getNome());
			System.out.println("liberado: " + cliente.getLiberado());
			System.out.println("Estado: " + cliente.getPessoa().getCidade().getEstado().getNome());
			System.out.println();
			
		}

	}
}
