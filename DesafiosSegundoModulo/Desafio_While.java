package DesafiosSegundoModulo;
import java.util.Scanner;

public class Desafio_While {
 public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	double total = 0;
	int contador = 0;
	
	while(true) {
		System.out.println("Digite a nota do aluno ou -1 para calcular a média: " );
		double nota = scanner.nextDouble();
		if(nota == -1) {
			break;
		}
		else if (nota >= 0 && nota <=10) {
			total += nota;
			contador++;
		}
		else {
		System.out.println("Nota Invalida!");
		}
	}
     if (contador > 0) {
    	 
    	 double media = total / contador;
         System.out.printf("A média da turma é: %.2f\n", media);
}
     else {
         System.out.println("Nenhuma nota válida foi inserida.");
     }
     
     scanner.close();
}
}
