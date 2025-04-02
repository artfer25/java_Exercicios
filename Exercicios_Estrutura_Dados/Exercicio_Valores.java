package Exercicios_Estrutura_Dados;
import java.util.Scanner;

public class Exercicio_Valores {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        int maiorNumero = Integer.MIN_VALUE; 
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = scanner.nextInt();

	            
	            if (numero > maiorNumero) {
	                maiorNumero = numero;
	            }
	        }

	        System.out.println("O maior número digitado foi: " + maiorNumero);

	        scanner.close();
	    }
	}

