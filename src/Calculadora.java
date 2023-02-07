import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {

		int valor1;
		int valor2;
		int soma, subt, mult;
		double divi;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Este programa irá realizar as quatro operações matemáticas básicas usando os números informados");
		
		System.out.println("Insira o primeiro valor!");
		valor1 = leitor.nextInt();
		System.out.println("Insira o segundo valor!");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("O resultado da soma foi: " + soma);
		
		subt = valor1 - valor2;	
		System.out.println("O resultado da subtração foi: " + subt);
		mult = valor1 * valor2;
		System.out.println("O resultado da multiplicação foi: " + mult);
		divi = valor1 / valor2;
		System.out.println("O resultado da divisão foi: " + divi);
		
		leitor.close();
		
	}

}
