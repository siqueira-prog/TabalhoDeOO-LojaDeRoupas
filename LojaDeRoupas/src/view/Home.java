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
	private static JLabel titulo = new JLabel("Menu principal");
	private static JLabel texto = new JLabel("OU");	
	   
    // KONG TEAM T-SHIRTs
    private static JLabel K = new JLabel("K");
    private static JLabel O = new JLabel("O");
    private static JLabel N = new JLabel("N");
    private static JLabel G = new JLabel("G");
    
    private static JLabel T = new JLabel("T");
    private static JLabel E = new JLabel("E");
    private static JLabel A = new JLabel("A");
    private static JLabel M = new JLabel("M");
    private static JLabel tshirt = new JLabel("T-SHIRTs");
    
	// Conteúdo
	private static JButton logarCliente = new JButton("Logar como cliente");
	private static JButton logarAdmin = new JButton("Logar como administrador");
	private static JButton cadastrarCliente = new JButton("Cadastrar como cliente");

	// CONSTRUTOR
	public Home() {
			
		// KONG TEAM T-SHIRT
        K.setBounds(50, 50, 100, 100);
        K.setFont(new Font("Algerian", Font.BOLD, 100));
        K.setForeground(Color.BLACK);
        
        O.setBounds(50, 150, 100, 100);
        O.setFont(new Font("Algerian", Font.BOLD, 100));
        O.setForeground(Color.BLACK);
        
        N.setBounds(50, 250, 100, 100);
        N.setFont(new Font("Algerian", Font.BOLD, 100));
        N.setForeground(Color.BLACK);
        
        G.setBounds(50, 350, 100, 100);
        G.setFont(new Font("Algerian", Font.BOLD, 100));
        G.setForeground(Color.BLACK);
        
        T.setBounds(600, 50, 100, 100);
        T.setFont(new Font("Algerian", Font.BOLD, 100));
        T.setForeground(Color.BLACK);
        
        E.setBounds(600, 150, 100, 100);
        E.setFont(new Font("Algerian", Font.BOLD, 100));
        E.setForeground(Color.BLACK);
        
        A.setBounds(600, 250, 100, 100);
        A.setFont(new Font("Algerian", Font.BOLD, 100));
        A.setForeground(Color.BLACK);
        
        M.setBounds(600, 350, 100, 100);
        M.setFont(new Font("Algerian", Font.BOLD, 100));
        M.setForeground(Color.BLACK);

    	tshirt.setBounds(200, 400, 400, 80);
    	tshirt.setFont(new Font("Chiller", Font.BOLD, 80));
    	tshirt.setForeground(new Color(212,175,55));
		
    	titulo.setFont(new Font("Algerian", Font.BOLD, 50));   
		titulo.setBounds(170, 50,600, 50);
		
		texto.setFont(new Font("Algerian", Font.BOLD, 20));
		
		logarCliente.setBounds(200, 150, 350, 50);
		logarCliente.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
		logarCliente.setFont(new Font("Algerian", Font.BOLD, 20));
		logarCliente.setBackground(Color.BLACK);
		logarCliente.setForeground(Color.WHITE);
		
		logarAdmin.setBounds(200, 215, 350, 50);
		logarAdmin.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
		logarAdmin.setFont(new Font("Algerian", Font.BOLD, 20));
		logarAdmin.setBackground(Color.BLACK);
		logarAdmin.setForeground(Color.WHITE);
		
		texto.setBounds(370, 275, 200, 30);
		
		cadastrarCliente.setBounds(200, 315, 350, 50);
		cadastrarCliente.setBorder(BorderFactory.createLineBorder(new Color(212,175,55), 4));
		cadastrarCliente.setFont(new Font("Algerian", Font.BOLD, 20));
		cadastrarCliente.setBackground(Color.BLACK);
		cadastrarCliente.setForeground(Color.WHITE);
		
		janela.setLayout(null);

		// Adicionando elementos
        janela.add(K);
        janela.add(O);
        janela.add(N);
        janela.add(G);
        janela.add(T);
        janela.add(E);
        janela.add(A);
        janela.add(M);
        janela.add(tshirt);
        
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
			janela.dispose();
		}
		if (src == cadastrarCliente) {
		   new CadastroCliente().cadastrarCliente();
		   janela.dispose();
		}
		if (src == logarAdmin) {
			janela.dispose();
			new LoginAdmin().loginAdmin();
		}
	}

	
	
}

