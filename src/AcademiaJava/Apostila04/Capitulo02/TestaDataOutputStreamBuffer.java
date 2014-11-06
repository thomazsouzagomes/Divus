package AcademiaJava.Apostila04.Capitulo02;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestaDataOutputStreamBuffer {
	public static void main(String[] args) throws IOException {
		String msg = "O Rodolfo está FUDIDO!!!";
		double valorHora = 300d;
		String diaDaSemana = "Sexta-Feira";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream out = null;
		fos = new FileOutputStream("Dados.txt");
		bos = new BufferedOutputStream(fos,1000);
		out = new DataOutputStream(bos);
		out.writeUTF(msg);
		out.writeDouble(valorHora);
		out.writeUTF(diaDaSemana);
		out.flush();
		out.close();
	}

}

