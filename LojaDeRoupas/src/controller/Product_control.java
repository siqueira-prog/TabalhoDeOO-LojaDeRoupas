package controller;

import java.util.ArrayList;

public class Product_control {
	private static Data_control database = new Data_control();
	static ArrayList<String> database_products = database.getDatabase_camiseta();
	
	public static ArrayList<String> nomeCamisetas(){
		ArrayList<String> nomes_camisetas = new ArrayList<String>() ;
		for (int i = 1; i<database_products.size()-1; i = i+11){
			nomes_camisetas.add(database_products.get(i));
			}
		return nomes_camisetas;
	}
	
	public static void main (String[] args) {
		System.out.println(nomeCamisetas());
	}}
