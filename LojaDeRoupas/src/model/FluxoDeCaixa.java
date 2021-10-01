//package
package model;

//class
public class FluxoDeCaixa {
	
	//attribute 
	private Produto produto;
	private Compra compra;
	
	//constructor
		public FluxoDeCaixa(Produto p, Compra c) { 
			produto = p;
			compra = c;
		}
	
	// method construction
		
		public  void exportar() {
			
		}
		
		public  void visualizar() {
			
		}
		
	//getters and setters 
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
		
}
