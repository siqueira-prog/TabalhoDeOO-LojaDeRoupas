// classe refatorada --> adaptei os métodos cadastrar + editar + deletar e tirei os prints 

//package
package model;

import java.util.ArrayList;

//class
public class Loja {
	
	//attribute
	private String nomeDaLoja;
	private String cnpj;
	private String nomeFantasia;
	private String emailComercial;
	private Endereco endereco;
	
	//constructor
	public Loja(String c, String n, String nf, String ec, Endereco end) { 
		cnpj = c ;
		nomeDaLoja = n;
		nomeFantasia = nf;
		emailComercial = ec;
		endereco = end;
	}
	
	//toString
	public String toString() {
		return  "cnpj: " + cnpj + "\n" +
				"nomeDaLoja: " + nomeDaLoja + "\n" +
				"nomeFantasia: " + nomeFantasia + "\n" +
				"Email Comercial: " + emailComercial + "\n"+
				"Endereço: " + endereco + "\n";
	}
		
	// method building
		
	public ArrayList<String>  cadastrar(
			ArrayList<String> data_loja, 
			String c, 
			String n, 
			String nf, 
			String ec,
			Endereco end
			) { 
		
			Loja loja = new Loja(
					c,
					n,
					nf,
					ec,
					end
					);
			
			data_loja.add(loja.cnpj);
			
			data_loja.add(loja.nomeDaLoja);
			
			data_loja.add(loja.nomeFantasia);
			
			data_loja.add(loja.emailComercial);
			
			data_loja.add(loja.endereco.getCep());
			
			data_loja.add(loja.endereco.getLogradouro());
			
			String numeroEnd_String = Integer.toString(loja.endereco.getNumeroEnd());
			data_loja.add(numeroEnd_String);
			
			data_loja.add(loja.endereco.getBairro());
			
			data_loja.add(loja.endereco.getCidade());
			
			data_loja.add(loja.endereco.getEstado());
			
			return data_loja;
		}
	
	public void visualizar(ArrayList<String> data_loja, String cnpj) {
			
			int position = data_loja.indexOf(cnpj);
			
			if(data_loja.contains(cnpj)) {
				
				System.out.println(
						
						"INFORMAÇÕES DA LOJA"+"\n"+
						"Cnpj: " + data_loja.get(position)+"\n"+
						"Nome da Loja: " + data_loja.get(position+1)+"\n"+
						"Nome Fantasia: " + data_loja.get(position+2)+"\n"+
						"Email Comercial: " + data_loja.get(position+3)+"\n"+
						"Cep: " + data_loja.get(position+4)+"\n"+
						"Logradouro: " + data_loja.get(position+5)+"\n"+
						"Número: " + data_loja.get(position+6)+"\n"+
						"Bairro: " + data_loja.get(position+7)+"\n"+
						"Cidade: " + data_loja.get(position+8)+"\n"+
						"Estado: " + data_loja.get(position+9)+"\n"
						);
				}
				
			else {
				
				System.out.println("Loja não cadastrada!");	}
			
		}	
		
	public ArrayList<String>  editar(ArrayList<String> data_loja, String c, String n, String nf, String ec, Endereco end) {
			
			
			int position = data_loja.indexOf(c);
			
			Loja loja = new Loja(c,n,nf,ec,end);
			
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			
			data_loja.add(loja.cnpj);
			
			data_loja.add(loja.nomeDaLoja);
			
			data_loja.add(loja.nomeFantasia);
			
			data_loja.add(loja.emailComercial);

			data_loja.add(loja.endereco.getCep());
			
			data_loja.add(loja.endereco.getLogradouro());
			
			String numeroEnd_String = Integer.toString(loja.endereco.getNumeroEnd());
			data_loja.add(numeroEnd_String);
			
			data_loja.add(loja.endereco.getBairro());
			
			data_loja.add(loja.endereco.getCidade());
			
			data_loja.add(loja.endereco.getEstado());
						
			return data_loja;
		}
		
	public ArrayList<String>  deletar(ArrayList<String> data_loja, String cnpj) {
			
			// deleting registration
			
			int position = data_loja.indexOf(cnpj);
			
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);
			data_loja.remove(position);

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
