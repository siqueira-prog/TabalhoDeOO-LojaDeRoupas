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
	 	 		System.out.println("Opção não encontrada! Selecione novamente \n");}}		
	
//testing all methods
	// refatorado
public static void testeCliente () {
	
	//criando database - data_client
	ArrayList<String> data_client = new ArrayList<String>();
	
	//instanciando objetos auxiliares
	
	Telefone tel = new Telefone(0, 0, 0);
	Telefone telefone1 = new Telefone(1, 61 , 98726178);
	Telefone telefone2 = new Telefone(2, 55 , 98777178);
	Telefone telefone3 = new Telefone(3, 61 , 98724448);
	Telefone telefone4 = new Telefone(4, 55 , 90987668);
	Telefone telefone5 = new Telefone(5, 61 , 99812357);
	Telefone telefone6 = new Telefone(6, 66 , 91226178);
	Telefone telefone7 = new Telefone(7, 61 , 92726178);
	Telefone telefone8 = new Telefone(8, 67 , 93826178);
	Telefone telefone9 = new Telefone(9, 33 , 94926178);
	Telefone telefone10 = new Telefone(10,55 , 95726118);
	
	Endereco endereco0 = new Endereco(null, null, null, 0, null, null, null);
	Endereco endereco1 = new Endereco("1", "67125-012", "Abaiara", 123, "VILA OLÍMPIA ", "SÃO PAULO", "SP");
	Endereco endereco2 = new Endereco("2", "77425-110", "bílio Martins", 145, "JD PETROPOLIS- PIRACICABA", "SÃO PAULO", "SP");
	Endereco endereco3 = new Endereco("3","51030-600", "Acaraú", 212, "VILA MARIANA", "SÃO PAULO", "SP");
	Endereco endereco4 = new Endereco("4","63504-650", "Acopiara", 771, "BROOKLIN ", "SÃO PAULO", "SP");
	Endereco endereco5 = new Endereco("5","78110-044", "Aiuá", 199 , "AV. PAULISTA", "SÃO PAULO", "SP");
	Endereco endereco6 = new Endereco("6", "67125-012", "Abaiara", 123, "VILA OLÍMPIA ", "SÃO PAULO", "SP");
	Endereco endereco7 = new Endereco("7", "77425-110", "bílio Martins", 145, "JD PETROPOLIS- PIRACICABA", "SÃO PAULO", "SP");
	Endereco endereco8 = new Endereco("8","51030-600", "Acaraú", 212, "VILA MARIANA", "SÃO PAULO", "SP");
	Endereco endereco9 = new Endereco("9","63504-650", "Acopiara", 771, "BROOKLIN ", "SÃO PAULO", "SP");
	Endereco endereco10= new Endereco("10","78110-044", "Aiuá", 199 , "AV. PAULISTA", "SÃO PAULO", "SP");

	Endereco end0[] = {endereco0};
	Endereco end1[] = {endereco1};
	Endereco end2[] = {endereco2};
	Endereco end3[] = {endereco3};
	Endereco end4[] = {endereco4};
	Endereco end5[] = {endereco5};
	Endereco end6[] = {endereco6};
	Endereco end7[] = {endereco7};
	Endereco end8[] = {endereco8};
	Endereco end9[] = {endereco9};
	Endereco end10[] = {endereco10};
	
	CartaoDeCredito cartao0 = new CartaoDeCredito(null, null, null, null, 0, 0);
	CartaoDeCredito cartao1 = new CartaoDeCredito ("FLO1fmu", "Visa", "643373604576", "3/12/2011", 1, 2020);
	CartaoDeCredito cartao2 = new CartaoDeCredito ("Jasj123", "Elo", "701790511786", "1/12/2015" ,2, 2021);
	CartaoDeCredito cartao3 = new CartaoDeCredito ("AASDS12", "MasterCard", "1232151521", "3/2/2012", 5, 2022);
	CartaoDeCredito cartao4 = new CartaoDeCredito ("wqeq44q", "American Express", "98686881", "3/12/2018",6, 2031);
	CartaoDeCredito cartao5 = new CartaoDeCredito ("123QQQ2", "Discover Network", "12312551231", "3/12/2019", 1, 2030);
	CartaoDeCredito cartao6 = new CartaoDeCredito ("AASDA23", "Hipercard", "12312412555", "8/3/2018", 11, 2028);
	CartaoDeCredito cartao7 = new CartaoDeCredito ("13Q2A4A", "Diners Club", "1246241241212", "3/6/2015", 9, 2022);
	CartaoDeCredito cartao8 = new CartaoDeCredito ("Q3R3A1A", "Visa Electron", "009089868724", "6/1/2018",8, 2019);
	CartaoDeCredito cartao9 = new CartaoDeCredito ("A4A3A6A", "Alelo", "31513573727", "3/9/2021", 3, 2040);
	CartaoDeCredito cartao10 = new CartaoDeCredito ("1343QQ2", "Visa", "19000051231", "3/12/2025", 1, 2050);

	
	CartaoDeCredito cdc0[] = {cartao0};
	CartaoDeCredito cdc1[] = {cartao1};
	CartaoDeCredito cdc2[] = {cartao2};
	CartaoDeCredito cdc3[] = {cartao3};
	CartaoDeCredito cdc4[] = {cartao4};
	CartaoDeCredito cdc5[] = {cartao5};
	CartaoDeCredito cdc6[] = {cartao6};
	CartaoDeCredito cdc7[] = {cartao7};
	CartaoDeCredito cdc8[] = {cartao8};
	CartaoDeCredito cdc9[] = {cartao9};
	CartaoDeCredito cdc10[] = {cartao10};
	
	//instanciando objetos - class Cliente
	
	Cliente cliente1 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente2 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente3 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente4 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente5 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente6 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente7 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente8 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente9 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
	Cliente cliente10 =new Cliente(0, null, null, null, tel, end0, cdc0, 0);

	
	
	//metodo cadastrar - class Cliente 
	
	cliente1.cadastrar(data_client,1111111, "cliente1", "cliente1@email.com", "1234GG", telefone1, end1, cdc1);
	cliente2.cadastrar(data_client,2111111, "cliente2", "cliente2@email.com", "123ff1", telefone2, end2, cdc2);
	cliente3.cadastrar(data_client,3333333, "cliente3", "cliente3@email.com", "DDS1DD", telefone3, end3, cdc3);
	cliente4.cadastrar(data_client,4444444, "cliente4", "cliente4@email.com", "ASDASF", telefone4, end4, cdc4);
	cliente5.cadastrar(data_client,5555555, "cliente5", "cliente5@email.com", "VFXAI1", telefone5, end5, cdc5);
	cliente6.cadastrar(data_client,6666666, "cliente6", "cliente6@email.com", "4D13CV", telefone6, end6, cdc6);
	cliente7.cadastrar(data_client,7777777, "cliente7", "cliente7@email.com", "GGG123", telefone7, end7, cdc7);
	cliente8.cadastrar(data_client,8888888, "cliente8", "cliente8@email.com", "A3A1A54", telefone8, end8, cdc8);
	cliente9.cadastrar(data_client,9999999, "cliente9", "cliente9@email.com", "12312Q4", telefone9, end9, cdc9);
	cliente10.cadastrar(data_client,1010101,"cliente10","cliente10@email.com","1032SAF", telefone10, end10, cdc10);
	

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
	cliente10.visualizar(data_client, "1010101");
	
	// metodo editar - class Cliente 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, os clientes 1 e 2  estão progamados" + "\n"+
			"para serem atualizados. O cliente a ser atualizado pode ser alterado pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
	cliente1.editar(data_client, "1111111", "novonome1", "novoemail1@email.com", "123123", telefone10, end10, cdc10);
	System.out.println("\n");
	cliente1.visualizar(data_client, "1111111");
	
	cliente2.editar(data_client, "2111111", "novonome2", "novoemail2@email.com", "GGE3123", telefone1, end1, cdc1);
	System.out.println("\n");
	cliente2.visualizar(data_client, "2111111");
	// metodo deletar -- class Cliente 
	
	System.out.println(
			 "\n" + "\n" + 
			"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
	);
	
	cliente1.deletar(data_client, "1111111");
	cliente2.deletar(data_client, "2111111");
	
	System.out.println(
			"\n"+
			"database após deleção dos clientes solicitados: " + "\n" +
			data_client
			
			);
}
	// refatorado
