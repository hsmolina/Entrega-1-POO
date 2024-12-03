package PruebaFiguras;

import java.util.Scanner;

public class PruebaFiguras {

/*Método main que crea un círculo, un rectángulo, un cuadrado y un triángulo rectángulo. Para cada uno de estas figuras geométricas, se calcula su área y perímetro. */
    
    public static void main(String[] args) {
        //Creamos un objeto de tipo Scanner que recibirá los datos por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parte 2 - Clases sobre figuras geométricas.");
        
        //Pedimos al usuario que digite las medidas en centímetros necesarias para realizar los cálculos
        System.out.println("Las medidas digitadas deben ser en centímetros (cm).");
        System.out.print("Digite el valor del radio del círculo: ");
        double radio_circulo = scanner.nextDouble();
        
        System.out.print("Digite el valor de la base del rectángulo: ");
        double base_rectangulo = scanner.nextDouble();
        System.out.print("Digite el valor de la altura del rectángulo: ");
        double altura_rectangulo = scanner.nextDouble();
        
        System.out.print("Digite el valor de uno de los lados del cuadrado: ");
        double lado_cuadrado = scanner.nextDouble();
        
        System.out.print("Digite el valor de la base del triángulo: ");
        double base_triangulo = scanner.nextDouble();
        System.out.print("Digite el valor de la altura del triángulo: ");
        double altura_triangulo = scanner.nextDouble();
        System.out.println("");
        
        //Creación de objetos con los datos por teclado
        //Creamos un objeto figura1 de la clase Circulo con los datos ingresados por teclado
        Circulo figura1 = new Circulo (radio_circulo);
        Rectangulo figura2 = new Rectangulo (base_rectangulo,altura_rectangulo);
        Cuadrado figura3 = new Cuadrado (lado_cuadrado);
        TrianguloRectangulo figura4 = new TrianguloRectangulo (base_triangulo,altura_triangulo);

        //Presentamos los resultados de los cálculos
        System.out.println(String.format("El área del círculo es = %.2f cm", figura1.calcularArea()));
        System.out.println(String.format("El perímetro del círculo es = %.2f cm", figura1.calcularPerimetro()));
        System.out.println();
        System.out.println(String.format("El área del rectángulo es = %.2f cm", figura2.calcularArea()));
        System.out.println(String.format("El perímetro del rectángulo es = %.2f cm", figura2.calcularPerimetro()));
        System.out.println();
        System.out.println(String.format("El área del cuadrado es = %.2f cm", figura3.calcularArea()));
        System.out.println(String.format("El perímetro del cuadrado es = %.2f cm", figura3.calcularPerimetro()));
        System.out.println();
        System.out.println(String.format("El área del triángulo es = %.2f cm", figura4.calcularArea()));
        System.out.println(String.format("El perímetro del triángulo es = %.2f cm", figura4.calcularPerimetro()));
        figura4.determinarTipoTriangulo();
    }
    
}
