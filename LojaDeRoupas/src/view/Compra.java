package view;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controller.Data_control;
import controller.Product_control;
//import controller.ControleCompra;
public class Compra implements ActionListener {
	// DATABASE 
	static Data_control database = new Data_control();
	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index;
    // NOME DA CAMISETA ESCOLHIDA
    static String camiseta_escolhida;
    // CARREGANDO AS INFORMAÇÕES PARA COLOCAR NA JLIST
    private ArrayList<String> nomeCamisetas_arraylist = Product_control.nomeCamisetas();
    private String[] lista = nomeCamisetas_arraylist.toArray(new String [nomeCamisetas_arraylist.size()]); 
    // CRIANDO A JLIST E ADICIONADO AS INFORMAÇÕES
    JList<String> listprodutos = new JList<String>(lista);
    // CENTRALIZANDO OS ELEMENTOS DA JLIST
    DefaultListCellRenderer renderer =  (DefaultListCellRenderer)listprodutos.getCellRenderer();      
    // JANELA
    private static JFrame janela = new JFrame("Compra");
    private static JLabel titulo = new JLabel("Camisetas disponíveis");
    // BOTOES
    private static JButton detalhesDoProduto = new JButton("Detalhes do Produto");
    private static JButton voltar = new JButton("Voltar");
    // CONSTRUTOR
    public Compra(int index, Data_control database) {
    	// PRINT PARA CONTROLER DE INFORMAÇÃO
    	System.out.println("Valor da posição do email no construtor de Compra= "+index);
    	// PASSANDO O DATABASE PARA SER USADO NAS PROXIMAS PAGINAS 
    	Compra.database = database;
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	Compra.index = index;        
        // JANELA
        titulo.setFont(new Font("Algerian", Font.BOLD,50));
        titulo.setBounds(205, 80, 1000, 70);
        //POSIÇÃO DOS ELEMENTOS DA JLIST
        renderer.setHorizontalAlignment(JLabel.CENTER); 
        //BORDA DA JLIST
        listprodutos.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        listprodutos.setBackground(new Color(220,220,220));
        //TAMANHO DA JLIST E POSICIONAMENTO
        listprodutos.setBounds(380, 200, 250, 300);
        //COR DOS ELEMENTOS NA JLIST
        listprodutos.setForeground(Color.BLACK);
        //DIMENSÕES DAS CÉLULAS QUE CONTEM CADA ELEMENTO DA JLIST
        listprodutos.setFixedCellHeight(60);
        listprodutos.setFixedCellWidth(50);
        //CORES DE INTERAÇÃO AO CLICK
        listprodutos.setSelectionBackground(new Color(212,175,55));
        listprodutos.setSelectionForeground(Color.WHITE);
        //FONTE DA JLIST
        listprodutos.setFont(new Font("Algerian", Font.BOLD, 20));
        // BOTOES
        // DETALHAR PRODUTO
        detalhesDoProduto.setBounds(380, 530, 250, 50);
        detalhesDoProduto.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        detalhesDoProduto.setFont(new Font("Algerian", Font.BOLD, 20));
        detalhesDoProduto.setBackground(Color.BLACK);
        detalhesDoProduto.setForeground(Color.WHITE);
        // VOLTAR
        voltar.setBounds(380, 600, 250, 50);
        voltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        voltar.setFont(new Font("Algerian", Font.BOLD, 20));
        voltar.setBackground(Color.BLACK);
        voltar.setForeground(Color.WHITE);
        // [ADICIONANDO A JANELA]
        janela.add(listprodutos);
        janela.add(detalhesDoProduto);
        janela.add(voltar);
        janela.add(titulo);
        janela.setSize(1024, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
        janela.setLayout(null);
    }
	// MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void comprarProduto(int index, Data_control database) {
        Compra compraproduto = new Compra(index, database);
        detalhesDoProduto.addActionListener(compraproduto);
        voltar.addActionListener(compraproduto);      
        listprodutos.addListSelectionListener(new ListSelectionListener(){
        	public void valueChanged(ListSelectionEvent e) {
        	Compra.camiseta_escolhida = listprodutos.getSelectedValue();
        	}});
    }
	// MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE   
    public static void main(String[] args) {
    	index = 2;
        Compra compraproduto = new Compra(index,database);
        detalhesDoProduto.addActionListener(compraproduto);
        voltar.addActionListener(compraproduto);
    }
    // MÉTODO PARA INSTRUIR AS AÇÕES
    public void actionPerformed(ActionEvent e) {  	
    	Object src = e.getSource();
    	System.out.println("Valor selecionado: " + listprodutos.getSelectedValue());
    	if (src == detalhesDoProduto) {
    		new DetalhesProduto(camiseta_escolhida, index, database).detalharProduto(camiseta_escolhida, index, database);
    		janela.dispose();
    		}
        if (src == voltar) {
        	new MenuCliente(index,database).menu(index,database);	
        	janela.dispose();
        }	 
    }}