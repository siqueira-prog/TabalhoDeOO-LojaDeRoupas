// package
package controller;

import java.util.ArrayList;
import java.util.Random;

import model.Dados;

//class
public class ControleCamiseta{
	
	public static ArrayList<String> nomeCamisetas() {
		String[] lista_nomes = {};
		ArrayList<String> nomes_camisetas = new ArrayList<String>();
		for (int i = 1; i<Dados.databaseprecadastrado().getData_camiseta().size()-1; i = i+11){;
			   nomes_camisetas.add( Dados.databaseprecadastrado().getData_camiseta().get(i));
			}
		return nomes_camisetas;
	}
}