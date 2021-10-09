package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import model.Dados;

public class LoginCliente implements ActionListener {
    // JANELA
    private static JFrame janela = new JFrame("Login Cliente");
    private static JLabel titulo = new JLabel("Login Cliente");

    // INFORMAÇÕES PESSOAIS

    // INPUT EMAIL
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();

    // INPUT SENHA
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    private static JPasswordField senha = new JPasswordField();

    // BOTÕES
    private static JButton Logar = new JButton("Logar");
    private static JButton Voltar = new JButton("Voltar");

    // COSTRUTOR
    public LoginCliente() {

        // JANELA
        titulo.setBounds(190, 20, 600, 50);
        janela.setLayout(null);
		titulo.setFont(new Font("Algerian", Font.BOLD, 50));

        // INFORMAÇÕES PESSOAIS

        // Input email
        labelEmail.setBounds(250, 150, 250, 50);
        labelEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setBounds(250, 190, 250, 50);
        fieldEmail.setFont(new Font("Kristen ITC", Font.BOLD, 20));

        // Iput senha
        labelSenha.setBounds(250, 240, 250, 50);
        labelSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setBounds(250, 280, 250, 50);
        senha.setFont(new Font("Kristen ITC", Font.BOLD, 20));

        // BOTÃO LOGAR
        Logar.setBounds(250, 360, 250, 50);
        Logar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        Logar.setFont(new Font("Algerian", Font.BOLD, 20));
        Logar.setBackground(Color.BLACK);
        Logar.setForeground(Color.WHITE);
        
        // BOTÃO VOLTAR
        Voltar.setBounds(250, 420, 250, 50);
        Voltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        Voltar.setFont(new Font("Algerian", Font.BOLD, 20));
        Voltar.setBackground(Color.BLACK);
        Voltar.setForeground(Color.WHITE);
        // [ADICIONANDO A JANELA]

        janela.add(titulo);

        // Informações Pessoais
        janela.add(labelEmail);
        janela.add(fieldEmail);
        janela.add(labelSenha);
        janela.add(senha);
        janela.add(Logar);
        janela.add(Voltar);

        janela.setSize(750, 550);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }

    // MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void loginCliente() {
        LoginCliente logincliente = new LoginCliente();
        fieldEmail.addActionListener(logincliente);
        senha.addActionListener(logincliente);
        Logar.addActionListener(logincliente);
        Voltar.addActionListener(logincliente);
    }

    // MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
        LoginCliente logincliente = new LoginCliente();
        fieldEmail.addActionListener(logincliente);
        senha.addActionListener(logincliente);
        Logar.addActionListener(logincliente);
        Voltar.addActionListener(logincliente);
        
    }

    // ORIENTAÇÃO DAS AÇÕES
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        String textolido_email  = LoginCliente.fieldEmail.getText();
        char[] textolido_senha  = LoginCliente.senha.getPassword();
        System.out.println(textolido_email);
        System.out.println(textolido_senha);
        if (src == Logar) {
        	if (Dados.databaseprecadastrado().getData_cliente().contains(textolido_email) 
        		& Dados.databaseprecadastrado().getData_cliente().contains(String.valueOf(textolido_senha))) {
        		System.exit(0);
                JOptionPane.showMessageDialog(
               		   null,
               		   "Login efetivado com sucesso!",
               		   null,
               		   JOptionPane.INFORMATION_MESSAGE);
                int index = Dados.databaseprecadastrado().getData_cliente().indexOf(textolido_email); 
                new MenuCliente(index).menu(index);
                janela.dispose();
        	}
        	else {
                JOptionPane.showMessageDialog(
             		   null,
             		   "Cadastro não encontrado! Digite novamente.",
             		   null,
             		   JOptionPane.INFORMATION_MESSAGE
             		   );
                janela.dispose();
            	new LoginCliente().loginCliente();
                
                
        	}
        }
        if (src == Voltar) {
            janela.dispose();
            new Home().home();
        }

    }

}
