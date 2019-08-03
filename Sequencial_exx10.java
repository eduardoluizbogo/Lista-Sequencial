package Lista2;

import java.util.Scanner;

public class Sequencial_exx10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1=0,n2=0;
		float n3=0,a=0,b=0,c=0;
		
		System.out.println("Insira um numero inteiro: ");
		n1 = entrada.nextInt();
		
		System.out.println("Insira outro numero inteiro: ");
		n2 = entrada.nextInt();
		
		System.out.println("Insira um numero real: ");
		n3 = entrada.nextInt();

		a = (float) ((float) (2*n1) * (0.5 * n2));
		System.out.println("O resultado de a e: "+ a);
		b = (float) (3 * n1) + n3;
		System.out.println("O resultado de b e: "+ b);
		c = (float) (n3 * n3 * n3);
		System.out.println("O resultado de c e: "+ c);
		
		entrada.close();
		
		
	}

}