public static void testeAdministrador() {
	//criando database - data_adm
		ArrayList<String> data_adm = new ArrayList<String>();
		
		//instanciando objetos auxiliares
		
		Telefone tel = new Telefone(0, 0, 0);
		
		Endereco endereco = new Endereco(null, null, null, 0, null, null, null);
		Endereco end[] = {endereco};
		CartaoDeCredito cartao = new CartaoDeCredito(null, null, null, null, 0, 0);
		CartaoDeCredito cdc[] = {cartao};
		
		//instanciando objetos - class Administrador
		
		Administrador adm1 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm2 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm3 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm4 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm5 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm6 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm7 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm8 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm9 = new Administrador(0, null, null, null, 0, 0);
		Administrador adm10 = new Administrador(0, null, null, null, 0, 0);
		
		//metodo cadastrar - class Administrador 
		
		adm1.cadastrar(data_adm,1111111 , "adm1", "adm1@email.com", "111", tel, end, cdc);
		adm2.cadastrar(data_adm,2111111, "adm2", "adm2@email.com", "222", tel, end, cdc);
		adm3.cadastrar(data_adm,3333333, "adm3", "adm3@email.com", "333", tel, end, cdc);
		adm4.cadastrar(data_adm,4444444, "adm4", "adm4@email.com", "444", tel, end, cdc);
		adm5.cadastrar(data_adm,5555555, "adm5", "adm5@email.com", "555", tel, end, cdc);
		adm6.cadastrar(data_adm,6666666, "adm6", "adm6@email.com", "666", tel, end, cdc);
		adm7.cadastrar(data_adm,7777777, "adm7", "adm7@email.com", "777", tel, end, cdc);
		adm8.cadastrar(data_adm,8888888, "adm8", "adm8@email.com", "888", tel, end, cdc);
		adm9.cadastrar(data_adm,9999999, "adm9", "adm9@email.com", "999", tel, end, cdc);
		adm10.cadastrar(data_adm,101010, "adm10", "adm10@email.com", "101010", tel, end, cdc);
		
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
		adm10.visualizar(data_adm, "101010");
		
		// metodo editar - class Administrador 
		
		System.out.println(
				"Agora testa-se o método editar. Contudo, os administradores 1, 2 e 10 estão progamados" + "\n"+
				"para serem atualizados. O administrador a ser atualizado pode ser alterado pelo parametro" + "\n"+
				"na função editar."+ "\n"
				);
		
		adm1.editar(data_adm, "1111111", "nome1","email1@email.com", "senha1", tel, end, cdc);
		System.out.println("\n");
		adm1.visualizar(data_adm, "1111111");
		
		adm2.editar(data_adm, "2111111", "nome2","email2@email.com", "senha2", tel, end, cdc);
		System.out.println("\n");
		adm2.visualizar(data_adm, "2111111");
		
		adm10.editar(data_adm, "101010", "nome10","email10@email.com", "senha10", tel, end, cdc);
		System.out.println("\n");
		adm10.visualizar(data_adm, "101010");
		
		// metodo deletar - class Administrador 
		
		System.out.println(
				 "\n" + "\n" + 
				"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
		);
		
		adm1.deletar(data_adm, "1111111");
		adm2.deletar(data_adm, "2111111");
		adm10.deletar(data_adm, "101010");
		
		System.out.println(
				"\n"+
				"database após deleção dos clientes solicitados: " + "\n" +
				data_adm
				
				);
}
	// refatorado
