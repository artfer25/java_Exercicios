package Exercicios_Estrutura_Dados;
import java.util.Scanner;
import java.util.Random;
public class Exercicio_Adivinhacao {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     Random random = new Random();
     int numeroAleatorio = random.nextInt(101);  

     int tentativas = 10;

     System.out.println("Bem-vindo ao jogo de adivinhação!");
     System.out.println("Tente adivinhar o número entre 0 e 100.");

     while (tentativas > 0) {
         System.out.print("Digite o seu palpite: ");
         int palpite = scanner.nextInt();

         if (palpite == numeroAleatorio) {
             System.out.println("Parabéns! Você acertou o número.");
             break;  
         } else {
             if (palpite > numeroAleatorio) {
                 System.out.println("O número é menor do que " + palpite + ".");
             } else {
                 System.out.println("O número é maior do que " + palpite + ".");
             }

             tentativas--;
             System.out.println("Tentativas restantes: " + tentativas);

             
             if (tentativas == 0) {
                 System.out.println("Você perdeu! O número era " + numeroAleatorio + ".");
             }
         }
     }


     scanner.close();
 }
}