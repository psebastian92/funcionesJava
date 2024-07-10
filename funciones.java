package funciones;

import java.util.Scanner;

public class funciones {
	static Scanner entrada = new Scanner(System.in);
	// VARIABLES GLOBALES n1 y n2: pertenecen a TODA la clase. Se pueden usar SIN
	// declarar de nuevo
	// en todo el programa.
	static int n1, n2;

	public static void saludar() {
		System.out.println("Hola. Quiero sumar");
	}

	public static String mostrarNombre() {
		System.out.println("Ingresa tu nombre: ");
		String nombre = entrada.next();
		return nombre;
	}

	public static void ingresarNumeros() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un primer numero: ");
		n1 = entrada.nextInt();
		System.out.println("Ingresa un segundo numero: ");
		n2 = entrada.nextInt();

	}

	public static int sumar(int a, int b) { // parametros: a y b.
		int suma = a + b; // variable LOCAL suma: solo puede utilizarse en esta función "sumar()".
		return suma;
	}

	public static void main(String[] args) {
		saludar();
		ingresarNumeros();
		sumar(n1, n2); // n1 y n2: argumentos
		System.out.println("El resultado de la suma es: " + sumar(n1, n2));
	}
}
