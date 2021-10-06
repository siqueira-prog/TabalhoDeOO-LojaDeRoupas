//refatorado - tirei os prints e adaptei os métodos alterar, cadastrar e editar 

//package
package model;

import java.util.ArrayList;

//class
public class Camiseta extends Produto {
	
	//attribute
	private String nome;
	private String cor;
	private String tamanho;
	private String composicao;
	private String tipo;

	//constructor
	public Camiseta(
			String codP,
			String n,
			String c,
			String t,
			String comp,
			String tp,
			double pv,
			double pf,
			int quant,
			String desc,
			String cat
			) {
		
		codigoProduto = codP;
		nome = n;
		cor = c;
		tamanho = t;
		composicao = comp;
		tipo = tp;
		precoVenda = pv;
		precoFab = pf;
		qtd = quant;
		descricao = desc;
		categoria = cat;
	}

	//toString
	public String toString() {
		return  "Nome: " + nome + "\n" +
				"Cor: " + cor + "\n" +
				"Tamanho: " + tamanho + "\n" +
				"Composição: " + composicao + "\n" +
				"Tipo: " + tipo + "\n" +
				"Preço de venda: " + precoVenda + "\n" +
				"Preço de fabrica: "+ precoFab + "\n"+
				"Quantidade em estoque: "+ qtd + "\n"+
				"Descrição do produto: " + descricao + "\n"+
				"Categoria do produto: " + categoria + "\n";
	}
	
	//method construction
	public ArrayList<String>  cadastrar(ArrayList<String> data_camiseta, Camiseta camisa) { 
								
		data_camiseta.add(camisa.getCodigoProduto());
		
		data_camiseta.add(camisa.getNome());
		
		data_camiseta.add(camisa.getCor());
		
		data_camiseta.add(camisa.getTamanho());
		
		data_camiseta.add(camisa.getComposicao());
		
		data_camiseta.add(camisa.getTipo());
		
		String precoVenda_string = String.valueOf(camisa.getPrecoVenda());
		data_camiseta.add(precoVenda_string);
		
		String precoFab_string = String.valueOf(camisa.getPrecoFab());
		data_camiseta.add(precoFab_string);
		
		String qtd_String = Integer.toString(camisa.getQtd());
		data_camiseta.add(qtd_String);
		
		data_camiseta.add(camisa.getDescricao());

		data_camiseta.add(camisa.getCategoria());
			
		return data_camiseta;
		}

	public void  visualizar(ArrayList<String> data_camiseta, String codP) {
			
			
				int position = data_camiseta.indexOf(codP);
				
				System.out.println(
						
						"INFORMAÇÕES DE CADASTRO"+"\n"+
						"Código do produto: " + data_camiseta.get(position)+ "\n"+
						"Nome: " + data_camiseta.get(position+1)+"\n"+
						"Cor: " + data_camiseta.get(position+2)+"\n"+
						"Tamanho: " + data_camiseta.get(position+3)+"\n"+
						"Composição: " + data_camiseta.get(position+4)+"\n"+
						"Tipo: " + data_camiseta.get(position+5)+"\n"+
						"Preço de venda: " + data_camiseta.get(position+6)+"\n"+
						"Preço de fábrica: " + data_camiseta.get(position+7)+"\n"+
						"Quantidade em estoque: " + data_camiseta.get(position+8)+"\n"+
						"Descrição: " + data_camiseta.get(position+9)+"\n"+
						"Categoria: " + data_camiseta.get(position+10)+"\n"
						);
				}

	public ArrayList<String>  alterar(ArrayList<String> data_camiseta, String codP, Camiseta newCamiseta){ 
		
			int position = data_camiseta.indexOf(codP);
		
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			
			data_camiseta.add(newCamiseta.codigoProduto);

			data_camiseta.add(newCamiseta.nome);

			data_camiseta.add(newCamiseta.cor);

			data_camiseta.add(newCamiseta.tamanho);

			data_camiseta.add(newCamiseta.composicao);

			data_camiseta.add(newCamiseta.tipo);

			String precoVenda_string = String.valueOf(newCamiseta.precoVenda);
			data_camiseta.add(precoVenda_string);
			
			String precoFab_string = String.valueOf(newCamiseta.precoFab);
			data_camiseta.add(precoFab_string);
			
			String qtd_String = Integer.toString(newCamiseta.qtd);
			data_camiseta.add(qtd_String);
			
			data_camiseta.add(newCamiseta.descricao);

			data_camiseta.add(newCamiseta.categoria);
			
			return data_camiseta;
		}

	public ArrayList<String>  deletar(ArrayList<String> data_camiseta, String codP) {
			
			// deleting registration
			
			int position = data_camiseta.indexOf(codP);
			
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
			data_camiseta.remove(position);
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