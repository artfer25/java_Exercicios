package desafiosPrimeiroModulo_curso;
import java.util.Scanner;

public class desafio_temperatura_dois {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     
     System.out.print("Digite a temperatura em Celsius: ");
     double c = scanner.nextDouble();
     
     double f = (c * 9/5) + 32;
     
     System.out.println("A temperatura em Fahrenheit é: " + f);
     
     scanner.close();
}
}
