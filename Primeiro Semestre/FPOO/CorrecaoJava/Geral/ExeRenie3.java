package correcao;

import java.util.Random;
import java.util.Scanner;

public class ExeRenie3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int menu = 0;
		while (menu != 3) {
			System.out.println("Escolha uma opcao:\n[1]ExercicioMatrix.\t[2]ExercicioAluno.\t[3]Exit.");
			menu = leia.nextInt();
			switch (menu) {
			case 1:

				Random rand = new Random();
				int numeros[][] = new int[5][5];
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						numeros[i][j] = rand.nextInt(100);
					}
				}
				MostrarMatrix(numeros);
				MostrarImparMaior(numeros);
				MostrarImparMenor(numeros);
				MostrarParMaior(numeros);
				MostrarParMenor(numeros);
				MostrarParMedia(numeros);
				MostrarImparMedia(numeros);
				System.out.println("");

				break;
			case 2:
				System.out.print("Digite quantos alunos deseja cadastrar(max:10):");
				int qtd = leia.nextInt();
				String aluno[] = new String[qtd];
				int nota1[] = new int[qtd];
				int nota2[] = new int[qtd];
				int nota3[] = new int[qtd];
				int media[] = new int[qtd];
				
				for(int i = 0; i < aluno.length; i++) {
					System.out.println("Digite o nome do aluno: ");
					aluno[i] = leia.next();
					System.out.println("Primeira nota do aluno: ");
					nota1[i] = leia.nextInt();
					System.out.println("Segunda nota do aluno: ");
					nota2[i] = leia.nextInt();
					System.out.println("Terceira nota do aluno: ");
					nota3[i] = leia.nextInt();
				}
		      for(int j = 0; j < aluno.length;j++) {
		    	  nota1[j] /= 5;
		    	  nota2[j] /= 3;
		    	  nota3[j] /= 2;
		    	  media[j] = (nota1[j] + nota2[j] + nota3[j])/3;
		      }
		      for(int b = 0; b < aluno.length;b++) {
		    	  System.out.println("A media do aluno " + aluno[b] + " � " + media[b]);
		    	  if(media[b] >= 6) {
		    		  System.out.println("Aluno aprovado!");
		    	  }else {
		    		  System.out.println("Aluno reprovado!");
		    	  }
		      }
			System.out.println("");
				break;
			default:
				break;
			}
		}
	}

	public static void MostrarMatrix(int numeros[][]) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void MostrarImparMaior(int numeros[][]) {
		int maior[] = new int[1];
		int acu[] = new int[1];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				acu[0] = numeros[i][j] % 2;

				if (acu[0] == 1) {
					if (maior[0] < numeros[i][j]) {
						maior[0] = numeros[i][j];

					}

				}

			}

		}
		System.out.println("O maior impar: " + maior[0]);
	}

	public static void MostrarImparMenor(int numeros[][]) {
		int menor[] = new int[1];
		int acu[] = new int[1];
		menor[0] = 99;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				acu[0] = numeros[i][j] % 2;

				if (acu[0] == 1) {
					if (menor[0] > numeros[i][j]) {
						menor[0] = numeros[i][j];

					}

				}

			}

		}
		System.out.println("O menor impar: " + menor[0]);
	}

	public static void MostrarParMaior(int numeros[][]) {
		int maior[] = new int[1];
		int acu[] = new int[1];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				acu[0] = numeros[i][j] % 2;

				if (acu[0] == 0) {
					if (maior[0] < numeros[i][j]) {
						maior[0] = numeros[i][j];
					}

				}

			}

		}
		System.out.println("O maior par: " + maior[0]);

	}

	public static void MostrarParMenor(int numeros[][]) {
		int menor[] = new int[1];
		int acu[] = new int[1];
		menor[0] = 100;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				acu[0] = numeros[i][j] % 2;

				if (acu[0] == 0) {
					if (menor[0] > numeros[i][j]) {
						menor[0] = numeros[i][j];
					}

				}

			}

		}
		System.out.println("O menor par: " + menor[0]);
		System.out.println(" ");
	}

	public static void MostrarParMedia(int numeros[][]) {

		int acu[] = new int[1];
		int acu2[] = new int[1];
		int media = 0;
		System.out.println("Numeros pares: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				acu[0] = numeros[i][j] % 2;

				if (acu[0] == 0) {
					acu2[0] += numeros[i][j];
					media++;
					System.out.print(numeros[i][j] + " ");
				}

			}

		}
		acu2[0] = acu2[0] / media;
		System.out.println(" ");
		System.out.println("A media entre os pares: " + acu2[0]);
		System.out.println(" ");
	}

	public static void MostrarImparMedia(int numeros[][]) {

		int acu[] = new int[1];
		int acu2[] = new int[1];
		int media = 0;
		System.out.println("Numeros impares: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				acu[0] = numeros[i][j] % 2;

				if (acu[0] == 1) {
					acu2[0] += numeros[i][j];
					media++;
					System.out.print(numeros[i][j] + " ");
				}

			}
		}
		acu2[0] = acu2[0] / media;
		System.out.println(" ");
		System.out.println("A media entre os impares: " + acu2[0]);
	}
}
