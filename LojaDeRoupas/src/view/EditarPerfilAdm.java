package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EditarPerfilAdm implements ActionListener {
    // [DEFININDO VARIÁVEIS]

	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index;
    
    // JANELA
    private static JFrame janela = new JFrame("Editar Perfil");
    private static JLabel titulo = new JLabel("Editar Perfil");

    // INFORMAÇÕES PESSOAIS

    // INPUT NOME
    private static JLabel labelNome = new JLabel("Didigite seu nome:");
    private static JTextField fieldNome = new JTextField();

    // INPUT CPF
    private static JLabel labelCPF = new JLabel("Didigite seu CPF:");
    private static JTextField fieldCPF = new JTextField();

    // INPUT EMAIL
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();

    // INPUT SENHA 
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    private static JPasswordField senha = new JPasswordField();

    // INPUT CONFIRMAR SENHA
    private static JLabel labelConfirmSenha = new JLabel("Repita sua senha:");
    private static JPasswordField confirmaSenha = new JPasswordField();

    // BOTÕES
    private static JButton editar = new JButton("Editar");
    private static JButton voltar = new JButton("Voltar");

    // CONSTRUTOR
    public EditarPerfilAdm(int index) {

    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	EditarPerfilAdm.index = index;
    	
    	// JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(185, 20, 600, 50);
		
     
        // INFORMAÇÕES PESSOAIS

        // INPUT CPF
        labelCPF.setBounds(255, 150, 250, 50);
        fieldCPF.setBounds(235, 190, 250, 50);
        labelCPF.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCPF.setFont(new Font("Kristen ITC", Font.BOLD, 20));

        

        // INPUT NOME
        labelNome.setBounds(255, 240, 250, 50);
        fieldNome.setBounds(235, 280, 250, 50);
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        
        // INPUT EMAIL
        labelEmail.setBounds(255, 330, 250, 50);
        fieldEmail.setBounds(235, 370, 250, 50);
        labelEmail.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEmail.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        
        // INPUT SENHA
        labelSenha.setBounds(255, 420, 250, 50);
        senha.setBounds(235, 460, 250, 50);
        labelSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        senha.setFont(new Font("Kristen ITC", Font.BOLD, 20));

        // INPUT CONFIRMAR SENHA
        labelConfirmSenha.setBounds(255, 510, 250, 50);
        confirmaSenha.setBounds(235, 550, 250, 50);
        labelConfirmSenha.setFont(new Font("Algerian", Font.BOLD, 20));
        confirmaSenha.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        
        // BOTÕES
        editar.setBounds(50, 640, 250, 50);
        editar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        editar.setFont(new Font("Algerian", Font.BOLD, 20));
        editar.setBackground(Color.BLACK);
        editar.setForeground(Color.WHITE);
        
        voltar.setBounds(420, 640, 250, 50);
        voltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        voltar.setFont(new Font("Algerian", Font.BOLD, 20));
        voltar.setBackground(Color.BLACK);
        voltar.setForeground(Color.WHITE);
        
        // [ADICIONANDO A JANELA]

        janela.add(titulo);
        janela.add(editar);

        // Informações pessoais
        
        janela.add(labelCPF);
        janela.add(fieldCPF);
        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelEmail);
        janela.add(fieldEmail);
        janela.add(labelSenha);
        janela.add(senha);
        janela.add(labelConfirmSenha);
        janela.add(confirmaSenha);
        
        janela.add(voltar);
        janela.setSize(750, 750);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    // MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void editarPerfilAdm(int index) {
    	EditarPerfilAdm editarperfiladm = new EditarPerfilAdm(index);
        fieldCPF.addActionListener(editarperfiladm);
        fieldNome.addActionListener(editarperfiladm);
        fieldEmail.addActionListener(editarperfiladm);
        senha.addActionListener(editarperfiladm);
        confirmaSenha.addActionListener(editarperfiladm);
        editar.addActionListener(editarperfiladm);
        voltar.addActionListener(editarperfiladm);					
    }
    
    // MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
    	EditarPerfilAdm editarperfiladm = new EditarPerfilAdm(index);
        fieldCPF.addActionListener(editarperfiladm);
        fieldNome.addActionListener(editarperfiladm);
        fieldEmail.addActionListener(editarperfiladm);
        senha.addActionListener(editarperfiladm);
        confirmaSenha.addActionListener(editarperfiladm);
        editar.addActionListener(editarperfiladm);
        voltar.addActionListener(editarperfiladm);
    }

    // ORIENTAÇÃO DAS AÇÕES 
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == editar) {
        	new MenuAdmin(index).menuAdmin(index);
        }
        if (src == voltar) {
            new MenuAdmin(index).menuAdmin(index);
        }

    }
}
