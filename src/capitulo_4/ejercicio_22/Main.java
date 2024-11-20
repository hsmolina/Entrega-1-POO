package capitulo_4.ejercicio_22;

import java.util.Scanner;

public class Main {
    public static void main(String ... args){
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado();

        System.out.println("Ingrese el nombre del empleado: ");
        empleado.setNombre(scanner.nextLine());

        System.out.println("Ingrese el salario por hora del empleado: ");
        empleado.setSalario_por_hora(scanner.nextLong());

        System.out.println("Ingrese las horas trabajadas por el empleado en el mes: ");
        empleado.setHoras_trabajadas(scanner.nextDouble());

        scanner.close();

        Double salario_empleado = empleado.calcularSalario();

        System.out.println(empleado.getNombre());

        if(salario_empleado > 450000) {
            System.out.printf("El salario mensual del empleado es %.2f", salario_empleado);
        }

    }
}
