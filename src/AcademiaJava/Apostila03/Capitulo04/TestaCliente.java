package AcademiaJava.Apostila03.Capitulo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestaCliente {
	public static void main(String[] args) {
		List<Cliente> listaCliente = new ArrayList<>();
		listaCliente.add(new Cliente(1, "999", "Thomaz", "111"));
		listaCliente.add(new Cliente(2, "888", "Souza", "222"));
		listaCliente.add(new Cliente(3, "777", "Gomes", "333"));
		
//		Organiza o nome da lista por ordem alfabética
		Collections.sort(listaCliente,new Comparator<Cliente>(){
			
			public int compare(Cliente c1, Cliente c2) {
				return c1.getNome().compareTo(c2.getNome());
			}
			
		});
		
		imprimeClientes(listaCliente);
		
		List<Pessoa> listaPessoa = new ArrayList<>();
		listaPessoa.add(new Pessoa(4,"5555"));
		imprimePessoa(listaPessoa);
		imprimeGeral(listaPessoa);
		
//		Set <Cliente> listaSet = new TreeSet<>(new ComparadorClientePorNome());
		Set <Cliente> listaSet = new TreeSet<>(new Comparator<Cliente>(){
			
			public int compare(Cliente c1, Cliente c2) {
				return c1.getNome().compareTo(c2.getNome());
			}
			
		});
		
		listaSet.add(new Cliente(1, "999", "Thomaz", "161"));
		listaSet.add(new Cliente(2, "888", "Souza", "222"));
		listaSet.add(new Cliente(3, "777", "Gomes", "133"));
		for(Cliente aux : listaSet){
			System.out.println(aux.getNome()+" "+aux.getCpf());
		}
		
		
		
	}

	private static void imprimeClientes(List<Cliente> listaCliente) {
		for(Cliente aux : listaCliente){
			System.out.println(aux.getNome());
		}
	}
	
	private static void imprimePessoa(List<Pessoa> listaPessoa) {
		for(Pessoa aux : listaPessoa){
			System.out.println(aux.getTel());
		}
	}
	
	private static void imprimeGeral(List<?> lista){
		for(Object o : lista){
			System.out.println(o);
		}
	}
	
	
}