public static void testeCamiseta() {
	
		//criando database - data_camiseta
		ArrayList<String> data_camiseta = new ArrayList<String>();
		
		//instanciando objetos de cadastro - class Camiseta
		
	
		Camiseta camiseta1 = new Camiseta(generate_cod(), "KongCamiseta1", "Preto", "GG", "Algodão", "Regata",50.99,15,100,"moda primavera verão","camiseta barata");
		Camiseta camiseta2 = new Camiseta(generate_cod(), "KongCamiseta2", "Branco", "MM", "Latex", "Regata",299.90,100,10,"camiseta style fashion","camiseta cara");
		Camiseta camiseta3 = new Camiseta(generate_cod(), "KongCamiseta3", "Azul", "GG", "Nylon", "Regata",520.99,300,5,"camiseta moderna","edição limitada");
		Camiseta camiseta4 = new Camiseta(generate_cod(), "KongCamiseta4", "Roxo", "PP", "Algodão", "Regata",10,2,1000,"camisa do flamengo","camisa feia");
		Camiseta camiseta5 = new Camiseta(generate_cod(), "KongCamiseta5", "Prata", "GG", "Nylon", "Regata",10000,500,1,"camiseta de ouro","edição única");
		
		camiseta1.cadastrar(data_camiseta, camiseta1);
		camiseta2.cadastrar(data_camiseta, camiseta2);
		camiseta3.cadastrar(data_camiseta, camiseta3);
		camiseta4.cadastrar(data_camiseta, camiseta4);
		camiseta5.cadastrar(data_camiseta, camiseta5);
		
		//instanciando objetos de alteração
		
		Camiseta newcamiseta1 = new Camiseta(
				generate_cod(),
				"KongCamiseta1Alterada",
				"cor_alteradaX",
				"tamanhoX",
				"composiçãoX",
				"tipoX",
				100,
				50,
				200,
				"descaleatoria1",
				"categoraaleatoria1"
				);
		
		Camiseta newcamiseta2 = new Camiseta(
				generate_cod(),
				"KongCamiseta2Alterada",
				"cor_alteradaY",
				"tamanhoY", 
				"composiçãoY",
				"tipoY",
				200,
				100,
				1200,
				"descaleatoria2",
				"categoraaleatoria2"
				);
		Camiseta newcamiseta3 = new Camiseta(
				generate_cod(),
				"KongCamiseta3Alterada", 
				"cor_alteradaZ",
				"tamanhoZ",
				"composiçãoZ",
				"tipoz",
				420.99,
				250,
				2,
				"descaleatoria1",
				"categoraaleatoria1"
				);
		// metodo visualizar - class Camiseta 
		
		System.out.println("Abaixo estarão alguns dados pré cadastrados de camisetas fictícias" + "\n" + "\n");

		camiseta1.visualizar(data_camiseta, camiseta1.getCodigoProduto());
		camiseta2.visualizar(data_camiseta, camiseta2.getCodigoProduto());
		camiseta3.visualizar(data_camiseta, camiseta3.getCodigoProduto());
		camiseta4.visualizar(data_camiseta, camiseta4.getCodigoProduto());
		camiseta5.visualizar(data_camiseta, camiseta5.getCodigoProduto());
		
		// metodo alterar - class Camiseta 
		
		System.out.println(
				"Agora testa-se o método editar. Contudo, as camisetas 1, 2 e 3 estão progamadas" + "\n"+
				"para serem atualizadas. A camiseta a ser atualizado pode ser alterada pelo parametro" + "\n"+
				"na função editar."+ "\n"
				);
		
		camiseta1.alterar(data_camiseta, camiseta1.getCodigoProduto(), newcamiseta1);
		camiseta1.visualizar(data_camiseta, newcamiseta1.getCodigoProduto());
		
		camiseta2.alterar(data_camiseta, camiseta2.getCodigoProduto(), newcamiseta2);
		camiseta2.visualizar(data_camiseta, newcamiseta2.getCodigoProduto());
		
		camiseta3.alterar(data_camiseta, camiseta3.getCodigoProduto(),newcamiseta3);
		camiseta3.visualizar(data_camiseta, newcamiseta3.getCodigoProduto());
		
		// metodo deletar -- class Camiseta 
		
		System.out.println(
				 "\n" + "\n" + 
				"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
		);
		
		camiseta1.deletar(data_camiseta, newcamiseta1.getCodigoProduto());
		camiseta1.deletar(data_camiseta, newcamiseta2.getCodigoProduto());
		camiseta1.deletar(data_camiseta, newcamiseta3.getCodigoProduto());
		
		System.out.println(
				"\n"+
				"database após deleção dos clientes solicitados: " + "\n" +
				data_camiseta
				
				);
}
	// refatorado
