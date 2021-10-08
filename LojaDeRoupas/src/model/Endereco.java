//package
package model;

import java.util.ArrayList;

// class
public class Endereco {
	

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

	public ArrayList<String> cadastrar(ArrayList<String> data_endereco, Endereco endereco) { 
						
			data_endereco.add(endereco.getId());
			data_endereco.add(endereco.getCep()); 
			data_endereco.add(endereco.getLogradouro()); 
			
			String numeroEnd_string = Integer.toString(endereco.getNumeroEnd());
			data_endereco.add(numeroEnd_string);
			
			data_endereco.add(endereco.getBairro()); 
			data_endereco.add(endereco.getCidade()); 
			data_endereco.add(endereco.getEstado());
			
			return data_endereco; 
			
			
		}
		
	public void visualizar(ArrayList<String> data_endereco, Endereco endereco) {
			
			int position = data_endereco.indexOf(endereco.getId());
				
				System.out.println(
						
						"INFORMAÇÕES DO ENDEREÇO"+"\n"+
						"Identificador: " + data_endereco.get(position)+"\n"+
						"Cep: " + data_endereco.get(position+1)+"\n"+
						"Logradouro: " + data_endereco.get(position+2)+"\n"+
						"Número do endereço: " + data_endereco.get(position+3)+"\n"+
						"bairro: " + data_endereco.get(position+4)+"\n"+
						"cidade: " + data_endereco.get(position+5)+"\n"+
						"estado: " + data_endereco.get(position+6)+"\n"
						
						);}	
		
	public void editar(ArrayList<String> data_endereco, Endereco newendereco) {

			int position = data_endereco.indexOf(newendereco.getId());
			
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			data_endereco.remove(position);
			
			data_endereco.add(newendereco.getId());
			

			data_endereco.add(newendereco.getCep());
	
			data_endereco.add(newendereco.getLogradouro());

			String numeroEnd_string = Integer.toString(newendereco.getNumeroEnd());
			data_endereco.add(numeroEnd_string);
			
			data_endereco.add(newendereco.getBairro());

			data_endereco.add(newendereco.getCidade());

			data_endereco.add(newendereco.getEstado());
				
			}
				
	//getters and setters 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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

