package funciones; // Define el paquete al que pertenece esta clase.

import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario.

public class funciones { // Declara la clase llamada "funciones".
    
    static Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.
    
    // VARIABLES GLOBALES n1 y n2: pertenecen a TODA la clase. Se pueden usar SIN
    // declararlas de nuevo en todo el programa.
    static int n1, n2;

    // Funcion que imprime un saludo.
    public static void saludar() {
        System.out.println("Hola. Quiero sumar"); // Imprime un mensaje de saludo.
    }

    // Funcion que pide el nombre del usuario y lo retorna.
    public static String mostrarNombre() {
        System.out.println("Ingresa tu nombre: "); // Pide al usuario que ingrese su nombre.
        String nombre = entrada.next(); // Lee el nombre ingresado y lo almacena en la variable "nombre".
        return nombre; // Retorna el nombre ingresado.
    }

    // Funcion que pide al usuario que ingrese dos numeros.
    public static void ingresarNumeros() {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner local para leer la entrada del usuario.
        System.out.println("Ingresa un primer numero: "); // Pide al usuario que ingrese el primer numero.
        n1 = entrada.nextInt(); // Lee el primer numero y lo almacena en la variable global "n1".
        System.out.println("Ingresa un segundo numero: "); // Pide al usuario que ingrese el segundo numero.
        n2 = entrada.nextInt(); // Lee el segundo numero y lo almacena en la variable global "n2".
    }

    // Funcion que suma dos numeros y retorna el resultado.
    public static int sumar(int a, int b) { // Parametros: "a" y "b".
        int suma = a + b; // Variable LOCAL "suma": solo puede utilizarse en esta funcion "sumar()".
        return suma; // Retorna el resultado de la suma.
    }

    // Funcion principal que se ejecuta al iniciar el programa.
    public static void main(String[] args) {
        saludar(); // Llama a la funcion "saludar" para imprimir un saludo.
        ingresarNumeros(); // Llama a la funcion "ingresarNumeros" para que el usuario ingrese dos numeros.
        // Llama a la funcion "sumar" con los numeros ingresados y guarda el resultado.
        int resultado = sumar(n1, n2); // n1 y n2: argumentos que se pasan a la funcion "sumar".
        System.out.println("El resultado de la suma es: " + resultado); // Imprime el resultado de la suma.
    }
}