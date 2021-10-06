//package
package model;

import java.util.ArrayList;

//class
public class FluxoDeCaixa {
	
	//attribute 
	private Compra compra;
	private Camiseta camiseta = compra.getCamiseta();
	//constructor
		public FluxoDeCaixa(Compra c) { 
			compra = c;
		}
	
	// method construction
		
		public  void exportar() {
			
		}
		
		public static void visualizar(ArrayList<String> data_camiseta) {
			System.out.println(
					"FLUXO DE CAIXA: "+"\n"+
					"Custos: " + calculaGastos(data_camiseta)+"\n"+
					"Ganho bruto: " + calculaGanhoBruto(data_camiseta) +"\n"+
					"Ganho líquido: " + calculaGanhoLiquido(data_camiseta) +"\n"
					);}
		
	// method aux
		// esse método atualiza o estoque de uma camiseta, além de atualizar o database com tal informação
		public static int atualizaEstoque(ArrayList<String> data_camiseta, Compra compra) {
			// criando as variaveis
			int quantidade_em_estoque = compra.getCamiseta().getQtd();
			int quantidade_solicitada = compra.getQtdSolicitada();
			
			// calculando a nova quantidade em estoque e transformando em string
			int new_quatidade_em_estoque = quantidade_em_estoque-quantidade_solicitada;
			String string_new_quatidade_em_estoque = Integer.toString(new_quatidade_em_estoque);
			
			// setando a nova quantidade em estoque no database (data_camiseta) e no objeto (nessa ordem obrigatoriamente)
			String string_quantidade_em_estoque = Integer.toString(quantidade_em_estoque);
			int position = data_camiseta.indexOf(string_quantidade_em_estoque);
			data_camiseta.set(position, string_new_quatidade_em_estoque);
			compra.getCamiseta().setQtd(new_quatidade_em_estoque); 
			
			return compra.getCamiseta().getQtd();
		}
		// esse método multiplica a quantidade em estoque pelo preço de fábrica de todos os objetos
		public static float calculaGastos(ArrayList <String>data_camiseta) {		
			float gastos = 0;
			
			for (int i = 7; i<data_camiseta.size()-1; i = i+11){
				   
				String fabric_price_string = data_camiseta.get(i);
				double fabric_price_double = Double.valueOf(fabric_price_string).doubleValue();
				float fabric_price_float = (float) fabric_price_double;
		        
				String estoque_string = data_camiseta.get(i+1);
				int estoque_int = Integer.valueOf(estoque_string).intValue();   
		        
				gastos = (estoque_int*fabric_price_float) + gastos;
				}
			return gastos;
		}
		// esse método multiplica a quantidade em estoque pelo preço de venda
		public static float calculaGanhoBruto(ArrayList <String>data_camiseta) {
			float ganho_bruto = 0;
			
			for (int i = 6; i<data_camiseta.size()-1; i = i+11){
				   
				String sale_price_string = data_camiseta.get(i);
				double sale_price_double = Double.valueOf(sale_price_string).doubleValue();
				float sale_price_float = (float) sale_price_double;
		        
				String estoque_string = data_camiseta.get(i+2);
				int estoque_int = Integer.valueOf(estoque_string).intValue();   
		        
				ganho_bruto = (estoque_int*sale_price_float) + ganho_bruto;
				}
			return ganho_bruto;
		}
		// esse método retorna a diferença entre os ganhos e os gastos. se for negativo, a empresa perdeu dinheiro
		public static float calculaGanhoLiquido(ArrayList <String>data_camiseta) {
			float gastos = calculaGastos(data_camiseta);
			float ganho_bruto = calculaGanhoBruto(data_camiseta);
			float ganho_liquido = ganho_bruto-gastos;
			return ganho_liquido;
		}

	//getters and setters 
		public Camiseta getCamiseta() {
			return camiseta;
		}


		public void setCamiseta(Camiseta camiseta) {
			this.camiseta = camiseta;
		}

		public Compra getCompra() {
			return compra;
		}

		public void setCompra(Compra compra) {
			this.compra = compra;
		}}