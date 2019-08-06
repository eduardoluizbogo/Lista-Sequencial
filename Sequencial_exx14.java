package Lista2;

import java.util.Scanner;

public class Sequencial_exx14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float ganhoh=0,horasm=0,salariobruto=0;
		
		System.out.println("Quanto voce ganha por hora? ");
		ganhoh = entrada.nextFloat();
		System.out.println("Quantas horas voce trabalha por mes? ");
		horasm = entrada.nextFloat();

		salariobruto = ganhoh * horasm;
		
		System.out.println("a: "+salariobruto);
		System.out.println("b: "+salariobruto * 0.08);
		System.out.println("c: "+salariobruto * 0.05);
		System.out.println("d: "+salariobruto * 0.76);
		System.out.println(" ");
		System.out.println("f: "+salariobruto);
		System.out.println("g: "+salariobruto * 0.11);
		System.out.println("h: "+salariobruto * 0.08);
		System.out.println("i: "+salariobruto * 0.05);
		System.out.println("j: "+salariobruto * 0.76);
		
		entrada.close();
	}

}
