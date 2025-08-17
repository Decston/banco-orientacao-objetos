package br.com.k19.testes;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Teste {
	public static void main(String[] args) {
		JFrame frame = new JFrame("K19- Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel label1 = new JLabel("Usuário: ");
		
		JTextField textField = new JTextField(20);
		
		JLabel label2 = new JLabel("Senha: ");
		
		JPasswordField passwordField = new JPasswordField(20);
		
		JButton button = new JButton("Logar");
		
		panel.add(label1);
		panel.add(textField);
		panel.add(label2);
		panel.add(passwordField);
		panel.add(button);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		frame.setContentPane(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
