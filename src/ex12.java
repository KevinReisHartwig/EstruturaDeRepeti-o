
import java.util.Scanner;

/*
  12)Faça um algoritmo que leia a altura e o sexo de n pessoas e imprima: 
a) - Quantos homens e mulheres foram medidas; 
b) - Quantos homens acima de 1,70; 
c) - A média das alturas das mulheres. 
 */
public class ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura;
		String sexo;
		double media = 0;
		double alturaMaior = 0;
		int homem = 0;
		int mulher = 0;
		double somaMulher = 0;

		System.out.println("digite a quantidade de pessoas: ");
		int numero = entrada.nextInt();

		for (int i = 0; i <= numero - 1; i++) {
			System.out.println("digite o sexo M/F: ");
			sexo = entrada.next();

			while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
				System.out.println("digite o sexo M/F: ");
				sexo = entrada.next();
			}

			System.out.println("digite a altura: ");
			altura = entrada.nextDouble();

			if (sexo.equalsIgnoreCase("M")) {
				homem = homem + 1;
				if (altura > 1.70) {
					alturaMaior = alturaMaior + 1;

				}

			} else if (sexo.equalsIgnoreCase("F")) {
				mulher = mulher + 1;
				somaMulher = somaMulher + altura;
				media = somaMulher / mulher;
			}

		}
		System.out.println("Foram medidos " + homem + " homens" + "e foram medidas " + mulher + " mulheres");
		System.out.println("tem " + alturaMaior + " homens acima de 1.70");
		System.out.println("A media da altura das mulheres é " + media);
		entrada.close();
	}
}
