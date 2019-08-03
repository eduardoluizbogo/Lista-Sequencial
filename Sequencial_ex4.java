package Lista2;

import java.util.Scanner;

public class Sequencial_ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float n1 = 0;
		System.out.println("Escreva a primeira nota: ");
		n1 = entrada.nextFloat();
		
		float n2 = 0;
		System.out.println("Escreva a segunda nota: ");
		n2 = entrada.nextFloat();
		
		float n3 = 0;
		System.out.println("Escreva a terceira nota: ");
		n3 = entrada.nextFloat();
		
		float n4 = 0;
		System.out.println("Escreva a quarta nota: ");
		n4 = entrada.nextFloat();
		
		float media = (n1+n2+n3+n4)/4;
		
		System.out.println("A media e: "+media);
		
		entrada.close();

	}

}
