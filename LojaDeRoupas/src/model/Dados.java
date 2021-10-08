//package
package model;

//class
import java.util.ArrayList;
import java.util.Random;
	
public class Dados {
	
	
	//atributte
	private  ArrayList<String> data_cliente = dados().get(0);
	private  ArrayList<String> data_adm= dados().get(7);
	private  ArrayList<String> data_tell= dados().get(1);
	private  ArrayList<String> data_end= dados().get(2);
	private  ArrayList<String> data_cdc= dados().get(3);
	private  ArrayList<String> data_camiseta= dados().get(5);
	private  ArrayList<String> data_compra= dados().get(4);
	private  ArrayList<String> data_loja= dados().get(6);
	

	//constructor
	public Dados(
			ArrayList<String> data_cliente,
			ArrayList<String> data_adm,
			ArrayList<String> data_tell,
			ArrayList<String> data_end,
			ArrayList<String> data_cdc,
			ArrayList<String> data_camiseta,
			ArrayList<String> data_compra,
			ArrayList<String> data_loja) {
		this.data_cliente = data_cliente;
		this.data_adm = data_adm;
		this.data_tell = data_tell;
		this.data_end = data_end;
		this.data_cdc = data_cdc;
		this.data_camiseta = data_camiseta;
		this.data_compra = data_compra;
		this.data_loja = data_loja;
	}

	public String toString() {
		return "Dados [data_cliente=" + data_cliente + ", data_adm=" + data_adm + ", data_tell=" + data_tell
				+ ", data_end=" + data_end + ", data_cdc=" + data_cdc + ", data_camiseta=" + data_camiseta
				+ ", data_compra=" + data_compra + ", data_loja=" + data_loja + "]";
	}

