package AcademiaJava.Apostila03.Capitulo02;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
	public static void main(String[] args) {
		//Com Contrutor
		Pessoa p = new Pessoa(11, "Simone", "111111", "8199-8066");
//		p.setNome("thomaz");
//		p.setCpf("1111111");
//		p.setId(11);
		
		Pessoa p1 = new Pessoa(22, "Adriana", "222222", "3642-1822");
		Pessoa p2 = new Pessoa(33, "Tereza", "333333", null);
		
		List arr = new ArrayList();
		arr.add(p);arr.add(p1);arr.add(p2);
//		int aux = 0;
//		for(Object obj : arr){
//			if(((Pessoa)obj).getTel() == null){
//				arr.remove(obj);
//			}
//			aux++;
//		}
		
		Iterator i = arr.iterator();
		System.out.println(arr.size());
		while(i.hasNext()){
			Pessoa p6 = (Pessoa) i.next();
			if(p6.getTel() == null){
				i.remove();
			}
		}
		System.out.println(arr.size());
		//Sem Construtor
//		Pessoa p1 = new Pessoa();
//		p1.setNome("gostoso");
//		p1.setCpf("2222222");
//		p1.setId(11);
//		
//		System.out.println(p.equals(p1));
//		
//		Scanner t = new Scanner(System.in);
//		List array = new ArrayList();
//		for(int i=0; i<3;i++){
//			System.out.println("Digite um id, Nome e CPF: ");
//			Pessoa p4 = new Pessoa(t.nextInt(), t.nextLine(), t.nextLine());
//			array.add(p4);
//		}
//		
//		for(int i=0; i<array.size();i++){
////			System.out.println(array.get(i).toString());
//			Pessoa p5 = (Pessoa) array.get(i);
//			System.out.println(p5.getNome());
//			System.out.println(p5.getId());
//			System.out.println(p5.getCpf());
//		}
		
		
	}

}

