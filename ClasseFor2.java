package PacoteJava;

import java.util.Scanner;

public class ClasseFor2 {
	
	public static void main(String[] args) {

		int x, num=0, contPar = 0, contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1; x<=10; x++) {
			System.out.print("\nDigite o n�mero:");
			num = leia.nextInt();
			
			if (num %2==0) {
				
				contPar++;
				
			}
			else {
				contImpar++;
			
			
		}
		
	}
		System.out.print("\nA quantidade de n�meros �mpares foi:"+ contImpar);
		System.out.print("\nA quantidade de n�meros pares foi:"+ contPar);
	}

}

