package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.Data_control;
//CRIANDO A CLASSE DA INTERFACE MENU DO ADMINISTRADOR
public class MenuAdmin implements ActionListener {
	// DATABASE 
	static Data_control database = new Data_control();
	// EMAIL POSITION - INPUT AT LOGIN ADMIN 
    static int index;
    // JANELA
    private static JFrame janela = new JFrame("Menu Administrador");
    private static JLabel titulo = new JLabel("Menu Administrador");
	private static JLabel texto = new JLabel("OU");
    // LABELS
    private static JLabel adm_name = new JLabel();
    // BOTOES
    private static JButton botaoCadProd = new JButton("Cadastrar Produto");
    private static JButton botaoEditPerfil = new JButton("Editar Perfil");
    private static JButton botaovoltar = new JButton("Voltar");
    // CONSTRUTOR
    public  MenuAdmin(int index, Data_control database) {
    	// PRINT PARA CONTROLER DE INFORMAÇÃO
    	System.out.println("Valor da posição do email no construtor de MenuAdmin= "+index);
    	// PASSANDO O DATABASE PARA SER USADO NAS PROXIMAS PAGINAS 
    	MenuAdmin.database = database;
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
        adm_name.setText("Bem vindo(a) " + database.getDatabase_adm().get(index-1));
        // BOTOES
        // CADASTRAR PRODUTO
        botaoCadProd.setBounds(250, 150, 250, 50);
        botaoCadProd.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoCadProd.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoCadProd.setBackground(Color.BLACK);
        botaoCadProd.setForeground(Color.WHITE);
        // EDITAR PERFIL
        botaoEditPerfil.setBounds(250, 240, 250, 50);
        botaoEditPerfil.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaoEditPerfil.setFont(new Font("Algerian", Font.BOLD, 20));
        botaoEditPerfil.setBackground(Color.BLACK);
        botaoEditPerfil.setForeground(Color.WHITE);
        // VOLTAR
        botaovoltar.setBounds(250, 400, 250, 50);
        botaovoltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        botaovoltar.setFont(new Font("Algerian", Font.BOLD, 20));
        botaovoltar.setBackground(Color.BLACK);
        botaovoltar.setForeground(Color.WHITE);
        // [ADICIONANDO A JANELA]
        janela.add(titulo);
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
    public void menuAdmin(int index, Data_control database) {
        MenuAdmin menuAdmin = new MenuAdmin(index, database);
        botaoCadProd.addActionListener(menuAdmin);
        botaoEditPerfil.addActionListener(menuAdmin);
        botaovoltar.addActionListener(menuAdmin);
    }
    // MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
    	int index = 2;
        MenuAdmin menuAdmin = new MenuAdmin(index,database);
        botaoCadProd.addActionListener(menuAdmin);
        botaoEditPerfil.addActionListener(menuAdmin);
        botaovoltar.addActionListener(menuAdmin);

    }
    // MÉTODO PARA INSTRUIR AS AÇÕES
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoCadProd) {
            new CadastroProduto(index, database).cadastroProduto(index, database);
        }
        if (src == botaoEditPerfil) {
            new EditarPerfilAdm(index, database).editarPerfilAdm(index, database);
        }
        if (src == botaovoltar) {
            new Home().home();
        }
    }}
