package controller;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextField;
public class Product_control {
	//ATTRIBUTES
	private static Data_control database = new Data_control();
	static ArrayList<String> database_products = database.getDatabase_camiseta();
	//T-SHIRTS NAMES
	public static ArrayList<String> nomeCamisetas(ArrayList<String> database_products){
		ArrayList<String> nomes_camisetas = new ArrayList<String>() ;
		for (int i = 1; i<database_products.size()-1; i = i+11){
			nomes_camisetas.add(database_products.get(i));
			}
		return nomes_camisetas;
	}
	//MAIN
	public static void main (String[] args) {
		System.out.println(nomeCamisetas(database_products));
	}
	//CADASTRAR PRODUTO
	public static ArrayList<String> cadastrar_produto(
			ArrayList<String> database_products,
			JTextField fieldNome,
			JTextField fieldCor,
			JTextField fieldTamanho,
			JTextField fieldComp,
			JTextField fieldTipo,
			JTextField fieldPrecoVenda,
			JTextField fieldPrecoFabrica,
			JTextField fieldEstoque,
			JTextField fieldDescricao,
			JTextField fieldCategoria
			) {
		database_products.add(String.valueOf(new Random().nextInt(10000)));
		database_products.add(fieldNome.getText());
		database_products.add(fieldCor.getText());
		database_products.add(fieldTamanho.getText());
		database_products.add(fieldComp.getText());
		database_products.add(fieldTipo.getText());
		database_products.add(fieldPrecoVenda.getText());
		database_products.add(fieldPrecoFabrica.getText());
		database_products.add(fieldEstoque.getText());
		database_products.add(fieldDescricao.getText());
		database_products.add(fieldCategoria.getText());
    	return database_products;
	}
	//GET AND SET
	public static Data_control getDatabase() {
		return database;
	}
	public static void setDatabase(Data_control database) {
		Product_control.database = database;
	}
	public static ArrayList<String> getDatabase_products() {
		return database_products;
	}
	public static void setDatabase_products(ArrayList<String> database_products) {
		Product_control.database_products = database_products;
	}}