
package PruebaFiguras;

public class Rectangulo {
    
    double base_rectangulo, altura_rectangulo; // Atributos de la clase Rectángulo
    
    //Constructor de la clase Rectangulo. Parámetro que define la base y altura del rectángulo
    public Rectangulo(double base_rectangulo, double altura_rectangulo) {
        this.base_rectangulo = base_rectangulo;
        this.altura_rectangulo = altura_rectangulo;
    }
    
    // Método que calcula y devuelve el área de un rectángulo como la multiplicación de la base por la altura @return Área de un rectángulo
    double calcularArea() {
        return base_rectangulo * altura_rectangulo;
    }

    // Método que calcula y devuelve el perímetro de un rectángulo como (2 * base) + (2 * altura) @return Perímetro de un rectángulo
    double calcularPerimetro() {
        return (2 * base_rectangulo) + (2 * altura_rectangulo);
    }
    
}
