// package
package model;

import java.util.ArrayList;
import java.util.Random;

//class
public class Administrador extends Usuario {
	
	//attribute 
	private int matricula;
	
	//constructor
	public Administrador( 
			int c, 
			String nom, 
			String e, 
			String s, 
			int m,
			int niv) 
	{ 
		this.nomeDoUsuario = nom;
		this.cpf = c;
		this.email = e;	
		this.senha = s; 
		this.nivel = niv;
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
	
		//refatorado - atributo matrícula adicionado no cadastro/tirei os prints
	public ArrayList<String>  cadastrar(
			ArrayList<String> data_adm,
			int c,
			String n,
			String e,
			String s,
			Telefone tel,
			Endereco end[],
			CartaoDeCredito cdc[]
			) { 
		
		Random random = new Random();
		int m = random.nextInt(100000000);
		
		int niv = 0;
		
		Administrador administrador = new Administrador(
				c,
				n,
				e,
				s,
				m,
				niv
				);
		
		String cpf_String = Integer.toString(administrador.cpf);
		data_adm.add(cpf_String);
		
		data_adm.add(administrador.nomeDoUsuario);
		
		data_adm.add(administrador.email);
		
		data_adm.add(administrador.senha);
		
		String matricula_string = Integer.toString(m);
		data_adm.add(matricula_string);
		
		String cliente_nivel_String = Integer.toString(administrador.nivel);
		data_adm.add(cliente_nivel_String);
			
		return data_adm;
		}

		// preciso entender como integrar o método visualizar com a interface gráfica
	public void  visualizar(
			ArrayList<String> data_adm,
			String c) {
			
			
			int position = data_adm.indexOf(c);
			
			if(data_adm.contains(c)) {
				
				System.out.println(
						
						"INFORMAÇÕES DE CADASTRO"+"\n"+
						"CPF: " + data_adm.get(position)+"\n"+
						"Nome: " + data_adm.get(position+1)+"\n"+
						"Email: " + data_adm.get(position+2)+"\n"+
						"Senha: " + data_adm.get(position+3)+"\n"+
						"Matricula: " + data_adm.get(position+4)+"\n"+
						"Nível: " + data_adm.get(position+5)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Administrador não encontrado!");	}
			
		}
		
		//refatorado - atributo matrícula adicionado no método editar/tirei os prints
	public ArrayList<String>  editar(
			ArrayList<String> data_adm,
			String cpf,
			String n,
			String e,
			String s,
			Telefone tel,
			Endereco end[],
			CartaoDeCredito cdc[]
			) 
	{
			int position = data_adm.indexOf(cpf);
			
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			
			data_adm.add(cpf);
			
			data_adm.add(n);
			
			data_adm.add(e);
			
			data_adm.add(s);
			
			// a matrícula é sempre gerada de forma aleatória
			Random random = new Random();
			int m = random.nextInt(100000000);
			
			String matricula_string = Integer.toString(m);
			data_adm.add(matricula_string);
			
			// o nivel do administrador é sempre 0
			String nivel = "0";
			data_adm.add(nivel);
						
			return data_adm;
		}
	
		//refatorado - atributo matrícula também é deletado
	public ArrayList<String>  deletar(ArrayList<String> data_adm, String c) {
			
			// deleting registration
			
			int position = data_adm.indexOf(c);
			
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			data_adm.remove(position);
			
			return data_adm;
		}
	
	//getters and setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

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

	}
	
	
