package br.com.cliente.model;

public class Cliente {

	private int id;
	private String nome;
	private String sobrenome;
	private int idade;
	private String telefone;

	public Cliente() {
		
	}
	
	public int getId() {
		return this.id;		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return this.idade;
	}	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}		
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNomeSobrenome(){
		
		String nomeCompleto = "";
		
		if (!this.nome.equals("") && !this.sobrenome.equals("")) {
			nomeCompleto = this.nome + " " + this.sobrenome;
		}
		return nomeCompleto;
	}
	
	public Cliente(int id, String nome, String sobreNome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobreNome;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Sobrenome: " + 
				this.sobrenome + " Idade: " + this.idade + " Telefone: " + this.telefone;
	}
}
