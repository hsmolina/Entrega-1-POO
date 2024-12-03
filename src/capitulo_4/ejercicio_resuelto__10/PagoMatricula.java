package capitulo_4.ejercicio_resuelto__10;

public class PagoMatricula {
    
    double valor_cobro_constante = 50000,patrimonio,valor_pagar;
    int estrato, numero_inscripcion;
    String nombres;
    
    public PagoMatricula (int numero_inscripcion,String nombres,double patrimonio,int estrato) {
        
        this.numero_inscripcion = numero_inscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        
    }
    
    double pagomatricula() {
        if (patrimonio > 2000000 && estrato > 3) {
            return valor_pagar = valor_cobro_constante+patrimonio*0.03;
        }
        else {
            return valor_pagar = valor_cobro_constante;
        }
    }
    
    void datosbasicos() {
        System.out.println("El número de inscripción es: "+numero_inscripcion);
        System.out.println("El nombre del estudiante es: "+nombres);
        System.out.println("El pago de la matrícula es: $"+pagomatricula());
    }

}
