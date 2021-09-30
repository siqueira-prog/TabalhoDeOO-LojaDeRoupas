package view;

import javax.swing.*;

public class TelaDeInicio extends JFrame {

	// Janela
	private static JFrame janela = new JFrame("Inicio");
	private static JLabel titulo = new JLabel("Menu Início");
	private static JLabel texto = new JLabel("OU");

	// Conteúdo
	private static JButton logarCliente = new JButton("Logar como cliente");
	private static JButton logarAdmin = new JButton("Logar como administrador");
	private static JButton cadastrarCliente = new JButton("Cadastrar como cliente");
	private static JButton cadastrarAdmin = new JButton("Cadastrar como administrador");

	public TelaDeInicio() {
		super();

		titulo.setBounds(250, 10, 150, 30);
		logarCliente.setBounds(250, 150, 250, 50);
		logarAdmin.setBounds(250, 215, 250, 50);
		texto.setBounds(370, 275, 200, 30);
		cadastrarCliente.setBounds(250, 315, 250, 50);
		cadastrarAdmin.setBounds(250, 375, 250, 50);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(logarCliente);
		janela.add(logarAdmin);
		janela.add(texto);
		janela.add(cadastrarCliente);
		janela.add(cadastrarAdmin);

		janela.setSize(750, 550);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		TelaDeInicio menu = new TelaDeInicio();

	}

}
