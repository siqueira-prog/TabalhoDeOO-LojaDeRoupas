package controller;

import java.util.ArrayList;

import model.Dados;
public class Data_control {

	static Dados database = Dados.databaseprecadastrado();
	static ArrayList<String> database_client = database.getData_cliente();
	static ArrayList<String> database_tell = database.getData_tell();
	static ArrayList<String> database_end = database.getData_end();
	static ArrayList<String> database_cdc = database.getData_cdc();
	static ArrayList<String> database_compra = database.getData_compra();
	static ArrayList<String> database_camiseta = database.getData_camiseta();
	static ArrayList<String> database_loja = database.getData_loja();
	static ArrayList<String> database_adm = database.getData_adm();
	
	public static void main(String[] args) {
		
		// alguns dados para testes:
		// login adm -> adm10@email.com --> senha = 101010
		// login cliente -> cliente10@email.com --> senha 10
		
		System.out.println("CLIENTE");
		System.out.println(" ");
		System.out.println(database_client);
		System.out.println(" ");
		System.out.println("TELEFONE");
		System.out.println(" ");
		System.out.println(database_tell);
		System.out.println(" ");
		System.out.println("ENDEREÇO");
		System.out.println(" ");
		System.out.println(database_end);
		System.out.println(" ");
		System.out.println("CARTAO DE CRÉDITO");
		System.out.println(" ");
		System.out.println(database_cdc);
		System.out.println(" ");
		System.out.println("COMPRA");
		System.out.println(" ");
		System.out.println(database_compra);
		System.out.println(" ");
		System.out.println("CAMISETA");
		System.out.println(" ");
		System.out.println(database_camiseta);
		System.out.println(" ");
		System.out.println("LOJA");
		System.out.println(" ");
		System.out.println(database_loja);
		System.out.println(" ");
		System.out.println("ADMINISTRADOR");
		System.out.println(" ");
		System.out.println(database_adm);
		
	}

	
	public static Dados getDatabase() {
		return database;
	}

	public static void setDatabase(Dados database) {
		Data_control.database = database;
	}

	public static ArrayList<String> getDatabase_client() {
		return database_client;
	}

	public static void setDatabase_client(ArrayList<String> database_client) {
		Data_control.database_client = database_client;
	}

	public static ArrayList<String> getDatabase_tell() {
		return database_tell;
	}

	public static void setDatabase_tell(ArrayList<String> database_tell) {
		Data_control.database_tell = database_tell;
	}

	public static ArrayList<String> getDatabase_end() {
		return database_end;
	}

	public static void setDatabase_end(ArrayList<String> database_end) {
		Data_control.database_end = database_end;
	}

	public static ArrayList<String> getDatabase_cdc() {
		return database_cdc;
	}

	public static void setDatabase_cdc(ArrayList<String> database_cdc) {
		Data_control.database_cdc = database_cdc;
	}

	public static ArrayList<String> getDatabase_compra() {
		return database_compra;
	}

	public static void setDatabase_compra(ArrayList<String> database_compra) {
		Data_control.database_compra = database_compra;
	}

	public static ArrayList<String> getDatabase_camiseta() {
		return database_camiseta;
	}

	public static void setDatabase_camiseta(ArrayList<String> database_camiseta) {
		Data_control.database_camiseta = database_camiseta;
	}

	public static ArrayList<String> getDatabase_loja() {
		return database_loja;
	}

	public static void setDatabase_loja(ArrayList<String> database_loja) {
		Data_control.database_loja = database_loja;
	}

	public static ArrayList<String> getDatabase_adm() {
		return database_adm;
	}

	public static void setDatabase_adm(ArrayList<String> database_adm) {
		Data_control.database_adm = database_adm;
	}


}
