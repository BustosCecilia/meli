import java.text.SimpleDateFormat;
import java.util.Date;

public class Incidente {
    private int id;
    private Clasificacion clasificacion;
    private String descripcion;
    private Usuario reportador;
    private Usuario responsable;
    private Date dateCreacion;
    private Date dateSolucion;

    public Incidente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getReportador() {
        return reportador;
    }

    public void setReportador(Usuario reportador) {
        this.reportador = reportador;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public Date getDateCreacion() {
        return dateCreacion;
    }

    public void setDateCreacion(Date dateCreacion) {
        this.dateCreacion = dateCreacion;
    }

    public Date getDateSolucion() {
        return dateSolucion;
    }

    public void setDateSolucion(Date dateSolucion) {
        this.dateSolucion = dateSolucion;
    }
}
