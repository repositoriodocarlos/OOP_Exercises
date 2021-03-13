package controller;

public class Aeronave {
	public Piloto piloto;
	public Passageiro[] passageiros;
	public int numeroAeroNave;
	
	public Aeronave(Piloto piloto, Passageiro[] passageiros,int numeroAeroNave){
		this.piloto = piloto;
		this.passageiros = passageiros;
		this.numeroAeroNave = numeroAeroNave;
	}
	
	public void Voar(){
		piloto.pilotarAviao();
	}
}
