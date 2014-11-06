package AcademiaJava.Apostila04.Capitulo02;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestaDataOutputStream {
	public static void main(String[] args) throws IOException {
		String msg = "O Rodolfo está FUDIDO!!!";
		double valorHora = 300d;
		String diaDaSemana = "Sexta-Feira";
		DataOutputStream out = null;
		FileOutputStream fos = null;
		fos = new FileOutputStream("Dados.txt");
		out = new DataOutputStream(fos);
		out.writeUTF(msg);
		out.writeDouble(valorHora);
		out.writeUTF(diaDaSemana);
		out.close();
	}

}
