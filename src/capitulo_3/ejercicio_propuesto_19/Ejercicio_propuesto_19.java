package capitulo_3.ejercicio_propuesto_19;

import java.util.Scanner;

public class Ejercicio_propuesto_19 {

    public static void main(String[] args) {
        
        //Creamos un objeto de tipo Scanner que recibirá los datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio propuesto #19");
        
        //Pedimos al usuario la medida de un lado del triángulo equilatero
        System.out.print("Ingrese la medida de uno de los lados del triángulo equilátero: ");
        double lado_triángulo = scanner.nextDouble();
        
        //Creamos un objeto triángulo_equilatero de la clase Triángulos con los datos ingresados por teclado
        Triángulos triángulo_equilatero = new Triángulos (lado_triángulo);
        
        //Llamamos los métodos para calcular perímetro, altura y área de triángulo equilatero
        System.out.println(String.format("El perímetro del triángulo equilátero es: %.2f", triángulo_equilatero.calcularPerimetroTriángulo()));
        System.out.println(String.format("La altura del triángulo equilátero es: %.2f", triángulo_equilatero.calcularAlturaTriánguloEquilatero()));
        System.out.println(String.format("El área del triángulo equilátero es: %.2f", triángulo_equilatero.calcularÁreaTriánguloEquilatero()));
        
    }
    
}
