package AcademiaJava.Apostila04.Capitulo02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestaDataInputStreamBuffer {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("Dados.txt");
		BufferedInputStream buffer = new BufferedInputStream(file);
		DataInputStream input = new DataInputStream(buffer);
		String msg = input.readUTF();
		double num = input.readDouble();
		String dia = input.readUTF();
		System.out.println(msg + " " + num + " " + dia);
		input.close();
	}

}