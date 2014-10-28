package AcademiaJava.Apostila03.Capitulo02;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestaMap {

	public static void main(String[] args) {

		  double nota[] = { 5.5, 3.4, 2.1, 3.8, 6.2, 3.7 };
		  int mes[] = { 1, 2, 3, 4, 5, 6 };

		  Map<Integer, Double> mesNota = new LinkedHashMap();

		  for (int i = 0; i < mes.length; i++) {
		   mesNota.put(mes[i], nota[i]);
		  }

		  System.out.println(mesNota.get(3));
		  
		  //Pelo Iterator "O Acesso é em tempo Real"
		  Set<Integer> key = mesNota.keySet();
		  Iterator<Integer> i = key.iterator();
		  while(i.hasNext()){
			  System.out.println(mesNota.get(i.next()));
		  }
		  
		  System.out.println("");
		  
		  //Pelo ForIt
		  for(Integer key2 : mesNota.keySet()){
			  System.out.println(mesNota.get(key2));
		  }
		  
	}

}
