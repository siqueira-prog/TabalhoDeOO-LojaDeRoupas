package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Compra implements ActionListener {
    // listaDeProdutos = new JList<String>(listaNomes);

    // JANELA
    private static JFrame janela = new JFrame("Compra");
    private static JLabel titulo = new JLabel("Compra");
    // Lista de Produtos
    // JList listaDeProdutos = new JList<string>();

    // Botao
    private static JButton comprar = new JButton("Comprar");

    public Compra() {
        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        // listaDeProdutos.setBounds(250, 150, 250, 50);

        comprar.setBounds(380, 640, 250, 50);

        janela.add(comprar);

        janela.add(titulo);
        janela.setSize(1024, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);

    }

    public void comprarProduto() {
        Compra compraproduto = new Compra();
        // comprar.addActionListener(compraproduto);
    }

    public static void main(String[] args) {
        Compra compraproduto = new Compra();
        // comprar.addActionListener(compraproduto);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        // if (src == cadastrar) {
        // JOptionPane.showMessageDialog(null, "Cadastro efetivado com sucesso!", null,
        // JOptionPane.INFORMATION_MESSAGE);
        // }
    }
}
