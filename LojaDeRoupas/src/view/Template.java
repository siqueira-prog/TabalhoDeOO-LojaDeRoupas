package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

public abstract class Template extends JFrame implements ActionListener {
    private final JLabel labelTexto;
    private final JTextField fieldTexto;
    private final JButton botao;
    private final JButton botao2;

    public Template(String nomeBotao) {
        super("Home Page");
        this.setSize(500, 300);
        this.setLayout(new GridLayout(2, 2));

        labelTexto = new JLabel("Texto");

        fieldTexto = new JTextField("Texto");

        botao = new JButton(nomeBotao);
        botao2 = new JButton("Botão 2");

        botao.addActionListener(this); // Vai passar o ActionListener da própria classe
        botao2.addActionListener(this);

        this.add(labelTexto);
        this.add(fieldTexto);
        this.add(botao);
        this.add(botao2);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Fecha a Janela
    }

    public JLabel getLabelTexto() {
        return labelTexto;
    }

    public JTextField getFieldTexto() {
        return fieldTexto;
    }

    public JButton getBotao() {
        return botao;
    }

    public JButton getBotao2() {
        return botao2;
    }
}
