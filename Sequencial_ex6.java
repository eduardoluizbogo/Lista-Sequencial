package Lista2;

import java.util.Scanner;

public class Sequencial_ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float raio = 0, area=0;
		
		
		System.out.println("Insira o raio de um circulo: ");
		raio = entrada.nextFloat();
		
		area = (float) (3.14 * (raio * raio));
		
		System.out.println("A area do circulo e: "+area);
		
		entrada.close();

	}

}
