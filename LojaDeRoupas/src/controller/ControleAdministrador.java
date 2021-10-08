// package
package controller;

import java.util.ArrayList;
import model.Administrador;
import model.Dados;

//class
public class ControleAdministrador{
	
	private int cpf_adm;
	private String nome_adm;
	private String email_adm;
	private String senha_adm;
	private String matricula_adm;
	private static ArrayList<String> data_adm = Dados.databaseprecadastrado().getData_adm();
	
	public static void main(String[] args) {
		
		
		//System.out.println(data_adm);		
		//System.out.println(Dados.databaseprecadastrado().getData_camiseta());
		nomeCamisetas();
	}
	public static void nomeCamisetas() {
		ArrayList<String> nomes_camisetas = new ArrayList<String>();
		for (int i = 1; i<Dados.databaseprecadastrado().getData_camiseta().size()-1; i = i+11){;
			   nomes_camisetas.add( Dados.databaseprecadastrado().getData_camiseta().get(i));
			}
		System.out.println(nomes_camisetas);
	}
}
