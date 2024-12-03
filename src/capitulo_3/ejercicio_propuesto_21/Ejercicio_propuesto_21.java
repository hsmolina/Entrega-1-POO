package capitulo_3.ejercicio_propuesto_21;

import java.util.Scanner;

public class Ejercicio_propuesto_21 {

    public static void main(String[] args) {
        
        //Creamos un objeto de tipo Scanner que recibirá los datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio propuesto #21");
        
        //Pedimos al usuario las medidas de los 3 lados del triángulo
        System.out.print("Ingrese la medida del lado A del triángulo: ");
        double lado_triánguloA = scanner.nextDouble();
        System.out.print("Ingrese la medida del lado B del triángulo: ");
        double lado_triánguloB = scanner.nextDouble();
        System.out.print("Ingrese la medida del lado C del triángulo: ");
        double lado_triánguloC = scanner.nextDouble();
        
        //Creamos un objeto triángulo de la clase Triángulos con los datos ingresados por teclado
        Triángulos triángulo = new Triángulos (lado_triánguloA, lado_triánguloB, lado_triánguloC);
        
        //Llamamos los métodos para calcular perímetro, altura y área de triángulo equilatero
        System.out.println(String.format("El perímetro del triángulo es: %.1f", triángulo.calcularPerimetroTriángulo()));
        System.out.println(String.format("El semiperímetro del triángulo es: %.1f", triángulo.calcularSemiperímetroTriángulo()));
        System.out.println(String.format("El área del triángulo es: %.2f", triángulo.calcularÁreaTriángulo()));
        
        
    }
    
}
