package AcademiaJava.Apostila03.Capitulo04;

public class Fora {
	private String nome = "Thomaz";
	
	public class Dentro{
		private String nome = "Dentro";
		public void imprime(){
			System.out.println("Nome: " + Fora.this.nome);
			System.out.println("Nome: " + this.nome);
		}
	}

}
