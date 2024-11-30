package capitulo_4.ejercicio_23;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los siguientes para resolver la ecuacion ax² + bx + c = 0");
        System.out.println("Si usas decimales, usa coma (,) en vez de punto (.)");
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        // Con esto se calcula el discriminante para saber si la ecuacion tiene solucion
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("El discriminante es: %.2f\n", discriminante);

        if (discriminante  >= 0) {
            double solucion_1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucion_2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: " + solucion_1 + " y " + solucion_2);
        }    else {
            System.out.println("La ecuacion no tiene solucion en los numeros reales");
        }
    }
}
