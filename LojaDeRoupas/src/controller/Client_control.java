package controller;

import java.util.ArrayList;

public class Client_control {
	
	//ATTRIBUTES
	private static Data_control database = new Data_control();
	static ArrayList<String> database_client = database.getDatabase_camiseta();
	public  String cpf;
	public  String nome;
	public  String email;	
	public  String senha;	
	public  String telefone;	
	public  String endereco;
	public  String cartao;	
	
	//CONSTRUCTOR
	public Client_control(int index) {	
		   super();
		   this.cpf 	= database_client.get(index+0);
		   this.nome	= database_client.get(index+1);
		   this.email	= database_client.get(index+2);
		   this.senha	= database_client.get(index+3);
		   this.telefone= database_client.get(index+4);
		   this.endereco= database_client.get(index+5);
		   this.cartao	= database_client.get(index+6);
	}	
	
	
	//ARRAYLIST - TELEFONE
	
	
	
	//ARRAYLIST - ENDERECO
	
	
	
	//ARRAYLIST - CARTAO
	
	//MAIN
	public static void main(String[] args) {}
	
	//GET AND SET
	public static ArrayList<String> getDatabase_client() {
		return database_client;
	}
	public static void setDatabase_client(ArrayList<String> database_client) {
		Client_control.database_client = database_client;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
}
