package Ist;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Usuario {
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(String telefono, String afp, int sistemaSalud, String direccion,
                   String comuna, int edad) {
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCadena() {
        return comuna;
    }

    public void setComuna(String cadena) {
        this.comuna = cadena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", SistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void obtenerNombre() {
        System.out.println("Nombre:: " + super.getNombres() + " " +
                super.getApellidos());
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Sistema de Salud: " + obtenerSistemaSalud(sistemaSalud));
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
    }

    private String obtenerSistemaSalud(int sistemaSalud) {
        String salud;

        if (sistemaSalud == 1);{
            salud = "Fonasa";
        }
        if (sistemaSalud == 2);{
            salud="Isapre";
        }
        return salud;
    };


}
