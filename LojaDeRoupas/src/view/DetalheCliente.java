package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DetalheCliente implements ActionListener {
    // [DEFININDO VARIÁVEIS]

    // JANELA
    private static JFrame janela = new JFrame("Detalhes do Cliente");
    private static JLabel titulo = new JLabel("Detalhes do Cliente");
    private static JLabel subtitulo1 = new JLabel("Infomações Pessoais");
    private static JLabel subtitulo2 = new JLabel("Infomações de Endereço");
    private static JLabel subtitulo3 = new JLabel("Infomações do Cartão de Crédito");

    // INFORMAÇÕES PESSOAIS

    // Input nome
    private static JLabel labelNome = new JLabel("Didigite seu nome:");
    private static JTextField fieldNome = new JTextField("Ronaldo Fenômeno");

    // Input CPF
    private static JLabel labelCPF = new JLabel("Didigite seu CPF:");
    private static JTextField fieldCPF = new JTextField("777.777.777-77");

    // Input email
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();

    // Input DDD
    private static JLabel labelDDD = new JLabel("DDD:");
    private static JTextField fieldDDD = new JTextField();

    // Input telefone
    private static JLabel labelTele = new JLabel("Telefone:");
    private static JTextField fieldTele = new JTextField();

    // Input senha
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    JPasswordField senha = new JPasswordField();

    // Input confirmar senha
    private static JLabel labelConfirmSenha = new JLabel("Repita sua senha:");
    JPasswordField confirmSenha = new JPasswordField();

    // ENDEREÇO

    // Logradouro
    private static JLabel labelLogradouro = new JLabel("Logradouro:");
    private static JTextField fieldLogradouro = new JTextField();

    // Numero do Endereço
    private static JLabel labelNumeroEnd = new JLabel("Nº:");
    private static JTextField fieldNumeroEnd = new JTextField();

    // Bairro
    private static JLabel labelBairro = new JLabel("Bairro:");
    private static JTextField fieldBairro = new JTextField();

    // CEP
    private static JLabel labelCep = new JLabel("CEP:");
    private static JTextField fieldCep = new JTextField();

    // Cidade
    private static JLabel labelCidade = new JLabel("Cidade");
    private static JTextField fieldCidade = new JTextField();

    // Estado
    private static JLabel labelEstado = new JLabel("Estado");
    private static JTextField fieldEstado = new JTextField();

    // CARTÃO DE CRÉDITO

    // Bandeira
    private static JLabel labelBand = new JLabel("Didigite a bandeira do cartão:");
    private static JTextField fieldBand = new JTextField();

    // Número do Cartão
    private static JLabel labelNumCart = new JLabel("Didigite o número do seu cartão:");
    private static JTextField fieldNumCart = new JTextField();

    // Código de Segurança
    private static JLabel labelCodSeg = new JLabel("Didigite o código de segurança:");
    private static JTextField fieldCodSeg = new JTextField();

    // Input data de nascimento
    private static JLabel labelDataNasc = new JLabel("Digite a sua data de nascimento:");
    private static JTextField fieldDataNasc = new JTextField();

    // Input data de vencimento do cartão
    private static JLabel labelDataVenc = new JLabel("Digite a data de vencimento:");
    private static JLabel labelMesVenc = new JLabel("Mês:");
    private static JLabel labelAnoVenc = new JLabel("Ano:");

    private static JTextField fieldMesVenc = new JTextField();
    private static JTextField fieldAnoVenc = new JTextField();

    // Botao
    private static JButton editar = new JButton("Editar");
    private static JButton cancelar = new JButton("Cancelar");

    public DetalheCliente() {

        // JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(220, 20, 600, 50);
        
        subtitulo1.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo1.setBounds(20, 80, 250, 50);
        subtitulo2.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo2.setBounds(380, 80, 250, 50);
        subtitulo3.setFont(new Font("Algerian", Font.BOLD, 14));
        subtitulo3.setBounds(730, 80, 250, 50);
        
        // INFORMAÇÕES PESSOAIS

        // Input nome
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);
        fieldNome.setEditable(false);
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setForeground(new Color(212,175,55));
        // Input CPF
        labelCPF.setBounds(20, 190, 250, 50);
        fieldCPF.setBounds(20, 230, 250, 50);
        fieldCPF.setEditable(false);
        labelCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setForeground(new Color(212,175,55));
        // Input email
        labelEmail.setBounds(20, 270, 250, 50);
        fieldEmail.setBounds(20, 310, 250, 50);
        fieldEmail.setEditable(false);
        labelEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setForeground(new Color(212,175,55));
        // Input DDD
        labelDDD.setBounds(20, 350, 50, 50);
        fieldDDD.setBounds(20, 390, 50, 50);
        fieldDDD.setEditable(false);
        labelDDD.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDDD.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDDD.setForeground(new Color(212,175,55));
        // Input telefone
        labelTele.setBounds(90, 350, 250, 50);
        fieldTele.setBounds(90, 390, 180, 50);
        fieldTele.setEditable(false);
        labelTele.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTele.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTele.setForeground(new Color(212,175,55));
        // Iput senha
        labelSenha.setBounds(20, 430, 250, 50);
        senha.setBounds(20, 470, 250, 50);
        senha.setEditable(false);
        labelSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setForeground(new Color(212,175,55));
        // Input confirmar senha
        labelConfirmSenha.setBounds(20, 510, 250, 50);
        confirmSenha.setBounds(20, 550, 250, 50);
        confirmSenha.setEditable(false);
        labelConfirmSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        confirmSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        confirmSenha.setForeground(new Color(212,175,55)); 
        // ENDEREÇO

        // Input logradouro
        labelLogradouro.setBounds(380, 110, 250, 50);
        fieldLogradouro.setBounds(380, 150, 250, 50);
        fieldLogradouro.setEditable(false);
        labelLogradouro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldLogradouro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldLogradouro.setForeground(new Color(212,175,55)); 
        // Input Numero Endereço
        labelNumeroEnd.setBounds(380, 190, 50, 50);
        fieldNumeroEnd.setBounds(380, 230, 50, 50);
        fieldNumeroEnd.setEditable(false);
        labelNumeroEnd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumeroEnd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumeroEnd.setForeground(new Color(212,175,55)); 
        // Input bairro
        labelBairro.setBounds(450, 190, 200, 50);
        fieldBairro.setBounds(450, 230, 180, 50);
        fieldBairro.setEditable(false);
        labelBairro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBairro.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBairro.setForeground(new Color(212,175,55)); 
        // Iput cep
        labelCep.setBounds(380, 270, 250, 50);
        fieldCep.setBounds(380, 310, 250, 50);
        fieldCep.setEditable(false);
        labelCep.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCep.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCep.setForeground(new Color(212,175,55)); 
        // Input cidade
        labelCidade.setBounds(380, 350, 250, 50);
        fieldCidade.setBounds(380, 390, 250, 50);
        fieldCidade.setEditable(false);
        labelCidade.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCidade.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCidade.setForeground(new Color(212,175,55)); 
        // Input estado
        labelEstado.setBounds(380, 430, 250, 50);
        fieldEstado.setBounds(380, 470, 250, 50);
        fieldEstado.setEditable(false);
        labelEstado.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstado.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstado.setForeground(new Color(212,175,55)); 
        // CARTÃO DE CRÉDITO

        // Input bandeira
        labelCodSeg.setBounds(730, 110, 400, 50);//cod seg	
        fieldCodSeg.setBounds(730, 150, 350, 50);
        fieldCodSeg.setEditable(false);
        labelCodSeg.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCodSeg.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCodSeg.setForeground(new Color(212,175,55)); 
        // Input numero do cartão
        labelNumCart.setBounds(730, 190, 400, 50);//numero cart
        fieldNumCart.setBounds(730, 230, 365, 50);
        fieldNumCart.setEditable(false);
        labelNumCart.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumCart.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNumCart.setForeground(new Color(212,175,55)); 
        // Input código de segurança
        labelBand.setBounds(730, 270, 350, 50);
        fieldBand.setBounds(730, 310, 350, 50); //bandeira
        fieldBand.setEditable(false);
        labelBand.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBand.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldBand.setForeground(new Color(212,175,55)); 
        // Iput data de nascimento
        labelDataNasc.setBounds(730, 350, 400, 50);	
        fieldDataNasc.setBounds(730, 390, 370, 50);
        fieldDataNasc.setEditable(false);
        labelDataNasc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDataNasc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDataNasc.setForeground(new Color(212,175,55)); 
        // Input data de vencimento do cartão

        labelDataVenc.setBounds(730, 430, 400, 50);
        labelDataVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        
        labelMesVenc.setBounds(730, 470, 250, 50);
        labelMesVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        
        labelAnoVenc.setBounds(730, 520, 250, 50);
        labelAnoVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        
        fieldMesVenc.setBounds(780, 470, 100, 50);
        fieldMesVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldMesVenc.setForeground(new Color(212,175,55)); 
        fieldMesVenc.setEditable(false);
        
        fieldAnoVenc.setBounds(780, 520, 100, 50);
        fieldAnoVenc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldAnoVenc.setForeground(new Color(212,175,55)); 
        fieldAnoVenc.setEditable(false);
        
        // BUTTONS
        editar.setBounds(256, 640, 250, 50);
        editar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        editar.setFont(new Font("Algerian", Font.BOLD, 20));
        editar.setBackground(Color.BLACK);
        editar.setForeground(Color.WHITE);
        
        cancelar.setBounds(512, 640, 250, 50);
        cancelar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        cancelar.setFont(new Font("Algerian", Font.BOLD, 20));
        cancelar.setBackground(Color.BLACK);
        cancelar.setForeground(Color.WHITE);
        
        // [ADICIONANDO A JANELA]

        janela.add(titulo);
        janela.add(subtitulo1);
        janela.add(subtitulo2);
        janela.add(subtitulo3);

        janela.add(editar);
        janela.add(cancelar);

        // Informações pessoais

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

        // Endereço

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

        // Cartão de Crédito

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
    

    public void detalharCliente() {
        DetalheCliente detalharcliente = new DetalheCliente();
        editar.addActionListener(detalharcliente);
        cancelar.addActionListener(detalharcliente);

    }

    
    public static void main(String[] args) {
    	DetalheCliente detalharcliente = new DetalheCliente();
        editar.addActionListener(detalharcliente);
        cancelar.addActionListener(detalharcliente);
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        if (src == editar) {
            new EditarPerfilCliente().editarPerfil();
        }
        if (src == cancelar) {
            janela.dispose();
        }
    }
}
