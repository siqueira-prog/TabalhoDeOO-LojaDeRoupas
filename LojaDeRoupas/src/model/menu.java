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
					+ "Digite 4 para testar os métodos da classe Loja\n"
					+ "Digite 5 para testar os métodos da classe Compra\n"
					+ "Digite 6 para testar os métodos da classe CartaoDeCredito\n"
					+ "Digite 7 para testar os métodos da classe Endereco\n"
					+ "Digite 8 para testar os métodos da classe Telefone\n"
					+ "Digite 9 para testar os métodos da classe FluxoDeCaixa\n"
					+ "Digite 10 Para sair\n");
			
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
				testeCompra();
			}
	 	 	else if (opcao == 6) {
				testeCartaoDeCredito();
			}
	 	 	else if (opcao == 7) {
	 	 		testeEndereco();
			}
	 	 	else if (opcao == 8) {
	 	 		testeTelefone();
			}
	 	 	else if (opcao == 9) {
	 	 		testeFluxoDeCaixa();
			}
	 	 			
	 	 	else if (opcao == 10) {
	 	 		System.out.println("Obrigado por usar o nosso sistema de teste, tenha um ótimo dia!"
	 	 							+"\n"
	 	 							+"Volte sempre!\n");
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
		
		Administrador adm1 = new Administrador(null, null, null, null, 0);
		Administrador adm2 = new Administrador(null, null, null, null, 0);
		Administrador adm3 = new Administrador(null, null, null, null, 0);
		Administrador adm4 = new Administrador(null, null, null, null, 0);
		Administrador adm5 = new Administrador(null, null, null, null, 0);
		Administrador adm6 = new Administrador(null, null, null, null, 0);
		Administrador adm7 = new Administrador(null, null, null, null, 0);
		Administrador adm8 = new Administrador(null, null, null, null, 0);
		Administrador adm9 = new Administrador(null, null, null, null, 0);
		Administrador adm10 = new Administrador(null, null, null, null,0);
		
		
		//metodo cadastrar - class Administrador 
		
		adm1.cadastrar(data_adm,"1111111", "adm1", "adm1@email.com", "111", 0);
		adm2.cadastrar(data_adm,"2111111", "adm2", "adm2@email.com", "222", 0);
		adm3.cadastrar(data_adm,"3333333", "adm3", "adm3@email.com", "333", 0);
		adm4.cadastrar(data_adm,"4444444", "adm4", "adm4@email.com", "444", 0);
		adm5.cadastrar(data_adm,"5555555", "adm5", "adm5@email.com", "555", 0);
		adm6.cadastrar(data_adm,"6666666", "adm6", "adm6@email.com", "666", 0);
		adm7.cadastrar(data_adm,"7777777", "adm7", "adm7@email.com", "777", 0);
		adm8.cadastrar(data_adm,"8888888", "adm8", "adm8@email.com", "888", 0);
		adm9.cadastrar(data_adm,"9999999", "adm9", "adm9@email.com", "999", 0);
		adm10.cadastrar(data_adm,"10101010101010", "adm10", "adm10@email.com", "101010", 0);
		
		// metodo visualizar - class Administrador 
		
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
		
		// metodo editar - class Administrador 
		
		System.out.println(
				"Agora testa-se o método editar. Contudo, os administradores 1, 2 e 10 estão progamados" + "\n"+
				"para serem atualizados. O administrador a ser atualizado pode ser alterado pelo parametro" + "\n"+
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
		
		// metodo deletar - class Administrador 
		
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
				"Agora testa-se o método editar. Contudo, as camisetas 1, 2 e 3 estão progamadas" + "\n"+
				"para serem atualizadas. A camiseta a ser atualizado pode ser alterada pelo parametro" + "\n"+
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
	
	//criando database - data_loja
	ArrayList<String> data_loja = new ArrayList<String>();
	
	//instanciando objetos - class Loja
	
	Loja loja1 = new Loja(null, null, null, null);
	Loja loja2 = new Loja(null, null, null, null);
	Loja loja3 = new Loja(null, null, null, null);
	
	//metodo cadastrar - class Loja
	
	loja1.cadastrar(data_loja, "78.353.334/0001-36",  "Kong Team T-Shirt" , "KongFilial_1", "kong1@email.com");
	loja2.cadastrar(data_loja, "87.821.715/0001-93",  "Kong Team T-Shirt" , "KongFilial_2", "kong2@email.com");
	loja3.cadastrar(data_loja, "61.462.605/0001-99",  "Kong Team T-Shirt" , "kongFilial_3", "kong3@email.com");

	// metodo visualizar - class Loja
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de lojas fictícias" + "\n" + "\n");
	
	loja1.visualizar(data_loja, "78.353.334/0001-36");
	loja2.visualizar(data_loja, "87.821.715/0001-93");
	loja3.visualizar(data_loja, "61.462.605/0001-99");
	
	// metodo editar - class Loja
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, a loja 1 está progamada" + "\n"+
			"para ser atualizada. A loja a ser atualizada pode ser alterada pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
	loja1.editar(data_loja,"78.353.334/0001-36");
	loja1.visualizar(data_loja, "78.353.334/0001-36");
	
	// metodo deletar -- class Loja
	
	System.out.println(
			 "\n" + "\n" + 
			"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
	);
	
	loja1.deletar(data_loja, "78.353.334/0001-36");


	
	System.out.println(
			"\n"+
			"database após deleção das lojas solicitadas: " + "\n" +
			data_loja +
			"\n"
		
			);
}
public static void testeCompra() {
	
	//criando database - data_compra
	ArrayList<String> data_compra = new ArrayList<String>();
	
	//instanciando objetos - class Compra
	

	
	Compra compra1  = new Compra(0, null, null, null) ;
	Compra compra2  = new Compra(0, null, null, null) ;
	Compra compra3  = new Compra(0, null, null, null) ;
	Compra compra4  = new Compra(0, null, null, null) ;
	Compra compra5  = new Compra(0, null, null, null) ;
	Compra compra6  = new Compra(0, null, null, null) ;
	Compra compra7  = new Compra(0, null, null, null) ;
	Compra compra8  = new Compra(0, null, null, null) ;

		
	//metodo cadastrar - class Compra 
	
	compra1.cadastrar (data_compra, 1 , "9",   "cliente1", "KongCamiseta1");
	compra2.cadastrar (data_compra, 2 , "582", "cliente2", "KongCamiseta2");
	compra3.cadastrar (data_compra, 3 , "527", "cliente3", "KongCamiseta3");
	compra4.cadastrar (data_compra, 4 , "152", "cliente4", "KongCamiseta4");
	compra5.cadastrar (data_compra, 5 , "352", "cliente5", "KongCamiseta5");
	compra6.cadastrar (data_compra, 6 , "452", "cliente6", "KongCamiseta6");
	compra7.cadastrar (data_compra, 7 , "62",  "cliente7", "KongCamiseta7");
	compra8.cadastrar (data_compra, 8 , "42",  "cliente8", "KongCamiseta8");

	// metodo visualizar - class Compra 
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de compras fictícias\n\n");
	
	compra1.visualizar(data_compra, "1");
	compra2.visualizar(data_compra, "2");
	compra3.visualizar(data_compra, "3");
	compra4.visualizar(data_compra, "4");
	compra5.visualizar(data_compra, "5");
	compra6.visualizar(data_compra, "6");
	compra7.visualizar(data_compra, "7");
	compra8.visualizar(data_compra, "8");
	
	// metodo editar - class Compra 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, as compras 4, 5 e 6 estão progamadas" + "\n"+
			"para serem atualizadas. A compra a ser atualizada pode ser alterada pelo parametro" + "\n"+
			"na função atualizar."+ "\n"
			);
	
	compra4.atualizar(data_compra, "4");
	System.out.println("\n");
	compra4.visualizar(data_compra, "4");
	
	compra5.atualizar(data_compra, "5");
	System.out.println("\n");
	compra5.visualizar(data_compra, "5");
	
	compra6.atualizar(data_compra, "6");
	System.out.println("\n");
	compra6.visualizar(data_compra, "6");
	
	// metodo deletar -- class Compra
	
	System.out.println(
			 "\n" + "\n" + 
			"Após o teste do método atualizar, o método deletar é acionado para teste." + "\n" + "\n"
	);
	
	compra4.deletar(data_compra, "4");
	compra5.deletar(data_compra, "5");
	compra6.deletar(data_compra, "6");
	
	System.out.println(
			"\n"+
			"database após deleção dos clientes solicitados: " + "\n" +
			data_compra
			
			);

}
public static void testeCartaoDeCredito() {
	
	//criando database - data_cartao
	ArrayList<String> data_cartao = new ArrayList<String>();
	
	//instanciando objetos - class CartaoDeCredito
	

	
	CartaoDeCredito cartao1  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao2  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao3  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao4  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao5  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao6  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao7  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao8  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;
	CartaoDeCredito cartao9  = new CartaoDeCredito(null, null, null, null, 0, 0 ) ;

	//metodo cadastrar - class CartaoDeCredito 
	
	cartao1.cadastrar (data_cartao,"FLO1fmu", "Visa", "643373604576", "3/12/2011", 1, 2020);
	cartao2.cadastrar (data_cartao,"Jasj123", "Elo", "701790511786", "1/12/2015" ,2, 2021);
	cartao3.cadastrar (data_cartao,"AASDS12", "MasterCard", "1232151521", "3/2/2012", 5, 2022);
	cartao4.cadastrar (data_cartao,"wqeq44q", "American Express", "98686881", "3/12/2018",6, 2031);
	cartao5.cadastrar (data_cartao,"123QQQ2", "Discover Network", "12312551231", "3/12/2019", 1, 2030);
	cartao6.cadastrar (data_cartao,"AASDA23", "Hipercard", "12312412555", "8/3/2018", 11, 2028);
	cartao7.cadastrar (data_cartao,"13Q2A4A", "Diners Club", "1246241241212", "3/6/2015", 9, 2022);
	cartao8.cadastrar (data_cartao,"Q3R3A1A", "Visa Electron", "009089868724", "6/1/2018",8, 2019);
	cartao9.cadastrar (data_cartao,"A4A3A6A", "Alelo", "31513573727", "3/9/2021", 3, 2040);

	// metodo visualizar - class CartaoDeCredito 
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de cartões fictícios\n\n");
	
	cartao1.visualizar(data_cartao, "FLO1fmu");
	cartao2.visualizar(data_cartao, "Jasj123");
	cartao3.visualizar(data_cartao, "AASDS12");
	cartao4.visualizar(data_cartao, "wqeq44q");
	cartao5.visualizar(data_cartao, "123QQQ2");
	cartao6.visualizar(data_cartao, "AASDA23");
	cartao7.visualizar(data_cartao, "13Q2A4A");
	cartao8.visualizar(data_cartao, "Q3R3A1A");
	cartao9.visualizar(data_cartao, "A4A3A6A");
	
	// metodo editar - class CartaoDeCredito 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, os cartões 1, 7 e 9 estão progamados" + "\n"+
			"para serem atualizados. O cartão a ser atualizada pode ser alterado pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
	cartao1.editar(data_cartao, "FLO1fmu");
	System.out.println("\n");
	cartao1.visualizar(data_cartao, "FLO1fmu");
	
	cartao7.editar(data_cartao, "13Q2A4A");
	System.out.println("\n");
	cartao7.visualizar(data_cartao, "13Q2A4A");
	
	cartao9.editar(data_cartao, "A4A3A6A");
	System.out.println("\n");
	cartao9.visualizar(data_cartao, "A4A3A6A");
	
	// metodo deletar -- class CartaoDeCredito
	
	System.out.println(
			 "\n" + "\n" + 
			"Após o teste do método atualizar, o método deletar é acionado para teste." + "\n" + "\n"
	);
	
	cartao1.deletar(data_cartao, "FLO1fmu");
	cartao7.deletar(data_cartao, "13Q2A4A");
	cartao9.deletar(data_cartao, "A4A3A6A");
	
	System.out.println(
			"\n"+
			"database após deleção dos clientes solicitados: " + "\n" +
			data_cartao
			
			);
}
public static void testeEndereco() {
	
	//criando database - data_cartao
	ArrayList<String> data_endereco = new ArrayList<String>();
	
	//instanciando objetos - class CartaoDeCredito
	
	Endereco endereco1  = new Endereco(null, null, null, 0, null, null, null) ;
	Endereco endereco2  = new Endereco(null, null, null, 0, null, null, null) ;
	Endereco endereco3  = new Endereco(null, null, null, 0, null, null, null) ;
	Endereco endereco4  = new Endereco(null, null, null, 0, null, null, null) ;
	Endereco endereco5  = new Endereco(null, null, null, 0, null, null, null) ;


	//metodo cadastrar - class CartaoDeCredito 
	
	endereco1.cadastrar (data_endereco, "1", "67125-012", "Abaiara", 123, "VILA OLÍMPIA ", "SÃO PAULO", "SP");
	endereco2.cadastrar (data_endereco,"2", "77425-110", "bílio Martins", 145, "JD PETROPOLIS- PIRACICABA", "SÃO PAULO", "SP");
	endereco3.cadastrar (data_endereco,"3","51030-600", "Acaraú", 212, "VILA MARIANA", "SÃO PAULO", "SP");
	endereco4.cadastrar (data_endereco,"4","63504-650", "Acopiara", 771, "BROOKLIN ", "SÃO PAULO", "SP");
	endereco5.cadastrar (data_endereco,"5","78110-044", "Aiuá", 199 , "AV. PAULISTA", "SÃO PAULO", "SP");


	// metodo visualizar - class CartaoDeCredito 
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de endereços fictícios\n\n");
	
	endereco1.visualizar(data_endereco, "67125-012");
	endereco2.visualizar(data_endereco, "77425-110");
	endereco3.visualizar(data_endereco, "51030-600");
	endereco4.visualizar(data_endereco, "63504-650");
	endereco5.visualizar(data_endereco, "78110-044");

	
	// metodo editar - class CartaoDeCredito 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, os endereços 1, 2 e 5 estão progamados" + "\n"+
			"para serem atualizados. O endereço a ser atualizado pode ser alterado pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
	endereco1.editar(data_endereco, "1");
	System.out.println("\n");
	endereco1.visualizar(data_endereco, "1");

	endereco2.editar(data_endereco, "2");
	System.out.println("\n");
	endereco2.visualizar(data_endereco, "2");
	
	endereco5.editar(data_endereco, "5");
	System.out.println("\n");
	endereco5.visualizar(data_endereco, "5");
	
	System.out.println(
			"\n"+
			"database após a edição dos dados solicitados: " + "\n" +
			data_endereco +
			"\n"
			
			);
}
public static void testeTelefone() {
	
		//criando database - data_telefone
		ArrayList<String> data_telefone = new ArrayList<String>();
		
		//instanciando objetos - class Telefone
		
		Telefone telefone1 = new Telefone(0,0,0);
		Telefone telefone2 = new Telefone(0,0,0);
		Telefone telefone3 = new Telefone(0,0,0);
		Telefone telefone4 = new Telefone(0,0,0);
		Telefone telefone5 = new Telefone(0,0,0);
		Telefone telefone6 = new Telefone(0,0,0);
		Telefone telefone7 = new Telefone(0,0,0);
		Telefone telefone8 = new Telefone(0,0,0);
		Telefone telefone9 = new Telefone(0,0,0);
		Telefone telefone10= new Telefone(0,0,0);
			
		//metodo cadastrar - class Telefone 
		
		telefone1.cadastrar(data_telefone, 1, 61 , 98726178);
		telefone2.cadastrar(data_telefone, 2, 55 , 98777178);
		telefone3.cadastrar(data_telefone, 3, 61 , 98724448);
		telefone4.cadastrar(data_telefone, 4, 55 , 90987668);
		telefone5.cadastrar(data_telefone, 5, 61 , 99812357);
		telefone6.cadastrar(data_telefone, 6, 66 , 91226178);
		telefone7.cadastrar(data_telefone, 7, 61 , 92726178);
		telefone8.cadastrar(data_telefone, 8, 67 , 93826178);
		telefone9.cadastrar(data_telefone, 9, 33 , 94926178);
		telefone10.cadastrar(data_telefone,10,55 , 95726118);
		
		// metodo visualizar - class Telefone 
		
		System.out.println("Abaixo estarão alguns dados pré cadastrados de telefones fictícios" + "\n" + "\n");
		
		telefone1.visualizar(data_telefone, "1");
		telefone2.visualizar(data_telefone, "2");
		telefone3.visualizar(data_telefone, "3");
		telefone4.visualizar(data_telefone, "4");
		telefone5.visualizar(data_telefone, "5");
		telefone6.visualizar(data_telefone, "6");
		telefone7.visualizar(data_telefone, "7");
		telefone8.visualizar(data_telefone, "8");
		telefone9.visualizar(data_telefone, "9");
		telefone10.visualizar(data_telefone,"10");

		
		// metodo editar - class Cliente 
		
		System.out.println(
				"Agora testa-se o método editar. Contudo, os telefones 7, 8 e 9 estão progamados" + "\n"+
				"para serem atualizados. O telefone a ser atualizado pode ser alterado pelo parametro" + "\n"+
				"na função editar."+ "\n"
				);
		
		telefone7.editar(data_telefone, "7");
		System.out.println("\n");
		telefone7.visualizar(data_telefone, "7");
		
		telefone8.editar(data_telefone, "8");
		System.out.println("\n");
		telefone8.visualizar(data_telefone, "8");
		
		telefone9.editar(data_telefone, "9");
		System.out.println("\n");
		telefone9.visualizar(data_telefone, "9");
			
		// metodo deletar -- class Telefone 
		
		System.out.println(
				 "\n" + "\n" + 
				"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
		);
		
		telefone7.deletar(data_telefone, "7");
		telefone8.deletar(data_telefone, "8");
		telefone9.deletar(data_telefone, "9");
		
		System.out.println(
				"\n"+
				"database após deleção dos telefones solicitados: " + "\n" +
				data_telefone
				
				);
}
public static void testeFluxoDeCaixa() {}
}