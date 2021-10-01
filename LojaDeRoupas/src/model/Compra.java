//package
package model;

import java.util.*;

//class
public class Compra {

	//scanner
	public static Scanner sc;
	
	//attribute 
	private String idDaCompra;
	private int qtdSolicitada;
	private Cliente cliente;
	private Produto produto;
	private CartaoDeCredito cartao[];
	
	//constructor
	
	public Compra( String id, int qtd, Cliente c, Produto p) { 
		idDaCompra = id;
		qtdSolicitada = qtd ;
		cliente = c;
		produto = p;
	}
	
	//method construction

	public  void cadastrar() {
		
	}
	
	public  void visualizar() {
		
	}
	
	public  void atualizar() {
		
	}
	
	public  void deletar() {
		
	}
	
	public  void exportar() {
		
	}
	
	//getters and setters
	public String getIdDaCompra() {
		return idDaCompra;
	}
	public void setIdDaCompra(String idDaCompra) {
		this.idDaCompra = idDaCompra;
	}
	public int getQtdSolicitada() {
		return qtdSolicitada;
	}
	public void setQtdSolicitada(int qtdSolicitada) {
		this.qtdSolicitada = qtdSolicitada;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public CartaoDeCredito[] getCartao() {
		return cartao;
	}
	public void setCartao(CartaoDeCredito[] cartao) {
		this.cartao = cartao;
	}

}
	



