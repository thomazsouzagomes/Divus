package AcademiaJava.Apostila04.Capitulo02;

import java.io.FileInputStream;
import java.io.IOException;

public class TestaFileInputStream {
	public static void main(String[] args) throws IOException{
		FileInputStream input = null;
		input = new FileInputStream ("Dados.txt");
		int leitura = input.read();
		while (leitura != -1){
			System.out.println(leitura);
			leitura = input.read();
		}
		input.close();
	}

}
