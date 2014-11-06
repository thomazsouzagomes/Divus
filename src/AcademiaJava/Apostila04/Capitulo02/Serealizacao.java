package AcademiaJava.Apostila04.Capitulo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serealizacao {
	public static void main(String[] args) throws IOException {
		Usuario u = new Usuario("Capuco", "1q2w3e");
		FileOutputStream out = new FileOutputStream("usuario.ser");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(u);
		oos.close();
	}

}
