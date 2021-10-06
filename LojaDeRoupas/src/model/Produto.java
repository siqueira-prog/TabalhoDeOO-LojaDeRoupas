//package
package model;

import java.util.ArrayList;

//class
public abstract class Produto {
	
	//attribute 
	protected String codigoProduto; 
	protected double precoVenda;
	protected double precoFab;
	protected int qtd;
	protected String descricao;
	protected String categoria;
	
	//getters and setters 
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public double getPrecoFab() {
		return precoFab;
	}
	public void setPrecoFab(double precoFab) {
		this.precoFab = precoFab;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	//method signature
	
	public abstract ArrayList<String>  cadastrar(ArrayList<String> data_camiseta, Camiseta camisa);
	public abstract void visualizar (ArrayList<String> data_camiseta, String codP);
	public abstract ArrayList<String>  alterar(ArrayList<String> data_camiseta, String codP, Camiseta newCamiseta);
	public abstract ArrayList<String>  deletar(ArrayList<String> data_camiseta, String cod); 
	

}