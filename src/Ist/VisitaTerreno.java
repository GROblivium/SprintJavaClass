package Ist;

import java.util.List;

public class VisitaTerreno {
    private int id;
    private String run;
    private String fechaVisita;
    private String horaVisita;
    private String lugar;
    private String comentarios;

    private List<Revision> revisiones;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int id, String run, String fechaVisita, String horaVisita,
                         String lugar, String comentarios) {
        this.id = id;
        this.run = run;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
        this.lugar = lugar;
        this.comentarios = comentarios;
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

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(String horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", run='" + run + '\'' +
                ", fechaVisita='" + fechaVisita + '\'' +
                ", horaVisita='" + horaVisita + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
