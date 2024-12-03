package capitulo_3.ejercicio_propuesto_18;

//importamos el paquete para permitir al usuario ingresar los datos por teclado
import java.util.Scanner;

public class Ejercicio_propuesto_18 {

    public static void main(String[] args) {
       
        System.out.println("Ejercicio propuesto #18");
        
        //Creamos un objeto Scanner para recibir los datos por teclado
        Scanner scanner = new Scanner(System.in);

        //Solicitamos los datos del empleado
        System.out.print("Ingrese el código del empleado: ");
        int código_empleado = scanner.nextInt();
        
        System.out.print("Ingrese el nombre del empleado: ");
        scanner.nextLine(); // Esto es importante para que el programa pueda leer correctamente la siguiente entrada de texto
        String nombre_empleado = scanner.nextLine();
        
        System.out.print("Ingrese las horas trabajadas: ");
        int horas_trabajadas = scanner.nextInt();
        
        System.out.print("Ingrese el valor de la hora trabajada: ");
        int valor_hora_trabajada = scanner.nextInt();
        
        System.out.print("Ingrese el porcentaje de retención: ");
        double porcentaje_retención = scanner.nextDouble();
        
        //Creamos un objeto empleado de la clase Empleado con los datos ingresador por teclado
        Empleado empleado = new Empleado(código_empleado, nombre_empleado, horas_trabajadas, valor_hora_trabajada, porcentaje_retención);
        
        //Imprimimos los atributos solicitados del objeto empleado: código y nombre
        System.out.println("Código de empleado: " + empleado.código_empleado);
        System.out.println("Nombre: " + empleado.nombre_empleado);
        //Se llaman los métodos para calcular salario bruto y neto, para luego imprimir su resultado
        System.out.println("Salario bruto: $" + empleado.calcularSalarioBruto());
        System.out.println("Salario neto: $" + empleado.calcularSalarioNeto());
            
    }
}