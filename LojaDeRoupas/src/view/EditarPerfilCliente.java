package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.Data_control;
public class EditarPerfilCliente implements ActionListener {
	// DATABASE 
	static Data_control database = new Data_control();
	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index;
    // JANELA
    private static JFrame janela = new JFrame("Cliente");
    private static JLabel titulo = new JLabel("      Editar Perfil ");
    private static JLabel subtitulo1 = new JLabel("Infomações Pessoais");
    private static JLabel subtitulo2 = new JLabel("Infomações de Endereço");
    private static JLabel subtitulo3 = new JLabel("Infomações do Cartão de Crédito");
    // INFORMAÇÕES PESSOAIS
    // NOME
    private static JLabel labelNome = new JLabel("Didigite seu nome:");
    private static JTextField fieldNome = new JTextField();
    // CPF
    private static JLabel labelCPF = new JLabel("Didigite seu CPF:");
    private static JTextField fieldCPF = new JTextField();
    // EMAIL
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
    JPasswordField senha = new JPasswordField();
    // CONFIRMAR SENHA 
    private static JLabel labelConfirmSenha = new JLabel("Repita sua senha:");
    JPasswordField confirmSenha = new JPasswordField();
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
    private static JLabel labelBand = new JLabel("Didigite a bandeira do cartão:");
    private static JTextField fieldBand = new JTextField();
    // NUMERO DO CARTAO
    private static JLabel labelNumCart = new JLabel("Didigite o número do seu cartão:");
    private static JTextField fieldNumCart = new JTextField();
    // CODIGO DE SEGURANCA
    private static JLabel labelCodSeg = new JLabel("Didigite o código de segurança:");
    private static JTextField fieldCodSeg = new JTextField();
    // DATA DE NASCIMENTO DO CARTAO
    private static JLabel labelDataNasc = new JLabel("Digite a sua data de nascimento:");
    private static JTextField fieldDataNasc = new JTextField();
    // DATA DE VENCIMENTO DO CARTAO
    private static JLabel labelDataVenc = new JLabel("Digite a data de vencimento do cartão:");
    private static JLabel labelMesVenc = new JLabel("Mês:");
    private static JLabel labelAnoVenc = new JLabel("Ano:");
    private static JTextField fieldMesVenc = new JTextField();
    private static JTextField fieldAnoVenc = new JTextField();
    // BOTOES
    private static JButton salvar = new JButton("Salvar");
    private static JButton voltar = new JButton("Voltar");
    private static JButton excluir = new JButton("Excluir");
    // CONSTRUTOR
    public EditarPerfilCliente(int index, Data_control database) {
    	// PRINT PARA CONTROLER DE INFORMAÇÃO
    	System.out.println("Valor da posição do email no construtor de EditarPerfilCliente= "+index);
    	// PASSANDO O DATABASE PARA SER USADO NAS PROXIMAS PAGINAS 
    	EditarPerfilCliente.database = database;
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	EditarPerfilCliente.index = index;
        // JANELA
        janela.setLayout(null);
        janela.setLayout(null);
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(220, 20, 600, 50);
        subtitulo1.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo1.setBounds(20, 80, 250, 50);
        subtitulo2.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo2.setBounds(380, 80, 250, 50);
        subtitulo3.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo3.setBounds(730, 80, 250, 50);
        // BOTOES
        // SALVAR
        salvar.setBounds(20, 640, 250, 50);
        salvar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        salvar.setFont(new Font("Algerian", Font.BOLD, 20));
        salvar.setBackground(Color.GREEN);
        salvar.setForeground(Color.BLACK);
        // VOLTAR
        voltar.setBounds(380, 640, 250, 50);
        voltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        voltar.setFont(new Font("Algerian", Font.BOLD, 20));
        voltar.setBackground(Color.BLACK);
        voltar.setForeground(Color.WHITE);
        // EXCLUIR
        excluir.setBounds(730, 640, 250, 50);
        excluir.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        excluir.setFont(new Font("Algerian", Font.BOLD, 20));
        excluir.setBackground(Color.RED);
        excluir.setForeground(Color.BLACK);;
        // INFORMAÇÕES PESSOAIS
        // NOME
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);
        fieldNome.setEditable(true);
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setForeground(new Color(212,175,55));
        // CPF
        labelCPF.setBounds(20, 190, 250, 50);
        fieldCPF.setBounds(20, 230, 250, 50);
        fieldCPF.setEditable(true);
        labelCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setForeground(new Color(212,175,55));
        // EMAIL
        labelEmail.setBounds(20, 270, 250, 50);
        fieldEmail.setBounds(20, 310, 250, 50);
        fieldEmail.setEditable(true);
        labelEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setForeground(new Color(212,175,55));
        // DDD
        labelDDD.setBounds(20, 350, 50, 50);
        fieldDDD.setBounds(20, 390, 50, 50);
        fieldDDD.setEditable(true);
        labelDDD.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDDD.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDDD.setForeground(new Color(212,175,55));
        // NUMERO DO TELEFONE
        labelTele.setBounds(90, 350, 250, 50);
        fieldTele.setBounds(90, 390, 180, 50);
        fieldTele.setEditable(true);
        labelTele.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTele.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTele.setForeground(new Color(212,175,55));
        // SENHA
        labelSenha.setBounds(20, 430, 250, 50);
        senha.setBounds(20, 470, 250, 50);
        senha.setEditable(true);
        labelSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setForeground(new Color(212,175,55));
        // CONFIRMAR SENHA
        labelConfirmSenha.setBounds(20, 510, 250, 50);
        confirmSenha.setBounds(20, 550, 250, 50);
        confirmSenha.setEditable(true);
        labelConfirmSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        confirmSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        confirmSenha.setForeground(new Color(212,175,55)); 
        // ENDEREÇO
        // LOGRADOURO
        labelLogradouro.setBounds(380, 110, 250, 50);
        fieldLogradouro.setBounds(380, 150, 250, 50);
        fieldLogradouro.setEditable(true);
        labelLogradouro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldLogradouro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldLogradouro.setForeground(new Color(212,175,55)); 
        // NUMERO DO ENDERECO
        labelNumeroEnd.setBounds(380, 190, 50, 50);
        fieldNumeroEnd.setBounds(380, 230, 50, 50);
        fieldNumeroEnd.setEditable(true);
        labelNumeroEnd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumeroEnd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumeroEnd.setForeground(new Color(212,175,55)); 
        // BAIRRO
        labelBairro.setBounds(450, 190, 200, 50);
        fieldBairro.setBounds(450, 230, 180, 50);
        fieldBairro.setEditable(true);
        labelBairro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBairro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBairro.setForeground(new Color(212,175,55)); 
        // CEP
        labelCep.setBounds(380, 270, 250, 50);
        fieldCep.setBounds(380, 310, 250, 50);
        fieldCep.setEditable(true);
        labelCep.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCep.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCep.setForeground(new Color(212,175,55)); 
        // CIDADE
        labelCidade.setBounds(380, 350, 250, 50);
        fieldCidade.setBounds(380, 390, 250, 50);
        fieldCidade.setEditable(true);
        labelCidade.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCidade.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCidade.setForeground(new Color(212,175,55)); 
        // ESTADO
        labelEstado.setBounds(380, 430, 250, 50);
        fieldEstado.setBounds(380, 470, 250, 50);
        fieldEstado.setEditable(true);
        labelEstado.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstado.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstado.setForeground(new Color(212,175,55)); 
        // CARTÃO DE CRÉDITO
        // BANDEIRA
        labelCodSeg.setBounds(730, 110, 400, 50);
        fieldCodSeg.setBounds(730, 150, 350, 50);
        fieldCodSeg.setEditable(true);
        labelCodSeg.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCodSeg.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCodSeg.setForeground(new Color(212,175,55)); 
        // NUMERO DO CARTAO
        labelNumCart.setBounds(730, 190, 400, 50);
        fieldNumCart.setBounds(730, 230, 365, 50);
        fieldNumCart.setEditable(true);
        labelNumCart.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumCart.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumCart.setForeground(new Color(212,175,55)); 
        // CODIGO DE SEGURANCA
        labelBand.setBounds(730, 270, 350, 50);
        fieldBand.setBounds(730, 310, 350, 50);
        fieldBand.setEditable(true);
        labelBand.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBand.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBand.setForeground(new Color(212,175,55)); 
        // DATA DE NASCIMENTO DO CARTAO
        labelDataNasc.setBounds(730, 350, 400, 50);	
        fieldDataNasc.setBounds(730, 390, 370, 50);
        fieldDataNasc.setEditable(true);
        labelDataNasc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDataNasc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDataNasc.setForeground(new Color(212,175,55)); 
        // DATA DE VENCIMENTO DO CARTAO
        labelDataVenc.setBounds(730, 430, 400, 50);
        labelDataVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        // MES DE VENCIMENTO DO CARTAO
        labelMesVenc.setBounds(730, 470, 250, 50);
        labelMesVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldMesVenc.setBounds(780, 470, 100, 50);
        fieldMesVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldMesVenc.setForeground(new Color(212,175,55)); 
        fieldMesVenc.setEditable(true);
        // ANO DE VENCIMENTO DO CARTAO
        labelAnoVenc.setBounds(730, 520, 250, 50);
        labelAnoVenc.setFont(new Font("Algerian", Font.BOLD, 20));        
        fieldAnoVenc.setBounds(780, 520, 100, 50);
        fieldAnoVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldAnoVenc.setForeground(new Color(212,175,55)); 
        fieldAnoVenc.setEditable(true);
        // [ADICIONANDO A JANELA]
        janela.add(titulo);
        janela.add(subtitulo1);
        janela.add(subtitulo2);
        janela.add(subtitulo3);
        janela.add(salvar);
        janela.add(voltar);
        janela.add(excluir);
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
        janela.setSize(1135, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
	// MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void editarPerfil(int index, Data_control database) {
        EditarPerfilCliente editarperfilcliente = new EditarPerfilCliente(index,database);
        salvar.addActionListener(editarperfilcliente);
        voltar.addActionListener(editarperfilcliente);
        excluir.addActionListener(editarperfilcliente);
    }
	// MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE   
    public static void main(String[] args) {
    	int index = 2;
        EditarPerfilCliente editarperfilcliente = new EditarPerfilCliente(index,database);
        salvar.addActionListener(editarperfilcliente);
        voltar.addActionListener(editarperfilcliente);
        excluir.addActionListener(editarperfilcliente);
    }
    // MÉTODO PARA INSTRUIR AS AÇÕES
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        char[] senhaChar  = senha.getPassword();
        String senhaString = String.valueOf(senhaChar);
        if (src == salvar) {
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
        	database.getDatabase_client().remove(index-2);
          	database.getDatabase_client().add(fieldCPF.getText());
        	database.getDatabase_client().add(fieldNome.getText());
        	database.getDatabase_client().add(fieldEmail.getText());
        	database.getDatabase_client().add(senhaString);
        	database.getDatabase_client().add(fieldDDD.getText()+fieldTele.getText());
        	database.getDatabase_client().add(fieldCep.getText());
        	database.getDatabase_client().add(fieldLogradouro.getText());
        	database.getDatabase_client().add(fieldNumeroEnd.getText());
        	database.getDatabase_client().add(fieldBairro.getText());
        	database.getDatabase_client().add(fieldCidade.getText());
        	database.getDatabase_client().add(fieldEstado.getText());
        	database.getDatabase_client().add(fieldCodSeg.getText());
        	database.getDatabase_client().add(fieldBand.getText());
        	database.getDatabase_client().add(fieldNumCart.getText());
        	database.getDatabase_client().add(fieldDataNasc.getText());
        	database.getDatabase_client().add(fieldMesVenc.getText());
        	database.getDatabase_client().add(fieldAnoVenc.getText());
        	database.getDatabase_client().add("1");
        	int index = database.getDatabase_client().indexOf(fieldEmail.getText());
            new MenuCliente(index,database).menu(index,database);
            janela.dispose();
        }
        if (src == voltar) {
        	new MenuCliente(index,database).menu(index,database);
            janela.dispose();
        }
        if (src == excluir) {
            new Home().home();
            janela.dispose();
        }
    }}