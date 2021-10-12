package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.Data_control;
public class DetalhesProduto implements ActionListener {
	// DATABASE 
	static Data_control database = new Data_control();
	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index; 
    // JANELA
    private static JFrame janela = new JFrame("Cliente");
    private static JLabel titulo = new JLabel("Detalhes do Produto");
    private static JLabel subtitulo1 = new JLabel("Infomações do+ Produto");
    // INFORMAÇÕES PESSOAIS
    // NOME
    private static JLabel labelNome = new JLabel("Nome do Produto:");
    private static JTextField fieldNome = new JTextField();
    // TAMANHO
    private static JLabel labelTamanho = new JLabel("Tamanho");
    private static JTextField fieldTamanho = new JTextField();
    // COR
    private static JLabel labelCor = new JLabel("Cor:");
    private static JTextField fieldCor = new JTextField();
    // DESCRICAO
    private static JLabel labelDesc = new JLabel("Descrição:");
    private static JTextField fieldDesc = new JTextField();
    // CATEGORIA
    private static JLabel labelCategoria = new JLabel("Categoria");
    private static JTextField fieldCategoria = new JTextField();
    // COMPOSICAO
    private static JLabel labelComp = new JLabel("Composição");
    private static JTextField fieldComp = new JTextField();
    // TIPO
    private static JLabel labelTipo = new JLabel("Tipo:");
    private static JTextField fieldTipo = new JTextField();
    // PRECO
    private static JLabel labelPreco = new JLabel("Preço:");
    private static JTextField fieldPreco = new JTextField();
    // QUANTIDADE
    private static JLabel labelQtd = new JLabel("Quantidade:");
    private static JTextField fieldQtd = new JTextField("1");
    // BOTOES
    private static JButton comprar = new JButton("Comprar");
    private static JButton cancelar = new JButton("Cancelar");
    // CONSTRUTOR
    public DetalhesProduto(String camiseta_escolhida_string, int index, Data_control database) {
    	// PRINT PARA CONTROLER DE INFORMAÇÃO
    	System.out.println("Valor da posição do email no construtor de DetalhesProduto= "+index);
    	// PASSANDO O DATABASE PARA SER USADO NAS PROXIMAS PAGINAS 
    	DetalhesProduto.database = database;
    	// PEGANDO A POSIÇÃO DA CAMISETA ESCOLHIDA NO DATABASE
    	int position = database.getDatabase_camiseta().indexOf(camiseta_escolhida_string);
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	DetalhesProduto.index= index;
    	// JANELA
        janela.setLayout(null);
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        titulo.setBounds(220, 20, 1000, 50);
        subtitulo1.setFont(new Font("Algerian", Font.BOLD, 10));
        subtitulo1.setBounds(20, 80, 250, 50);
        // BOTOES
        //COMPRAR
        comprar.setBounds(256, 640, 250, 50);
        comprar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        comprar.setFont(new Font("Algerian", Font.BOLD, 20));
        comprar.setBackground(Color.BLACK);
        comprar.setForeground(Color.WHITE);
        // CANCELAR
        cancelar.setBounds(512, 640, 250, 50);
        cancelar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        cancelar.setFont(new Font("Algerian", Font.BOLD, 20));
        cancelar.setBackground(Color.BLACK);
        cancelar.setForeground(Color.WHITE);
        // INFORMAÇÕES DA CAMISETA
        // NOME
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);
        fieldNome.setEditable(false);
        fieldNome.setText(database.getDatabase_camiseta().get(position));
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setForeground(new Color(212,175,55));
        // TAMANHO
        labelTamanho.setBounds(20, 190, 100, 50);
        fieldTamanho.setBounds(20, 230, 100, 50);
        fieldTamanho.setEditable(false);
        fieldTamanho.setText(database.getDatabase_camiseta().get(position+2));
        labelTamanho.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTamanho.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTamanho.setForeground(new Color(212,175,55));
        // COR
        labelCor.setBounds(170, 190, 100, 50);
        fieldCor.setBounds(170, 230, 100, 50);
        fieldCor.setEditable(false);
        fieldCor.setText(database.getDatabase_camiseta().get(position+1));
        labelCor.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCor.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCor.setForeground(new Color(212,175,55));
        // DESCRICAO
        labelDesc.setBounds(20, 270, 250, 50);
        fieldDesc.setBounds(20, 310, 250, 80);
        fieldDesc.setEditable(false);
        fieldDesc.setText(database.getDatabase_camiseta().get(position+8));
        labelDesc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDesc.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDesc.setForeground(new Color(212,175,55));
        // CATEGORIA
        labelCategoria.setBounds(380, 110, 250, 50);
        fieldCategoria.setBounds(380, 150, 250, 50);
        fieldCategoria.setEditable(false);
        fieldCategoria.setText(database.getDatabase_camiseta().get(position+9));
        labelCategoria.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCategoria.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCategoria.setForeground(new Color(212,175,55));
        // COMPOSICAO
        labelComp.setBounds(380, 190, 250, 50);
        fieldComp.setBounds(380, 230, 250, 50);
        fieldComp.setEditable(false);
        fieldComp.setText(database.getDatabase_camiseta().get(position+3));
        labelComp.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldComp.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldComp.setForeground(new Color(212,175,55));
        // TIPO
        labelTipo.setBounds(380, 270, 250, 50);
        fieldTipo.setBounds(380, 310, 250, 50);
        fieldTipo.setEditable(false);
        fieldTipo.setText(database.getDatabase_camiseta().get(position+4));
        labelTipo.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTipo.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTipo.setForeground(new Color(212,175,55));     
        // PRECO
        labelPreco.setBounds(730, 110, 100, 50);
        fieldPreco.setBounds(730, 150, 100, 50);
        fieldPreco.setEditable(false);
        fieldPreco.setText(database.getDatabase_camiseta().get(position+5));
        labelPreco.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldPreco.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldPreco.setForeground(new Color(212,175,55));
        // QUANTIDADE
        labelQtd.setBounds(880, 110, 150, 50);
        fieldQtd.setBounds(900, 150, 100, 50);
        fieldQtd.setText(database.getDatabase_camiseta().get(position+7));
        labelQtd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldQtd.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldQtd.setForeground(new Color(212,175,55));
        // [ADICIONANDO A JANELA]
        janela.add(titulo);
        janela.add(subtitulo1);
        janela.add(comprar);
        janela.add(cancelar);
        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelTamanho);
        janela.add(fieldTamanho);
        janela.add(labelCor);
        janela.add(fieldCor);
        janela.add(labelDesc);
        janela.add(fieldDesc);
        janela.add(labelCategoria);
        janela.add(fieldCategoria);
        janela.add(labelComp);
        janela.add(fieldComp);
        janela.add(labelTipo);
        janela.add(fieldTipo);
        janela.add(labelPreco);
        janela.add(fieldPreco);
        janela.add(labelQtd);
        janela.add(fieldQtd);
        janela.setSize(1074, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
	// MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void detalharProduto(String camiseta_escolhida_string, int index, Data_control database) {
        DetalhesProduto detalhesproduto = new DetalhesProduto(camiseta_escolhida_string, index, database);
         comprar.addActionListener(detalhesproduto);
         cancelar.addActionListener(detalhesproduto);
    }
	// MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE   
    public static void main(String[] args) {
    	//index = 2;
    	//String camiseta_escolhida_string = "KongCamiseta1";
    	//DetalhesProduto detalhesproduto = new DetalhesProduto(camiseta_escolhida_string, index);
    	//comprar.addActionListener(detalhesproduto);
    	//cancelar.addActionListener(detalhesproduto);
    }
    // MÉTODO PARA INSTRUIR AS AÇÕES
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        	if (src == comprar) {
        		new MenuCliente(index, database).menu(index, database);
        		janela.dispose();
        	}
        	if (src == cancelar) {
        		new MenuCliente(index, database).menu(index, database);
        		janela.dispose();
        	}
    }}
