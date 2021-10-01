package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuCliente implements ActionListener {

    // JANELA
    private static JFrame janela = new JFrame("Menu Cliente");
    private static JLabel titulo = new JLabel("Menu Cliente");

    private static JButton botaoComprar = new JButton("Comprar");
    private static JButton botaoEditPerfil = new JButton("Editar Perfil");

    public MenuCliente() {

        // JANELA
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        janela.setLayout(null);

        // INFORMAÇÕES PESSOAIS

        // Input email
        botaoComprar.setBounds(250, 150, 250, 50);

        botaoEditPerfil.setBounds(250, 240, 250, 50);

        // [ADICIONANDO A JANELA]

        janela.add(titulo);

        // Informações Pessoais
        janela.add(botaoComprar);
        janela.add(botaoEditPerfil);

        janela.setSize(750, 550);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        MenuCliente menuCliente = new MenuCliente();
        botaoComprar.addActionListener(menuCliente);
        botaoEditPerfil.addActionListener(menuCliente);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        if (src == botaoComprar) {
            new Compra();
        }
        if (src == botaoEditPerfil) {
            new DetalheCliente().editarPerfil();
            ;
        }

    }
}
