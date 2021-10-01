//package
package model;

import java.util.*;


//class
public class Cliente extends Usuario{
	
	// scanner
	private Scanner sc = new Scanner(System.in);
	
	//attribute
	private Telefone telefone;
	private	Endereco endereco[];
	private CartaoDeCredito cartao[];
	
	//constructor
	public Cliente( 
			String c, 
			String nom, 
			String e, 
			String s, 
			int niv) 
	{ 
		nomeDoUsuario = nom;
		cpf = c;
		email = e;	
		senha = s;
		nivel = niv;
	}
	
	//toString
	
	public String toString() {
		return  "cpf :" + cpf + "\n" +
				"nome :" + nomeDoUsuario + "\n" +
				"email :" + email + "\n" +
				"senha :" + senha + "\n" +
				"nivel :" + nivel + "\n" +
				"telefone :" + telefone + "\n" +
				"endereço :" + endereco + "\n"+
				"CartaoDeCredito :" + cartao + "\n";
	}
	
	

	//method construction
	
	public ArrayList<String>  cadastrar(ArrayList<String> data_client, String c, String n, String e, String s, int niv ) { 
								
		Cliente cliente = new Cliente(
				c,
				n,
				e,
				s,
				niv
				);
		
			data_client.add(cliente.cpf);
			data_client.add(cliente.nomeDoUsuario);
			data_client.add(cliente.email);
			data_client.add(cliente.senha);
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
						"Nível: " + data_client.get(position+4)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Cliente não encontrado!");	}
			
		}
		

		public ArrayList<String>  editar(ArrayList<String> data_client, String c) {
			
			
			int position = data_client.indexOf(c);
			
			
			data_client.remove(position);
			data_client.remove(position);
			data_client.remove(position);
			data_client.remove(position);
			data_client.remove(position);
			
			String cpf = c;
			data_client.add(cpf);
			System.out.println("Digite seu novo nome: " + "\n");
			String nome = sc.nextLine();
			data_client.add(nome);
			System.out.println("Digite seu novo email: " + "\n");
			String email = sc.nextLine();
			data_client.add(email);
			System.out.println("Digite sua nova senha: " + "\n");
			String senha = sc.nextLine();
			data_client.add(senha);
			String nivel = "1";
			data_client.add(nivel);
			
			System.out.println("Dados atualizados com sucesso!");
						
			return data_client;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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
