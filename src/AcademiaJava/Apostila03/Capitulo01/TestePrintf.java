package AcademiaJava.Apostila03.Capitulo01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */


import java.util.Date;

public class TestePrintf {

	public static void main(String[] args) {

		// Mostre a data no formato dd/mm/yyyy
		Date data = new Date();
		System.out.printf("", data);

		// Mostre o numero inteiro com 6 digitos e zeros a esquerda
		int i = 101;
		System.out.printf("", i);

		// Mostre o numero double com 2 casas decimais
		double numero = 23.45;
		System.out.printf("", numero);
	}
}
