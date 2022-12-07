package exercicios_estrutura_repeticao_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input X value: ");
		double x = sc.nextDouble();
		System.out.print("Input Y value: ");
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			System.out.println();
			if (x > 0 && y > 0) {
				System.out.println("First quadrant");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Second quadrant");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Third quadrant");
			}
			else {
				System.out.println("Fourth quadrant");
			}
			
			System.out.println();
			System.out.print("Input X value: ");
			x = sc.nextDouble();
			System.out.print("Input Y value: ");
			y = sc.nextDouble();
				
		}
		
		
		
		sc.close();
	}

}
