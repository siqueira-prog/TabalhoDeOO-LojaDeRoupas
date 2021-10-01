package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DetalheAdmin {
    // [DEFININDO VARIÁVEIS]

    // JANELA
    private static JFrame janela = new JFrame("Editar Perfil");
    private static JLabel titulo = new JLabel("Editar Perfil");

    // INFORMAÇÕES PESSOAIS

    // Input nome
    private static JLabel labelNome = new JLabel("Didigite seu nome:");
    private static JTextField fieldNome = new JTextField();

    // Input CPF
    private static JLabel labelCPF = new JLabel("Didigite seu CPF:");
    private static JTextField fieldCPF = new JTextField();

    // Input email
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();

    // Input senha
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    JPasswordField senha = new JPasswordField();

    // Input confirmar senha
    private static JLabel labelConfirmSenha = new JLabel("Repita sua senha:");
    JPasswordField confirmSenha = new JPasswordField();

    // Input matricula
    private static JLabel labelMatricula = new JLabel("Matricula");
    private static JTextField fieldMatricula = new JTextField();

    private static JButton cadastrar = new JButton("Editar");

    public void editarPerfil() {

        // JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        cadastrar.setBounds(50, 640, 250, 50);

        // INFORMAÇÕES PESSOAIS

        // Input nome
        labelNome.setBounds(50, 150, 250, 50);
        fieldNome.setBounds(50, 190, 250, 50);

        // Input CPF
        labelCPF.setBounds(50, 240, 250, 50);
        fieldCPF.setBounds(50, 280, 250, 50);

        // Input email
        labelEmail.setBounds(50, 330, 250, 50);
        fieldEmail.setBounds(50, 370, 250, 50);

        // Iput senha
        labelSenha.setBounds(50, 420, 250, 50);
        senha.setBounds(50, 460, 250, 50);

        // Input confirmar senha
        labelConfirmSenha.setBounds(50, 510, 250, 50);
        confirmSenha.setBounds(50, 550, 250, 50);

        // Input logradouro
        labelMatricula.setBounds(350, 150, 250, 50);
        fieldMatricula.setBounds(350, 190, 250, 50);

        // [ADICIONANDO A JANELA]

        janela.add(titulo);
        janela.add(cadastrar);

        // Informações pessoais

        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelCPF);
        janela.add(fieldCPF);
        janela.add(labelEmail);
        janela.add(fieldEmail);
        janela.add(labelSenha);
        janela.add(senha);
        janela.add(labelConfirmSenha);
        janela.add(confirmSenha);

        janela.add(labelMatricula);
        janela.add(fieldMatricula);

        janela.setSize(750, 750);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
}
