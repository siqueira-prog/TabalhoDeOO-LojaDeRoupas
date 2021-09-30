package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class ExemploEvento implements ActionListener {
   private static JFrame f;
   private static JButton b;

   public ExemploEvento() {
      f = new JFrame("Exemplo de Evento");
      b = new JButton("Clique aqui!");
      f.setSize(300, 100);
      b.setBounds(80, 10, 120, 30);
      f.setLayout(null);
      f.add(b);
      f.setVisible(true);
   }

   public static void main(final String args[]) {
      ExemploEvento exemplo = new ExemploEvento();
      b.addActionListener(exemplo);
   }

   public void actionPerformed(ActionEvent e) {
      System.out.println("O botão foi clicado!");
   }
}