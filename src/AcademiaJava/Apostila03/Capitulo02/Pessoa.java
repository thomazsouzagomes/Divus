package AcademiaJava.Apostila03.Capitulo02;

public class Pessoa {
	Integer id;
	String nome, cpf, tel;
			
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Contrutor
	public Pessoa(Integer id, String nome, String cpf, String tel) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
	}

	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(this == o){
			return true;
		}
		if(o instanceof Pessoa){
			Pessoa outra =(Pessoa) o;
			if(this.getCpf() == null){
				if(outra.getCpf() == null){
					return false;
				}				
			}
			return this.getId().equals(outra.getId());
		}else{
			return false;
		}
	}

}
