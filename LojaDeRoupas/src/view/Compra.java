package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import controller.ControleCamiseta;
import controller.ControleCompra;

public class Compra implements ActionListener {

    private ArrayList<String> nomeCamisetas_arraylist = ControleCamiseta.nomeCamisetas();
    private String[] lista = nomeCamisetas_arraylist.toArray(new String [nomeCamisetas_arraylist.size()]); 

    JList listprodutos = new JList<String>(lista);

    // JANELA
    private static JFrame janela = new JFrame("Compra");
    private static JLabel titulo = new JLabel("Compra");
    // Lista de Produtos

    // Botao
    private static JButton detalhesDoProduto = new JButton("Detalhes do Produto");

    public Compra() {
        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        // listaDeProdutos.setBounds(250, 150, 250, 50);
        listprodutos.setBounds(380, 200, 250, 300);
        detalhesDoProduto.setBounds(380, 640, 250, 50);

        janela.add(listprodutos);
        janela.add(detalhesDoProduto);

        janela.add(titulo);
        janela.setSize(1024, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);

    }

    public void comprarProduto() {
        Compra compraproduto = new Compra();
        detalhesDoProduto.addActionListener(compraproduto);
    }

    public static void main(String[] args) {
        Compra compraproduto = new Compra();
        detalhesDoProduto.addActionListener(compraproduto);
    }

    public void actionPerformed(ActionEvent e) {
    	Object src = e.getSource();

        if (src == detalhesDoProduto) {
        	int index = listprodutos.getSelectedIndex();
        	String camiseta_escolhida_string = lista[index];
        	System.out.print(camiseta_escolhida_string);
        	janela.dispose();
            new DetalhesProduto(index).detalharProduto(index);
        }
    }
}
