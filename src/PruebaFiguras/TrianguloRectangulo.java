
package PruebaFiguras;

public class TrianguloRectangulo {
    
    double base_triangulo, altura_triangulo; // Atributos de la clase TrianguloRectangulo
    
    //Constructor de la clase TrianguloRectangulo. Parámetro que define la base y altura de un triángulo
    public TrianguloRectangulo (double base_triangulo, double altura_triangulo) {
        this.base_triangulo = base_triangulo;
        this.altura_triangulo = altura_triangulo;
        }
    
    // Método que calcula y devuelve el área de un triángulo rectángulo como la base multiplicada por la altura sobre 2 @return Área de un triángulo rectángulo
    double calcularArea() {
        return (base_triangulo * altura_triangulo / 2);
    }
    
    //Método que calcula y devuelve el perímetro de un triángulo rectángulo como la suma de la base, la altura y la hipotenusa @return Perímetro de un triángulo rectángulo
    double calcularPerimetro() {
        return (base_triangulo + altura_triangulo + calcularHipotenusa()); // Invoca al método calcular hipotenusa */
    }
    
    // Método que calcula y devuelve la hipotenusa de un triángulo rectángulo utilizando el teorema de Pitágoras @return Hipotenusa de un triángulo rectángulo
    double calcularHipotenusa() {
        return Math.pow(base_triangulo*base_triangulo + altura_triangulo*altura_triangulo, 0.5);
    }
    
    // Método que determina si un triángulo es: - Equilatero: si sus tres lados son iguales - Escaleno: si sus tres lados son todos diferentes - Escaleno: si dos de sus lados son iguales y el otro es diferente de los demás
    void determinarTipoTriangulo() {
        if ((base_triangulo == altura_triangulo) && (base_triangulo == calcularHipotenusa()) && (altura_triangulo == calcularHipotenusa())) {
            System.out.println("Es un triángulo equilátero");
        } // Todos sus lados son iguales
        else if ((base_triangulo != altura_triangulo) && (base_triangulo != calcularHipotenusa()) && (altura_triangulo != calcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno"); /* Todos sus  lados son diferentes */
        }
        else {
            System.out.println("Es un triángulo isósceles"); // De otra manera, es isósceles 
                } 
    }
}
