
package capitulo_4.ejercicio_resuelto_7;

public class Comparador {
    
    double a,b;
    
    public Comparador (double a, double b) {
        
        this.a = a;
        this.b = b;
        
    }
    
    //Método para calcular si A es mayor, menor o igual que B
    
    void comparadorAB() {
        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }
    }
}
