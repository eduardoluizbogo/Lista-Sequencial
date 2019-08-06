package Lista2;

import java.util.Scanner;

public class Sequencial_exx13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float peso=0,excesso=0;
		
		System.out.println("Insira o peso dos peixes: ");
		peso = entrada.nextInt();

		if(peso > 50)
			excesso = peso - 50;
		else
			excesso = 0;
		
		float multa = excesso * 4;
		
		System.out.println("O peso dos peixes foi: "+peso+", O excesso foi: "
		+excesso+", e a multa e: "+multa);
		
		entrada.close();
	}

}
