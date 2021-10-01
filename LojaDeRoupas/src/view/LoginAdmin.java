package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginAdmin {
    // JANELA
    private static JFrame janela = new JFrame("Login Cliente");
    private static JLabel titulo = new JLabel("Login Cliente");

    // INFORMAÇÕES PESSOAIS

    // Input email
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();

    // Input senha
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    JPasswordField senha = new JPasswordField();

    public void loginAdmin() {

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

        // [ADICIONANDO A JANELA]

        janela.add(titulo);

        // Informações Pessoais
        janela.add(labelEmail);
        janela.add(fieldEmail);
        janela.add(labelSenha);
        janela.add(senha);

        janela.setSize(750, 550);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
}
