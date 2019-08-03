package Lista2;

import java.util.Scanner;

public class Sequencial_ex8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float hora = 0,ganho = 0,total = 0;
		
		System.out.println("Quanto voce ganha por hora? ");
		ganho = entrada.nextFloat();
		
		System.out.println("Quantas horas voce trabalha por mes? ");
		hora = entrada.nextFloat();
		
		total = ganho * hora;
		
		System.out.println("O seu salario e: "+total);
		
		entrada.close();
	}

}
