package controller;

public class Aeroporto {
	
	public String nome;	
	public String endereco;
	public Aeronave[] aeronaves;
	
	public Aeroporto(String nome, String endereco, Aeronave[] aeronaves){
		this.nome = nome;
		this.endereco = endereco;
		this.aeronaves = aeronaves;
	}
	
	

}
