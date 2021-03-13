package controller;

public class Piloto extends Pessoa{
	
	public int habilitacao;
	public String categoriaHabilitacao;
	public int numeroDeVoos;
	
	public Piloto(String nome, int idade, double cpf, int habilitacao, String categoriaHabilitacao, int numeroDeVoos) {
		super(nome, idade, cpf);
		this.habilitacao = habilitacao;
		this.categoriaHabilitacao = categoriaHabilitacao;
		this.numeroDeVoos = numeroDeVoos;		
	}
	
	public void pilotarAviao(){
		System.out.println("ligando motores...");
		System.out.println("acelerando...");
		System.out.println("voando...");
		System.out.println();
	}

	

}
