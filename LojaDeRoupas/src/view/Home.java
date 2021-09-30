package view;

//Imports

import java.awt.event.ActionEvent;

import controller.ControleHome;

//Main Class

public class Home extends Template {
	private final ControleHome controller;

	public Home() {
		super("Home");
		this.controller = new ControleHome(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executarBotao(e);
	}

}
