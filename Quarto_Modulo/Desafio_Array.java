package Quarto_Modulo;
import java.util.Scanner;
public class Desafio_Array {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	 int quantidade = scanner.nextInt();

     double[] notas = new double[quantidade];
     
     for (int i = 0; i < quantidade; i++) {
         System.out.println("Digite a nota " + (i + 1) + ": ");
         notas[i] = scanner.nextDouble();
     }
     
     double soma = 0;
     
     for (double nota : notas) {
         soma += nota;
     }
     
     double media = soma / quantidade;
     
     System.out.println("A média das notas é: " + media);
     
     scanner.close();
}
}
