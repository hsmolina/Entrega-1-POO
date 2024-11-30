package capitulo_4.ejercicio_24;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        String esferaMayorPeso;
        String UnidadDeMedida = "Kg";
        double mayorPeso;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa determina la esfera más pesada de tres esferas.");
        System.out.println("La unidad de medida es en Kg.");
        
        System.out.print("Ingrese el peso de la esfera A: ");
        double peso_esfera_a = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double peso_esfera_b = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double peso_esfera_c = scanner.nextDouble();

        scanner.close();

        if (peso_esfera_a > peso_esfera_b) {
            if (peso_esfera_a > peso_esfera_c) {
                esferaMayorPeso = "A";
                mayorPeso = peso_esfera_a;
            } else {
                esferaMayorPeso = "C";
                mayorPeso = peso_esfera_c;
            }
        } else {
            if (peso_esfera_b > peso_esfera_c) {
                esferaMayorPeso = "B";
                mayorPeso = peso_esfera_b;
            } else {
                esferaMayorPeso = "C";
                mayorPeso = peso_esfera_c;
            }
        }

        System.out.printf("La esfera mas pesada es la %s con un peso de %.2f%s\n ", esferaMayorPeso, mayorPeso,
                UnidadDeMedida);
    }
}
