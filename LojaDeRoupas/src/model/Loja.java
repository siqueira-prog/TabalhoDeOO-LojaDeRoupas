//package
package model;

import java.util.*;

//class
public class Loja {
	
	//scanner
	private Scanner sc = new Scanner(System.in);
			
	//attribute
	private String nomeDaLoja;
	private String cnpj;
	private String nomeFantasia;
	private String emailComercial;
	//private Endereco endereco;
	
	//constructor
	public Loja(String c, String n, String nf, String ec) { 
		cnpj = c ;
		nomeDaLoja = n;
		nomeFantasia = nf;
		emailComercial = ec;
		//endereco = e;
	}
	
	//toString
	public String toString() {
		return  "cnpj :" + cnpj + "\n" +
				"nomeDaLoja :" + nomeDaLoja + "\n" +
				"nomeFantasia :" + nomeFantasia + "\n" +
				"emailComercial :" + emailComercial + "\n"; //+
				//"endereco :" + endereco + "\n";
	}
		
	// method building
		
	public ArrayList<String>  cadastrar(
			ArrayList<String> data_loja, 
			String c, 
			String n, 
			String nf, 
			String ec
			) { 
		
			Loja loja = new Loja(
					c,
					n,
					nf,
					ec
					);
			
			data_loja.add(loja.cnpj);
			data_loja.add(loja.nomeDaLoja);
			data_loja.add(loja.nomeFantasia);
			data_loja.add(loja.emailComercial);
			
			//String end_loja_String = Integer.toString(loja.endereco);
			//data_loja.add(end_loja_String);
			
			return data_loja;
		}
		public void visualizar(ArrayList<String> data_loja, String cnpj) {
			
			int position = data_loja.indexOf(cnpj);
			
			if(data_loja.contains(cnpj)) {
				
				System.out.println(
						
						"INFORMAÇÕES DA LOJA"+"\n"+
						"cnpj: " + data_loja.get(position)+"\n"+
						"nomeDaLoja: " + data_loja.get(position+1)+"\n"+
						"nomeFantasia: " + data_loja.get(position+2)+"\n"+
						"emailComercial: " + data_loja.get(position+3)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Loja não cadastrada!");	}
			
		}	
		
		public ArrayList<String>  editar(ArrayList<String> data_loja, String c) {
			
			
			int position = data_loja.indexOf(c);
			
			
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			
			String cnpj = c;
			data_loja.add(cnpj);
			
			System.out.println("Digite o novo nome da loja: " + "\n");
			String nome = sc.nextLine();
			data_loja.add(nome);
			
			System.out.println("Digite o novo nome fantasia da loja: " + "\n");
			String nomef = sc.nextLine();
			data_loja.add(nomef);
			
			System.out.println("Digite o novo email comercial da loja: " + "\n");
			String email = sc.nextLine();
			data_loja.add(email);

			
			System.out.println("Dados atualizados com sucesso!");
						
			return data_loja;
		}
		
		public ArrayList<String>  deletar(ArrayList<String> data_loja, String cnpj) {
			
			// deleting registration
			
			int position = data_loja.indexOf(cnpj);
			
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);

			
			System.out.println("Cadastro deletado com sucesso!");
			return data_loja;
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
//	public Endereco getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}

}
