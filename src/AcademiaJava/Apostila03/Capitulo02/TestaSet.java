package AcademiaJava.Apostila03.Capitulo02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestaSet {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		
		set.add("Ana");
		set.add("Wanessa");
		set.add("Bruna");
		set.add("Wanessa");
		set.add("Ana");
		set.add("Ana");
		for(Object obj : set){
			System.out.println(obj);
		}	
		
	}

}
