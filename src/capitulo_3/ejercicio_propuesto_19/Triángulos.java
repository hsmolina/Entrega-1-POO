//La clase Triángulos cuenta métodos para calcular el perímetro, la altura y el área de un triángulo equilatero
package capitulo_3.ejercicio_propuesto_19;

public class Triángulos {
    
    //Atributos de la clase Triángulos
    double lado_triángulo;
    
    // Constructor para inicializar los datos del triángulo__equilatero
    //Un constructor es un método especial de una clase que se ejecuta automáticamente cuando se crea un nuevo objeto de esa clase, en este caso Triángulos
    //public Triángulos () recibe parámetros que permiten pasar valores específicos para cada uno de los atributos al momento de crear un objeto, en este caso triángulo_equilatero
    //this. asigna valores a los atributos
    public Triángulos (double lado_triángulo) {
        this.lado_triángulo = lado_triángulo;
    }
    
    //Método para calcular el perímetro
    double calcularPerimetroTriángulo() {
        return lado_triángulo * 3;
    }
    
    //Método para calcular la altura de un triángulo equilatero
    double calcularAlturaTriánguloEquilatero() {
        return (Math.sqrt(3)*lado_triángulo) / 2;
    }
    
    //Método para calcular el área de un triángulo equilatero
    double calcularÁreaTriánguloEquilatero() {
        return (Math.sqrt(3)*Math.pow(lado_triángulo, 2)) / 4;
    }
    
}
