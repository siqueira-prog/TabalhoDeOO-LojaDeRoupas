//package
package model;

import java.util.ArrayList;
import java.util.Arrays;


//class
public class Cliente extends Usuario{
	
	//attribute
	private Telefone telefone;
	private	Endereco endereco[] = new Endereco[1];
	private CartaoDeCredito cartao[] = new CartaoDeCredito[100];
	
	//constructor
	public Cliente( 
			int c, 
			String nom, 
			String e, 
			String s, 
			Telefone tel,
			Endereco end[],
			CartaoDeCredito cdc[],
			int niv) 
	{ 
		this.cpf = c;
		this.nomeDoUsuario = nom;
		this.email = e;	
		this.senha = s;
		this.telefone = tel;
		this.endereco = end;
		this.cartao = cdc;
		this.nivel = niv;
	}
	
	//toString

	public String toString() {
		String endereco_string = Arrays.toString(endereco);
		String cartao_string = Arrays.toString(cartao);
		return  "cpf :" + cpf + "\n" +
				"nome :" + nomeDoUsuario + "\n" +
				"email :" + email + "\n" +
				"senha :" + senha + "\n" +
				"nivel :" + nivel + "\n" +
				"telefone :" + telefone + "\n" +
				"endereço :" + "\n" + endereco_string + "\n"+
				"CartaoDeCredito :" + "\n"+ cartao_string + "\n";
	}

	//method construction
	
	public ArrayList<String>  cadastrar(
			
			ArrayList<String> data_client,
			int c,
			String n,
			String e,
			String s,
			Telefone tel,
			Endereco end[],
			CartaoDeCredito cdc[]
			) { 
		
		
			int niv = 1;
		
			Cliente cliente = new Cliente(c,n,e,s,tel,end,cdc,niv);
		
			String cpf_String = Integer.toString(cliente.cpf);
			data_client.add(cpf_String);
			
			data_client.add(cliente.nomeDoUsuario);
			
			data_client.add(cliente.email);
			
			data_client.add(cliente.senha);
			
			String ddd_String = Integer.toString(cliente.telefone.getDdd());
			String number_String = Integer.toString(cliente.telefone.getNumero());
			String fullnumber = ddd_String + number_String;
			data_client.add(fullnumber);  
			
			data_client.add(cliente.endereco[0].getCep());
			data_client.add(cliente.endereco[0].getLogradouro());
			data_client.add(Integer.toString(endereco[0].getNumeroEnd()));
			data_client.add(cliente.endereco[0].getBairro());
			data_client.add(cliente.endereco[0].getCidade());
			data_client.add(cliente.endereco[0].getEstado());
			
			data_client.add(cliente.cartao[0].getCodigoDeSeguranca());
			data_client.add(cliente.cartao[0].getBandeira());
			data_client.add(cliente.cartao[0].getNumeroDoCartao());
			data_client.add(cliente.cartao[0].getDataNasc());
			data_client.add(Integer.toString(cliente.cartao[0].getMesDataVenc()));
			data_client.add(Integer.toString(cliente.cartao[0].getAnoDataVenc()));
			
			String cliente_nivel_String = Integer.toString(cliente.nivel);
			data_client.add(cliente_nivel_String);
			
		return data_client;
		}

	public void  visualizar(ArrayList<String> data_client, String c) {
		
			int position = data_client.indexOf(c);
		

			if(data_client.contains(c)) {
				
				System.out.println(
						
						"INFORMAÇÕES DE CADASTRO"+"\n"+
						"CPF: " + data_client.get(position)+"\n"+
						"Nome: " + data_client.get(position+1)+"\n"+
						"Email: " + data_client.get(position+2)+"\n"+
						"Senha: " + data_client.get(position+3)+"\n"+
						"Telefone: " + data_client.get(position+4)+"\n"+
						"Endereço: " + data_client.get(position+5)+"\n"+
						"Cartão de credito: " + data_client.get(position+6)+"\n"+
						"Nível: " + data_client.get(position+7)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Cliente não encontrado!");	}

		}
		

	public ArrayList<String>  editar(ArrayList<String> database, String c, String n, String e, String s, Telefone tel,
			 Endereco end[], CartaoDeCredito cdc[]){
			
			
			int position = database.indexOf(c);
			
			int niv = 1;
			
			int cpf_int = Integer.parseInt(c);
			
			Cliente cliente = new Cliente(cpf_int, n, e, s, tel, end, cdc, niv);
			
			database.remove(position);
			database.remove(position);
			database.remove(position);
			database.remove(position);
			database.remove(position);
			database.remove(position);
			database.remove(position);
			database.remove(position);
			
			database.add(c);

			database.add(n);

			database.add(e);

			database.add(s);
			
			String ddd_String = Integer.toString(cliente.telefone.getDdd());
			String number_String = Integer.toString(cliente.telefone.getNumero());
			String fullnumber = ddd_String + number_String;
			database.add(fullnumber);
			
			String endereco_string = Arrays.toString(cliente.endereco);
			database.add(endereco_string);
			
			String cartao_string = Arrays.toString(cliente.cartao);
			database.add(cartao_string);
			
			String nivel = "1";
			database.add(nivel);
			
						
			return database;
		}


	public ArrayList<String>  deletar(ArrayList<String> data_client, String c) {
			
			// deleting registration
			
			int position = data_client.indexOf(c);
			
			data_client.remove(position);
			data_client.remove(position);
			data_client.remove(position);
			data_client.remove(position);
			data_client.remove(position);
			
			System.out.println("Cadastro deletado com sucesso!");
			return data_client;
		}
		
	//getters and setters
	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}

	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Endereco[] getEndereco() {
		return endereco; 
	}
	
	public void setEndereco(Endereco[] endereco) {
		this.endereco = endereco;
	}
	
	public CartaoDeCredito[] getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito[] cartao) {
		this.cartao = cartao;
	}






}
