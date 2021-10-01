//package
package model;

import java.util.*;

//class
public class Compra {

	//scanner
	private Scanner sc = new Scanner(System.in);
	
	//attribute 
	private int idDaCompra;
	private String qtdSolicitada;
	private String cliente;
	private String produto;
	private CartaoDeCredito cartao[];
	
	//constructor
	
	public Compra( int id, String qtd, String c, String p) { 
		idDaCompra = id;
		qtdSolicitada = qtd ;
		cliente = c;
		produto = p;
	}
	
	//toString
	
	public String toString() {
		return  "id :" + idDaCompra + "\n" +
				"quantidade solicitada :" + qtdSolicitada + "\n" +
				"cliente :" + cliente + "\n" +
				"produto :" + produto + "\n" ;

	}
	//method construction

	public ArrayList<String>  cadastrar(ArrayList<String> data_compra, int id, String qts, String c, String p) { 
		
		Compra compra = new Compra(
				id,
				qts,
				c,
				p
				);
		
			String id_string = Integer.toString(compra.idDaCompra);
			data_compra.add(id_string);
			data_compra.add(compra.qtdSolicitada);
			data_compra.add(compra.cliente);
			data_compra.add(compra.produto);
			
		return data_compra;
		}

	
	public void  visualizar(ArrayList<String> data_compra, String id) {
		
		
		int position = data_compra.indexOf(id);
		
		if(data_compra.contains(id)) {
			
			System.out.println(
					
					"INFORMAÇÕES DA COMPRA"+"\n"+
					"id : " + data_compra.get(position)+"\n"+
					"Quantidade Solicitada: " + data_compra.get(position+1)+"\n"+
					"Nome do Cliente: " + data_compra.get(position+2)+"\n"+
					"Produto : " + data_compra.get(position+3)+"\n"

					
					);
			}
			
		else {
			
			System.out.println("Compra não encontrada!");	}
		
	}
	
	public ArrayList<String>  atualizar(ArrayList<String> data_compra, String id) {
			
		int position = data_compra.indexOf(id);
		
		
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);

		String identificador = id;
		data_compra.add(identificador);
		
		System.out.println("Digite a nova quantidade solicitada do produto: " + "\n");
		String new_qtd = sc.nextLine();
		data_compra.add(new_qtd);
		
		System.out.println("Informe o nome do cliente: " + "\n");
		String new_nome_cliente = sc.nextLine();
		data_compra.add(new_nome_cliente);
		
		System.out.println("Informe qual produto deseja comprar:" + "\n");
		String new_nome_produto = sc.nextLine();
		data_compra.add(new_nome_produto);
		
		System.out.println("Dados atualizados com sucesso!");
					
		return data_compra;
	}
	
	public ArrayList<String>  deletar(ArrayList<String> data_compra, String id) {
		
		// deleting registration
		
		int position = data_compra.indexOf(id);
		
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		data_compra.remove(position);
		
		System.out.println("Compra canselada com sucesso!");
		
		return data_compra;
		}
	
	public void  exportar(ArrayList<String> data_compra, String id) {
	}
	

	public int getIdDaCompra() {
		return idDaCompra;
	}

	public void setIdDaCompra(int idDaCompra) {
		this.idDaCompra = idDaCompra;
	}

	public String getQtdSolicitada() {
		return qtdSolicitada;
	}

	public void setQtdSolicitada(String qtdSolicitada) {
		this.qtdSolicitada = qtdSolicitada;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public CartaoDeCredito[] getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito[] cartao) {
		this.cartao = cartao;
	}
	
	//getters and setters


}
	



