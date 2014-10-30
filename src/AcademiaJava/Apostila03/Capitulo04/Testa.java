package AcademiaJava.Apostila03.Capitulo04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Testa {
	public static void main(String[] args) {
		Fora.Dentro in1 = new Fora().new Dentro();
		Fora f= new Fora();
		Fora.Dentro in2 = f.new Dentro();
//		Usar o in1 ou in2
		in1.imprime();
		
		Imprimivel imp = new Imprimivel() {
			
			public void imprimir() {
				System.out.println("Imprimidddddddddddd");
			}
		};
		
		imp.imprimir();
		
	}

}
