package Ist;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Usuario implements Iasesoria{
    private String nombres;
    private String apellidos;
    private String fechaNac;
    private String run;
    private int tipo;
    private List<Iasesoria> asesorias;

    public Usuario() {
    }

    public Usuario(String run,String nombre, String apellido,String fechaNac,int tipo) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.fechaNac = fechaNac;
        //this.fechaNac = validaFecha(fechaNac);
        this.run = run;
        this.tipo = tipo;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fecha) {
        this.fechaNac = fecha;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int run) {
        this.tipo = run;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombres + '\'' +
                ", apellido='" + apellidos + '\'' +
                ", fecha='" + fechaNac + '\'' +
                ", run='" + run + '\'' +
                ", run='" + tipo + '\'' +
                '}';
    }

    public void mostrarEdad(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaNacimiento = getFechaNac();
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        int edad = periodo.getYears();
        System.out.println("La edad actual es: " + edad + " años.");
    }

    public void analizarUsuario() {
        System.out.println("RUN: " + run);
        System.out.println("Nombre: " + nombres);
        System.out.println("Apellido: " + apellidos);
    }

}
