package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import model.Dados;

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
		titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(85, 20, 600, 50);
        janela.setLayout(null);
        
        // INFORMAÇÕES PESSOAIS

        // Input email
        labelEmail.setBounds(250, 150, 250, 50);
        labelEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setBounds(250, 190, 250, 50);
        fieldEmail.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldEmail.setForeground(new Color(212,175,55));
        
        // Iput senha
        labelSenha.setBounds(250, 240, 250, 50);
        labelSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setBounds(250, 280, 250, 50);
        senha.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        senha.setForeground(new Color(212,175,55));

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
		
        String textolido_email  = LoginAdmin.fieldEmail.getText();
        
        char[] textolido_senha  = LoginAdmin.senha.getPassword();
        
        System.out.println(textolido_email);
        System.out.println(textolido_senha);
        
		 if (src == Logar) {
			 
	        	if (Dados.databaseprecadastrado().getData_adm().contains(textolido_email) 
	        		& Dados.databaseprecadastrado().getData_adm().contains(String.valueOf(textolido_senha))) {
	        		
	                JOptionPane.showMessageDialog(
	               		   null,
	               		   "Login efetivado com sucesso!",
	               		   null,
	               		   JOptionPane.INFORMATION_MESSAGE);
	                
	                int index = Dados.databaseprecadastrado().getData_adm().indexOf(textolido_email);
	                
	                new MenuAdmin(index).menuAdmin(index);
	                
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
	                
	                new LoginAdmin().loginAdmin();
	                
	        	}	
	        }
	        
		 
		if (src == Voltar) {
			
			new Home();
			
			janela.dispose();
			
		}
	}
}
