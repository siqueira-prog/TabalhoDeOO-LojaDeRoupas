package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Endereco;

public class ControleLoja {
	//scanner
	public static Scanner sc;
	
	//attribute
	private String nomeDaLoja;
	private String cnpj;
	private String nomeFantasia;
	private String emailComercial;
	private Endereco endereco;
	
	//constructor
	public ControleLoja(String n, String c, String nf, String ec, Endereco e) { 
		nomeDaLoja = n;
		cnpj = c ;
		nomeFantasia = nf;
		emailComercial = ec;
		endereco = e;
	}
	
	//toString
	public String toString() {
		return  "nomeDaLoja :" + nomeDaLoja + "\n" +
				"cnpj :" + cnpj + "\n" +
				"nomeFantasia :" + nomeFantasia + "\n" +
				"emailComercial :" + emailComercial + "\n" +
				"endereco :" + endereco + "\n";
	}
	
	// method building
	
	public void cadastrar() { 
		
		ArrayList<String> data_loja = new ArrayList<String>();
		data_loja.add(nomeDaLoja); 
		data_loja.add(cnpj);
		data_loja.add(nomeFantasia); 
		data_loja.add(emailComercial); 
		
	}
	
	public void visualizar(ArrayList<String> data_loja, String emailComercial) {
		
		int position = data_loja.indexOf(emailComercial);
		
		if(data_loja.contains(emailComercial)) {
			
			System.out.println(
					
					"INFORMAÇÕES DA LOJA"+"\n"+
					"nomeDaLoja: " + data_loja.get(position-3)+"\n"+
					"cnpj: " + data_loja.get(position-2)+"\n"+
					"nomeFantasia: " + data_loja.get(position-1)+"\n"+
					"emailComercial: " + data_loja.get(position)+"\n"
					
					);
			}
			
		else {
			
			System.out.println("Endereço não encontrado!");	}
		
	}	
	
	public void editar(ArrayList<String> data_loja, String emailComercial) {
		
		int position = data_loja.indexOf(emailComercial);
			
		data_loja.remove(position);
		data_loja.remove(position-1);
		data_loja.remove(position-2);
		data_loja.remove(position-3);
	
	
		System.out.println("Digite o nome da loja: " + "\n");
		String new_nomeDaLoja = sc.nextLine();
		data_loja.add(new_nomeDaLoja);
		System.out.println("Digite o cpnj da loja: " + "\n");
		String new_cpnj = sc.nextLine();
		data_loja.add(new_cpnj);
		System.out.println("Digite o nome fantasia da loja: " + "\n");
		String nomeFantasia = sc.nextLine();
		data_loja.add(nomeFantasia);
		System.out.println("Digite o email comercial da loja " + "\n");
		String new_emailComercial = sc.nextLine();
		data_loja.add(new_emailComercial);
			
		}
	//getters and setters 
	public String getNomeDaLoja() {
	return nomeDaLoja;
	}
	public void setNomeDaLoja(String nomeDaLoja) {
	this.nomeDaLoja = nomeDaLoja;
	}
	public String getCnpj() {
	return cnpj;
	}
	public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
	return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
	}
	public String getEmailComercial() {
	return emailComercial;
	}
	public void setEmailComercial(String emailComercial) {
	this.emailComercial = emailComercial;
	}
	public Endereco getEndereco() {
	return endereco;
	}
	public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
	}
}
