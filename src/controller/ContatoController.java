package controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class ContatoController {

	private String nome;
	private String email;
	private String mensagem;
	
	public String enviar() {
		System.out.println(nome+"\n"+email+"\n"+mensagem);
		return "Dados enviados!";
	}
	
	public void limpar() {
		nome = "";
		email = "";
		mensagem = "";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	


}