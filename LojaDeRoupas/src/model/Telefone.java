//package
package model;

import java.util.ArrayList;
import java.util.Scanner;

//class
public class Telefone {
	
	//scanner
	private Scanner sc = new Scanner(System.in);
	
	//attribute 
	private int id;
	private int ddd;
	private int numero;
		
	//constructor
		public Telefone(int identificador, int d, int n) { 
			id = identificador;
			ddd = d;
			numero = n;
		}
		
	//method construction
		
	public ArrayList<String>  cadastrar(ArrayList<String> data_telefone, int i, int d, int n) { 
			
			 Telefone telefone = new Telefone(
					 i,
					 d,
					 n
					);
			 
			 String id_String = Integer.toString(telefone.id);
			 data_telefone.add(id_String);
			 
			 String ddd_String = Integer.toString(telefone.ddd);
			 data_telefone.add(ddd_String);
			 
			 String numero_String = Integer.toString(telefone.numero);
			 data_telefone.add(numero_String);
			 
			 
			return data_telefone; 
			
			
		}
		
		public void visualizar(ArrayList<String> data_telefone, String id) {
					
					int position = data_telefone.indexOf(id);
					
					if(data_telefone.contains(id)) {
						
						System.out.println(
								
								"INFORMAÇÕES DE TELEFONE"+"\n"+
								"Telefone número: " + data_telefone.get(position)+"\n"+
								"ddd: " + data_telefone.get(position+1)+"\n"+
								"numero: " + data_telefone.get(position+2)+"\n"
								
								);
						}
						
					else {
						
						System.out.println("Telefone não encontrado!");	}
					
				}		
		
		public void editar(ArrayList<String> data_telefone, String id) {
						
					int position = data_telefone.indexOf(id);
						
					data_telefone.remove(position);
					data_telefone.remove(position);
					data_telefone.remove(position);
					
					data_telefone.add(id);
				
					System.out.println("Digite seu ddd: " + "\n");
					String new_ddd = sc.nextLine();
					data_telefone.add(new_ddd);
					System.out.println("Digite seu numero: " + "\n");
					String new_numero = sc.nextLine();
					data_telefone.add(new_numero);
						
						
					}
					
		public void deletar(ArrayList<String> data_telefone, String id) {
					
					// deleting registration
					
					
					int position = data_telefone.indexOf(id);
					
					data_telefone.remove(position);
					data_telefone.remove(position);
					data_telefone.remove(position);
					
					
				}
		
	//getters and setters

	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}