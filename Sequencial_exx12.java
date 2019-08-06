package Lista2;

import java.util.Scanner;

public class Sequencial_exx12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float h=0,idealh=0,idealm=0;
		String sexo= " ";
		
		System.out.println("Insira a sua altura: ");
		h = entrada.nextFloat();
		
		entrada.nextLine();
		
		System.out.println("Voce e homem ou mulher?");
		sexo = entrada.nextLine();
		
		if(sexo == "homem" ) {
			idealh = (float) (72.7 * h - 58);
			System.out.println("O seu peso ideal e: "+idealh);
		}
		else if(sexo == "mulher") {
			idealm = (float) (62.1 * h - 44.7);
		System.out.println("O seu peso ideal e: "+idealm);
		}
		else {
			System.out.println("Voce digitou uma resposta invalida");
		}
		
		entrada.close();

	}

}
