import java.util.Scanner;


public class Exericicio01 {

	public static void main(String[] args) {

		float valorDigitado;
		float dolarHoje = (float) 5.20;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Favor informar o valor a ser convertido!");
		valorDigitado = leitor.nextFloat();
		
		float resultado = valorDigitado / dolarHoje;
		
		System.out.println("O valor convertido em dólares é: " + resultado);
		
		leitor.close();
	
	}

}
