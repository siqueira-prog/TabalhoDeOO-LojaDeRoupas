//package
package model;

import java.util.*;

//class
public class CartaoDeCredito{
	
	//scanner
	public static Scanner sc;
	
	//attribute 
	private String bandeira;
	private String numeroDoCartao;
	private String codigoDeSeguranca;
	private Date dataNasc;
	private int mesDataVenc;
	private int anoDataVenc;

	//constructor
	public CartaoDeCredito(String b, String n, String c, Date d, int m, int a) {
		bandeira = b;
		numeroDoCartao = n;
		codigoDeSeguranca = c;
		dataNasc = d;
		mesDataVenc = m;
		anoDataVenc = a;
	}
	
	//method construction
	
	public void cadastrar() { 
        
			ArrayList<String> data_cartao = new ArrayList<String>();
			String mesDataVenc_string = Integer.toString(mesDataVenc);
			String anoDataVenc_string = Integer.toString(anoDataVenc);

			
			data_cartao.add(bandeira); 
			data_cartao.add(numeroDoCartao); 
			data_cartao.add(codigoDeSeguranca); 
			data_cartao.add(mesDataVenc_string); 
			data_cartao.add(anoDataVenc_string);

			
		}

		public void visualizar(ArrayList<String> data_cartao, String numeroDoCartao) {
			
			int position = data_cartao.indexOf(numeroDoCartao);
			
			if(data_cartao.contains(numeroDoCartao)) {
				
				System.out.println(
						
						"INFORMAÇÕES DO CARTÃO"+"\n"+
						"bandeira: " + data_cartao.get(position-1)+"\n"+
						"numeroDoCartao: " + data_cartao.get(position)+"\n"+
						"codigoDeSeguranca: " + data_cartao.get(position+1)+"\n"+
						"Mes de vencimento: " + data_cartao.get(position+2)+"\n"+
						"Ano de vencimento: " + data_cartao.get(position+3)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Cartão não cadastrado!");	}
			
		}
		

		public void editar(ArrayList<String> data_cartao, String numeroDoCartao) {
			
			int position = data_cartao.indexOf(numeroDoCartao);
			
			data_cartao.remove(position);
			data_cartao.remove(position-1);
			data_cartao.remove(position-1);
			data_cartao.remove(position-1);
			data_cartao.remove(position-1);
			
			System.out.println("Digite a bandeira do seu cartão: " + "\n");
			String new_bandeira = sc.nextLine();
			data_cartao.add(new_bandeira);
			System.out.println("Digite o número do seu cartão: " + "\n");
			String new_numeroDoCartao = sc.nextLine();
			data_cartao.add(new_numeroDoCartao);
			System.out.println("Digite o código de segurança do seu cartão: " + "\n");
			String new_codigoDeSeguranca = sc.nextLine();
			data_cartao.add(new_codigoDeSeguranca);
			System.out.println("Digite o mes de vencimento do seu cartão: " + "\n");
			String new_mesDataVenc_string = sc.nextLine();
			data_cartao.add(new_mesDataVenc_string);
			System.out.println("Digite o ano de vencimento do seu cartão: " + "\n");
			String new_anoDataVenc_string = sc.nextLine();
			data_cartao.add(new_anoDataVenc_string);
			
			System.out.println("Dados atualizados com sucesso!");
			
			
		}


		public void deletar(ArrayList<String> data_cartao, String numeroDoCartao) {
			
			// deleting registration
			
			int position = data_cartao.indexOf(numeroDoCartao);
			
			data_cartao.remove(position);
			data_cartao.remove(position-1);
			data_cartao.remove(position-1);
			data_cartao.remove(position-1);
			data_cartao.remove(position-1);
			
			System.out.println("Cadastro removido com sucesso!");
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
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
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
