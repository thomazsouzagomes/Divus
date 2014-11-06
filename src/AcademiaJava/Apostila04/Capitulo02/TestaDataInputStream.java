package AcademiaJava.Apostila04.Capitulo02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestaDataInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("Dados.txt");
		DataInputStream input = new DataInputStream(file);
		String msg = input.readUTF();
		double num = input.readDouble();
		String dia = input.readUTF();
		System.out.println(msg + " " + num + " " + dia);
		input.close();
	}

}