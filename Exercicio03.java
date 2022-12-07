package exercicios_estrutura_repeticao_while;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcohol = 0;
		int gasoline = 0; 
		int diesel = 0;
		
		System.out.println("FUEL\n"
				+ "1.Alcohol\n"
				+ "2.Gasoline\n"
				+ "3.Diesel\n"
				+ "4.Break\n");
		System.out.print("What is your fuel preference: ");
		int cod = sc.nextInt();
		
		while(cod != 4) {
			if (cod == 1) {
				alcohol += 1;
			}
			else if (cod == 2) {
				gasoline += 1;
			}
			else if (cod == 3) {
				diesel += 1;
			}
			else {
				System.out.println("This code does not exist!!!");
				System.out.println();
			}
			
			System.out.print("What is your fuel preference: ");
			cod = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("Thank you, for your preference");
		System.out.println("Alcohol: "+ alcohol);
		System.out.println("Gasoline: "+ gasoline);
		System.out.println("Diesel: "+ diesel);
		
		
		sc.close();
	}

}
