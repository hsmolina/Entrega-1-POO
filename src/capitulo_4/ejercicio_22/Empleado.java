package capitulo_4.ejercicio_22;

public class Empleado {
    private String nombre;
    private Long salario_por_hora;
    private Double horas_trabajadas;

    public Empleado() {}

    public Empleado(String nombre, Long salario_por_hora, Double horas_trabajadas) {
        this.nombre = nombre;
        this.salario_por_hora = salario_por_hora;
        this.horas_trabajadas = horas_trabajadas;
    }

    public Double calcularSalario() {
        return salario_por_hora * horas_trabajadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario_por_hora(Long salario_por_hora) {
        this.salario_por_hora = salario_por_hora;
    }

    public void setHoras_trabajadas(Double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getSalario_por_hora() {
        return salario_por_hora;
    }

    public Double getHoras_trabajadas() {
        return horas_trabajadas;
    }
}
