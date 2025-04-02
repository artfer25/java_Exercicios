package desafiosPrimeiroModulo_curso;

public class desafio_aritmeticos {
	public static void main(String[] args) {
		double numA = Math.pow(6 *(3 + 2), 2);
		double danA = 3 * 2;
		double numB = (1 - 5) * (2 - 7);
		double danB = 2;
		
		double sueperiorA = numA / danA;
		double superiorB = Math.pow(numB / danB ,2);
		
		double superior = Math.pow(sueperiorA -superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultdao é " + resultado);
		
				
		
		
		
		
		
		
		
		
	}

}
