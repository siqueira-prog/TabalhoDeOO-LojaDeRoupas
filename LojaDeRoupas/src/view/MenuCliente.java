package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.Data_control;
public class MenuCliente implements ActionListener {
	// DATABASE 
	static Data_control database = new Data_control();
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
    // CONSTRUTOR
    public MenuCliente(int index, Data_control database ) {
    	// PRINT PARA CONTROLER DE INFORMAÇÃO
    	System.out.println("Valor da posição do email no construtor de MenuCliente= "+index);
    	// PASSANDO O DATABASE PARA SER USADO NAS PROXIMAS PAGINAS 
    	MenuCliente.database = database;
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	MenuCliente.index = index;
        // JANELA
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(190, 20, 600, 50);
        janela.setLayout(null);
        // NOME DO CLIENTE 
        client_name.setBounds(230, 120, 400, 50);
        client_name.setFont(new Font("Algerian", Font.BOLD, 20));
        client_name.setText("Bem vindo(a) " + database.getDatabase_client().get(index-1));
        // BOTÕES
        botaoComprar.setBounds(230, 200, 250, 50);
        botaoComprar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoComprar.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoComprar.setBackground(Color.BLACK);
        botaoComprar.setForeground(Color.WHITE);
        // EDITAR PERFIL
        botaoEditPerfil.setBounds(230, 300, 250, 50);
        botaoEditPerfil.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoEditPerfil.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoEditPerfil.setBackground(Color.BLACK);
        botaoEditPerfil.setForeground(Color.WHITE);
        // VISUALIZAR PERFIL
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
	// MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void menu(int index, Data_control database) {
        MenuCliente menucliente = new MenuCliente(index, database);
        botaoComprar.addActionListener(menucliente);
        botaoEditPerfil.addActionListener(menucliente);
        botaoVisualizarPerfil.addActionListener(menucliente);
    }
	// MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE   
    public static void main(String[] args) {
    }
    // MÉTODO PARA INSTRUIR AS AÇÕES
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoComprar) {
            new Compra(index,database).comprarProduto(index,database);
            janela.dispose();
        }
        if (src == botaoEditPerfil) {
            new EditarPerfilCliente(index,database).editarPerfil(index,database);
            janela.dispose();
        }
        if (src == botaoVisualizarPerfil) {
        	new DetalheCliente(index, database).detalharCliente(index, database);
            janela.dispose();
        }

    }}
