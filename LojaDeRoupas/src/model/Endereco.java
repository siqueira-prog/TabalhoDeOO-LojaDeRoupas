//package
package model;

import java.util.*;


// class
public class Endereco {
	
	//scanner
			public static Scanner sc;
			
	//attribute
	private String logradouro;
	private int numeroEnd;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	//constructor
		public Endereco( String l, int n, String b, String c, String cid, String e) { 
			logradouro = l;
			numeroEnd = n;
			bairro = b; 
			cep = c;
			cidade = cid;
			estado = e;
		}
		
	//method construction
		
		public void cadastrar() { 
			
			ArrayList<String> data_endereco = new ArrayList<String>();
			data_endereco.add(logradouro); 
			String numeroEnd_string = Integer.toString(numeroEnd);
			data_endereco.add(numeroEnd_string);
			data_endereco.add(bairro); 
			data_endereco.add(cep); 
			data_endereco.add(cidade); 
			data_endereco.add(estado); 
			
			
		}
		
		public void visualizar(ArrayList<String> data_endereco, String logradouro) {
			
			int position = data_endereco.indexOf(logradouro);
			
			if(data_endereco.contains(logradouro)) {
				
				System.out.println(
						
						"INFORMAÇÕES DE ENDEREÇO"+"\n"+
						"logradouro: " + data_endereco.get(position)+"\n"+
						"numeroEnd: " + data_endereco.get(position+1)+"\n"+
						"bairro: " + data_endereco.get(position+2)+"\n"+
						"cep: " + data_endereco.get(position+3)+"\n"+
						"cidade: " + data_endereco.get(position+4)+"\n"+
						"estado: " + data_endereco.get(position+5)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Endereço não encontrado!");	}
			
		}	
		
		public void editar(ArrayList<String> data_endereco, String logradouro) {
			
			int position = data_endereco.indexOf(logradouro);
				
			data_endereco.remove(position);
			data_endereco.remove(position+1);
			data_endereco.remove(position+2);
			data_endereco.remove(position+3);
			data_endereco.remove(position+4);
			data_endereco.remove(position+5);
		
			System.out.println("Digite seu logradouro: " + "\n");
			String new_logradouro = sc.nextLine();
			data_endereco.add(new_logradouro);
			System.out.println("Digite seu numeroEnd: " + "\n");
			String new_numeroEnd = sc.nextLine();
			data_endereco.add(new_numeroEnd);
			System.out.println("Digite seu bairro: " + "\n");
			String new_bairro = sc.nextLine();
			data_endereco.add(new_bairro);
			System.out.println("Digite seu cep: " + "\n");
			String new_cep = sc.nextLine();
			data_endereco.add(new_cep);
			System.out.println("Digite seu cidade: " + "\n");
			String new_cidade = sc.nextLine();
			data_endereco.add(new_cidade);
			System.out.println("Digite seu estado: " + "\n");
			String new_estado = sc.nextLine();
			data_endereco.add(new_estado);
				
				
			}
				
	//getters and setters 
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumeroEnd() {
		return numeroEnd;
	}
	public void setNumeroEnd(int numeroEnd) {
		this.numeroEnd = numeroEnd;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}

