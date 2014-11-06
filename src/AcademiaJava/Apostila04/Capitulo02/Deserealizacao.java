package AcademiaJava.Apostila04.Capitulo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserealizacao {
	public static void main(String[] args) throws IOException, Exception {
		FileInputStream input = new FileInputStream("usuario.ser");
		ObjectInputStream ois = new ObjectInputStream(input);
		Usuario u = (Usuario) ois.readObject();
		System.out.println(u.getNome());
		System.out.println(u.getSenha());
		
	}

}
