//La clase Triángulos cuenta métodos para calcular el perímetro, el semiperímetro y el área de un triángulo
package capitulo_3.ejercicio_propuesto_21;

public class Triángulos {
    
    //Atributos de la clase Triángulos
    double lado_triánguloA, lado_triánguloB,lado_triánguloC;
    
    // Constructor para inicializar los datos del triángulo
    //Un constructor es un método especial de una clase que se ejecuta automáticamente cuando se crea un nuevo objeto de esa clase, en este caso Triángulos
    //public Triángulos () recibe parámetros que permiten pasar valores específicos para cada uno de los atributos al momento de crear un objeto, en este caso triángulo
    //this. asigna valores a los atributos
    public Triángulos (double lado_triánguloA, double lado_triánguloB, double lado_triánguloC) {
        this.lado_triánguloA = lado_triánguloA;
        this.lado_triánguloB = lado_triánguloB;
        this.lado_triánguloC = lado_triánguloC;
    }
    
    //Método para calcular el perímetro de un triángulo
    double calcularPerimetroTriángulo() {
        return lado_triánguloA + lado_triánguloB + lado_triánguloC;
    }
    
    //Método para calcular el semiperímetro de un triángulo
    double calcularSemiperímetroTriángulo() {
        return calcularPerimetroTriángulo()/2;
    }
    
    //Método para calcular el área de un triángulo utilizando la fórmula de Heron
    double calcularÁreaTriángulo() {
        return Math.sqrt(calcularSemiperímetroTriángulo()*(calcularSemiperímetroTriángulo()-lado_triánguloA)*(calcularSemiperímetroTriángulo()-lado_triánguloB)*(calcularSemiperímetroTriángulo()-lado_triánguloC));
    }
    
}
