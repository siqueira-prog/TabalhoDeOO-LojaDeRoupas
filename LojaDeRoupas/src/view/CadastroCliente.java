package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.Client_control;
import controller.Data_control;
public class CadastroCliente implements ActionListener {
	// DATABASE 
	private Data_control database = new Data_control();
    // JANELA
    private static JFrame janela = new JFrame("Cadastro de Cliente");
    private static JLabel titulo = new JLabel("Cadastro de Cliente");
    private static JLabel subtitulo1 = new JLabel("Infomações Pessoais");
    private static JLabel subtitulo2 = new JLabel("Infomações do Endereço");
    private static JLabel subtitulo3 = new JLabel("Infomações do Cartão de crédito");
    // INFORMÇÕES PESSOAIS
    // NOME
    private static JLabel labelNome = new JLabel("Didigite seu nome:");
    private static JTextField fieldNome = new JTextField();
    // CPF
    private static JLabel labelCPF = new JLabel("Didigite seu CPF:");
    private static JTextField fieldCPF = new JTextField();
    // Input email
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();
    // DDD
    private static JLabel labelDDD = new JLabel("DDD:");
    private static JTextField fieldDDD = new JTextField();
    // TELEFONE
    private static JLabel labelTele = new JLabel("Telefone:");
    private static JTextField fieldTele = new JTextField();
    // SENHA
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    static JPasswordField senha = new JPasswordField();
    // CONFIRMAR SENHA 
    private static JLabel labelConfirmSenha = new JLabel("Repita sua senha:");
    JPasswordField confirmSenha = new JPasswordField();
    // ENDERECO
    // LOGRADOURO
    private static JLabel labelLogradouro = new JLabel("Logradouro:");
    private static JTextField fieldLogradouro = new JTextField();
    // NUMERO DO ENDERECO
    private static JLabel labelNumeroEnd = new JLabel("Nº:");
    private static JTextField fieldNumeroEnd = new JTextField();
    // BAIRRO
    private static JLabel labelBairro = new JLabel("Bairro:");
    private static JTextField fieldBairro = new JTextField();
    // CEP
    private static JLabel labelCep = new JLabel("CEP:");
    private static JTextField fieldCep = new JTextField();
    // CIDADE
    private static JLabel labelCidade = new JLabel("Cidade");
    private static JTextField fieldCidade = new JTextField();
    // ESTADO
    private static JLabel labelEstado = new JLabel("Estado");
    private static JTextField fieldEstado = new JTextField();
    // CARTÃO DE CRÉDITO
    // BANDEIRA
    private static JLabel labelBand = new JLabel("Didigite a bandeira do cartão:");
    private static JTextField fieldBand = new JTextField();
    // NUMERO DO CARTAO
    private static JLabel labelNumCart = new JLabel("Didigite o número do seu cartão:");
    private static JTextField fieldNumCart = new JTextField();
    // CODIGO DE SEGURANCA
    private static JLabel labelCodSeg = new JLabel("Didigite o código de segurança:");
    private static JTextField fieldCodSeg = new JTextField();
    // NASCIMENTO DO CARTAO
    private static JLabel labelDataNasc = new JLabel("Digite a sua data de nascimento:");
    private static JTextField fieldDataNasc = new JTextField();
    // VENCIMENTO DO CARTAO
    private static JLabel labelDataVenc = new JLabel("Digite a data de vencimento:");
    private static JLabel labelMesVenc = new JLabel("Mês:");
    private static JLabel labelAnoVenc = new JLabel("Ano:");
    private static JTextField fieldMesVenc = new JTextField();
    private static JTextField fieldAnoVenc = new JTextField();
    // BOTOES
    private static JButton cadastrar = new JButton("Cadastrar");
    private static JButton cancelar = new JButton("Cancelar");
    // CONSTRUTOR
    public CadastroCliente() {
        // JANELA
        janela.setLayout(null);
        titulo.setBounds(300, 20, 600, 50);
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        subtitulo1.setBounds(20, 80, 250, 50);
        subtitulo1.setFont(new Font("Algerian", Font.BOLD, 20));
        subtitulo2.setBounds(380, 80, 280, 50);
        subtitulo2.setFont(new Font("Algerian", Font.BOLD, 20));
        subtitulo3.setBounds(730, 80, 500, 50);
        subtitulo3.setFont(new Font("Algerian", Font.BOLD, 20));
        // INFORMAÇÕES PESSOAIS
        // NOME
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldNome.setForeground(new Color(212,175,55));
        // CPF
        labelCPF.setBounds(20, 190, 250, 50);
        fieldCPF.setBounds(20, 230, 250, 50);
        labelCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldCPF.setForeground(new Color(212,175,55)); 
        // EMAIL
        labelEmail.setBounds(20, 270, 250, 50);
        fieldEmail.setBounds(20, 310, 250, 50);
        labelEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldEmail.setForeground(new Color(212,175,55));
        // DDD
        labelDDD.setBounds(20, 350, 50, 50);
        fieldDDD.setBounds(20, 390, 50, 50);
        labelDDD.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDDD.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldDDD.setForeground(new Color(212,175,55));
        // TELEFONE
        labelTele.setBounds(90, 350, 250, 50);
        fieldTele.setBounds(90, 390, 180, 50);
        labelTele.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTele.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldTele.setForeground(new Color(212,175,55));
        // SENHA
        labelSenha.setBounds(20, 430, 250, 50);
        senha.setBounds(20, 470, 250, 50);
        labelSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        senha.setForeground(new Color(212,175,55));
        // CONFIRMA SENHA 
        labelConfirmSenha.setBounds(20, 510, 250, 50);
        confirmSenha.setBounds(20, 550, 250, 50);
        labelConfirmSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        confirmSenha.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        confirmSenha.setForeground(new Color(212,175,55));
        // ENDEREÇO
        // LOGRADOURO
        labelLogradouro.setBounds(380, 110, 250, 50);
        fieldLogradouro.setBounds(380, 150, 250, 50);
        labelLogradouro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldLogradouro.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldLogradouro.setForeground(new Color(212,175,55));
        // NUMERO DO ENDERECO
        labelNumeroEnd.setBounds(380, 190, 50, 50);
        fieldNumeroEnd.setBounds(380, 230, 50, 50);
        labelNumeroEnd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumeroEnd.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldNumeroEnd.setForeground(new Color(212,175,55));
        // BAIRRO
        labelBairro.setBounds(450, 190, 200, 50);
        fieldBairro.setBounds(450, 230, 180, 50);
        labelBairro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBairro.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldBairro.setForeground(new Color(212,175,55));
        // CEP
        labelCep.setBounds(380, 270, 250, 50);
        fieldCep.setBounds(380, 310, 250, 50);
        labelCep.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCep.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldCep.setForeground(new Color(212,175,55));
        // CIDADE
        labelCidade.setBounds(380, 350, 250, 50);
        fieldCidade.setBounds(380, 390, 250, 50);
        labelCidade.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCidade.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldCidade.setForeground(new Color(212,175,55));
        // ESTADO
        labelEstado.setBounds(380, 430, 250, 50);
        fieldEstado.setBounds(380, 470, 250, 50);
        labelEstado.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstado.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldEstado.setForeground(new Color(212,175,55));
        // CARTÃƒO DE CRÉDITO
        // BANDEIRA
        labelBand.setBounds(730, 110, 600, 50);
        fieldBand.setBounds(730, 150, 370, 50);
        labelBand.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBand.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldBand.setForeground(new Color(212,175,55));
        // NUMERO DO CARTAO
        labelNumCart.setBounds(730, 190, 600, 50);
        fieldNumCart.setBounds(730, 230, 370, 50);
        labelNumCart.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumCart.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldNumCart.setForeground(new Color(212,175,55));
        // CODIGO DE SEGURANCA
        labelCodSeg.setBounds(730, 270, 600, 50);
        fieldCodSeg.setBounds(730, 310, 370, 50);
        labelCodSeg.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCodSeg.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldCodSeg.setForeground(new Color(212,175,55));
        // DATA DE NASCIMENTO DO CARTAO
        labelDataNasc.setBounds(730, 350, 650, 50);
        fieldDataNasc.setBounds(730, 390, 370, 50);
        labelDataNasc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDataNasc.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldDataNasc.setForeground(new Color(212,175,55));
        // DATA DE VENCIMENTO DO CARTAO
        labelDataVenc.setBounds(730, 430, 600, 50);
        labelDataVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        // MES DE VENCIMENTO DO CARTAO
        labelMesVenc.setBounds(730, 450, 250, 50);
        labelMesVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldMesVenc.setBounds(730, 490, 100, 50);
        fieldMesVenc.setForeground(new Color(212,175,55));
        fieldMesVenc.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        // ANO DE VENCIMENTO DO CARTAO
        labelAnoVenc.setBounds(950, 450, 250, 50);
        labelAnoVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldAnoVenc.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldAnoVenc.setForeground(new Color(212,175,55));
        fieldAnoVenc.setBounds(950, 490, 100, 50);
        // BOTÕES
        // CADASTRAR
        cadastrar.setBounds(306, 640, 250, 50);
        cadastrar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        cadastrar.setFont(new Font("Algerian", Font.BOLD, 20));
        cadastrar.setBackground(Color.GREEN);
        cadastrar.setForeground(Color.BLACK);
        // CANCELAR
        cancelar.setBounds(650, 640, 250, 50);
        cancelar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        cancelar.setFont(new Font("Algerian", Font.BOLD, 20));
        cancelar.setBackground(Color.RED);
        cancelar.setForeground(Color.BLACK);
        // [ADICIONANDO A JANELA]
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
        janela.setSize(1200, 768);
        janela.add(titulo);
        janela.add(subtitulo1);
        janela.add(subtitulo2);
        janela.add(subtitulo3);
        janela.add(cadastrar);
        janela.add(cancelar);
        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelCPF);
        janela.add(fieldCPF);
        janela.add(labelEmail);
        janela.add(fieldEmail);
        janela.add(labelDDD);
        janela.add(fieldDDD);
        janela.add(labelTele);
        janela.add(fieldTele);
        janela.add(labelSenha);
        janela.add(senha);
        janela.add(labelConfirmSenha);
        janela.add(confirmSenha);
        janela.add(labelLogradouro);
        janela.add(fieldLogradouro);
        janela.add(labelNumeroEnd);
        janela.add(fieldNumeroEnd);
        janela.add(labelBairro);
        janela.add(fieldBairro);
        janela.add(labelCep);
        janela.add(fieldCep);
        janela.add(labelCidade);
        janela.add(fieldCidade);
        janela.add(labelEstado);
        janela.add(fieldEstado);
        janela.add(labelBand);
        janela.add(fieldBand);
        janela.add(labelNumCart);
        janela.add(fieldNumCart);
        janela.add(labelCodSeg);
        janela.add(fieldCodSeg);
        janela.add(labelDataNasc);
        janela.add(fieldDataNasc);
        janela.add(labelDataVenc);
        janela.add(labelMesVenc);
        janela.add(labelAnoVenc);
        janela.add(fieldMesVenc);
        janela.add(fieldAnoVenc);
    }
	// MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void cadastrarCliente() {
        CadastroCliente cadastrocliente = new CadastroCliente();
        cadastrar.addActionListener(cadastrocliente);
        cancelar.addActionListener(cadastrocliente);
    }
	// MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE  
    public static void main(String[] args) {
        CadastroCliente cadastrocliente = new CadastroCliente();
        cadastrar.addActionListener(cadastrocliente);
        cancelar.addActionListener(cadastrocliente);
        }
    // MÉTODO PARA INSTRUIR AS AÇÕES
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == cadastrar) {
            	  database.setDatabase_client(
            			Client_control.cadastrar_cliente(
              			database.getDatabase_client(),
              			fieldCPF,
              			fieldNome,
              			fieldEmail,
              			senha,
              			fieldDDD,
              			fieldTele,
              			fieldCep,
              			fieldLogradouro,
              			fieldNumeroEnd,
              			fieldBairro,
              			fieldCidade,
              			fieldEstado,
              			fieldBand,
              			fieldNumCart,
              			fieldCodSeg,
              			fieldDataNasc,
              			fieldMesVenc,
              			fieldAnoVenc));
        		int index = database.getDatabase_client().indexOf(fieldEmail.getText());
                System.out.println("INDEX : "+index);
            	System.out.println("database após a adição dos itens: "+database.getDatabase_client());
            	new MenuCliente(index,database).menu(index,database);
            	janela.dispose();
        	
        	}
        if (src == cancelar) {
        	new	Home().home();
            janela.dispose();

        }
    }}