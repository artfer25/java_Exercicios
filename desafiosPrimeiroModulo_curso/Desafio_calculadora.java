package desafiosPrimeiroModulo_curso;
import java.util.Scanner;

public class Desafio_calculadora {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 
		 System.out.println("Informe o primeiro número da operação: ");
		 double num1 = entrada.nextDouble();
		 
		 System.out.println("Informe o segundo numero da operação: ");
		 double num2 = entrada.nextDouble();
		 
          System.out.println("Informe a operação: ");
          String op = entrada.next();
          
          double resultado = "+".equals(op) ? num1 + num2 : 0 ;
          resultado = "-".equals(op) ? num1 - num2 : resultado;
          resultado = "*".equals(op) ? num1 * num2 : resultado;
          resultado = "/".equals(op) ? num1 / num2 : resultado;
          resultado = "%".equals(op) ? num1 % num2 : resultado;

          System.out.printf("%.2f %s %.2F = %.2f"
        		  , num1, op, num2 , resultado );
		 
		 entrada.close();
	}

}
