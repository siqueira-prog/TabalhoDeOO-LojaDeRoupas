package model;

import java.util.*;

// aqui se encontra o método main para verificar as funcionalidades

//import java.util.*; 

//Teste

public class menu {

private  static Scanner sc;

public static void main(String[] args) {		
	

		// Creating the menu:
	
		boolean leave = false;
		sc = new Scanner(System.in);
		
		while (leave == false) {
			
			System.out.println("Bemvindo(a) de volta ao menu de teste! \n"
					+ "Selecione uma opção a baixo: \n"
					+ "Digite 1 para testar os métodos da classe Cliente.\n"
					+ "Digite 2 para testar os métodos da classe Administrador\n"
					+ "Digite 3 para testar os métodos da classe Camiseta\n"
					+ "Digite 4 para testar os métodos da classe Loja."
					+ "5 Para sair");
			
			int opcao = sc.nextInt(); 
			
			if (opcao == 1) {
				testeCliente();
			}
	 	 	else if (opcao == 2) {
				testeAdministrador();
			}
	 	 	else if (opcao == 3) {
				testeCamiseta();
			}
	 	 	else if (opcao == 4) {
				testeLoja();
			}
	 	 			
	 	 	else if (opcao == 5) {
	 	 		System.out.println("Obrigado por usar o nosso sistema de teste, tenha um ótimo dia!"
	 	 							+"\n"
	 	 							+"Volte sempre!");
	 	 		leave = true;}
			
	 	 	else
	 	 		System.out.println("Opção não encontrada! Selecione novamente \n");
				
		}
	
}		
// test methods
public static void testeCliente () {
	//criando database - data_client
	ArrayList<String> data_client = new ArrayList<String>();
	
	//instanciando objetos - class Cliente
	
	Cliente cliente1 = new Cliente(null, null, null, null, 0);
	Cliente cliente2 = new Cliente(null, null, null, null, 0);
	Cliente cliente3 = new Cliente(null, null, null, null, 0);
	Cliente cliente4 = new Cliente(null, null, null, null, 0);
	Cliente cliente5 = new Cliente(null, null, null, null, 0);
	Cliente cliente6 = new Cliente(null, null, null, null, 0);
	Cliente cliente7 = new Cliente(null, null, null, null, 0);
	Cliente cliente8 = new Cliente(null, null, null, null, 0);
	Cliente cliente9 = new Cliente(null, null, null, null, 0);
	Cliente cliente10 = new Cliente(null, null, null, null, 0);
	
	
	//metodo cadastrar - class Cliente 
	
	cliente1.cadastrar(data_client,"1111111", "cliente1", "cliente1@email.com", "111", 1);
	cliente2.cadastrar(data_client,"2111111", "cliente2", "cliente2@email.com", "222", 1);
	cliente3.cadastrar(data_client,"3333333", "cliente3", "cliente3@email.com", "333", 1);
	cliente4.cadastrar(data_client,"4444444", "cliente4", "cliente4@email.com", "444", 1);
	cliente5.cadastrar(data_client,"5555555", "cliente5", "cliente5@email.com", "555", 1);
	cliente6.cadastrar(data_client,"6666666", "cliente6", "cliente6@email.com", "666", 1);
	cliente7.cadastrar(data_client,"7777777", "cliente7", "cliente7@email.com", "777", 1);
	cliente8.cadastrar(data_client,"8888888", "cliente8", "cliente8@email.com", "888", 1);
	cliente9.cadastrar(data_client,"9999999", "cliente9", "cliente9@email.com", "999", 1);
	cliente10.cadastrar(data_client,"10101010101010", "cliente10", "cliente10@email.com", "101010", 1);
	

	// metodo visualizar - class Cliente 
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de clientes fictícios" + "\n" + "\n");
	
	cliente1.visualizar(data_client, "1111111");
	cliente2.visualizar(data_client, "2111111");
	cliente3.visualizar(data_client, "3333333");
	cliente4.visualizar(data_client, "4444444");
	cliente5.visualizar(data_client, "5555555");
	cliente6.visualizar(data_client, "6666666");
	cliente7.visualizar(data_client, "7777777");
	cliente8.visualizar(data_client, "8888888");
	cliente9.visualizar(data_client, "9999999");
	cliente10.visualizar(data_client, "10101010101010");
	
	// metodo editar - class Cliente 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, os clientes 1, 2 e 10 estão progamados" + "\n"+
			"para serem atualizados. O cliente a ser atualizado pode ser alterado pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
	cliente1.editar(data_client, "1111111");
	System.out.println("\n");
	cliente1.visualizar(data_client, "1111111");
	
	cliente2.editar(data_client, "2111111");
	System.out.println("\n");
	cliente2.visualizar(data_client, "2111111");
	
	cliente10.editar(data_client, "10101010101010");
	System.out.println("\n");
	cliente10.visualizar(data_client, "10101010101010");
	
	// metodo deletar -- class Cliente 
	
	System.out.println(
			 "\n" + "\n" + 
			"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
	);
	
	cliente1.deletar(data_client, "1111111");
	cliente2.deletar(data_client, "2111111");
	cliente10.deletar(data_client, "10101010101010");
	
	System.out.println(
			"\n"+
			"database após deleção dos clientes solicitados: " + "\n" +
			data_client
			
			);
}
public static void testeAdministrador() {
	//criando database - data_adm
		ArrayList<String> data_adm = new ArrayList<String>();
		
		//instanciando objetos - class Administrador
		
		Administrador adm1 = new Administrador(null, null, null, null, 1);
		Administrador adm2 = new Administrador(null, null, null, null, 1);
		Administrador adm3 = new Administrador(null, null, null, null, 1);
		Administrador adm4 = new Administrador(null, null, null, null, 1);
		Administrador adm5 = new Administrador(null, null, null, null, 1);
		Administrador adm6 = new Administrador(null, null, null, null, 1);
		Administrador adm7 = new Administrador(null, null, null, null, 1);
		Administrador adm8 = new Administrador(null, null, null, null, 1);
		Administrador adm9 = new Administrador(null, null, null, null, 1);
		Administrador adm10 = new Administrador(null, null, null, null,1);
		
		
		//metodo cadastrar - class Administrador 
		
		adm1.cadastrar(data_adm,"1111111", "adm1", "adm1@email.com", "111", 1);
		adm2.cadastrar(data_adm,"2111111", "adm2", "adm2@email.com", "222", 1);
		adm3.cadastrar(data_adm,"3333333", "adm3", "adm3@email.com", "333", 1);
		adm4.cadastrar(data_adm,"4444444", "adm4", "adm4@email.com", "444", 1);
		adm5.cadastrar(data_adm,"5555555", "adm5", "adm5@email.com", "555", 1);
		adm6.cadastrar(data_adm,"6666666", "adm6", "adm6@email.com", "666", 1);
		adm7.cadastrar(data_adm,"7777777", "adm7", "adm7@email.com", "777", 1);
		adm8.cadastrar(data_adm,"8888888", "adm8", "adm8@email.com", "888", 1);
		adm9.cadastrar(data_adm,"9999999", "adm9", "adm9@email.com", "999", 1);
		adm10.cadastrar(data_adm,"10101010101010", "adm10", "cliente10@email.com", "101010", 1);
		
		// metodo visualizar - class Cliente 
		
		System.out.println("Abaixo estarão alguns dados pré cadastrados de administradores fictícios" + "\n" + "\n");
		
		adm1.visualizar(data_adm, "1111111");
		adm2.visualizar(data_adm, "2111111");
		adm3.visualizar(data_adm, "3333333");
		adm4.visualizar(data_adm, "4444444");
		adm5.visualizar(data_adm, "5555555");
		adm6.visualizar(data_adm, "6666666");
		adm7.visualizar(data_adm, "7777777");
		adm8.visualizar(data_adm, "8888888");
		adm9.visualizar(data_adm, "9999999");
		adm10.visualizar(data_adm, "10101010101010");
		
		// metodo editar - class Cliente 
		
		System.out.println(
				"Agora testa-se o método editar. Contudo, os clientes 1, 2 e 10 estão progamados" + "\n"+
				"para serem atualizados. O cliente a ser atualizado pode ser alterado pelo parametro" + "\n"+
				"na função editar."+ "\n"
				);
		
		adm1.editar(data_adm, "1111111");
		System.out.println("\n");
		adm1.visualizar(data_adm, "1111111");
		
		adm2.editar(data_adm, "2111111");
		System.out.println("\n");
		adm2.visualizar(data_adm, "2111111");
		
		adm10.editar(data_adm, "10101010101010");
		System.out.println("\n");
		adm10.visualizar(data_adm, "10101010101010");
		
		// metodo deletar -- class Cliente 
		
		System.out.println(
				 "\n" + "\n" + 
				"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
		);
		
		adm1.deletar(data_adm, "1111111");
		adm2.deletar(data_adm, "2111111");
		adm10.deletar(data_adm, "10101010101010");
		
		System.out.println(
				"\n"+
				"database após deleção dos clientes solicitados: " + "\n" +
				data_adm
				
				);
}
public static void testeCamiseta() {
	
	//criando database - data_camiseta
		ArrayList<String> data_camiseta = new ArrayList<String>();
		
		//instanciando objetos - class Camiseta
		
		Camiseta camiseta1 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta2 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta3 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta4 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta5 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta6 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta7 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta8 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta9 = new Camiseta(null, null, null, null, null, null);
		Camiseta camiseta10= new Camiseta(null, null, null, null, null, null);
		
		
		//metodo cadastrar - class Camiseta 
	
		camiseta1.cadastrar(data_camiseta,"1111", "KongCamiseta1", "Preto", "GG", "Algodão", "Regata");
		camiseta2.cadastrar(data_camiseta,"2222", "KongCamiseta2", "Branco", "MM", "Latex", "Regata");
		camiseta3.cadastrar(data_camiseta,"3333", "KongCamiseta3", "Azul", "GG", "Nylon", "Regata");
		camiseta4.cadastrar(data_camiseta,"4444", "KongCamiseta4", "Roxo", "PP", "Algodão", "Regata");
		camiseta5.cadastrar(data_camiseta,"5555", "KongCamiseta5", "Prata", "GG", "Nylon", "Regata");
		camiseta6.cadastrar(data_camiseta,"6666", "KongCamiseta6", "Dourada", "GG", "Algodão", "Regata");
		camiseta7.cadastrar(data_camiseta,"7777", "KongCamiseta7", "Vermelho", "GG", "Algodão", "Regata");
		camiseta8.cadastrar(data_camiseta,"8888", "KongCamiseta8", "Azul", "GG", "Latex", "Regata");
		camiseta9.cadastrar(data_camiseta,"9999", "KongCamiseta9", "Verde", "GG", "Algodão", "Regata");
		camiseta10.cadastrar(data_camiseta,"10101010", "KongCamiseta10","Lilaz", "GG", "Algodão", "Regata");
		
		// metodo visualizar - class Camiseta 
		
		System.out.println("Abaixo estarão alguns dados pré cadastrados de clientes fictícios" + "\n" + "\n");
		
		camiseta1.visualizar(data_camiseta, "1111");
		camiseta2.visualizar(data_camiseta, "2222");
		camiseta3.visualizar(data_camiseta, "3333");
		camiseta4.visualizar(data_camiseta, "4444");
		camiseta5.visualizar(data_camiseta, "5555");
		camiseta6.visualizar(data_camiseta, "6666");
		camiseta7.visualizar(data_camiseta, "7777");
		camiseta8.visualizar(data_camiseta, "8888");
		camiseta9.visualizar(data_camiseta, "9999");
		camiseta10.visualizar(data_camiseta,"10101010");
		
		// metodo alterar - class Camiseta 
		
		System.out.println(
				"Agora testa-se o método editar. Contudo, os clientes 1, 2 e 3 estão progamados" + "\n"+
				"para serem atualizados. O cliente a ser atualizado pode ser alterado pelo parametro" + "\n"+
				"na função editar."+ "\n"
				);
		
		camiseta1.alterar(data_camiseta, "1111");
		System.out.println("\n");
		camiseta1.visualizar(data_camiseta, "1111");
		
		camiseta2.alterar(data_camiseta, "2222");
		System.out.println("\n");
		camiseta2.visualizar(data_camiseta, "2222");
		
		camiseta3.alterar(data_camiseta, "3333");
		System.out.println("\n");
		camiseta3.visualizar(data_camiseta, "3333");
		
		// metodo deletar -- class Camiseta 
		
		System.out.println(
				 "\n" + "\n" + 
				"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
		);
		
		camiseta1.deletar(data_camiseta, "1111");
		camiseta1.deletar(data_camiseta, "2222");
		camiseta1.deletar(data_camiseta, "3333");
		
		System.out.println(
				"\n"+
				"database após deleção dos clientes solicitados: " + "\n" +
				data_camiseta
				
				);
}
public static void testeLoja() {
//criando database - data_client
	ArrayList<String> data_loja = new ArrayList<String>();
	
	//instanciando objetos - class Cliente
	
	Loja loja1 = new Loja(null, null, null, null);
	
	//metodo cadastrar - class Cliente 
	
	loja1.cadastrar(data_loja, "1654654", "Seila", "Seinao", "emailinstitu@email.com");

	// metodo visualizar - class Cliente 
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de clientes fictícios" + "\n" + "\n");
	
	loja1.visualizar(data_loja, "emailinstitu@email.com");
	
	// metodo editar - class Cliente 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, os clientes 1, 2 e 10 estão progamados" + "\n"+
			"para serem atualizados. O cliente a ser atualizado pode ser alterado pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
//	cliente1.editar(data_client, "1111111");
//	System.out.println("\n");
//	cliente1.visualizar(data_client, "1111111");
//	
//	cliente2.editar(data_client, "2111111");
//	System.out.println("\n");
//	cliente2.visualizar(data_client, "2111111");
//	
//	cliente10.editar(data_client, "10101010101010");
//	System.out.println("\n");
//	cliente10.visualizar(data_client, "10101010101010");
	
	// metodo deletar -- class Cliente 
	
//	System.out.println(
//			 "\n" + "\n" + 
//			"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
//	);
//	
//	cliente1.deletar(data_client, "1111111");
//	cliente2.deletar(data_client, "2111111");
//	cliente10.deletar(data_client, "10101010101010");
//	
//	System.out.println(
//			"\n"+
//			"database após deleção dos clientes solicitados: " + "\n" +
//			data_client
//			
//			);
	}
}