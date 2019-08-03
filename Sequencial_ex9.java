package Lista2;

import java.util.Scanner;

public class Sequencial_ex9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float F = 0, C = 0;
		
		
		System.out.println("Insira uma temperatura em Farenheit: ");
		F = entrada.nextFloat();
		
		C = (float) (((F - 32) * 5) / 9);
		System.out.println("A temperatura em graus celsius e: "+C);
		
		entrada.close();

		
	}

}
