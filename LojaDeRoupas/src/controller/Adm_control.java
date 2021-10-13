package controller;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Adm_control {
	//ATTRIBUTES
	private static Data_control database = new Data_control();
	static ArrayList<String> database_adm = database.getDatabase_camiseta();
	//EDITAR PERFIL ADM
	public static ArrayList<String> editar_adm(
			int index,
			ArrayList<String> database_adm,
			JTextField fieldCPF,	
			JTextField fieldNome,
			JTextField fieldEmail,
			JPasswordField senha)
	{
    	database_adm.remove(index-2);
    	database_adm.remove(index-2);
    	database_adm.remove(index-2);
    	database_adm.remove(index-2);
    	database_adm.remove(index-2);
    	database_adm.remove(index-2);
    	database_adm.add(fieldCPF.getText());
    	database_adm.add(fieldNome.getText());
    	database_adm.add(fieldEmail.getText());
        //SENHA
    	char[] senhaChar = senha.getPassword();
        String senhaString = String.valueOf(senhaChar);
        database_adm.add(senhaString);
        //MATRICULA
		Random random = new Random();
		int m = random.nextInt(100000000);
		database_adm.add(Integer.toString(m));
        //NIVEL
		database_adm.add("0");
    	return database_adm;	
	}
	//GET AND SET
	public static Data_control getDatabase() {
		return database;
	}
	public static void setDatabase(Data_control database) {
		Adm_control.database = database;
	}
	public static ArrayList<String> getDatabase_adm() {
		return database_adm;
	}
	public static void setDatabase_adm(ArrayList<String> database_adm) {
		Adm_control.database_adm = database_adm;
	}}


