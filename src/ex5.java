import java.util.Scanner;
/*
 * 5) Faça um algoritmo que leia a altura de moças inscritas em um concurso de beleza. Para 
finalizar será digitado zero na altura. Imprima as duas maiores alturas. 
 */
public class ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura;
		double maior1=0;
		double maior2=0;
		int cont = 0;
		
		System.out.println("Digite a altura para parar digite 0: ");
		altura = entrada.nextDouble();
		
		while(altura != 0) {
			cont = cont + 1;
			if (altura > maior1) {
				maior2 = maior1;
				maior1 = altura;
				
				
			}else if(altura > maior2 && altura != maior1 ) {
				maior2 = altura;
				
				
			}
			System.out.println("Digite a altura para parar digite 0: ");
			altura = entrada.nextDouble();
			
		}
	if(cont == 0) {
		System.out.println("ninguem se inscreveu");
	
	}else if(cont == 1) {
		System.out.println("apenas uma pessoa se inscreveu, maior é " + maior1);
	
	}else {
		System.out.println("a primeira maior é " + maior1 + " a segunda maior é " + maior2);
		
	}
	entrada.close();
	
	}

}
