//package
package model;

import java.util.*;


// class
public class Endereco {
	
	//scanner
	private Scanner sc = new Scanner(System.in);
			
	//attribute
	private String id;
	private String cep;
	private String logradouro;
	private int numeroEnd;
	private String bairro;
	private String cidade;
	private String estado;
	
	//constructor
	public Endereco(String identificador, String c, String l, int n, String b, String cid, String e) { 
			id = identificador;
			logradouro = l;
			numeroEnd = n;
			bairro = b; 
			cep = c;
			cidade = cid;
			estado = e;
		}
	
	
		
	//method construction

	public String toString() {
		return 		
		      "\n"+"Cep        = " + cep
			+ "\n"+"Logradouro = " + logradouro 
			+ "\n"+"Número     = "+ numeroEnd 
			+ "\n"+"Bairro     = " + bairro 
			+ "\n"+"Cidade     = " + cidade 
			+ "\n"+"Estado     = "+ estado + "\n";
	}

	public ArrayList<String> cadastrar(ArrayList<String> data_endereco, String id, String c, String l, int n, String b, String cid, String e) { 
			
			Endereco endereco = new Endereco(
					id,
					c,
					l,
					n,
					b,
					cid,
					e
					);
			
			data_endereco.add(endereco.id);
			data_endereco.add(endereco.cep); 
			data_endereco.add(endereco.logradouro); 
			
			String numeroEnd_string = Integer.toString(endereco.numeroEnd);
			data_endereco.add(numeroEnd_string);
			
			data_endereco.add(endereco.bairro); 
			data_endereco.add(endereco.cidade); 
			data_endereco.add(endereco.estado);
			
			return data_endereco; 
			
			
		}
		
	public void visualizar(ArrayList<String> data_endereco, String id) {
			
			int position = data_endereco.indexOf(id);
			
			if(data_endereco.contains(id)) {
				
				System.out.println(
						
						"INFORMAÇÕES DO ENDEREÇO"+"\n"+
						"Cep: " + data_endereco.get(position)+"\n"+
						"Logradouro: " + data_endereco.get(position+1)+"\n"+
						"Número do endereço: " + data_endereco.get(position+2)+"\n"+
						"bairro: " + data_endereco.get(position+3)+"\n"+
						"cidade: " + data_endereco.get(position+4)+"\n"+
						"estado: " + data_endereco.get(position+5)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Endereço não encontrado!");	}
			
		}	
		
	public void editar(ArrayList<String> data_endereco, String id) {
			
			int position = data_endereco.indexOf(id);
			
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			
			data_endereco.add(id);
			
			System.out.println("Digite o cep: " + "\n");
			String new_cep = sc.nextLine();
			data_endereco.add(new_cep);
			System.out.println("Digite o logradouro: " + "\n");
			String new_logradouro = sc.nextLine();
			data_endereco.add(new_logradouro);
			System.out.println("Digite o número do endereço: " + "\n");
			String new_numeroEnd = sc.nextLine();
			data_endereco.add(new_numeroEnd);
			System.out.println("Digite o bairro: " + "\n");
			String new_bairro = sc.nextLine();
			data_endereco.add(new_bairro);
			System.out.println("Digite seu cidade: " + "\n");
			String new_cidade = sc.nextLine();
			data_endereco.add(new_cidade);
			System.out.println("Digite sua estado: " + "\n");
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

