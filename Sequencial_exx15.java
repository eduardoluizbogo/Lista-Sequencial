package Lista2;

import java.util.Scanner;

public class Sequencial_exx15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float tamanhoarea=0,litro=0,lata=0;
		
		System.out.println("Qual e o tamanho da area em metros quadrados? ");
		tamanhoarea = entrada.nextFloat();
		
		
		litro = tamanhoarea / 3;
		lata = litro / 18;
		
		System.out.println("A quantidade de latas de tinta e: "+Math.ceil(lata));
		System.out.println("O custo vai ser: "+Math.ceil(lata) * 80);
		
		entrada.close();
	}

}
