////////////////////////////////////////////////////////////

// PROFESSORA LEIA O README

/////////////////////////////////////////////////////////////

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// CRIANDO A INTERFACE INICIAL CHAMADA HOME
public class Home implements ActionListener {

	// Janela
	private static JFrame janela = new JFrame("Home");
	private static JLabel titulo = new JLabel("Menu Início");
	private static JLabel texto = new JLabel("OU");

	// Conteúdo
	private static JButton logarCliente = new JButton("Logar como cliente");
	private static JButton logarAdmin = new JButton("Logar como administrador");
	private static JButton cadastrarCliente = new JButton("Cadastrar como cliente");

	// CONSTRUTOR
	public Home() {

		// Setando tamanhos
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(20, 20, 250, 50);
		logarCliente.setBounds(250, 150, 250, 50);
		logarAdmin.setBounds(250, 215, 250, 50);
		texto.setBounds(370, 275, 200, 30);
		cadastrarCliente.setBounds(250, 315, 250, 50);
		janela.setLayout(null);

		// Adicionando elementos
		janela.add(titulo);
		janela.add(logarCliente);
		janela.add(logarAdmin);
		janela.add(texto);
		janela.add(cadastrarCliente);

		// Janela
		janela.setSize(750, 550);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	// MÉTODO PARA SER PUXADO POR OUTRA INTERFACE
	public void home() {
		Home menu = new Home();
		logarCliente.addActionListener(menu);
		cadastrarCliente.addActionListener(menu);
		logarAdmin.addActionListener(menu);
	}

	// MÉTODO MAIN PARA RODAR A INTERFACE SEPARADAMENTE
	public static void main(String[] args) {
		Home menu = new Home();
		logarCliente.addActionListener(menu);
		cadastrarCliente.addActionListener(menu);
		logarAdmin.addActionListener(menu);
	}

	// ORIENTAÇÃO DAS AÇÕES
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == logarCliente) {
			new LoginCliente().loginCliente();
		}
		if (src == cadastrarCliente) {
			// new CadastroCliente().cadastroCliente();
		}
		if (src == logarAdmin) {
			new LoginAdmin().loginAdmin();
		}
	}

}