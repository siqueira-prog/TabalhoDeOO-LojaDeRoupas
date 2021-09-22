// package
package controller;

import java.util.*;

import model.Usuario;


//class
public class ControleAdministrador extends Usuario {
	
	// scanner
	private Scanner sc = new Scanner(System.in);
	
	//attribute 
	private String matricula;
	
	//constructor
	public ControleAdministrador( 
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
				"matricula" + matricula + "\n" +
				"nivel :" + nivel + "\n" ;

	}
	
	//method construction
	
	public ArrayList<String>  cadastrar(ArrayList<String> data_adm, String c, String n, String e, String s, int niv ) { 
								
		ControleAdministrador admin = new ControleAdministrador(
				c,
				n,
				e,
				s,
				niv
				);
		
		data_adm.add(admin.cpf);
		data_adm.add(admin.nomeDoUsuario);
		data_adm.add(admin.email);
		data_adm.add(admin.senha);
		String cliente_nivel_String = Integer.toString(admin.nivel);
		data_adm.add(cliente_nivel_String);
			
		return data_adm;
		}

		public void  visualizar(ArrayList<String> data_adm, String c) {
			
			
			int position = data_adm.indexOf(c);
			
			if(data_adm.contains(c)) {
				
				System.out.println(
						
						"INFORMAÇÕES DE CADASTRO"+"\n"+
						"CPF: " + data_adm.get(position)+"\n"+
						"Nome: " + data_adm.get(position+1)+"\n"+
						"Email: " + data_adm.get(position+2)+"\n"+
						"Senha: " + data_adm.get(position+3)+"\n"+
						"Nível: " + data_adm.get(position+4)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Administrador não encontrado!");	}
			
		}
		

		public ArrayList<String>  editar(ArrayList<String> data_adm, String c) {
			
			
			int position = data_adm.indexOf(c);
			
			
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			
			String cpf = c;
			data_adm.add(cpf);
			System.out.println("Digite seu novo nome: " + "\n");
			String nome = sc.nextLine();
			data_adm.add(nome);
			System.out.println("Digite seu novo email: " + "\n");
			String email = sc.nextLine();
			data_adm.add(email);
			System.out.println("Digite sua nova senha: " + "\n");
			String senha = sc.nextLine();
			data_adm.add(senha);
			String nivel = "1";
			data_adm.add(nivel);
			
			System.out.println("Dados atualizados com sucesso!");
						
			return data_adm;
		}


		public ArrayList<String>  deletar(ArrayList<String> data_adm, String c) {
			
			// deleting registration
			
			int position = data_adm.indexOf(c);
			
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			
			System.out.println("Cadastro deletado com sucesso!");
			return data_adm;
		}
	
	//getters and setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

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

	}
	
	
