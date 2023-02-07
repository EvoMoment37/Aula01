import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		float kiloInicial;
		float kiloFinal;
		float litros;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Favor informar o valor de kilometragem inicial!");
		kiloInicial = leitor.nextFloat();
		System.out.println("Favor informar o valor de kilometragem final!");
		kiloFinal = leitor.nextFloat();
		System.out.println("Favor informar quantos litros foram reabastecidos!");
		litros = leitor.nextFloat();
		
		float resultado = (kiloFinal - kiloInicial) / litros;
		
		System.out.println("A média de kilometros por litro é: " + resultado);
		leitor.close();

	}

}
