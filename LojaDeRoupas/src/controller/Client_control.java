package controller;
import java.util.ArrayList;
import javax.swing.*;
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
	//CADASTRAR CLIENTE
	public static ArrayList<String> cadastrar_cliente(
			ArrayList<String> database_client,
			JTextField fieldCPF,	
			JTextField fieldNome,
			JTextField fieldEmail,
			JPasswordField senha, 
			JTextField fieldDDD,
			JTextField fieldTele,
			JTextField fieldCep,
			JTextField fieldLogradouro,
			JTextField fieldNumeroEnd,
			JTextField fieldBairro,
			JTextField fieldCidade,
			JTextField fieldEstado,
			JTextField fieldBand,
			JTextField fieldNumCart,
			JTextField fieldCodSeg,
			JTextField fieldDataNasc,
			JTextField fieldMesVenc,
			JTextField fieldAnoVenc) 
	{
    	database_client.add(fieldCPF.getText());
    	database_client.add(fieldNome.getText());
    	database_client.add(fieldEmail.getText());
        char[] senhaChar  = senha.getPassword();
        String senhaString = String.valueOf(senhaChar);
    	database_client.add(senhaString);
    	database_client.add(fieldDDD.getText()+fieldTele.getText());
    	database_client.add(fieldCep.getText());
    	database_client.add(fieldLogradouro.getText());
    	database_client.add(fieldNumeroEnd.getText());
    	database_client.add(fieldBairro.getText());
    	database_client.add(fieldCidade.getText());
    	database_client.add(fieldEstado.getText());
    	database_client.add(fieldBand.getText());
    	database_client.add(fieldNumCart.getText());
    	database_client.add(fieldCodSeg.getText());
    	database_client.add(fieldDataNasc.getText());
    	database_client.add(fieldMesVenc.getText());
    	database_client.add(fieldAnoVenc.getText());
    	database_client.add("1");
		return database_client;
	}
	//EDITAR PERFIL CLIENTE
	public static ArrayList<String> editar_cliente(
			int index,
			ArrayList<String> database_client,
			JTextField fieldCPF,	
			JTextField fieldNome,
			JTextField fieldEmail,
			JPasswordField senha, 
			JTextField fieldDDD,
			JTextField fieldTele,
			JTextField fieldCep,
			JTextField fieldLogradouro,
			JTextField fieldNumeroEnd,
			JTextField fieldBairro,
			JTextField fieldCidade,
			JTextField fieldEstado,
			JTextField fieldBand,
			JTextField fieldNumCart,
			JTextField fieldCodSeg,
			JTextField fieldDataNasc,
			JTextField fieldMesVenc,
			JTextField fieldAnoVenc) 
	{
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	//CPF
    	database_client.add(fieldCPF.getText());
    	//NOME
    	database_client.add(fieldNome.getText());
    	//EMAIL
    	database_client.add(fieldEmail.getText());
        //SENHA
    	char[] senhaChar = senha.getPassword();
        String senhaString = String.valueOf(senhaChar);
    	database_client.add(senhaString);
    	//TELEFONE
    	database_client.add(fieldDDD.getText()+fieldTele.getText());
    	database_client.add(fieldCep.getText());
    	//ENDERECO
    	database_client.add(fieldLogradouro.getText());
    	database_client.add(fieldNumeroEnd.getText());
    	database_client.add(fieldBairro.getText());
    	database_client.add(fieldCidade.getText());
    	database_client.add(fieldEstado.getText());
    	//CARTAO DE CREDITO
    	database_client.add(fieldBand.getText());
    	database_client.add(fieldNumCart.getText());
    	database_client.add(fieldCodSeg.getText());
    	database_client.add(fieldDataNasc.getText());
    	database_client.add(fieldMesVenc.getText());
    	database_client.add(fieldAnoVenc.getText());
    	//NIVEL
    	database_client.add("1");
    	return database_client;	
	}
	//EXCLUIR PERFIL CLIENTE
	public static ArrayList<String> excluir_cliente(
			int index,
			ArrayList<String> database_client) 
	{
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	database_client.remove(index-2);
    	return database_client;	
	}
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
	}}