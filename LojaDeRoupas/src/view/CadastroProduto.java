package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadastroProduto implements ActionListener {
    // [DEFININDO VARIÁVEIS]

	// EMAIL POSITION - INPUT AT LOGIN CLIENT 
    static int index;
    
    // JANELA
    private static JFrame janela = new JFrame("Cadastrar produto");
    private static JLabel titulo = new JLabel("Cadastro Produto");

    // INFORMAÇÕES DO PRODUTO
    
    // INPUT NOME
    private static JLabel labelNome = new JLabel("Didigite o nome:");
    private static JTextField fieldNome = new JTextField();

    // INPUT COR
    private static JLabel labelCor = new JLabel("Didigite a cor:");
    private static JTextField fieldCor = new JTextField();

    // INPUT TAMANHO
    private static JLabel labelTamanho = new JLabel("Didigite o tamanho:");
    private static JTextField fieldTamanho = new JTextField();

    // INPUT COMPOSIÇÃO
    private static JLabel labelComp = new JLabel("Didigite a composição:");
    private static JTextField fieldComp = new JTextField();

    // INPUT TIPO
    private static JLabel labelTipo = new JLabel("Digite o tipo:");
    private static JTextField fieldTipo = new JTextField();

    // PREÇO DE VENDA
    private static JLabel labelPrecoVenda = new JLabel("Digite o valor de venda:");
    private static JTextField fieldPrecoVenda = new JTextField();
    
    // PREÇO DE FÁBRICA
    private static JLabel labelPrecoFabrica = new JLabel("Digite o valor de fábrica:");
    private static JTextField fieldPrecoFabrica = new JTextField();
    
    // VOLUME (QUANTIDADE DO PRODUTO)
    private static JLabel labelEstoque = new JLabel("Digite o estoque:");
    private static JTextField fieldEstoque = new JTextField();
    
    // DESCRIÇÃO 
    private static JLabel labelDescricao = new JLabel("Digite a descrição:");
    private static JTextField fieldDescricao = new JTextField();
    
    // CATEGORIA
    private static JLabel labelCategoria = new JLabel("Digite a categoria:");
    private static JTextField fieldCategoria = new JTextField();
    
    // BOTÕES
    private static JButton cadastrar = new JButton("Cadastrar");
    private static JButton voltar = new JButton("Voltar");

    // CONSTRUTOR
    public CadastroProduto(int index) {
    	
    	// PASSANDO O VALOR DE INDEX PARA SER USADO NAS PROXIMAS PAGINAS
    	CadastroProduto.index = index;
    	
        // JANELA

        janela.setLayout(null);

        titulo.setBounds(85, 20, 600, 50);
        titulo.setFont(new Font("Algerian", Font.BOLD, 50));
        // INFORMAÇÕES DO PRODUTO

        // INPUT NOME
        labelNome.setBounds(50, 150, 250, 50);
        fieldNome.setBounds(50, 190, 250, 50);
        labelNome.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldNome.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldNome.setForeground(new Color(212,175,55));

        // INPUT COR
        labelCor.setBounds(50, 240, 250, 50);
        fieldCor.setBounds(50, 280, 250, 50);
        labelCor.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCor.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldCor.setForeground(new Color(212,175,55));

        // INPUT TAMANHO
        labelTamanho.setBounds(50, 330, 250, 50);
        fieldTamanho.setBounds(50, 370, 250, 50);
        labelTamanho.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTamanho.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldTamanho.setForeground(new Color(212,175,55));
     
        // INPUT COMPOSIÇÃO
        labelComp.setBounds(50, 420, 250, 50);
        fieldComp.setBounds(50, 460, 250, 50);
        labelComp.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldComp.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldComp.setForeground(new Color(212,175,55));

        // INPUT TIPO
        labelTipo.setBounds(50, 510, 250, 50);
        fieldTipo.setBounds(50, 550, 250, 50);
        labelTipo.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldTipo.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldTipo.setForeground(new Color(212,175,55));
        
        // INPUT PREÇO DE VENDA
        labelPrecoVenda.setBounds(400, 150, 250, 50);
        fieldPrecoVenda.setBounds(400, 190, 250, 50);
        labelPrecoVenda.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldPrecoVenda.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldPrecoVenda.setForeground(new Color(212,175,55));
          
        // INPUT PREÇO DE FABRICA
        labelPrecoFabrica.setBounds(400, 240, 250, 50);
        fieldPrecoFabrica.setBounds(400, 280, 250, 50);
        labelPrecoFabrica.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldPrecoFabrica.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldPrecoFabrica.setForeground(new Color(212,175,55));
        
        // INPUT ESTOQUE 
        labelEstoque.setBounds(400, 330, 250, 50);
        fieldEstoque.setBounds(400, 370, 250, 50);
        labelEstoque.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldEstoque.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldEstoque.setForeground(new Color(212,175,55));
        
        // INPUT DESCRIÇÃO
        labelDescricao.setBounds(400, 420, 250, 50);
        fieldDescricao.setBounds(400, 460, 250, 50);
        labelDescricao.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldDescricao.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldDescricao.setForeground(new Color(212,175,55));
        
        // INPUT CATEGORIA 
        labelCategoria.setBounds(400, 510, 250, 50);
        fieldCategoria.setBounds(400, 550, 250, 50);
        labelCategoria.setFont(new Font("Algerian", Font.BOLD, 20));
        fieldCategoria.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        fieldCategoria.setForeground(new Color(212,175,55));
                
        // BOTÕES
        cadastrar.setBounds(50, 640, 250, 50);
        cadastrar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        cadastrar.setFont(new Font("Algerian", Font.BOLD, 20));
        cadastrar.setBackground(Color.GREEN);
        cadastrar.setForeground(Color.BLACK);

        voltar.setBounds(400, 640, 250, 50);
        voltar.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
        voltar.setFont(new Font("Algerian", Font.BOLD, 20));
        voltar.setBackground(Color.BLACK);
        voltar.setForeground(Color.WHITE);
        
        janela.add(titulo);
        
        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelCor);
        janela.add(fieldCor);
        janela.add(labelTamanho);
        janela.add(fieldTamanho);
        janela.add(labelComp);
        janela.add(fieldComp);
        janela.add(labelTipo);
        janela.add(fieldTipo);
        janela.add(labelPrecoVenda);
        janela.add(fieldPrecoVenda);
        janela.add(labelPrecoFabrica);
        janela.add(fieldPrecoFabrica);
        janela.add(labelEstoque);
        janela.add(fieldEstoque);
        janela.add(labelDescricao);
        janela.add(fieldDescricao);
        janela.add(labelCategoria);
        janela.add(fieldCategoria);
        
        janela.add(cadastrar);
        janela.add(voltar);
        
        janela.setSize(750, 750);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    // MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
    public void cadastroProduto(int index) {
    	CadastroProduto cadastroproduto = new CadastroProduto(index);
    	fieldNome.addActionListener(cadastroproduto);
    	fieldCor.addActionListener(cadastroproduto);
    	fieldTamanho.addActionListener(cadastroproduto);
    	fieldComp.addActionListener(cadastroproduto);
    	fieldTipo.addActionListener(cadastroproduto);
        fieldPrecoVenda.addActionListener(cadastroproduto);
        fieldPrecoFabrica.addActionListener(cadastroproduto);
        fieldEstoque.addActionListener(cadastroproduto);
        fieldDescricao.addActionListener(cadastroproduto);
        fieldCategoria.addActionListener(cadastroproduto);
        cadastrar.addActionListener(cadastroproduto);
        voltar.addActionListener(cadastroproduto);
    }
    
    // MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
    public static void main(String[] args) {
    	CadastroProduto cadastroproduto = new CadastroProduto(index);
    	fieldNome.addActionListener(cadastroproduto);
    	fieldCor.addActionListener(cadastroproduto);
    	fieldTamanho.addActionListener(cadastroproduto);
    	fieldComp.addActionListener(cadastroproduto);
    	fieldTipo.addActionListener(cadastroproduto);
        fieldPrecoVenda.addActionListener(cadastroproduto);
        fieldPrecoFabrica.addActionListener(cadastroproduto);
        fieldEstoque.addActionListener(cadastroproduto);
        fieldDescricao.addActionListener(cadastroproduto);
        fieldCategoria.addActionListener(cadastroproduto);
        cadastrar.addActionListener(cadastroproduto);
        voltar.addActionListener(cadastroproduto);
    }
    
    // ORIENTAÇÃO DAS AÇÕES 
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == cadastrar) {
        	new MenuAdmin(index).menuAdmin(index);
        	janela.dispose();
        }
        if (src == voltar) {
            new MenuAdmin(index).menuAdmin(index);
        	janela.dispose();
        }
    }
}
