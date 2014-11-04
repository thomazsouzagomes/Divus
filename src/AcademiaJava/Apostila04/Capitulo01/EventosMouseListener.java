package AcademiaJava.Apostila04.Capitulo01;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Clicado!!!");
		
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
