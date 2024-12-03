package capitulo_4.ejercicio_resuelto_7;

import java.util.Scanner;

public class Ejercicio_resuelto_7 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio resuelto #7");
        
        //Creamos un objeto de tipo Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos por teclado los valores de A y B
        System.out.print("Ingrese el valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double b = scanner.nextDouble();
        
        //Creamos un objeto comparador de la clase Comparador con los datos ingresados por teclado
        Comparador comparador = new Comparador (a,b);
        
        //Llamamos el método para comparar
        comparador.comparadorAB();
        
    }
    
}
