
package PruebaFiguras;

public class Cuadrado {
    
        double lado_cuadrado; // Atributos de la clase Cuadrado
        
        //Constructor de la clase Circulo. Parámetro que define el lado de un cuadrado
        public Cuadrado (double lado_cuadrado) {
            this.lado_cuadrado = lado_cuadrado;
        }

        // Método que calcula y devuelve el área de un cuadrado como el lado elevado al cuadrado @return Área de un Cuadrado
        double calcularArea() {
            return lado_cuadrado*lado_cuadrado;
        }

        // Método que calcula y devuelve el perímetro de un cuadrado como cuatro veces su lado @return Perímetro de un cuadrado
        double calcularPerimetro() {
            return (4*lado_cuadrado);
        }
    
}
