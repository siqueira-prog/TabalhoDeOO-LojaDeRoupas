//package
package model;

import java.util.ArrayList;

//class
public class Telefone {
	
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
		
	//toString
		public String toString() {
			return "" + ddd + "" + numero;
		}
		
	//method construction

	public ArrayList<String>  cadastrar(ArrayList<String> data_telefone, Telefone telefone) { 
			 
			 String id_String = Integer.toString(telefone.getId());
			 data_telefone.add(id_String);
			 
			 String ddd_String = Integer.toString(telefone.getDdd());
			 data_telefone.add(ddd_String);
			 
			 String numero_String = Integer.toString(telefone.getNumero());
			 data_telefone.add(numero_String);
			 	 
			return data_telefone; 
			
			
		}
		
	public void visualizar(ArrayList<String> data_telefone, Telefone telefone) {
					String id_string = Integer.toString(telefone.getId());
					int position = data_telefone.indexOf(id_string);
						
					System.out.println(
								
								"INFORMAÇÕES DE TELEFONE"+"\n"+
								"Identificador: " + data_telefone.get(position)+"\n"+
								"DDD: " + data_telefone.get(position+1)+"\n"+
								"Número: " + data_telefone.get(position+2)+"\n"
								);}
					
	public void editar(ArrayList<String> data_telefone, Telefone newtelefone) {
					String id_string = Integer.toString(newtelefone.getId());
					int position = data_telefone.indexOf(id_string);
						
					data_telefone.remove(position);
					data_telefone.remove(position);
					data_telefone.remove(position);
					
					data_telefone.add(id_string);
				
					String ddd_string = Integer.toString(newtelefone.getDdd());
					data_telefone.add(ddd_string);

					String numero_string = Integer.toString(newtelefone.getNumero());
					data_telefone.add(numero_string);
					}
					
	public void deletar(ArrayList<String> data_telefone, Telefone telefone_del) {
					String id_string = Integer.toString(telefone_del.getId());
					int position = data_telefone.indexOf(id_string);		
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
		this.numero = numero;}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}}