package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import model.Dados;

public class DetalhesProduto implements ActionListener {
    // [DEFININDO VARIÁVEIS]

    // JANELA
    private static JFrame janela = new JFrame("Cliente");
    private static JLabel titulo = new JLabel("Produto - Detalhes");
    private static JLabel subtitulo1 = new JLabel("Infomações do Produto");

    // INFORMAÇÕES PESSOAIS

    // Input nome
    private static JLabel labelNome = new JLabel("Nome do Produto:");
    private static JTextField fieldNome = new JTextField();
    
    
    // Input tamanho
    private static JLabel labelTamanho = new JLabel("Tamanho");
    private static JTextField fieldTamanho = new JTextField();

    // Input cor
    private static JLabel labelCor = new JLabel("Cor:");
    private static JTextField fieldCor = new JTextField();

    // Input descrição
    private static JLabel labelDesc = new JLabel("Descrição:");
    private static JTextField fieldDesc = new JTextField();

    // Input categoria
    private static JLabel labelCategoria = new JLabel("Categoria");
    private static JTextField fieldCategoria = new JTextField();

    // Input composição
    private static JLabel labelComp = new JLabel("Composição");
    private static JTextField fieldComp = new JTextField();

    // Tipo
    private static JLabel labelTipo = new JLabel("Tipo:");
    private static JTextField fieldTipo = new JTextField();

    // Input preço
    private static JLabel labelPreco = new JLabel("Preço:");
    private static JTextField fieldPreco = new JTextField();

    // Input qunatidade
    private static JLabel labelQtd = new JLabel("Quantidade:");
    private static JTextField fieldQtd = new JTextField("1");

    // Botao
    private static JButton comprar = new JButton("Comprar");
    private static JButton cancelar = new JButton("Cancelar");

    public DetalhesProduto(int index) {

        // JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        subtitulo1.setFont(new Font("Arial", Font.BOLD, 14));
        subtitulo1.setBounds(20, 80, 250, 50);
        comprar.setBounds(256, 640, 250, 50);
        comprar.setBackground(Color.GREEN);
        cancelar.setBounds(512, 640, 250, 50);

        // INFORMAÇÕES PESSOAIS

        // Input nome
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);
        fieldNome.setEditable(false);
        fieldNome.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+1));
        
        // Tamano
        labelTamanho.setBounds(20, 190, 100, 50);
        fieldTamanho.setBounds(20, 230, 100, 50);
        fieldTamanho.setEditable(false);
        fieldTamanho.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+3));
        
        // Cor
        labelCor.setBounds(170, 190, 100, 50);
        fieldCor.setBounds(170, 230, 100, 50);
        fieldCor.setEditable(false);
        fieldCor.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+2));
        
        // Iput descrição
        labelDesc.setBounds(20, 270, 250, 50);
        fieldDesc.setBounds(20, 310, 250, 80);
        fieldDesc.setEditable(false);
        fieldDesc.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+9));
        
        // Input categoria
        labelCategoria.setBounds(380, 110, 250, 50);
        fieldCategoria.setBounds(380, 150, 250, 50);
        fieldCategoria.setEditable(false);
        fieldCategoria.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+10));
        
        // Input estado
        labelComp.setBounds(380, 190, 250, 50);
        fieldComp.setBounds(380, 230, 250, 50);
        fieldComp.setEditable(false);
        fieldComp.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+4));
        
        // Ipnpu Tipo
        labelTipo.setBounds(380, 270, 250, 50);
        fieldTipo.setBounds(380, 310, 250, 50);
        fieldTipo.setEditable(false);
        fieldTipo.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+5));
        
        // Input preço
        labelPreco.setBounds(730, 110, 100, 50);
        fieldPreco.setBounds(730, 150, 100, 50);
        fieldPreco.setEditable(false);
        fieldPreco.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+6));
       
        // Input quantidade
        labelQtd.setBounds(880, 110, 100, 50);
        fieldQtd.setBounds(880, 150, 100, 50);
        fieldQtd.setText(Dados.databaseprecadastrado().getData_camiseta().get(index+8));
        
        // [ADICIONANDO A JANELA]

        janela.add(titulo);
        janela.add(subtitulo1);

        janela.add(comprar);
        janela.add(cancelar);

        // Informações do produto

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

        // Cartão de Crédito

        janela.setSize(1024, 768);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }

    public void detalharProduto(int index) {
        DetalhesProduto detalharproduto = new DetalhesProduto(0);
        // editar.addActionListener(detalharcliente);
        // cancelar.addActionListener(detalharcliente);

    }

    public static void main(String[] args) {
        DetalhesProduto detalharproduto = new DetalhesProduto(0);
        // editar.addActionListener(detalharcliente);
        // cancelar.addActionListener(detalharcliente);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        // if (src == editar) {
        // new EditarPerfilCliente().editarPerfil();
        // }
        // if (src == cancelar) {
        // janela.dispose();
        // }
    }
}
