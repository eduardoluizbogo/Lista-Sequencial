package Lista2;

import java.util.Scanner;

public class Sequencial_exx16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float tamanhoarea=0,litro=0,lata=0,galao=0;
		
		System.out.println("Qual e o tamanho da area em metros quadrados? ");
		tamanhoarea = entrada.nextFloat();
		
		
		litro = tamanhoarea / 6;
		lata = litro / 18;
		galao = (float) (litro / 3.6);	
		
		System.out.println("Comprando apenas latas de tinta de 18L e: "+Math.ceil(lata)+"L");
		System.out.println("O custo vai ser: "+Math.ceil(lata) * 80);
		
		System.out.println("Comprando apenas galao de tinta de 3,6L e: "+Math.ceil(galao)+"L");
		System.out.println("O custo vai ser: "+Math.ceil(galao) * 25);

		entrada.close();
	}

}
