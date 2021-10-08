//package
package model;

import java.util.*;

//class
public class Compra {
	
	//attribute 
	private String idDaCompra;
	private int qtdSolicitada;
	private Cliente cliente;
	private Camiseta camiseta;
	private CartaoDeCredito cartao[] = new CartaoDeCredito[100];
	
	//constructor
	
	public Compra( String id, int qtd, Cliente c, Camiseta cm, CartaoDeCredito cdc[]) { 
		this.idDaCompra = id;
		this.qtdSolicitada = qtd ;
		this.cliente = c;
		this.camiseta = cm;
		this.cartao = cdc;
	}
	
	//toString
	
	public String toString() {
		return  "ID: " + idDaCompra + "\n" +
				"Quantidade solicitada: " + qtdSolicitada + "\n" +
				"Cliente: " + cliente + "\n" +
				"Produto: " + camiseta + "\n"+
				"Cartao de Crédito: " + camiseta + "\n" ;

	}
	//method construction

	public ArrayList<String>  cadastrar(ArrayList<String> data_compra, Compra compra) {
								
			data_compra.add(compra.idDaCompra);
			
			String qts_string = Integer.toString(compra.qtdSolicitada);
			data_compra.add(qts_string);
			
			data_compra.add(compra.cliente.getNomeDoUsuario());
			
			data_compra.add(compra.cliente.getEmail());
			
			String ddd_string = Integer.toString(compra.cliente.getTelefone().getDdd());
			String numero_string = Integer.toString(compra.cliente.getTelefone().getNumero());
			String fullnumber = ddd_string + numero_string;
			data_compra.add(fullnumber);
			
			String endereco_string = Arrays.toString(compra.cliente.getEndereco());
			data_compra.add(endereco_string);
			
			String cartao_string = Arrays.toString(compra.cliente.getCartao());
			data_compra.add(cartao_string);
			
			return data_compra;
		}

	
	public void  visualizar(ArrayList<String> data_compra, String id) {
		
			int position = data_compra.indexOf(id);
			
			System.out.println(
					
					"INFORMAÇÕES DA COMPRA"+"\n"+
					"id: " + data_compra.get(position)+"\n"+
					"Quantidade Solicitada: " + data_compra.get(position+1)+"\n"+
					"Nome do Cliente: " + data_compra.get(position+2)+"\n"+
					"Email do Cliente: " + data_compra.get(position+3)+"\n"+
					"Telefone: " + data_compra.get(position+4)+"\n"+
					"Endereço: " + data_compra.get(position+5)+"\n"+
					"Cartao de crédito: " + data_compra.get(position+6)

					
					);
		
	}
	
	public ArrayList<String>  atualizar(ArrayList<String> data_compra, Compra newcompra) {
			
		int position = data_compra.indexOf(newcompra.getIdDaCompra());
		
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);

		data_compra.add(newcompra.getIdDaCompra());
		
		String qts_string = Integer.toString(newcompra.qtdSolicitada);
		data_compra.add(qts_string);
		
		data_compra.add(newcompra.cliente.getNomeDoUsuario());
		
		data_compra.add(newcompra.cliente.getEmail());
		
		String ddd_string = Integer.toString(newcompra.cliente.getTelefone().getDdd());
		String numero_string = Integer.toString(newcompra.cliente.getTelefone().getNumero());
		String fullnumber = ddd_string + numero_string;
		data_compra.add(fullnumber);
		
		String endereco_string = Arrays.toString(newcompra.cliente.getEndereco());
		data_compra.add(endereco_string);
		
		String cartao_string = Arrays.toString(newcompra.cliente.getCartao());
		data_compra.add(cartao_string);		
		
		return data_compra;
	}
	
	public ArrayList<String>  deletar(ArrayList<String> data_compra, Compra compra) {
		
		// deleting registration
		
		int position = data_compra.indexOf(compra.getIdDaCompra());
		
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		
		return data_compra;
		}
	
	// se sobrar tempo eu faço esse método
	public void  exportar(ArrayList<String> data_compra, String id) {
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

	public Camiseta getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	public CartaoDeCredito[] getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito[] cartao) {
		this.cartao = cartao;
	}

}
	



