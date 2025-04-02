package desafiosPrimeiroModulo_curso;
import java.util.Scanner;
public class desafio_conversao {
	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Digite o primeiro salário:");
		        String salario1 = scanner.nextLine().replace(",", ".");
		        
		        System.out.println("Digite o segundo salário:");
		        String salario2 = scanner.nextLine().replace(",", ".");
		        
		        System.out.println("Digite o terceiro salário:");
		        String salario3 = scanner.nextLine().replace(",", ".");
		        
		        try {
		            double s1 = Double.parseDouble(salario1);
		            double s2 = Double.parseDouble(salario2);
		            double s3 = Double.parseDouble(salario3);
		            
		            double media = (s1 + s2 + s3) / 3;
		            System.out.printf("A média salarial é: %.2f\n", media);
		        } catch (NumberFormatException e) {
		            System.out.println("Erro: Certifique-se de inserir números válidos.");
		        }
		        
		        scanner.close();
		    }
		

	}