public static void testeLoja() {
	
	//criando database - data_loja
	ArrayList<String> data_loja = new ArrayList<String>();
	
	//instanciando objetos auxiliares	
	Endereco endereco1 = new Endereco("1", "67125-012", "Abaiara", 123, "VILA OLÍMPIA ", "SÃO PAULO", "SP");
	Endereco endereco2 = new Endereco("2", "77425-110", "bílio Martins", 145, "JD PETROPOLIS- PIRACICABA", "SÃO PAULO", "SP");
	Endereco endereco3 = new Endereco("3","51030-600", "Acaraú", 212, "VILA MARIANA", "SÃO PAULO", "SP");
	Endereco endereco4 = new Endereco("4","63504-650", "Acopiara", 771, "BROOKLIN ", "SÃO PAULO", "SP");
	
	//instanciando objetos do tipo loja 
	Loja loja1 = new Loja(null, null, null, null, null);
	Loja loja2 = new Loja(null, null, null, null, null);
	Loja loja3 = new Loja(null, null, null, null, null);
	
	//metodo cadastrar - class Loja
	
	loja1.cadastrar(data_loja, "78.353.334/0001-36",  "Kong Team T-Shirt" , "KongFilial_1", "kong1@email.com", endereco1);
	loja2.cadastrar(data_loja, "87.821.715/0001-93",  "Kong Team T-Shirt" , "KongFilial_2", "kong2@email.com", endereco2);
	loja3.cadastrar(data_loja, "61.462.605/0001-99",  "Kong Team T-Shirt" , "kongFilial_3", "kong3@email.com", endereco3);

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
	
	loja1.editar(data_loja,"78.353.334/0001-36",  "Kong Team T-Shirt atualizado" , "newKongFilial1", "newKong1@email.com", endereco4);
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
	// refatorado - farei o método exportar se sobrar tempo, pois preciso gerar um pdf e eu não sei fazer isso 
public static void testeCompra() {
	
	//criando database - data_compra
	ArrayList<String> data_compra = new ArrayList<String>();
	
	//instanciando objetos auxiliares
	
		//telefones para cadastrar clientes 
	Telefone telefone1 = new Telefone(1, 61 , 98726178);
	Telefone telefone2 = new Telefone(2, 55 , 98777178);
	Telefone telefone3 = new Telefone(3, 61 , 98724448);
	Telefone telefone4 = new Telefone(4, 55 , 90987668);
	Telefone telefone5 = new Telefone(5, 61 , 99812357);
		//endereços para cadastrar clientes 
	Endereco endereco1 = new Endereco("1", "67125-012", "Abaiara", 123, "VILA OLÍMPIA ", "SÃO PAULO", "SP");
	Endereco endereco2 = new Endereco("2", "77425-110", "bílio Martins", 145, "JD PETROPOLIS- PIRACICABA", "SÃO PAULO", "SP");
	Endereco endereco3 = new Endereco("3","51030-600", "Acaraú", 212, "VILA MARIANA", "SÃO PAULO", "SP");
	Endereco endereco4 = new Endereco("4","63504-650", "Acopiara", 771, "BROOKLIN ", "SÃO PAULO", "SP");
	Endereco endereco5 = new Endereco("5","78110-044", "Aiuá", 199 , "AV. PAULISTA", "SÃO PAULO", "SP");
	Endereco end1[] = {endereco1};
	Endereco end2[] = {endereco2};
	Endereco end3[] = {endereco3};
	Endereco end4[] = {endereco4};
	Endereco end5[] = {endereco5};
		//cartões de creditos para cadastrar clientes
	CartaoDeCredito cartao1 = new CartaoDeCredito ("FLO1fmu", "Visa", "643373604576", "3/12/2011", 1, 2020);
	CartaoDeCredito cartao2 = new CartaoDeCredito ("Jasj123", "Elo", "701790511786", "1/12/2015" ,2, 2021);
	CartaoDeCredito cartao3 = new CartaoDeCredito ("AASDS12", "MasterCard", "1232151521", "3/2/2012", 5, 2022);
	CartaoDeCredito cartao4 = new CartaoDeCredito ("wqeq44q", "American Express", "98686881", "3/12/2018",6, 2031);
	CartaoDeCredito cartao5 = new CartaoDeCredito ("123QQQ2", "Discover Network", "12312551231", "3/12/2019", 1, 2030);
	CartaoDeCredito cdc1[] = {cartao1};
	CartaoDeCredito cdc2[] = {cartao2};
	CartaoDeCredito cdc3[] = {cartao3};
	CartaoDeCredito cdc4[] = {cartao4};
	CartaoDeCredito cdc5[] = {cartao5};
		// clientes para cadastrar compras
	Cliente cliente1 = new Cliente(1111111, "cliente1", "cliente1@email.com", "1234GG", telefone1, end1, cdc1,1);
	Cliente cliente2 = new Cliente(2111111, "cliente2", "cliente2@email.com", "123ff1", telefone2, end2, cdc2,1);
	Cliente cliente3 = new Cliente(3333333, "cliente3", "cliente3@email.com", "DDS1DD", telefone3, end3, cdc3,1);
	Cliente cliente4 = new Cliente(4444444, "cliente4", "cliente4@email.com", "ASDASF", telefone4, end4, cdc4,1);
	Cliente cliente5 = new Cliente(5555555, "cliente5", "cliente5@email.com", "VFXAI1", telefone5, end5, cdc5,1);
		//camisetas para cadastrar compras
	Camiseta camiseta1 = new Camiseta(generate_cod(), "KongCamiseta1", "Preto", "GG", "Algodão", "Regata",50.99,15,100,"moda primavera verão","camiseta barata");
	Camiseta camiseta2 = new Camiseta(generate_cod(), "KongCamiseta2", "Branco", "MM", "Latex", "Regata",299.90,100,10,"camiseta style fashion","camiseta cara");
	Camiseta camiseta3 = new Camiseta(generate_cod(), "KongCamiseta3", "Azul", "GG", "Nylon", "Regata",520.99,300,5,"camiseta moderna","edição limitada");
	Camiseta camiseta4 = new Camiseta(generate_cod(), "KongCamiseta4", "Roxo", "PP", "Algodão", "Regata",10,2,1000,"camisa do flamengo","camisa feia");
	Camiseta camiseta5 = new Camiseta(generate_cod(), "KongCamiseta5", "Prata", "GG", "Nylon", "Regata",10000,500,1,"camiseta de ouro","edição única");
		//instanciando objetos - class Compra	
	Compra compra1  = new Compra(generate_cod(), 1, cliente1, camiseta1, cliente1.getCartao());
	Compra compra2  = new Compra(generate_cod(), 3, cliente2, camiseta2, cliente2.getCartao());
	Compra compra3  = new Compra(generate_cod(), 6, cliente3, camiseta3, cliente3.getCartao());
	Compra compra4  = new Compra(generate_cod(), 1, cliente4, camiseta4, cliente4.getCartao());
	Compra compra5  = new Compra(generate_cod(), 10,cliente5, camiseta5, cliente5.getCartao());
		//instanciando objeto de atualização de compra
	Compra newcompra1 = new Compra(compra1.getIdDaCompra(),4, cliente1,camiseta5,cliente1.getCartao());
	
	//metodo cadastrar - class Compra 
	compra1.cadastrar (data_compra,compra1);
	compra2.cadastrar (data_compra,compra2);
	compra3.cadastrar (data_compra,compra3);
	compra4.cadastrar (data_compra,compra4);
	compra5.cadastrar (data_compra,compra5);

	// metodo visualizar - class Compra 
	System.out.println("Abaixo estarão alguns dados pré cadastrados de compras fictícias\n\n");	
	compra1.visualizar(data_compra, compra1.getIdDaCompra());
	compra2.visualizar(data_compra, compra2.getIdDaCompra());
	compra3.visualizar(data_compra, compra3.getIdDaCompra());
	compra4.visualizar(data_compra, compra4.getIdDaCompra());
	compra5.visualizar(data_compra, compra5.getIdDaCompra());
	
	// metodo editar - class Compra 
	System.out.println(
			"Agora testa-se o método editar. Contudo, a compra 1 está progamada" + "\n"+
			"para ser atualizada. A compra a ser atualizada pode ser alterada pelo parametro" + "\n"+
			"na função atualizar."+ "\n"
			);
	
	compra1.atualizar(data_compra, newcompra1);
	System.out.println("\n");
	compra1.visualizar(data_compra, newcompra1.getIdDaCompra());
	

	
	// metodo deletar -- class Compra
	
	System.out.println(
			 "\n" + "\n" + 
			"Após o teste do método atualizar, o método deletar é acionado para teste." + "\n" + "\n"
	);
	
	newcompra1.deletar(data_compra, newcompra1);

	
	System.out.println(
			"\n"+
			"database após deleção da compra solicitada: " + "\n" +
			data_compra
			
			);

}
	// refatorado
public static void testeCartaoDeCredito() {
	
	//criando database - data_cartao
	ArrayList<String> data_cartao = new ArrayList<String>();
	
	//instanciando objetos - class CartaoDeCredito
	CartaoDeCredito cartao1  = new CartaoDeCredito("FLO1fmu", "Visa", "643373604576", "3/12/2011", 1, 2020);
	CartaoDeCredito cartao2  = new CartaoDeCredito("Jasj123", "Elo", "701790511786", "1/12/2015" ,2, 2021);
	CartaoDeCredito cartao3  = new CartaoDeCredito("AASDS12", "MasterCard", "1232151521", "3/2/2012", 5, 2022);
	CartaoDeCredito cartao4  = new CartaoDeCredito("wqeq44q", "American Express", "98686881", "3/12/2018",6, 2031);
	CartaoDeCredito cartao5  = new CartaoDeCredito("123QQQ2", "Discover Network", "12312551231", "3/12/2019", 1, 2030);
	CartaoDeCredito cartao6  = new CartaoDeCredito("AASDA23", "Hipercard", "12312412555", "8/3/2018", 11, 2028);
	CartaoDeCredito cartao7  = new CartaoDeCredito("13Q2A4A", "Diners Club", "1246241241212", "3/6/2015", 9, 2022);
	CartaoDeCredito cartao8  = new CartaoDeCredito("Q3R3A1A", "Visa Electron", "009089868724", "6/1/2018",8, 2019);
	CartaoDeCredito cartao9  = new CartaoDeCredito("A4A3A6A", "Alelo", "31513573727", "3/9/2021", 3, 2040);
	
	CartaoDeCredito cartao_teste_editar = new CartaoDeCredito("A4A3A6A", "Visa", "12312312312", "3/9/2040", 2, 2100);

	//metodo cadastrar - class CartaoDeCredito 
	cartao1.cadastrar (data_cartao, cartao1);
	cartao2.cadastrar (data_cartao, cartao2);
	cartao3.cadastrar (data_cartao, cartao3);
	cartao4.cadastrar (data_cartao, cartao4);
	cartao5.cadastrar (data_cartao, cartao5);
	cartao6.cadastrar (data_cartao, cartao6);
	cartao7.cadastrar (data_cartao, cartao7);
	cartao8.cadastrar (data_cartao, cartao8);
	cartao9.cadastrar (data_cartao, cartao9);

	// metodo visualizar - class CartaoDeCredito 
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de cartões fictícios\n\n");
	
	cartao1.visualizar (data_cartao, cartao1);
	cartao2.visualizar (data_cartao, cartao2);
	cartao3.visualizar (data_cartao, cartao3);
	cartao4.visualizar (data_cartao, cartao4);
	cartao5.visualizar (data_cartao, cartao5);
	cartao6.visualizar (data_cartao, cartao6);
	cartao7.visualizar (data_cartao, cartao7);
	cartao8.visualizar (data_cartao, cartao8);
	cartao9.visualizar (data_cartao, cartao9);
	
	// metodo editar - class CartaoDeCredito 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, o cartão 9 está programado" + "\n"+
			"para sere atualizado. O cartão a ser atualizada pode ser alterado pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
	cartao9.editar(data_cartao, cartao_teste_editar);
	cartao9.visualizar (data_cartao, cartao9);
	
	// metodo deletar -- class CartaoDeCredito
	
	System.out.println(
			 "\n" + "\n" + 
			"Após o teste do método atualizar, o método deletar é acionado para teste." + "\n" + "\n"
	);
	
	cartao9.deletar(data_cartao, cartao9);
	
	System.out.println(
			"\n"+
			"database após deleção dos clientes solicitados: " + "\n" +
			data_cartao
			
			);
}
	// refatorado
public static void testeEndereco() {
	
	//criando database - data_endereco
	ArrayList<String> data_endereco = new ArrayList<String>();
	
	//instanciando objetos - class Endereco
	
	Endereco endereco1  = new Endereco(generate_cod(), "67125-012", "Abaiara", 123, "VILA OLÍMPIA ", "SÃO PAULO", "SP");
	Endereco endereco2  = new Endereco(generate_cod(), "77425-110", "bílio Martins", 145, "JD PETROPOLIS- PIRACICABA", "SÃO PAULO", "SP");
	Endereco endereco3  = new Endereco(generate_cod(),"51030-600", "Acaraú", 212, "VILA MARIANA", "SÃO PAULO", "SP");
	Endereco endereco4  = new Endereco(generate_cod(),"63504-650", "Acopiara", 771, "BROOKLIN ", "SÃO PAULO", "SP");
	Endereco endereco5  = new Endereco(generate_cod(),"78110-044", "Aiuá", 199 , "AV. PAULISTA", "SÃO PAULO", "SP");

	Endereco newendereco1 = new Endereco(endereco1.getId(), "15409-021", "Bailailama", 432, "Candangolandia","Brasília","DF");
	Endereco newendereco2 = new Endereco(endereco2.getId(), "90451-120", "Xiquinho", 234, "Aidanlognadnac","Brasília","DF");
	//metodo cadastrar - class Endereco 
	
	endereco1.cadastrar (data_endereco, endereco1);
	endereco2.cadastrar (data_endereco, endereco2);
	endereco3.cadastrar (data_endereco, endereco3);
	endereco4.cadastrar (data_endereco, endereco4);
	endereco5.cadastrar (data_endereco, endereco5);


	// metodo visualizar - class Endereco 
	
	System.out.println("Abaixo estarão alguns dados pré cadastrados de endereços fictícios\n\n");
	
	endereco1.visualizar (data_endereco, endereco1);
	endereco2.visualizar (data_endereco, endereco2);
	endereco3.visualizar (data_endereco, endereco3);
	endereco4.visualizar (data_endereco, endereco4);
	endereco5.visualizar (data_endereco, endereco5);
	
	// metodo editar - class Endereco 
	
	System.out.println(
			"Agora testa-se o método editar. Contudo, os endereços 1, 2 estão progamados" + "\n"+
			"para serem atualizados. O endereço a ser atualizado pode ser alterado pelo parametro" + "\n"+
			"na função editar."+ "\n"
			);
	
	endereco1.editar (data_endereco, newendereco1);
	endereco1.editar (data_endereco, newendereco2);
	endereco1.visualizar (data_endereco, endereco1);
	endereco2.visualizar (data_endereco, endereco2);

}
	// refatorado
public static void testeTelefone() {
	
		//criando database - data_telefone
		ArrayList<String> data_telefone = new ArrayList<String>();
		
		//instanciando objetos - class Telefone
		
		Telefone telefone1 = new Telefone(generate_cod_int(), 61 , 98726178);
		Telefone telefone2 = new Telefone(generate_cod_int(), 55 , 98777178);
		Telefone telefone3 = new Telefone(generate_cod_int(), 61 , 98724448);
		Telefone telefone4 = new Telefone(generate_cod_int(), 55 , 90987668);
		Telefone telefone5 = new Telefone(generate_cod_int(), 61 , 99812357);
		Telefone telefone6 = new Telefone(generate_cod_int(), 66 , 91226178);
		Telefone telefone7 = new Telefone(generate_cod_int(), 61 , 92726178);
		Telefone telefone8 = new Telefone(generate_cod_int(), 67 , 93826178);
		Telefone telefone9 = new Telefone(generate_cod_int(), 33 , 94926178);
		Telefone telefone10= new Telefone(generate_cod_int(),55 , 95726118);
			
		Telefone newtelefone7 = new Telefone(telefone7.getId(), 55 , 958744863);
		Telefone newtelefone8 = new Telefone(telefone8.getId(), 55 , 977845612);
		Telefone newtelefone9 = new Telefone(telefone9.getId(), 55 , 987564811);
		//metodo cadastrar - class Telefone 
		
		telefone1.cadastrar(data_telefone, telefone1);
		telefone2.cadastrar(data_telefone, telefone2);
		telefone3.cadastrar(data_telefone, telefone3);
		telefone4.cadastrar(data_telefone, telefone4);
		telefone5.cadastrar(data_telefone, telefone5);
		telefone6.cadastrar(data_telefone, telefone6);
		telefone7.cadastrar(data_telefone, telefone7);
		telefone8.cadastrar(data_telefone, telefone8);
		telefone9.cadastrar(data_telefone, telefone9);
		telefone10.cadastrar(data_telefone, telefone10);
		
		// metodo visualizar - class Telefone 
		
		System.out.println("Abaixo estarão alguns dados pré cadastrados de telefones fictícios" + "\n" + "\n");
		
		telefone1.visualizar(data_telefone, telefone1);
		telefone2.visualizar(data_telefone, telefone2);
		telefone3.visualizar(data_telefone, telefone3);
		telefone4.visualizar(data_telefone, telefone4);
		telefone5.visualizar(data_telefone, telefone5);
		telefone6.visualizar(data_telefone, telefone6);
		telefone7.visualizar(data_telefone, telefone7);
		telefone8.visualizar(data_telefone, telefone8);
		telefone9.visualizar(data_telefone, telefone9);
		telefone10.visualizar(data_telefone, telefone10);

		
		// metodo editar - class Cliente 
		
		System.out.println(
				"Agora testa-se o método editar. Contudo, os telefones 7, 8 e 9 estão progamados" + "\n"+
				"para serem atualizados. O telefone a ser atualizado pode ser alterado pelo parametro" + "\n"+
				"na função editar."+ "\n"
				);
		
		telefone7.editar(data_telefone, newtelefone7);
		telefone8.editar(data_telefone, newtelefone8);
		telefone9.editar(data_telefone, newtelefone9);
		
		telefone7.visualizar(data_telefone, telefone7);
		telefone8.visualizar(data_telefone, telefone8);
		telefone9.visualizar(data_telefone, telefone9);

			
		// metodo deletar -- class Telefone 
		
		System.out.println(
				 "\n" + "\n" + 
				"Após o teste do método editar, o método deletar é acionado para teste." + "\n" + "\n"
		);
		
		telefone7.deletar(data_telefone, telefone7);
		telefone8.deletar(data_telefone, telefone8);
		telefone9.deletar(data_telefone, telefone9);
		
		System.out.println(
				"\n"+
				"database após deleção dos telefones solicitados: " + "\n" +
				data_telefone
				
				);
}
	// criado - farei o método exportar se sobrar tempo, pois preciso gerar um pdf e eu não sei fazer isso 
public static void testeFluxoDeCaixa() {
	//criando database para teste - data_camiseta
	ArrayList<String> data_camiseta = new ArrayList<String>();
	// instanciando objetos para teste
	Camiseta camiseta1 = new Camiseta(generate_cod(), "KongCamiseta1", "Preto", "GG", "Algodão", "Regata",50.99,15,100,"moda primavera verão","camiseta barata");
	Camiseta camiseta2 = new Camiseta(generate_cod(), "KongCamiseta2", "Branco", "MM", "Latex", "Regata",299.90,100,10,"camiseta style fashion","camiseta cara");
	Camiseta camiseta3 = new Camiseta(generate_cod(), "KongCamiseta3", "Azul", "GG", "Nylon", "Regata",520.99,300,5,"camiseta moderna","edição limitada");
	Camiseta camiseta4 = new Camiseta(generate_cod(), "KongCamiseta4", "Roxo", "PP", "Algodão", "Regata",10,2,1000,"camisa do flamengo","camisa feia");
	Camiseta camiseta5 = new Camiseta(generate_cod(), "KongCamiseta5", "Prata", "GG", "Nylon", "Regata",10000,500,1,"camiseta de ouro","edição única");
	camiseta1.cadastrar(data_camiseta, camiseta1);
	camiseta2.cadastrar(data_camiseta, camiseta2);
	camiseta3.cadastrar(data_camiseta, camiseta3);
	camiseta4.cadastrar(data_camiseta, camiseta4);
	camiseta5.cadastrar(data_camiseta, camiseta5);
	
	System.out.println("Datatabse de camiseta antes da atualização do estoque:");
	System.out.println(" ");
	System.out.println(data_camiseta);
	System.out.println(" ");
	Telefone telefone1 = new Telefone(1, 61 , 98726178);
	
	Endereco endereco1 = new Endereco("1", "67125-012", "Abaiara", 123, "VILA OLÍMPIA ", "SÃO PAULO", "SP");
	Endereco end1[] = {endereco1};
	
	CartaoDeCredito cartao1 = new CartaoDeCredito ("FLO1fmu", "Visa", "643373604576", "3/12/2011", 1, 2020);
	CartaoDeCredito cdc1[] = {cartao1};
	
	Cliente cliente1 = new Cliente(1111111, "cliente1", "cliente1@email.com", "1234GG", telefone1, end1, cdc1,1);
	
	Compra compra1  = new Compra(generate_cod(), 1, cliente1, camiseta1, cliente1.getCartao());
	
	System.out.println("Valor de estoque da camiseta 1 (100 peças) após a compra  de 1 unidade: " 
	+ FluxoDeCaixa.atualizaEstoque(data_camiseta, compra1) );
	
	System.out.print("Gastos = "+ FluxoDeCaixa.calculaGastos(data_camiseta) + "\n");
	
	System.out.print("Ganhos brutos = " + FluxoDeCaixa.calculaGanhoBruto(data_camiseta) + "\n");
	
	System.out.print("Ganhos líquidos = " + FluxoDeCaixa.calculaGanhoLiquido(data_camiseta) + "\n");
	

	System.out.println("Chamando o método visualizar: \n");
	FluxoDeCaixa.visualizar(data_camiseta);
	System.out.println(" ");

}
	
	// métodos auxiliares:
	// metodo gerador de código numérico aleatório convertido em string
public static String generate_cod() {
	Random random = new Random();
	int codigo_int = random.nextInt(100000000);
	String codigo_string = Integer.toString(codigo_int);
	return codigo_string;
	}	
	// método gerador de código numérico aleatório convertido em int
public static int generate_cod_int() {
	Random random = new Random();
	int codigo_int = random.nextInt(100000000);
	return codigo_int;
}}
	// FIM