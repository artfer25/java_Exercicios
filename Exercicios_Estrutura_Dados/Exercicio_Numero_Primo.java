package Exercicios_Estrutura_Dados;
import java.util.Scanner;

public class Exercicio_Numero_Primo {
	 

 public static void main(String[] args) {

	         Scanner scanner = new Scanner(System.in);
	         
	         System.out.println("Digite um número: ");
	         int numero = scanner.nextInt();
	         
	         
	         boolean Primo = true;  
	         
	         if (numero <= 1) {
	             Primo = false; 
	         } else {
	             for (int i = 2; i <= Math.sqrt(numero); i++) {
	                 if (numero % i == 0) {
	                     Primo = false; 
	                     break;
	                 }
	             }
	         }

	         if (Primo) {
	             System.out.println("O número " + numero + " é primo.");
	         } else {
	             System.out.println("O número " + numero + " não é primo.");
	         }
	         
	
	         scanner.close();
	     }
	 

}

