package AcademiaJava.Apostila04.Capitulo01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TestaFlowLayout extends JFrame implements MouseListener{
	public JPanel montaPanelBotoes(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton btnOK = new JButton("OK");
		btnOK.addMouseListener(this);
		panel.add(btnOK);
		panel.add(new JButton("Cancelar"));
		return panel;
	}
	public TestaFlowLayout(){
		super("BOTÕES");
		JPanel panelBotoes = montaPanelBotoes();
		JPanel panelCadastro = montaPanelCadastro();
		add(panelCadastro, BorderLayout.CENTER);
		add(panelBotoes, BorderLayout.SOUTH);
		setSize(200,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public JPanel montaPanelCadastro() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,2));
		JTextField txtId = new JTextField();
		JTextField txtTel = new JTextField();
		JTextField txtNome = new JTextField();
		JTextField txtCPF = new JTextField();
		panel.add(new JLabel("ID: ", SwingConstants(CENTER_ALIGNMENT)));
		panel.add(txtId);
		panel.add(new JLabel("Telefone: ", SwingConstants(CENTER_ALIGNMENT)));
		panel.add(txtTel);
		panel.add(new JLabel("Nome: ", SwingConstants(CENTER_ALIGNMENT)));
		panel.add(txtNome);
		panel.add(new JLabel("CPF: ", SwingConstants(CENTER_ALIGNMENT)));
		panel.add(txtCPF);
		return panel;
	}
	
	private int SwingConstants(float centerAlignment) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		TestaFlowLayout t = new TestaFlowLayout();
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Clicado!!!");
		setTitle("Novo Título!!!!!!!!!!!");
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Em Cima do Botão!!!");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Saiu do Botão!!!");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Pressionado!!!");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Pressionado Sem Está Clicado!!!");
	}
}