package exercicios_estrutura_repeticao_while;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("PASSWORD: ");
		int password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Incorrect password");
			
			System.out.print("PASSWORD: ");
			password = sc.nextInt();
		}
		
		System.out.println("Allowed Acess");
		
		sc.close();
	}

}
