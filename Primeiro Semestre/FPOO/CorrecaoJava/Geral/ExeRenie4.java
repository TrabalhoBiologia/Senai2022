package correcao;

import java.util.Random;
import java.util.Scanner;

public class ExeRenie4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String aluno[][] = new String[3][4];
		String matricula[][] = new String[4][3];
		int nota[][] = new int [3][4];
		
		int menu = 0;
		while (menu != 4) {
			System.out.println("Escolha uma opcao:\n[1]Cadastrar um novo aluno (M�x. 10).\t[2]Buscar aluno por matr�cula e nome.\t[3]Aluno reprovado ou aprovado.\t[4]Exit.");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
			  
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 4; j++) {
						System.out.print("Nome do aluno: ");
						aluno[i][j] = leia.next();
						System.out.print("matricula do aluno: ");
						matricula[i][j] = leia.next();
						
						
					}
					
				}
				for(int b = 0; b < 3; b++) {
				   for(int c = 0; c < 4;c ++) {
					   System.out.print("Digite a nota do aluno " + aluno[b][c]);
				   }
			    }	
				break;
			case 2:

				break;
			case 3:
				System.out.println("Obrigado por usar nossos sistemas! :)");
				break;
			default:
				System.out.println("Tente novamente!");
				break;
			}
		}
	}
}
