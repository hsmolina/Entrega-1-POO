package capitulo_4.ejercicio_resuelto__10;

import java.util.Scanner;

public class Ejercicio_resuelto__10 {

    public static void main(String[] args) {
        
        //Creamos un objeto de tipo Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio resuelto #10");
        
        System.out.print("Ingrese el número de inscripción: ");
        int numero_inscripcion = scanner.nextInt();
        System.out.print("Ingrese los nombres: ");
        scanner.nextLine();
        String nombres = scanner.nextLine();
        System.out.print("Ingrese el valor del patrimonio: ");
        double patrimonio = scanner.nextDouble();
        System.out.print("Ingrese el número de estrato social: ");
        int estrato = scanner.nextInt();
        
        //Creamos un objeto pagomatricula de la clase PagoMatricula con los datos ingresados por teclado
        PagoMatricula pagomatricula = new PagoMatricula (numero_inscripcion,nombres,patrimonio,estrato);
        
        pagomatricula.datosbasicos();
              
    }
    
}
