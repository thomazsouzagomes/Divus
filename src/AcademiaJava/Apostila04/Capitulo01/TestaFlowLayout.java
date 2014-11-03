package AcademiaJava.Apostila04.Capitulo01;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestaFlowLayout extends JFrame{
	public TestaFlowLayout(){
		super("TITULO SWING");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(new JButton("OK"));
		panel.add(new JButton("Cancelar"));
		add(panel);
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		TestaFlowLayout t = new TestaFlowLayout();
	}

}
