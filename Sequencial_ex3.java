package Lista2;

import java.util.Scanner;

public class Sequencial_ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float soma = 0;
		
		float num1 = 0;
		System.out.println("Escreva um numero : ");
		num1 = entrada.nextFloat();
		
		float num2 = 0;
		System.out.println("Escreva outro numero : ");
		num2 = entrada.nextFloat();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos dois numeros e: "+soma);
		
		entrada.close();
		
	}

}
