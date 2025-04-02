package DesafiosSegundoModulo;

import java.util.Scanner;

public class Desafio_Dia_Semana {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner (System.in);
	 
	 System.out.println("Digite o dia da semana por extenso: ");
	  String dia = scanner .nextLine().trim().toLowerCase();
	  
	  int numDia;
	  
	  if (dia.equals("domingo")) {
		  numDia=1;
 } else if (dia.equals("segunda-feira")) {
     numDia = 2;
 } else if (dia.equals("terça-feira") || dia.equals("terca-feira")) {
     numDia = 3;
 } else if (dia.equals("quarta-feira")) {
     numDia = 4;
 } else if (dia.equals("quinta-feira")) {
     numDia = 5;
 } else if (dia.equals("sexta-feira")) {
     numDia = 6;
 } else if (dia.equals("sábado") || dia.equals("sabado")) {
     numDia = 7;
 } else {
     System.out.println("Dia inválido!");
     scanner.close();
     return;
 }
 
	  System.out.println("O dia correspondente é: " + numDia);
       scanner.close();
}
}