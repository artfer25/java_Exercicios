package desafiosPrimeiroModulo_curso;
import java.util.Scanner;

public class Desafio_Matematico {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um valor: ");
	        double valor = scanner.nextDouble();
	        
	        
	        double quadrado = Math.pow(valor, 2);
	        double cubo = Math.pow(valor, 3);
	        
	        System.out.printf("O quadrado de %.2f é: %.2f\n", valor, quadrado);
	        System.out.printf("O cubo de %.2f é: %.2f\n", valor, cubo);
	        
	        scanner.close();
	    }
	}

}
