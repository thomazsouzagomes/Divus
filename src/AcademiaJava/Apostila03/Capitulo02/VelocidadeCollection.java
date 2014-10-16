package AcademiaJava.Apostila03.Capitulo02;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VelocidadeCollection {
	public static void main(String[] args) {
		Long inicio = System.currentTimeMillis();
		List lista = new ArrayList();
		Set set = new HashSet();
		for(int i=0;i<30000;i++){
			//lista.add(i);
			set.add(i);
		}
				
		for(int i=0;i<30000;i++){
			//lista.contains(i);
			set.contains(i);
		}

		Long fim = System.currentTimeMillis();
		System.out.println(fim - inicio + "ms");
		
	}

}
