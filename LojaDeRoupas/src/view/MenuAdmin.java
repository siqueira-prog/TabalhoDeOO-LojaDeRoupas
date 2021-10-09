package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//CRIANDO A CLASSE DA INTERFACE MENU DO ADMINISTRADOR
public class MenuAdmin implements ActionListener {
    // JANELA
    private static JFrame janela = new JFrame("Menu Administrador");
    private static JLabel titulo = new JLabel("Menu Administrador");
	private static JLabel texto = new JLabel("OU");
    
    private static JButton botaoCadProd = new JButton("Cadastrar Produto");
    private static JButton botaoEditPerfil = new JButton("Editar Perfil");
    private static JButton botaovoltar = new JButton("Voltar");
    
    // CONSTRUTOR
    public  MenuAdmin() {

        // JANELA
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(85, 20, 600, 50);
        janela.setLayout(null);
        texto.setFont(new Font("Algerian", Font.BOLD, 20));
        texto.setBounds(360, 320, 250, 50);
        
        // INFORMAÇÕES PESSOAIS

        // Input email
        botaoCadProd.setBounds(250, 150, 250, 50);
        botaoCadProd.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoCadProd.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoCadProd.setBackground(Color.BLACK);
        botaoCadProd.setForeground(Color.WHITE);
        
        botaoEditPerfil.setBounds(250, 240, 250, 50);
        botaoEditPerfil.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoEditPerfil.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoEditPerfil.setBackground(Color.BLACK);
        botaoEditPerfil.setForeground(Color.WHITE);
        
        botaovoltar.setBounds(250, 400, 250, 50);
        botaovoltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaovoltar.setFont(new Font("Algerian", Font.BOLD, 20));
        botaovoltar.setBackground(Color.BLACK);
        botaovoltar.setForeground(Color.WHITE);
        
        // [ADICIONANDO A JANELA]

        janela.add(titulo);

        // Informações Pessoais
        janela.add(botaoCadProd);
        janela.add(botaoEditPerfil);
        janela.add(botaovoltar);
        janela.add(texto);
        janela.setSize(750, 550);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
    // MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void menuAdmin() {
        MenuAdmin menuAdmin = new MenuAdmin();
        botaoCadProd.addActionListener(menuAdmin);
        botaoEditPerfil.addActionListener(menuAdmin);
        botaovoltar.addActionListener(menuAdmin);
    }
    
    // MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
        MenuAdmin menuAdmin = new MenuAdmin();
        botaoCadProd.addActionListener(menuAdmin);
        botaoEditPerfil.addActionListener(menuAdmin);
        botaovoltar.addActionListener(menuAdmin);

    }

    // ORIENTAÇÃO DAS AÇÕES 
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        if (src == botaoCadProd) {
            new CadastroProduto().cadastroProduto();
        }
        if (src == botaoEditPerfil) {
            new EditarPerfilAdm().editarPerfilAdm();
        }
        if (src == botaovoltar) {
            new Home().home();
        }

    }
}
