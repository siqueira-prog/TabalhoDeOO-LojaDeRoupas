//package
package model;

import java.util.*;

//abstract class
public abstract class Usuario {

	
	//attribute
	protected String nomeDoUsuario; 
	protected int cpf;
	protected String email;
	protected String senha;
	protected int nivel;
	
	
	//getters and setters 
	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}
	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}

	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	//method signature
	
	public abstract ArrayList<String>  cadastrar(
			ArrayList<String> data_client,
			int c,
			String n,
			String e,
			String s,
			Telefone tel,
			Endereco end[],
			CartaoDeCredito cdc[]);
	public abstract void visualizar (ArrayList<String> data_client, String c);
	public abstract ArrayList<String>  editar(
			ArrayList<String> database,
			String c,
			String n,
			String e,
			String s,
			Telefone tel,
			Endereco end[],
			CartaoDeCredito cdc[]);
	public abstract ArrayList<String>  deletar(ArrayList<String> data_client, String c); 
	
	//main class - testing

	
	
}
