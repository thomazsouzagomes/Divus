package AcademiaJava.Apostila04.Capitulo01;

import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestaJanela2 extends JFrame{
	public TestaJanela2(){
		super("TITULO SWING");
//		setLayout(null);
		setSize(200,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// DISPOSE_ON_CLOSE para feichar janelas internas		
//		JLabel l = new JLabel("Label Feio");
		JButton btnOK = new JButton ("OK");
//		btnOK.setVerticalAlignment(20);
//		btnOK.setHorizontalAlignment(50);
		btnOK.setSize(100, 50);
		btnOK.setMnemonic(KeyEvent.VK_O);
		JTextField campo = new JTextField("Insira o Valor: ");
//		add(campo);
		JComboBox combo = new JComboBox();
		combo.addItem("Lindo");
		combo.addItem("Bonitão");
		combo.addItem("top");
		add(combo);
		setSize(200,100);
		setVisible(true);
		//add(l);
		setVisible(true);
	}
	public static void main(String[] args) {
		TestaJanela2 t = new TestaJanela2();
	}

}
