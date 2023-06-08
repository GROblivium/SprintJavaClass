package Ist;

public class Revision {
    private int id;
    private int id_visita;
    private String nomRevision;
    private String detRevision;
    private int estado;


    public Revision() {
    }

    public Revision(int id, int id_visita, String nomRevision, String detRevision, int estado) {
        this.id = id;
        this.id_visita = id_visita;
        this.nomRevision = nomRevision;
        this.detRevision = detRevision;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public String getNomRevision() {
        return nomRevision;
    }

    public void setNomRevision(String nomRevision) {
        this.nomRevision = nomRevision;
    }

    public String getDetRevision() {
        return detRevision;
    }

    public void setDetRevision(String detRevision) {
        this.detRevision = detRevision;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", id_visita=" + id_visita +
                ", nomRevision='" + nomRevision + '\'' +
                ", detRevision='" + detRevision + '\'' +
                ", estado=" + estado +
                '}';
    }
}
