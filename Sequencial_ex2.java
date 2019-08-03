package Lista2;

import java.util.Scanner;

public class Sequencial_ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		float n1 = 0;
		System.out.println("Digite um numero: ");
		n1 = entrada.nextFloat();
		
		System.out.println("O numero informado foi: "+n1);

		entrada.close();
	}

}
