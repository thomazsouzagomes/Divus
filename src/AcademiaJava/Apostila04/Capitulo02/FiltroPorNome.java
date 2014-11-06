package AcademiaJava.Apostila04.Capitulo02;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroPorNome implements FilenameFilter{
	private String extensao;
	public FiltroPorNome(String ext){
		this.extensao = ext;
	}
	public boolean accept(File dir, String name){
		return name.endsWith(extensao);
	}
	
}
