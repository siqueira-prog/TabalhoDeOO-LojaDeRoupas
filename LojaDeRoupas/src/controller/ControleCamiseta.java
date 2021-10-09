// package
package controller;
/**
* Busca pelo nome das camisetas e gera um array para para visualizar
* @author Grupo T3.1
* @version 1.0 (Out 2021)
*/
import java.util.ArrayList;
import java.util.Random;

import model.Dados;

//class
public class ControleCamiseta{
	/**
	* Gera o array com os nomes das camiseta(produtos) para serem vizualidos na
	* interface Teste de texto prara ver se aparece na documentcao
	*
	* @return Array de camisetas
	*
	*/
	public static ArrayList<String> nomeCamisetas() {
		String[] lista_nomes = {};
		ArrayList<String> nomes_camisetas = new ArrayList<String>();
		for (int i = 1; i<Dados.databaseprecadastrado().getData_camiseta().size()-1; i = i+11){;
			   nomes_camisetas.add( Dados.databaseprecadastrado().getData_camiseta().get(i));
			}
		return nomes_camisetas;
	}
}