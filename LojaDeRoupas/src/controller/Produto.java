//package
package controller;

import java.util.ArrayList;

//class
public abstract class Produto {
	
	//attribute 
	protected String codigoProduto; 
	protected double precoVenda;
	protected double precoFab;
	protected int qtd;
	protected String descricao;
	protected String cadegoria;
	
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
	public String getCadegoria() {
		return cadegoria;
	}
	public void setCadegoria(String cadegoria) {
		this.cadegoria = cadegoria;
	}
	
	//method signature
	
	public abstract ArrayList<String>  cadastrar(ArrayList<String> data_camiseta, String cod, String n, String c, String t, String comp, String tp );
	public abstract void visualizar (ArrayList<String> data_camiseta, String cod);
	public abstract ArrayList<String>  alterar(ArrayList<String> data_camiseta, String cod);
	public abstract ArrayList<String>  deletar(ArrayList<String> data_camiseta, String cod); 
	

}