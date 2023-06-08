package Ist;

public class Accidente {
    private int id;
    private String run;
    private String fechaAccidente;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int id, String run, String fechaAccidente, String hora,
                     String lugar, String origen, String consecuencias) {
        this.id = id;
        this.run = run;
        this.fechaAccidente = fechaAccidente;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(String fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", run='" + run + '\'' +
                ", fechaAccidente='" + fechaAccidente + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
