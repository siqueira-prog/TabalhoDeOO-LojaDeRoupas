	package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import model.Dados;

public class MenuCliente implements ActionListener {
	// NAME POSITION 
    static int position;
    
    // JANELA
    private static JFrame janela = new JFrame("Menu Cliente");
    private static JLabel titulo = new JLabel("Menu Cliente");

    // LABELS
    private static JLabel client_name = new JLabel(
    		"Bem vindo(a) "+
    		Dados.databaseprecadastrado().getData_cliente().get(position+1) +"!"
    		);
    
    // BUTTONS
    private static JButton botaoComprar = new JButton("Comprar");
    private static JButton botaoEditPerfil = new JButton("Editar Perfil");
    private static JButton botaoVisualizarPerfil = new JButton("Visualizar Perfil");

    public MenuCliente(int index) {
        // JANELA
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(190, 20, 600, 50);
        janela.setLayout(null);

        // LABEL COM NOME DO CLIENTE
        client_name.setBounds(230, 120, 400, 50);
        client_name.setFont(new Font("Algerian", Font.BOLD, 20));
        
        // BOTÕES
        botaoComprar.setBounds(230, 200, 250, 50);
        botaoComprar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoComprar.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoComprar.setBackground(Color.BLACK);
        botaoComprar.setForeground(Color.WHITE);
        
        botaoEditPerfil.setBounds(230, 300, 250, 50);
        botaoEditPerfil.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoEditPerfil.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoEditPerfil.setBackground(Color.BLACK);
        botaoEditPerfil.setForeground(Color.WHITE);
        
        botaoVisualizarPerfil.setBounds(230, 400, 250, 50);
        botaoVisualizarPerfil.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoVisualizarPerfil.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoVisualizarPerfil.setBackground(Color.BLACK);
        botaoVisualizarPerfil.setForeground(Color.WHITE);
        
        // [ADICIONANDO A JANELA]
        
        janela.add(botaoVisualizarPerfil);
        janela.add(titulo);
        janela.add(botaoComprar);
        janela.add(botaoEditPerfil);
        janela.add(client_name);
        janela.setSize(750, 550);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public void menu(int index) {
        MenuCliente menucliente = new MenuCliente(index);
        botaoComprar.addActionListener(menucliente);
        botaoEditPerfil.addActionListener(menucliente);
    }

    public static void main(String[] args) {

    	MenuCliente menucliente = new MenuCliente(0);
        botaoComprar.addActionListener(menucliente);
        botaoEditPerfil.addActionListener(menucliente);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoComprar) {
            new Compra().comprarProduto();;
        }
        if (src == botaoEditPerfil) {
            new DetalheCliente().detalharCliente();
           
        }

    }
}
