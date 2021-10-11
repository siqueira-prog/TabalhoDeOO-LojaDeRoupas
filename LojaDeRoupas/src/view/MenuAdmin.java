package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.Adm_control;

//CRIANDO A CLASSE DA INTERFACE MENU DO ADMINISTRADOR
public class MenuAdmin implements ActionListener {
	
	// EMAIL POSITION - INPUT AT LOGIN ADMIN 
    static int index;
    
    // JANELA
    private static JFrame janela = new JFrame("Menu Administrador");
    private static JLabel titulo = new JLabel("Menu Administrador");
	private static JLabel texto = new JLabel("OU");
    
    // LABELS
    private static JLabel adm_name = new JLabel();
    
    private static JButton botaoCadProd = new JButton("Cadastrar Produto");
    private static JButton botaoEditPerfil = new JButton("Editar Perfil");
    private static JButton botaovoltar = new JButton("Voltar");
    
    // CONSTRUTOR
    public  MenuAdmin(int index) {
    	
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	MenuAdmin.index = index;
        
    	// JANELA
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(85, 20, 600, 50);
        janela.setLayout(null);
        texto.setFont(new Font("Algerian", Font.BOLD, 20));
        texto.setBounds(360, 320, 250, 50);
        
        // NOME DO ADMINISTRADOR LOGADO
        adm_name.setBounds(270, 90, 400, 50);
        adm_name.setFont(new Font("Algerian", Font.BOLD, 20));
        adm_name.setText("Bem vindo(a) " + Adm_control.database_adm.get(index-1));

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
        janela.add(adm_name);
        janela.setSize(750, 550);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
    // MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void menuAdmin(int index) {
        MenuAdmin menuAdmin = new MenuAdmin(index);
        botaoCadProd.addActionListener(menuAdmin);
        botaoEditPerfil.addActionListener(menuAdmin);
        botaovoltar.addActionListener(menuAdmin);
    }
    
    // MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
    	int index = 2;
        MenuAdmin menuAdmin = new MenuAdmin(index);
        botaoCadProd.addActionListener(menuAdmin);
        botaoEditPerfil.addActionListener(menuAdmin);
        botaovoltar.addActionListener(menuAdmin);

    }

    // ORIENTAÇÃO DAS AÇÕES 
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        if (src == botaoCadProd) {
            new CadastroProduto(index).cadastroProduto(index);
        }
        if (src == botaoEditPerfil) {
            new EditarPerfilAdm(index).editarPerfilAdm(index);
        }
        if (src == botaovoltar) {
            new Home().home();
        }

    }
}
