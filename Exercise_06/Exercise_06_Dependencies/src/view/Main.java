package view;
import controller.Aeronave;
import controller.Aeroporto;
import controller.Passageiro;
import controller.Pessoa;
import controller.Piloto;

public class Main {

	public static void main(String[] args) {
		
		Piloto p1 = new Piloto("Carlos", 20, 123456789, 3568, "J", 250);
		Piloto p2 = new Piloto("Andre", 32, 123456789, 2512, "J", 250);
		Piloto p3 = new Piloto("Camila", 45, 123456789, 2728, "k", 250);
		Piloto p4 = new Piloto("Sandra", 28, 123456789, 3012, "k", 250);
		
		Passageiro ps1 = new Passageiro("Luis", 55, 123456789, 356, 25);
		Passageiro ps2 = new Passageiro("Vania", 30, 789456123, 357, 22);
		Passageiro ps3 = new Passageiro("Luis", 55, 654789213, 225, 12);
		Passageiro ps4 = new Passageiro("Luis", 55, 753951852, 127, 33);
		
		Passageiro[] passageiros1 = new Passageiro[4];		
		passageiros1[0] = ps1;
		passageiros1[1] = ps2;
		passageiros1[2] = ps3;
		passageiros1[3] = ps4;
		
		Passageiro[] passageiros2 = new Passageiro[4];
		passageiros2[0] = ps3;
		passageiros2[1] = ps2;
		passageiros2[2] = ps4;
		passageiros2[3] = ps1;		
		
		Aeronave a1 = new Aeronave(p1, passageiros1, 12);
		Aeronave a2 = new Aeronave(p2, passageiros2, 25);
		Aeronave a3 = new Aeronave(p2, passageiros2, 16);
		Aeronave a4 = new Aeronave(p1, passageiros2, 12);
		
		Aeronave[] aeronaves1 = new Aeronave[10];
		aeronaves1[0] = a1;
		aeronaves1[1] = a2;
		
		Aeronave[] aeronaves2 = new Aeronave[10];
		aeronaves2[0] = a3;
		aeronaves2[1] = a4;		
		
		Aeroporto ae1 = new Aeroporto("Congonhas", " Av. Washington Luís, s/nº", aeronaves1);
		Aeroporto ae2 = new Aeroporto("Guarulhos", " Rod. Hélio Smidt, s/nº", aeronaves2);
		
		
		ae1.aeronaves[0].passageiros[0].colocarCintoDeSeguranca();
		ae1.aeronaves[0].passageiros[1].colocarCintoDeSeguranca();
		ae1.aeronaves[0].passageiros[2].colocarCintoDeSeguranca();
		ae1.aeronaves[0].passageiros[3].colocarCintoDeSeguranca();
		ae1.aeronaves[0].Voar();

		ae2.aeronaves[1].passageiros[0].colocarCintoDeSeguranca();
		ae2.aeronaves[1].passageiros[1].colocarCintoDeSeguranca();
		ae2.aeronaves[1].passageiros[2].colocarCintoDeSeguranca();
		ae2.aeronaves[1].passageiros[3].colocarCintoDeSeguranca();
		ae2.aeronaves[1].Voar();
		
	}

}
