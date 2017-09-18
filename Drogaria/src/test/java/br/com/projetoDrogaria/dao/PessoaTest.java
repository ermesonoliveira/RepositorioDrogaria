package br.com.projetoDrogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoDrogaria.domain.Cidade;
import br.com.projetoDrogaria.domain.Pessoa;

public class PessoaTest {

	@Test
	@Ignore
	public void salvar() {
		Pessoa pessoa = new Pessoa();
		CidadeDAO daoCidade = new CidadeDAO();
		Cidade cidade = daoCidade.buscar(1L);
		pessoa.setBairro("Lagoa");
		pessoa.setCelular("8899999999");
		pessoa.setCep("639000000");
		pessoa.setCidade(cidade);
		pessoa.setComplemento("casa");
		pessoa.setCpf("00000000000");
		pessoa.setEmail("mvp_ermeson@hotmail.com");
		pessoa.setNome("Ermeson");
		pessoa.setNumero(new Short("888"));
		pessoa.setRg("200000000");
		pessoa.setRua("Frazao");
		pessoa.setTelefone("40028922");
		PessoaDAO daoPessoa = new PessoaDAO();
		daoPessoa.salvar(pessoa);
		
	}@Test
	public void listar() {
		PessoaDAO daoPessoa = new PessoaDAO();
		List<Pessoa> resultado = daoPessoa.listar();
			for (Pessoa pessoa : resultado) {
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Cidade: " + pessoa.getCidade().getNome());
				System.out.println("Estado " + pessoa.getCidade().getEstado().getNome());
			}	
		
	}
	
	
}
