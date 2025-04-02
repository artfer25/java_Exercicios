package desafiosPrimeiroModulo_curso;
import java.util.Scanner;
public class desafios_logicos {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("O primeiro trabalho deu certo? (true/false): ");
	        boolean trabalho1 = scanner.nextBoolean();
	        
	        System.out.print("O segundo trabalho deu certo? (true/false): ");
	        boolean trabalho2 = scanner.nextBoolean();
	        
	        
	        boolean Tv1 = trabalho1 && trabalho2;
	        boolean Tv2 = trabalho1 ^ trabalho2; 
	        boolean Sorvete = trabalho1 || trabalho2;
	        boolean ficarCasa = !Sorvete;
	        
	        
	        if (Tv1) {
	            System.out.println("A família comprou a TV de 50 polegadas e vai tomar sorvete!");
	        } else if (Tv2) {
	            System.out.println("A família comprou a TV de 32 polegadas e vai tomar sorvete!");
	        } else {
	            System.out.println("Nenhum trabalho deu certo. A família ficou em casa com fome!");
	        }
	        
	        scanner.close();
	    }
	}
	
