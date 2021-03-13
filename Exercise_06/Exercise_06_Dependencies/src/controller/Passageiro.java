package controller;

public class Passageiro extends Pessoa{
	
	public int passagem;
	public int assento;
	public boolean estadoDoCintoDeSeguranca;
	
	public Passageiro(String nome, int idade, double cpf, int passagem, int assento) {
		super(nome, idade, cpf);
		this.passagem = passagem;
		this.assento = assento;
	}
	
	public void colocarCintoDeSeguranca(){
		estadoDoCintoDeSeguranca = true;
		System.out.println("Cinto de segurança do passageiro assento: "+ assento + " OK!");
	}


}
