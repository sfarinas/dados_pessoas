package arranjoDadosPessoas;

import java.util.Scanner;

public class dadosPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas : ");
		int n = sc.nextInt();
		double maiorAlt = 0;
		double menorAlt = 100.0;
		double soma = 0;
		int numHomem = 0;
		double media;
		int numeroMulheres = 0;
		
		char[] sexo = new char[n];
		double[] altura = new double[n];
		
		for (int i = 0; i < sexo.length; i++) {
			System.out.println("Digite o genero da pessoa : ");
			sexo[i] = sc.next().toUpperCase().charAt(0);
			System.out.println("Atura da pessoa : ");
			altura[i] = sc.nextDouble();sc.nextLine();
			
			if (altura[i] < menorAlt) {
				menorAlt = altura[i];	
			} 
			
			for (int j = 0; j < altura.length; j++) {
				if (altura[j] > maiorAlt) {
					maiorAlt = altura[i];
				}
			}	
		}
		
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 'F') {
				numeroMulheres ++;
				soma += altura[i];
			}else {
				numHomem ++;
			}
		}
		
		media = soma / numeroMulheres;
		
		System.out.println("Menor Altura : " + menorAlt);
		System.out.println("Maior Altura : " + maiorAlt);
		System.out.println("Media das mulheres : " + media);
		System.out.println("Numero de homens : " + numHomem);
		
		sc.close();
	}
}
