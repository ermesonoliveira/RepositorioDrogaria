package br.com.projetoDrogaria.dao;

import org.junit.Test;

import br.com.projetoDrogaria.domain.Pessoa;
import br.com.projetoDrogaria.domain.Usuario;

public class UsuarioTest {

	@Test
	public void salvar() {
		Usuario usuario = new Usuario();
		PessoaDAO daoPessoa = new PessoaDAO();
		Pessoa pessoa = daoPessoa.buscar(1L);
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("1234");
		usuario.setTipo('a');
		UsuarioDAO daoUsuario = new UsuarioDAO();
		daoUsuario.salvar(usuario);
		
		
	}
}
