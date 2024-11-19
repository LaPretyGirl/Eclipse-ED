package Calculadora;

import java.util.Scanner;

public class CalculadoraSimple {

	public static double sumar(double a, double b) {
		return a + b;
	}
	
	public static double restar(double a, double b) {
		return a - b;
	}

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculadora Simple:");
		System.out.print("Introduce el primer número: ");
		double numero1 = scanner.nextDouble();      
		System.out.print("Introduce el segundo número: ");
		double numero2 = scanner.nextDouble();      
		double resultadoSuma = sumar(numero1, numero2);
		double resultadoResta = restar(numero1, numero2);
		System.out.println("Resultado de la suma: " + resultadoSuma);
		System.out.println("Resultado de la resta: " + resultadoResta);
		System.out.println("\nEsto es la modificación del ejercició 3.");
		System.out.println("\nEsto es la segunda modificación del ejercició 3.");
		System.out.println("Cambio hecho desde la rama feature");
		System.out.println("Cambio hecho desde el GitHub");
		scanner.close();
		
	}
}
