
import java.util.Scanner;

/*
 * 3) Faça um programa que vai pedindo números ao usuário até que este introduza o 
número -1. O computador deve dizer a média dos números introduzidos (excluindo o -
1).
 */
public class ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		int media = 0;
		int cont = 0;

		while (numero != -1) {
			System.out.print("digite um numero para parar digite -1: ");
			numero = entrada.nextInt();
			cont = cont + 1;
			if (numero != -1) {

				soma = soma + numero;

			}
		}
		media = soma / (cont - 1);
		System.out.println("a media dos numeros foi " + media);
		entrada.close();
	}
		
}
