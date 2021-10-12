package controller;

import java.util.ArrayList;

import model.Dados;
public class Data_control {

	private  Dados database = Dados.databaseprecadastrado();
	private  ArrayList<String> database_client = database.getData_cliente();
	private  ArrayList<String> database_tell = database.getData_tell();
	private  ArrayList<String> database_end = database.getData_end();
	private  ArrayList<String> database_cdc = database.getData_cdc();
	private  ArrayList<String> database_compra = database.getData_compra();
	private  ArrayList<String> database_camiseta = database.getData_camiseta();
	private  ArrayList<String> database_loja = database.getData_loja();
	private  ArrayList<String> database_adm = database.getData_adm();

	public static void main(String[] args) {
		
		// alguns dados para testes:
		// login adm -> adm10@email.com --> senha = 101010
		// login cliente -> cliente10@email.com --> senha 10
		Data_control database = new Data_control();
		System.out.println(database.getDatabase_client().size());
	}

	
	
	public Dados getDatabase() {
		return database;
	}
	public void setDatabase(Dados database) {
		this.database = database;
	}
	public ArrayList<String> getDatabase_client() {
		return database_client;
	}

	public void setDatabase_client(ArrayList<String> database_client) {
		this.database_client = database_client;
	}

	public ArrayList<String> getDatabase_tell() {
		return database_tell;
	}

	public void setDatabase_tell(ArrayList<String> database_tell) {
		this.database_tell = database_tell;
	}

	public ArrayList<String> getDatabase_end() {
		return database_end;
	}

	public void setDatabase_end(ArrayList<String> database_end) {
		this.database_end = database_end;
	}

	public ArrayList<String> getDatabase_cdc() {
		return database_cdc;
	}

	public void setDatabase_cdc(ArrayList<String> database_cdc) {
		this.database_cdc = database_cdc;
	}

	public ArrayList<String> getDatabase_compra() {
		return database_compra;
	}

	public void setDatabase_compra(ArrayList<String> database_compra) {
		this.database_compra = database_compra;
	}

	public ArrayList<String> getDatabase_camiseta() {
		return database_camiseta;
	}

	public void setDatabase_camiseta(ArrayList<String> database_camiseta) {
		this.database_camiseta = database_camiseta;
	}

	public ArrayList<String> getDatabase_loja() {
		return database_loja;
	}

	public void setDatabase_loja(ArrayList<String> database_loja) {
		this.database_loja = database_loja;
	}

	public ArrayList<String> getDatabase_adm() {
		return database_adm;
	}

	public void setDatabase_adm(ArrayList<String> database_adm) {
		this.database_adm = database_adm;
	}}
