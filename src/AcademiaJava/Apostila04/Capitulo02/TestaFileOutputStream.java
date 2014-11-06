	package AcademiaJava.Apostila04.Capitulo02;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestaFileOutputStream {
	public static void main(String[] args) {		
		MetodoFileOutputStream();
	}

	private static void MetodoFileOutputStream() {
		byte[] b= {65, 66, 67};
		FileOutputStream fi = null;
		try{
			fi = new FileOutputStream("Dados.txt", true);
			for (byte aux : b){
				fi.write(aux);
			}
			fi.close();
		}catch(IOException e){
		
		}finally{

		}
	}
}