	public static Dados databaseprecadastrado() {
		Dados dados = new Dados( 
				dados().get(0),
				dados().get(1),
				dados().get(2),
				dados().get(3),
				dados().get(4),
				dados().get(5), 
				dados().get(6),
				dados().get(7)
				);
				
		return dados;
	}
	//dados previamente cadastrados
	public static ArrayList<ArrayList<String>> dados () {
		
		//criando database - data_client
		ArrayList<String> data_client = new ArrayList<String>();
		//criando database - data_tell
		ArrayList<String> data_tell = new ArrayList<String>();
		//criando database - data_end
		ArrayList<String> data_end = new ArrayList<String>();
		//criando database - data_cdc
		ArrayList<String> data_cdc = new ArrayList<String>();
		//criando database - data_compra 
		ArrayList<String> data_compra = new ArrayList<String>();
		//criando database - data_camiseta
		ArrayList<String> data_camiseta = new ArrayList<String>();
		//criando database - data_loja
		ArrayList<String> data_loja = new ArrayList<String>();
		//criando database - data administrador
		ArrayList<String> data_adm = new ArrayList<String>();
		// criando database global - todas as informações pré cadastradas
		ArrayList<ArrayList<String>> data_global = new ArrayList<ArrayList<String>>();
	
		/*
		 @POSIÇÕES NO ARRAYLIST DATA_GLOBAL@
		 0 - data_client
		 1 - data_tell
		 2 - data_end
		 3 - data_cdc
		 4 - data_compra
		 5 - data_camiseta
		 6 - data_loja
		 7 - data_adm
		 */
	
		//DATA-TELL
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
		
		//DATA-END
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
		
		//DATA-CDC
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
		
		//DATA-CLIENTS
		
		Cliente cliente1 = new Cliente(1111111, "cliente1", "cliente1@email.com", "1234GG", telefone1, end1, cdc1,0);
		Cliente cliente2 = new Cliente(2111111, "cliente2", "cliente2@email.com", "123ff1", telefone2, end2, cdc2,0);
		Cliente cliente3 = new Cliente(3333333, "cliente3", "cliente3@email.com", "DDS1DD", telefone3, end3, cdc3,0);
		Cliente cliente4 = new Cliente(4444444, "cliente4", "cliente4@email.com", "ASDASF", telefone4, end4, cdc4,0);
		Cliente cliente5 = new Cliente(5555555, "cliente5", "cliente5@email.com", "VFXAI1", telefone5, end5, cdc5,0);
		Cliente cliente6 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
		Cliente cliente7 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
		Cliente cliente8 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
		Cliente cliente9 = new Cliente(0, null, null, null, tel, end0, cdc0, 0);
		Cliente cliente10 =new Cliente(0, null, null, null, tel, end0, cdc0, 0);
		
		//DATA-CAMISETA
		Camiseta camiseta1 = new Camiseta(generate_cod(), "KongCamiseta1", "Preto", "GG", "Algodão", "Regata",50.99,15,100,"moda primavera verão","camiseta barata");
		Camiseta camiseta2 = new Camiseta(generate_cod(), "KongCamiseta2", "Branco", "MM", "Latex", "Regata",299.90,100,10,"camiseta style fashion","camiseta cara");
		Camiseta camiseta3 = new Camiseta(generate_cod(), "KongCamiseta3", "Azul", "GG", "Nylon", "Regata",520.99,300,5,"camiseta moderna","edição limitada");
		Camiseta camiseta4 = new Camiseta(generate_cod(), "KongCamiseta4", "Roxo", "PP", "Algodão", "Regata",10,2,1000,"camisa do flamengo","camisa feia");
		Camiseta camiseta5 = new Camiseta(generate_cod(), "KongCamiseta5", "Prata", "GG", "Nylon", "Regata",10000,500,1,"camiseta de ouro","edição única");
		
		//DATA-COMPRA
		Compra compra1  = new Compra(generate_cod(), 1, cliente1, camiseta1, cliente1.getCartao());
		Compra compra2  = new Compra(generate_cod(), 3, cliente2, camiseta2, cliente2.getCartao());
		Compra compra3  = new Compra(generate_cod(), 6, cliente3, camiseta3, cliente3.getCartao());
		Compra compra4  = new Compra(generate_cod(), 1, cliente4, camiseta4, cliente4.getCartao());
		Compra compra5  = new Compra(generate_cod(), 10,cliente5, camiseta5, cliente5.getCartao());
		
		//DATA-LOJA
		Loja loja1 = new Loja(null, null, null, null, null);
		Loja loja2 = new Loja(null, null, null, null, null);
		Loja loja3 = new Loja(null, null, null, null, null);
		
		//DATA-ADMINISTRADOR
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
		
		//CADASTRANDO CLIENTES
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
	
		//CADASTRANDO TELEFONES 
		telefone1.cadastrar(data_tell, telefone1);
		telefone2.cadastrar(data_tell, telefone2);
		telefone3.cadastrar(data_tell, telefone3);
		telefone4.cadastrar(data_tell, telefone4);
		telefone5.cadastrar(data_tell, telefone5);
		telefone6.cadastrar(data_tell, telefone6);
		telefone7.cadastrar(data_tell, telefone7);
		telefone8.cadastrar(data_tell, telefone8);
		telefone9.cadastrar(data_tell, telefone9);
		telefone10.cadastrar(data_tell, telefone10);
		
		//CADASTRANDOS ENDEREÇOS	
		endereco1.cadastrar (data_end, endereco1);
		endereco2.cadastrar (data_end, endereco2);
		endereco3.cadastrar (data_end, endereco3);
		endereco4.cadastrar (data_end, endereco4);
		endereco5.cadastrar (data_end, endereco5);
		endereco6.cadastrar (data_end, endereco6);
		endereco7.cadastrar (data_end, endereco7);
		endereco8.cadastrar (data_end, endereco8);
		endereco9.cadastrar (data_end, endereco9);
		endereco10.cadastrar (data_end, endereco10);
		
		//CADASTRANDO CARTÕES DE CRÉDITOS	
		cartao1.cadastrar (data_cdc, cartao1);
		cartao2.cadastrar (data_cdc, cartao2);
		cartao3.cadastrar (data_cdc, cartao3);
		cartao4.cadastrar (data_cdc, cartao4);
		cartao5.cadastrar (data_cdc, cartao5);
		cartao6.cadastrar (data_cdc, cartao6);
		cartao7.cadastrar (data_cdc, cartao7);
		cartao8.cadastrar (data_cdc, cartao8);
		cartao9.cadastrar (data_cdc, cartao9);
		cartao10.cadastrar (data_cdc, cartao10);
		
		//CADASTRANDO COMPRAS	
		compra1.cadastrar (data_compra,compra1);
		compra2.cadastrar (data_compra,compra2);
		compra3.cadastrar (data_compra,compra3);
		compra4.cadastrar (data_compra,compra4);
		compra5.cadastrar (data_compra,compra5);
		
		//CADASTRANDO CAMISETAS
		camiseta1.cadastrar(data_camiseta, camiseta1);
		camiseta2.cadastrar(data_camiseta, camiseta2);
		camiseta3.cadastrar(data_camiseta, camiseta3);
		camiseta4.cadastrar(data_camiseta, camiseta4);
		camiseta5.cadastrar(data_camiseta, camiseta5);
		
		//CADASTRANDO LOJAS  - OBJETOS INSTANCIADOS AQUI
		loja1.cadastrar(data_loja, "78.353.334/0001-36",  "Kong Team T-Shirt" , "KongFilial_1", "kong1@email.com", endereco1);
		loja2.cadastrar(data_loja, "87.821.715/0001-93",  "Kong Team T-Shirt" , "KongFilial_2", "kong2@email.com", endereco2);
		loja3.cadastrar(data_loja, "61.462.605/0001-99",  "Kong Team T-Shirt" , "kongFilial_3", "kong3@email.com", endereco3);
		
		//
		adm1.cadastrar(data_adm,1111111 , "adm1", "adm1@email.com", "111",tel, end0, cdc0);
		adm2.cadastrar(data_adm,2111111, "adm2", "adm2@email.com", "222", tel, end0, cdc0);
		adm3.cadastrar(data_adm,3333333, "adm3", "adm3@email.com", "333", tel, end0, cdc0);
		adm4.cadastrar(data_adm,4444444, "adm4", "adm4@email.com", "444", tel, end0, cdc0);
		adm5.cadastrar(data_adm,5555555, "adm5", "adm5@email.com", "555", tel, end0, cdc0);
		adm6.cadastrar(data_adm,6666666, "adm6", "adm6@email.com", "666", tel, end0, cdc0);
		adm7.cadastrar(data_adm,7777777, "adm7", "adm7@email.com", "777", tel, end0, cdc0);
		adm8.cadastrar(data_adm,8888888, "adm8", "adm8@email.com", "888", tel, end0, cdc0);
		adm9.cadastrar(data_adm,9999999, "adm9", "adm9@email.com", "999", tel, end0, cdc0);
		adm10.cadastrar(data_adm,101010, "adm10", "adm10@email.com", "101010", tel, end0, cdc0);
		
	
		data_global.add(data_client);
		data_global.add(data_tell);
		data_global.add(data_end);
		data_global.add(data_cdc);
		data_global.add(data_compra);
		data_global.add(data_camiseta);
		data_global.add(data_loja);
		data_global.add(data_adm);
		return data_global;
	}
		
