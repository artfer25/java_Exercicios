package desafiosPrimeiroModulo_curso;
import java.util.Scanner;
public class desafio_temperatura {
	public static void main(String[] args) {
	

		        final int AJUSTE = 32;
		        final double FATOR = 5.0 / 9.0;
		        
		      
		        double f;
		        double c;
		        
		       
		    Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite a temperatura em Fahrenheit: ");
		        f = scanner.nextDouble();
		        
		        c = (f - AJUSTE) * FATOR;
		        
		        
		        System.out.printf("A temperatura em Celsius é: %.2f°C\n", c);
		        
		        
		        scanner.close();
	}

		
	}


