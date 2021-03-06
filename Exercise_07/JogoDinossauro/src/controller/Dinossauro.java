package controller;

public class Dinossauro {
	public String nome;
	private int energia;
	private int velocidade;
	private int temperatura;
	private int humor;
	
	public Dinossauro(String nome){
		this.nome = nome;
		energia = 5;
		humor = 5;		
	}
	
	public void pular(){
		energia--;
		humor++;
		System.out.println("\n O dinossauro " 
				+ nome 
				+ "est? pulando. \n");		
	}
	
	public void correr(){
		energia--;
		humor++;
		System.out.println("\n O dinossauro " 
							+ nome 
							+ "est? correndo. \n");
	}
	
	public void comer(){
		energia++;
		humor++;
		System.out.println("\n O dinossauro " 
							+ nome 
							+ " acaba de comer, ganhou energia e est? mais feliz. \n");		
	}
	
	public void brincar(){
		energia--;
		humor++;
		System.out.println("\n O dinossauro " 
				+ nome 
				+ " est? brincando, portanto est? mais feliz.\n");		
	}
	
	public void tomarSol(){
			humor ++;		
			velocidade ++;
			energia--;
			System.out.println("\n O dinossauro "
								+ nome
								+ " est? um pouco mais feliz e mais veloz!\n");
	}
	
	public void ficarNaSombra(){		
		energia++;
		humor--;
		System.out.println("\n O dinossauro " 
							+ nome
							+ " est? descansando na sombra.\n");
	}
	
	@Override
	public String toString(){
		return "Dinossauro " + nome +": \n"
				+ "energia: " + energia +": \n"
				+ "velocidade: " + velocidade +": \n"
				+ "temperatura: " + temperatura +": \n"
				+ "humor: " + humor +": \n";
	}
	

}
