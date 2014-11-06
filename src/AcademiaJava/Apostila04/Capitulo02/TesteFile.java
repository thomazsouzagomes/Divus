package AcademiaJava.Apostila04.Capitulo02;

import java.io.File;
import java.io.IOException;

public class TesteFile {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\pastawwww");
		System.out.println(dir.isDirectory()); //verifica se � diretorio 
		System.out.println(dir.isFile()); //verifica se � diretorio arquivo
		System.out.println(dir.canRead()); // Se tem permiss�o de leitura
		System.out.println(dir.canWrite()); // Se tem permiss�o de escritta
		System.out.println(dir.isHidden()); // Se � oculto
		String[] list = dir.list(); // Lista os arquivos ou diretoria que se encontra na raiz
		if(dir.exists()){
			for (String aux : list){
				System.out.println(aux);
			}
		}			
		dir.mkdir();
		File arq = new File (dir,"teste.txt");
		System.out.println(arq.createNewFile());
	}

}
