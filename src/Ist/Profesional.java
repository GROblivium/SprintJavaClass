package Ist;

public class Profesional extends Usuario{

    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String titulo) {
        this.titulo = titulo;
        this.fechaIngreso= titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    @Override


    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Titulo: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);

    }
}
