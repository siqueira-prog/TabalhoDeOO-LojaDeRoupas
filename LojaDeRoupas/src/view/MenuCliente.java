	package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.Client_control;

public class MenuCliente implements ActionListener {
	
	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index;

    // JANELA
    private static JFrame janela = new JFrame("Menu Cliente");
    private static JLabel titulo = new JLabel("Menu Cliente");

    // LABELS
    private static JLabel client_name = new JLabel();
    
    // BUTTONS
    private static JButton botaoComprar = new JButton("Comprar");
    private static JButton botaoEditPerfil = new JButton("Editar Perfil");
    private static JButton botaoVisualizarPerfil = new JButton("Visualizar Perfil");

    public MenuCliente(int index) {
    	
    	System.out.println(index);
    	
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	MenuCliente.index = index;
    	
        // JANELA
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(190, 20, 600, 50);
        janela.setLayout(null);

        // LABEL COM NOME DO CLIENTE
        client_name.setBounds(230, 120, 400, 50);
        client_name.setFont(new Font("Algerian", Font.BOLD, 20));
        client_name.setText("Bem vindo(a) " + Client_control.database_client.get(index-1));
        
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
        botaoVisualizarPerfil.addActionListener(menucliente);
    }

    public static void main(String[] args) {
    	int index = 2;
    	MenuCliente menucliente = new MenuCliente(index);
        botaoComprar.addActionListener(menucliente);
        botaoEditPerfil.addActionListener(menucliente);
        botaoVisualizarPerfil.addActionListener(menucliente);

    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoComprar) {
            new Compra(index).comprarProduto(index);
            janela.dispose();
        }
        if (src == botaoEditPerfil) {
            new EditarPerfilCliente(index).editarPerfil(index);
            janela.dispose();
        }
        if (src == botaoVisualizarPerfil) {
            new DetalheCliente(index).detalharCliente(index);
            janela.dispose();
        }

    }
}
