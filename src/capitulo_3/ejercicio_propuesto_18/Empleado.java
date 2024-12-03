/*La clase Empleado cuenta con atributos y métodos para calcular el salario bruto y neto.*/
package capitulo_3.ejercicio_propuesto_18;

public class Empleado {
    
    // Atributos de la clase Empleado
    int código_empleado, horas_trabajadas, valor_hora_trabajada;
    double porcentaje_retención;
    String nombre_empleado;
    
    // Constructor para inicializar los datos del empleado
    //Un constructor es un método especial de una clase que se ejecuta automáticamente cuando se crea un nuevo objeto de esa clase, en este caso Empleado
    //public Empleado () recibe parámetros que permiten pasar valores específicos para cada uno de los atributos al momento de crear un objeto, en este caso empleado
    //this. asigna valores a los atributos
    public Empleado(int código_empleado, String nombre_empleado, int horas_trabajadas, int valor_hora_trabajada, double porcentaje_retención) {
        this.código_empleado = código_empleado;
        this.nombre_empleado = nombre_empleado;
        this.horas_trabajadas = horas_trabajadas;
        this.valor_hora_trabajada = valor_hora_trabajada;
        this.porcentaje_retención = porcentaje_retención;
    }

    // Método para calcular el salario bruto
    double calcularSalarioBruto() {
        return horas_trabajadas * valor_hora_trabajada;
    }

    // Método para calcular la retención
    double calcularRetención() {
        return calcularSalarioBruto() * (porcentaje_retención / 100);
    }

    // Método para calcular el salario neto
    double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularRetención();
    }
}

