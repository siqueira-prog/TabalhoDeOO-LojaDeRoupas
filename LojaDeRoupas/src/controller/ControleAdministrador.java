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
	
	
	public ControleAdministrador(int cpf_adm, String nome_adm, String email_adm, String senha_adm,
			String matricula_adm) {
		super();
		this.cpf_adm = cpf_adm;
		this.nome_adm = nome_adm;
		this.email_adm = email_adm;
		this.senha_adm = senha_adm;
		this.matricula_adm = matricula_adm;
	}
	
	public static void main(String[] args) {
		
		
		//System.out.println(data_adm);		
		//System.out.println(Dados.databaseprecadastrado().getData_camiseta());

	}
}
