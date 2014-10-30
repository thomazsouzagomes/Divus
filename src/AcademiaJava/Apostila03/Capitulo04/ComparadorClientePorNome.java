package AcademiaJava.Apostila03.Capitulo04;

import java.util.Comparator;

public class ComparadorClientePorNome implements Comparator<Cliente>{

	@Override
	public int compare(Cliente c1, Cliente c2) {
		return c1.getNome().compareTo(c2.getNome());
	}

}
