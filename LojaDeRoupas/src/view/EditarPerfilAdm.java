package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EditarPerfilAdm implements ActionListener {
    // [DEFININDO VARIÁVEIS]

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
    public EditarPerfilAdm() {
        // JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);

        // INFORMAÇÕES PESSOAIS

        // INPUT CPF
        labelCPF.setBounds(50, 150, 250, 50);
        fieldCPF.setBounds(50, 190, 250, 50);

        // INPUT NOME
        labelNome.setBounds(50, 240, 250, 50);
        fieldNome.setBounds(50, 280, 250, 50);
        
        // INPUT EMAIL
        labelEmail.setBounds(50, 330, 250, 50);
        fieldEmail.setBounds(50, 370, 250, 50);

        // INPUT SENHA
        labelSenha.setBounds(50, 420, 250, 50);
        senha.setBounds(50, 460, 250, 50);

        // INPUT CONFIRMAR SENHA
        labelConfirmSenha.setBounds(50, 510, 250, 50);
        confirmaSenha.setBounds(50, 550, 250, 50);

        // BOTÕES
        editar.setBounds(50, 640, 250, 50);
        voltar.setBounds(350, 640, 250, 50);
        
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
    public void editarPerfilAdm() {
    	EditarPerfilAdm editarperfiladm = new EditarPerfilAdm();
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
    	EditarPerfilAdm editarperfiladm = new EditarPerfilAdm();
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
           JOptionPane.showMessageDialog(
        		   null,
        		   "Informações atualizadas com sucesso!",
        		   null,
        		   JOptionPane.INFORMATION_MESSAGE
        		   );
        }
        if (src == voltar) {
            new MenuAdmin().menuAdmin();
        }

    }
}
