package Cadastro;

import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner as = new Scanner(System.in);

		System.out.print("Digite o numero de cadastros que deseja fazer: ");
		int cadastros = as.nextInt();
		int[] vect = new int[cadastros];
		char continua;

		System.out.println("Digite o numero do funcionario");
		do {
			for (int i = 0; i < vect.length; i++) {
				System.out.println("N° do Cadastro " + (i + 1) + ": ");
				vect[i] = as.nextInt();
			}

			System.out.print("Cadastros: ");

			for (int i = 0; i < vect.length; i++) {
				System.out.print((i + 1) + ":" + vect[i] + " ");
			}
			System.out.println();
			System.out.println("Deseja continuar com os  cadastros? s / n");
			continua = as.next().charAt(0);
		}

		while (continua == 's'); // while verifica dentro do laço, mais a variavel precisa ser criada fora

		System.out.println();
		System.out.println("Cadastros finalizados ");
		as.close();

	}

}
