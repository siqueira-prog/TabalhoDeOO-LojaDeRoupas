package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// CRIANDO A CLASSE DE LOG-IN DO ADMINISTRADOR
public class LoginAdmin implements ActionListener{
    // JANELA
    private static JFrame janela = new JFrame("Login Administrador");
    private static JLabel titulo = new JLabel("Login Administrador");
   
    // INFORMAÇÕES PESSOAIS
   
    // Input email
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();
  
    // Input senha
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    private static JPasswordField senha = new JPasswordField();
  
    // Botões
	private static JButton Logar = new JButton("Logar");
	private static JButton Voltar = new JButton("Voltar");
	
	// CONSTRUTOR 
    public LoginAdmin() {

        // JANELA
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        janela.setLayout(null);

        // INFORMAÇÕES PESSOAIS

        // Input email
        labelEmail.setBounds(250, 150, 250, 50);
        fieldEmail.setBounds(250, 190, 250, 50);

        // Iput senha
        labelSenha.setBounds(250, 240, 250, 50);
        senha.setBounds(250, 280, 250, 50);
        
        // BOTÃO LOGAR
        Logar.setBounds(250, 360, 250, 50);
        
        // BOTÃO VOLTAR
        Voltar.setBounds(250, 420, 250, 50);

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
    public void loginAdmin() {
		LoginAdmin loginadmin = new LoginAdmin();
		fieldEmail.addActionListener(loginadmin);
		senha.addActionListener(loginadmin);
		Logar.addActionListener(loginadmin);
		Voltar.addActionListener(loginadmin);
    }
    
    // MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
		LoginAdmin loginadmin = new LoginAdmin();
		fieldEmail.addActionListener(loginadmin);
		senha.addActionListener(loginadmin);
		Logar.addActionListener(loginadmin);
		Voltar.addActionListener(loginadmin);

	}
    
    // ORIENTAÇÃO DAS AÇÕES 
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == Logar) {
			new MenuAdmin().menuAdmin();;
		}
		if (src == Voltar) {
			new Home();
		}

	}

}
