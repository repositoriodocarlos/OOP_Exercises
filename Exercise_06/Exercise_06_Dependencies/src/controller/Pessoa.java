package controller;

public class Pessoa {
	public String nome;
	public int idade;
	public double cpf;
	
	public Pessoa(String nome, int idade, double cpf){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	@Override
	public String toString(){
		return "Nome: "
				+ nome
				+" Idade: "
				+idade
				+" CPF:";
	}
}
