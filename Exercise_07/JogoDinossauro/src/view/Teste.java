package view;
import java.util.Scanner;
import controller.Dinossauro;

public class Teste {

	public static void main(String[] args) {
		Dinossauro Skeep =  new Dinossauro("Skeep");
		
		boolean loop = true;
		 while(loop == true){
			 Scanner scan = new Scanner(System.in);
			 System.out.println(Skeep);
			 System.out.println("Escolha uma a??o para o " + Skeep.nome + ": \n" 
					 			 + "(P)ular \n"
					 			 + "Co(R)rer \n"
					 			 + "(C)omer \n"
					 			 + "(B)rincar\n"
					 			 + "Tomar (S)ol \n"
					 			 + "Ficar na S(o)mbra");
			 String textoMaiusculo = scan.nextLine().toUpperCase();
			 char letra = textoMaiusculo.charAt(0);
			 switch(letra){
			 	case 'P':
			 		Skeep.pular();
			 		break;
			 	case 'R':
			 		Skeep.correr();
			 		break;
			 	case 'C':
			 		Skeep.comer();
			 		break;
			 	case 'B':
			 		Skeep.brincar();
			 		break;
			 	case 'S':
			 		Skeep.tomarSol();
			 		break;
			 	case 'O':
			 		Skeep.ficarNaSombra();			 		
			 		break;			 				
			 }
			 
		 }


	}

}
