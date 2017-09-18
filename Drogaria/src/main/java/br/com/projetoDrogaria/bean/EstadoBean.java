package br.com.projetoDrogaria.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.projetoDrogaria.dao.EstadoDAO;
import br.com.projetoDrogaria.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable {

	private Estado estado;
	private List<Estado> estados;

	public void novo() {
		estado = new Estado();

	}

	public void salvar() {
		// System.out.println(estado);
		boolean error = false;
		try {
			EstadoDAO daoEstado = new EstadoDAO();
			daoEstado.merge(estado);
			novo();
			listar();

		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar Salvar o Estado");
			erro.printStackTrace();
			error = true;

		}
		if (!error) {

			Messages.addGlobalInfo("Salvo com sucesso!");

		}

		// String msg = "Programação Web com Java";
		// FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg,
		// msg);
		// FacesContext contexto = FacesContext.getCurrentInstance();
		// contexto.addMessage(null, message);
	}

	@PostConstruct
	public void listar() {

		try {
			EstadoDAO daoEstado = new EstadoDAO();
			estados = daoEstado.listar();
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar Listar");
			erro.printStackTrace();

		}

	}

	public void excluir(ActionEvent evento) {
		boolean error = false;
		try {
			estado = (Estado) evento.getComponent().getAttributes().get("estadoSelecionado");
			EstadoDAO daoEstado = new EstadoDAO();
			daoEstado.excluir(estado);
			estados = daoEstado.listar();

		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar Excluir o Estado");
			erro.printStackTrace();
			error = true;

		}
		if (!error) {

			Messages.addGlobalInfo("Estado excluido com sucesso!");

		}

	}

	public void editar(ActionEvent evento) {
		estado = (Estado) evento.getComponent().getAttributes().get("estadoSelecionado");

	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

}
