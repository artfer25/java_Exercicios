package desafiosPrimeiroModulo_curso;
import java.util.Scanner;
public class Desafio_Imc {
public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
      
      System.out.print("Digite seu peso (kg): ");
      double peso = scanner.nextDouble();
      
      System.out.print("Digite sua altura (m): ");
      double altura = scanner.nextDouble();
      
      double imc = peso / (altura * altura);
      
      System.out.printf("Seu IMC é: %.2f\n", imc);
      
      scanner.close();
  }
}

