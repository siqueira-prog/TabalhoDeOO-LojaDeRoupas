package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.Home;
import view.Home2;

public class ControleHome {
	private final Home view;

	public ControleHome(Home view) {
		super();
		this.view = view;
	}

	public void executarBotao(ActionEvent e) {
		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getBotao2()) {
			new Home2().setVisible(true);
			this.view.setVisible(false);
		} else {
			String textoLido = view.getFieldTexto().getText(); // Vai pegar o texto dentro do TextField
			System.out.println(textoLido);
		}
	}

	private void printOlaMundo() {
		System.out.println("Olá Mundo");
	}

	public Home getView() {
		return view;
	}
}
