package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.Data_control;
public class DetalheCliente implements ActionListener {
	// DATABASE 
	static Data_control database = new Data_control();
	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index;
    // JANELA
    private static JFrame janela = new JFrame("Detalhes do Cliente");
    private static JLabel titulo = new JLabel("Detalhes do Cliente");
    private static JLabel subtitulo1 = new JLabel("Infomações Pessoais");
    private static JLabel subtitulo2 = new JLabel("Infomações de Endereço");
    private static JLabel subtitulo3 = new JLabel("Infomações do Cartão de Crédito");
    // INFORMAÇÕES PESSOAIS
    // NOME
    private static JLabel labelNome = new JLabel("Seu nome:");
    private static JTextField fieldNome = new JTextField("Ronaldo Fenômeno");
    // CPF
    private static JLabel labelCPF = new JLabel("Seu CPF:");
    private static JTextField fieldCPF = new JTextField("777.777.777-77");
    // EMAIL
    private static JLabel labelEmail = new JLabel("Seu email:");
    private static JTextField fieldEmail = new JTextField();
    // NUMERO
    private static JLabel labelTele = new JLabel("Número:");
    private static JTextField fieldTele = new JTextField();
    // SENHA
    private static JLabel labelSenha = new JLabel("Sua senha:");
    private static JTextField senha = new JTextField();
    // ENDEREÇO
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
    private static JLabel labelBand = new JLabel("Bandeira do cartão:");
    private static JTextField fieldBand = new JTextField();
    // NUMERO DO CARTAO
    private static JLabel labelNumCart = new JLabel("Número do seu cartão:");
    private static JTextField fieldNumCart = new JTextField();
    // CODIGO DE SEGURANCA
    private static JLabel labelCodSeg = new JLabel("Código de segurança:");
    private static JTextField fieldCodSeg = new JTextField();
    // DATA DE NASCIMENTO DO CARTAO
    private static JLabel labelDataNasc = new JLabel("Data de nascimento:");
    private static JTextField fieldDataNasc = new JTextField();
    // DATA DE VENCIMENTO DO CARTAO
    private static JLabel labelDataVenc = new JLabel("Data de vencimento:");
    private static JLabel labelMesVenc = new JLabel("Mês:");
    private static JLabel labelAnoVenc = new JLabel("Ano:");
    private static JTextField fieldMesVenc = new JTextField();
    private static JTextField fieldAnoVenc = new JTextField();
    // BOTAO
    private static JButton editar = new JButton("Editar");
    private static JButton voltar = new JButton("Voltar");
    // CONSTRUTOR
    public DetalheCliente(int index, Data_control database) {
    	// VISUALIZANDO O INDEX PARA CONTROLER DE BUGS 
    	System.out.println("Valor da posição do email no construtor de DetalheCliente= "+index);
    	// PASSANDO O DATABASE PARA SER USADO NAS PROXIMAS PAGINAS 
    	MenuCliente.database = database;
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	DetalheCliente.index= index;  
    	// JANELA
        janela.setLayout(null);
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(220, 20, 600, 50);
        subtitulo1.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo1.setBounds(20, 80, 250, 50);
        subtitulo2.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo2.setBounds(380, 80, 250, 50);
        subtitulo3.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo3.setBounds(730, 80, 300, 50);
        // INFORMAÇÕES PESSOAIS
        // NOME
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);
        fieldNome.setEditable(false);
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setForeground(new Color(212,175,55));
        fieldNome.setText(database.getDatabase_client().get(index-1));
        // CPF
        labelCPF.setBounds(20, 190, 250, 50);
        fieldCPF.setBounds(20, 230, 250, 50);
        fieldCPF.setEditable(false);
        labelCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setForeground(new Color(212,175,55));
        fieldCPF.setText(database.getDatabase_client().get(index-2));
        // EMAIL
        labelEmail.setBounds(20, 270, 250, 50);
        fieldEmail.setBounds(20, 310, 250, 50);
        fieldEmail.setEditable(false);
        labelEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setForeground(new Color(212,175,55));
        fieldEmail.setText(database.getDatabase_client().get(index));
        // SENHA
        labelSenha.setBounds(20, 430, 250, 50);
        senha.setBounds(20, 470, 250, 50);
        senha.setEditable(false);
        labelSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setForeground(new Color(212,175,55));
        senha.setText(database.getDatabase_client().get(index+1));
        // TELEFONE
        labelTele.setBounds(20, 350, 250, 50);
        fieldTele.setBounds(20, 390, 250, 50);
        fieldTele.setEditable(false);
        labelTele.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTele.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTele.setForeground(new Color(212,175,55));
        fieldTele.setText(database.getDatabase_client().get(index+2));
        // ENDEREÇO
        // LOGRADROURO
        labelLogradouro.setBounds(380, 110, 250, 50);
        fieldLogradouro.setBounds(380, 150, 250, 50);
        fieldLogradouro.setEditable(false);
        labelLogradouro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldLogradouro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldLogradouro.setForeground(new Color(212,175,55)); 
        fieldLogradouro.setText(database.getDatabase_client().get(index+4));
        // NUMERO DO ENDEREÇO
        labelNumeroEnd.setBounds(380, 190, 50, 50);
        fieldNumeroEnd.setBounds(380, 230, 50, 50);
        fieldNumeroEnd.setEditable(false);
        labelNumeroEnd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumeroEnd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumeroEnd.setForeground(new Color(212,175,55)); 
        fieldNumeroEnd.setText(database.getDatabase_client().get(index+5));
        // BAIRRO
        labelBairro.setBounds(450, 190, 200, 50);
        fieldBairro.setBounds(450, 230, 180, 50);
        fieldBairro.setEditable(false);
        labelBairro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBairro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBairro.setForeground(new Color(212,175,55)); 
        fieldBairro.setText(database.getDatabase_client().get(index+6));
        // CEP
        labelCep.setBounds(380, 270, 250, 50);
        fieldCep.setBounds(380, 310, 250, 50);
        fieldCep.setEditable(false);
        labelCep.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCep.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCep.setForeground(new Color(212,175,55));
        fieldCep.setText(database.getDatabase_client().get(index+3));
        // CIDADE
        labelCidade.setBounds(380, 350, 250, 50);
        fieldCidade.setBounds(380, 390, 250, 50);
        fieldCidade.setEditable(false);
        labelCidade.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCidade.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCidade.setForeground(new Color(212,175,55)); 
        fieldCidade.setText(database.getDatabase_client().get(index+7));
        // ESTADO
        labelEstado.setBounds(380, 430, 250, 50);
        fieldEstado.setBounds(380, 470, 250, 50);
        fieldEstado.setEditable(false);
        labelEstado.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstado.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstado.setForeground(new Color(212,175,55)); 
        fieldEstado.setText(database.getDatabase_client().get(index+8));
        // CARTAO DE CREDITO
        // CODIGO DE SEGURANCA
        labelCodSeg.setBounds(730, 110, 400, 50);//cod seg	
        fieldCodSeg.setBounds(730, 150, 350, 50);
        fieldCodSeg.setEditable(false);
        labelCodSeg.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCodSeg.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCodSeg.setForeground(new Color(212,175,55)); 
        fieldCodSeg.setText(database.getDatabase_client().get(index+9));
        // NUMERO DO CARTAO
        labelNumCart.setBounds(730, 190, 400, 50);//numero cart
        fieldNumCart.setBounds(730, 230, 365, 50);
        fieldNumCart.setEditable(false);
        labelNumCart.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumCart.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumCart.setForeground(new Color(212,175,55)); 
        fieldNumCart.setText(database.getDatabase_client().get(index+11));
        // BANDEIRA
        labelBand.setBounds(730, 270, 350, 50);
        fieldBand.setBounds(730, 310, 350, 50); //bandeira
        fieldBand.setEditable(false);
        labelBand.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBand.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBand.setForeground(new Color(212,175,55)); 
        fieldBand.setText(database.getDatabase_client().get(index+10));
        // DATA DE NASCIMENTO DO CARTAO
        labelDataNasc.setBounds(730, 350, 400, 50);	
        fieldDataNasc.setBounds(730, 390, 370, 50);
        fieldDataNasc.setEditable(false);
        labelDataNasc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDataNasc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDataNasc.setForeground(new Color(212,175,55)); 
        fieldDataNasc.setText(database.getDatabase_client().get(index+12));
        // VENCIMENTO DO CARTAO
        labelDataVenc.setBounds(730, 430, 400, 50);
        labelDataVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        // MES DE VENCIMENTO
        labelMesVenc.setBounds(730, 470, 250, 50);
        labelMesVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldMesVenc.setBounds(780, 470, 100, 50);
        fieldMesVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldMesVenc.setForeground(new Color(212,175,55)); 
        fieldMesVenc.setEditable(false);
        fieldMesVenc.setText(database.getDatabase_client().get(index+13));
        // ANO DE VENCIMENTO
        labelAnoVenc.setBounds(730, 520, 250, 50);
        labelAnoVenc.setFont(new Font("Algerian", Font.BOLD, 20));    
        fieldAnoVenc.setBounds(780, 520, 100, 50);
        fieldAnoVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldAnoVenc.setForeground(new Color(212,175,55)); 
        fieldAnoVenc.setEditable(false);
        fieldAnoVenc.setText(database.getDatabase_client().get(index+14));
        // BUTTONS
        // BOTÃO EDITAR
        editar.setBounds(256, 640, 250, 50);
        editar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        editar.setFont(new Font("Algerian", Font.BOLD, 20));
        editar.setBackground(Color.BLACK);
        editar.setForeground(Color.WHITE);
        // BOTÃO VOLTAR
        voltar.setBounds(512, 640, 250, 50);
        voltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        voltar.setFont(new Font("Algerian", Font.BOLD, 20));
        voltar.setBackground(Color.BLACK);
        voltar.setForeground(Color.WHITE);
        // [ADICIONANDO A JANELA]
        janela.add(titulo);
        janela.add(subtitulo1);
        janela.add(subtitulo2);
        janela.add(subtitulo3);
        janela.add(editar);
        janela.add(voltar);
        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelCPF);
        janela.add(fieldCPF);
        janela.add(labelEmail);
        janela.add(fieldEmail);
        janela.add(labelTele);
        janela.add(fieldTele);
        janela.add(labelSenha);
        janela.add(senha);
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
        janela.setSize(1135, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
	// MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void detalharCliente(int index,Data_control database) {
        DetalheCliente detalharcliente = new DetalheCliente(index, database);
        editar.addActionListener(detalharcliente);
        voltar.addActionListener(detalharcliente);
    } 
	// MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE   
    public static void main(String[] args) {
    	new DetalheCliente(2,database).detalharCliente(2, database);
    }
    // MÉTODO PARA INSTRUIR AS AÇÕES
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == editar) {
            new EditarPerfilCliente(index,database).editarPerfil(index,database);
            janela.dispose();
        }
        if (src == voltar) {
        	new MenuCliente(index,database).menu(index,database);
            janela.dispose();
        }
    }}

