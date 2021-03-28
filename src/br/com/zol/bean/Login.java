package br.com.zol.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "loginBean")
@RequestScoped

public class Login {
	private String usuario;
	private String senha;
	private String mensagem;

	public String ValidaLogin() {
		if (usuario.equals("Adimin")) {
			if (senha.contentEquals("123456")) {
				return "/loginCorreto.xhtml";
			} else {
				return "/loginErrado.xhtml";
			}
		} else {
			return "/mensagemErro.xhtml";
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}