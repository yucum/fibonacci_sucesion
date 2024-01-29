package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Lee la entrada de lusuario desde la consola
        System.out.print("Ingrese el número para calcular la sucesión de Fibonacci: "); // Se solicita al usuario que ingrese un número
        int n = scanner.nextInt(); // Se lee el número ingresado por el usuario y se almacena en la variable

        int resultado = Fibonacci.calcular(n); // Se llama al método calcular de la clase Fibonacci y se almacena el resultado en la variable resultado
        System.out.println("El resultado de Fibonacci para " + n + " es: " + resultado); // Se imprime el resultado de la sucesión de Fibonacci

        scanner.close();
    }
}
