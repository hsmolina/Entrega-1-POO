
package PruebaFiguras;

public class Circulo {
    
    double radio_circulo; // Atributos de la clase Circulo
     
    //Constructor de la clase Circulo. Parámetro que define el radio de un círculo
    public Circulo(double radio_circulo) {
        this.radio_circulo = radio_circulo;
    }
    
    //Método que calcula y devuelve el área de un círculo como pi multiplicado por el radio al cuadrado @return Área de un círculo
    double calcularArea() {
        return Math.PI*Math.pow(radio_circulo,2);
    }
    // Método que calcula y devuelve el perímetro de un círculo como la multiplicación de pi por el radio por 2 @return Perímetro de un círculo
    double calcularPerimetro() {
        return 2*Math.PI*radio_circulo;
    }
    
}
