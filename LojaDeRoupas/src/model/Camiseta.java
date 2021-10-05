//refatorado - tirei os prints e adaptei os métodos alterar, cadastrar e editar 

//package
package model;

import java.util.ArrayList;

//class
public class Camiseta extends Produto {
	
	//attribute
	private String codigo;
	private String nome;
	private String cor;
	private String tamanho;
	private String composicao;
	private String tipo;
	
	//constructor
	public Camiseta(String cod,String n, String c, String t, String comp, String tp) {
		codigo = cod;
		nome = n;
		cor = c;
		tamanho = t;
		composicao = c;
		tipo = tp;
	}
	
	//method construction
	
	public ArrayList<String>  cadastrar(
			ArrayList<String> data_camiseta, 
			String cod,
			String n, 
			String c, 
			String t, 
			String comp, 
			String tp 
			) { 
								
		Camiseta camisa = new Camiseta(
				cod,
				n,
				c,
				t,
				comp,
				tp
				);
		
		data_camiseta.add(camisa.codigo);
		data_camiseta.add(camisa.nome);
		data_camiseta.add(camisa.cor);
		data_camiseta.add(camisa.tamanho);
		data_camiseta.add(camisa.composicao);
		data_camiseta.add(camisa.tipo);
			
		return data_camiseta;
		}

	public void  visualizar(ArrayList<String> data_camiseta, String cod) {
			
			
			int position = data_camiseta.indexOf(cod);
			
			if(data_camiseta.contains(cod)) {
				
				System.out.println(
						
						"INFORMAÇÕES DE CADASTRO"+"\n"+
						"Código: " + data_camiseta.get(position)+ "\n"+
						"Nome: " + data_camiseta.get(position+1)+"\n"+
						"Cor: " + data_camiseta.get(position+2)+"\n"+
						"Tamanho: " + data_camiseta.get(position+3)+"\n"+
						"Composição: " + data_camiseta.get(position+4)+"\n"+
						"Tipo: " + data_camiseta.get(position+5)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Camiseta não encontrada!");	}
			
		}

	public ArrayList<String>  alterar(ArrayList<String> data_camiseta, String cod,String n, String c, String t, String comp, String tp) {
			
			int position = data_camiseta.indexOf(cod);
			
			Camiseta camiseta = new Camiseta(cod, n, c, t, comp, tp);
			
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			
			data_camiseta.add(camiseta.codigo);

			data_camiseta.add(camiseta.nome);

			data_camiseta.add(camiseta.cor);

			data_camiseta.add(camiseta.tamanho);

			data_camiseta.add(camiseta.composicao);

			data_camiseta.add(camiseta.tipo);
						
			return data_camiseta;
		}

	public ArrayList<String>  deletar(ArrayList<String> data_camiseta, String cod) {
			
			// deleting registration
			
			int position = data_camiseta.indexOf(cod);
			
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			
			return data_camiseta;
		}
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
}
