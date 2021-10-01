//package
package model;

import java.util.ArrayList;
import java.util.Scanner;

//class
public class Telefone {
	
	//scanner
		public static Scanner sc;
		
	//attribute 
	private int ddd;
	private int numero;
		
	//constructor
		public Telefone(int d, int n) { 
			ddd = d;
			numero = n;
		}
		
		//toString 
		
		public String toString() {
			return  "ddd :" + ddd + "\n" +
					"numero :" + numero + "\n" ;
		}
		
		//method construction
		
		public void cadastrar() { 
			
			ArrayList<String> data_tell = new ArrayList<String>();
			String ddd_string = Integer.toString(ddd);
			String numero_string = Integer.toString(numero);
			data_tell.add(ddd_string); 
			data_tell.add(numero_string); 
			
			
		}
		
		public void visualizar(ArrayList<String> data_tell, String numero) {
					
					int position = data_tell.indexOf(numero);
					
					if(data_tell.contains(numero)) {
						
						System.out.println(
								
								"INFORMAÇÕES DE TELEFONE"+"\n"+
								"ddd: " + data_tell.get(position-1)+"\n"+
								"numero: " + data_tell.get(position)+"\n"
								
								);
						}
						
					else {
						
						System.out.println("Numero não encontrado!");	}
					
				}		
		
		public void editar(ArrayList<String> data_tell, String numero) {
						
					int position = data_tell.indexOf(numero);
						
					data_tell.remove(position);
					data_tell.remove(position-1);
				
					System.out.println("Digite seu ddd: " + "\n");
					String new_ddd = sc.nextLine();
					data_tell.add(new_ddd);
					System.out.println("Digite seu numero: " + "\n");
					String new_numero = sc.nextLine();
					data_tell.add(new_numero);
						
						
					}
					
		public void deletar(ArrayList<String> data_tell, String numero) {
					
					// deleting registration
					
					
					int position = data_tell.indexOf(numero);
					
					data_tell.remove(position);
					data_tell.remove(position-1);
					
					
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