	//metodo main para teste interno
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> data = dados();
		System.out.println(Dados.dados().get(0).get(0));
		System.out.println(" ");
		System.out.println("CLIENTE");
		System.out.println(" ");
		System.out.println(data.get(0));
		System.out.println(" ");
		System.out.println("TELEFONE");
		System.out.println(" ");
		System.out.println(data.get(1));
		System.out.println(" ");
		System.out.println("ENDEREÇO");
		System.out.println(" ");
		System.out.println(data.get(2));
		System.out.println(" ");
		System.out.println("CARTAO DE CRÉDITO");
		System.out.println(" ");
		System.out.println(data.get(3));
		System.out.println(" ");
		System.out.println("COMPRA");
		System.out.println(" ");
		System.out.println(data.get(4));
		System.out.println(" ");
		System.out.println("CAMISEA");
		System.out.println(" ");
		System.out.println(data.get(5));
		System.out.println(" ");
		System.out.println("LOJA");
		System.out.println(" ");
		System.out.println(data.get(6));
		System.out.println(" ");
		System.out.println("ADMINISTRADOR");
		System.out.println(" ");
		System.out.println(data.get(7));
	}
	
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
	}

	
public ArrayList<String> getData_cliente() {
	return data_cliente;
}

public void setData_cliente(ArrayList<String> data_cliente) {
	this.data_cliente = data_cliente;
}

public ArrayList<String> getData_adm() {
	return data_adm;
}

public void setData_adm(ArrayList<String> data_adm) {
	this.data_adm = data_adm;
}

public ArrayList<String> getData_tell() {
	return data_tell;
}

public void setData_tell(ArrayList<String> data_tell) {
	this.data_tell = data_tell;
}

public ArrayList<String> getData_end() {
	return data_end;
}

public void setData_end(ArrayList<String> data_end) {
	this.data_end = data_end;
}

public ArrayList<String> getData_cdc() {
	return data_cdc;
}

public void setData_cdc(ArrayList<String> data_cdc) {
	this.data_cdc = data_cdc;
}

public ArrayList<String> getData_camiseta() {
	return data_camiseta;
}

public void setData_camiseta(ArrayList<String> data_camiseta) {
	this.data_camiseta = data_camiseta;
}

public ArrayList<String> getData_compra() {
	return data_compra;
}

public void setData_compra(ArrayList<String> data_compra) {
	this.data_compra = data_compra;
}

public ArrayList<String> getData_loja() {
	return data_loja;
}

public void setData_loja(ArrayList<String> data_loja) {
	this.data_loja = data_loja;
}}
// FIM