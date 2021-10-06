//package
package model;

import java.util.ArrayList;

//class
public class CartaoDeCredito{
	
	
	//attribute 
	private String bandeira;
	private String numeroDoCartao;
	private String codigoDeSeguranca;
	private String dataNasc;
	private int mesDataVenc;
	private int anoDataVenc;

	//constructor
	public CartaoDeCredito(String c, String b, String n, String d, int m, int a) {
		
		codigoDeSeguranca = c;
		bandeira = b;
		numeroDoCartao = n;
		dataNasc = d;
		mesDataVenc = m;
		anoDataVenc = a;
	}
	
	public String toString() {
		return 	  "\n"+"bandeira do cartão  = " + bandeira
				+ "\n"+"Número do cartão    = " + numeroDoCartao 
				+ "\n"+"Código de segurança = "+ codigoDeSeguranca 
				+ "\n"+"Data de criação     = " + dataNasc 
				+ "\n"+"Mês de vencimento   = " + mesDataVenc 
				+ "\n"+"Ano de vencimento   = "+ anoDataVenc + "\n";
	}

	//method construction

	public ArrayList<String>  cadastrar(ArrayList<String> data_cartao, CartaoDeCredito cartao) { 	
			data_cartao.add(cartao.getCodigoDeSeguranca());
			data_cartao.add(cartao.getBandeira()); 
			data_cartao.add(cartao.getNumeroDoCartao()); 
	        data_cartao.add(cartao.getDataNasc());
			
			String mesDataVenc_string = Integer.toString(cartao.getMesDataVenc());
			data_cartao.add(mesDataVenc_string);
			
			String anoDataVenc_string = Integer.toString(cartao.getAnoDataVenc());
			data_cartao.add(anoDataVenc_string);
			
			return data_cartao;
			
		}

		public void visualizar(ArrayList<String> data_cartao, CartaoDeCredito cartao) {
				int position = data_cartao.indexOf(cartao.getCodigoDeSeguranca());
				System.out.println(
						"INFORMAÇÕES DO CARTÃO"+"\n"+
						"codigoDeSeguranca: " + data_cartao.get(position)+"\n"+
						"Bandeira: " + data_cartao.get(position+1)+"\n"+
						"Número do cartão: " + data_cartao.get(position+2)+"\n"+
						"Data de criação: " + data_cartao.get(position+3)+"\n"+
						"Mes de vencimento: " + data_cartao.get(position+4)+"\n"+
						"Ano de vencimento: " + data_cartao.get(position+5)+"\n"
						);}
		
		public ArrayList<String> editar(ArrayList<String> data_cartao, CartaoDeCredito newcartao) {
			int position = data_cartao.indexOf(newcartao.getCodigoDeSeguranca());
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);

			data_cartao.add(newcartao.getCodigoDeSeguranca());
			data_cartao.add(newcartao.getBandeira()); 
			data_cartao.add(newcartao.getNumeroDoCartao()); 
	        data_cartao.add(newcartao.getDataNasc());
			
			String mesDataVenc_string = Integer.toString(newcartao.getMesDataVenc());
			data_cartao.add(mesDataVenc_string);
			
			String anoDataVenc_string = Integer.toString(newcartao.getAnoDataVenc());
			data_cartao.add(anoDataVenc_string);
			return data_cartao;	
		}

		public ArrayList<String> deletar(ArrayList<String> data_cartao, CartaoDeCredito cartao_delet) {
			int position = data_cartao.indexOf(cartao_delet.getCodigoDeSeguranca());
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			return data_cartao;
		}

		//getters and setters
		public String getBandeira() {
			return bandeira;
		}

		public void setBandeira(String bandeira) {
			this.bandeira = bandeira;
		}

		public String getNumeroDoCartao() {
			return numeroDoCartao;
		}

		public void setNumeroDoCartao(String numeroDoCartao) {
			this.numeroDoCartao = numeroDoCartao;
		}

		public String getCodigoDeSeguranca() {
			return codigoDeSeguranca;
		}

		public void setCodigoDeSeguranca(String codigoDeSeguranca) {
			this.codigoDeSeguranca = codigoDeSeguranca;
		}

		public String getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}

		public int getMesDataVenc() {
			return mesDataVenc;
		}

		public void setMesDataVenc(int mesDataVenc) {
			this.mesDataVenc = mesDataVenc;
		}

		public int getAnoDataVenc() {
			return anoDataVenc;
		}

		public void setAnoDataVenc(int anoDataVenc) {
			this.anoDataVenc = anoDataVenc;
		}
		
}
