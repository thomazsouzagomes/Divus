package AcademiaJava.Apostila04.Capitulo01;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestaJanela extends JFrame{
	public TestaJanela(){
		super("TITULO SWING");
		setLayout(null);
		setSize(200,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// DISPOSE_ON_CLOSE para feichar janelas internas		
		//JLabel l = new JLabel("Label Feio");
		JButton btnOK = new JButton ("OK");
//		btnOK.setVerticalAlignment(20);
//		btnOK.setHorizontalAlignment(50);
		btnOK.setSize(100, 50);
		btnOK.setMnemonic(KeyEvent.VK_O);
		JTextField txtField = new JTextField("Digite seu Nome: ");
		add(txtField);
//		add(btnOK);
		//add(l);
		setVisible(true);
	}
	public static void main(String[] args) {
		TestaJanela t = new TestaJanela();
	}

}
