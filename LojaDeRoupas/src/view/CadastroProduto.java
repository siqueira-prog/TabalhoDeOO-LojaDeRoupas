package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadastroProduto {
    // [DEFININDO VARIÁVEIS]

    // JANELA
    private static JFrame janela = new JFrame("Cadastro de Cliente");
    private static JLabel titulo = new JLabel("Cadastro de Produto");

    // INFORMAÇÕES DO PRODUTO

    // Input nome
    private static JLabel labelNome = new JLabel("Didigite o nome:");
    private static JTextField fieldNome = new JTextField();

    // Input CPF
    private static JLabel labelCor = new JLabel("Didigite a cor:");
    private static JTextField fieldCor = new JTextField();

    // Input email
    private static JLabel labelTamanho = new JLabel("Didigite o tamanho:");
    private static JTextField fieldTamanho = new JTextField();

    // Input senha
    private static JLabel labelComp = new JLabel("Didigite a composição:");
    private static JTextField fieldComp = new JTextField();

    // Input confirmar senha
    private static JLabel labelTipo = new JLabel("Digite o tipo:");
    private static JTextField fieldTipo = new JTextField();

    private static JButton cadastrar = new JButton("Cadastrar");

    public void cadastrarProduto() {

        // JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        cadastrar.setBounds(50, 640, 250, 50);

        // INFORMAÇÕES DO PRODUTO

        // Input nome
        labelNome.setBounds(50, 150, 250, 50);
        fieldNome.setBounds(50, 190, 250, 50);

        // Input cor
        labelCor.setBounds(50, 240, 250, 50);
        fieldCor.setBounds(50, 280, 250, 50);

        // Input tamanho
        labelTamanho.setBounds(50, 330, 250, 50);
        fieldTamanho.setBounds(50, 370, 250, 50);

        // Iput composição
        labelComp.setBounds(50, 420, 250, 50);
        fieldComp.setBounds(50, 460, 250, 50);

        // Input tipo
        labelTipo.setBounds(50, 510, 250, 50);
        fieldTipo.setBounds(50, 550, 250, 50);

        janela.add(titulo);
        janela.add(cadastrar);

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

        janela.setSize(750, 750);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
}
