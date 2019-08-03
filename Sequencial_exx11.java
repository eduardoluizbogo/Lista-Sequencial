package Lista2;

import java.util.Scanner;

public class Sequencial_exx11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float h=0,ideal=0;
		
		System.out.println("Insira a sua altura: ");
		h = entrada.nextFloat();
		
		ideal = (float) (72.7 * h - 58);
		
		System.out.println("O seu peso ideal e: "+ideal);
		
		entrada.close();
		

	}

}
