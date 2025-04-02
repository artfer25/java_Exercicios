package Exercicios_Estrutura_Dados;
import java.util.Scanner;
public class Exercicio_Par {
	public static void main(String[] args) {
		
	
	        Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
	        
	       
	        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
	            System.out.println("O número " + numero + " é par.");
	        } else {
	            System.out.println("O número " + numero + " não atende aos critérios.");
	        }
	        
	       
	        scanner.close();
	    }
	

	

}

