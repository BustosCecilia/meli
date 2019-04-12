import java.util.Collection;

public interface IncidenteService {

    public void addIncidente(Incidente incidente);

    public Collection<Proyecto> geIncidente(); //Preguntar q es esto y q tiene q ver con spark

    public Integrante getIncidente(String id);

    public Integrante modifyIncidente(Incidente incidente) throws IntegranteException;

    public void deleteIncidente(String id);

    public boolean existIncidente(String id);
}
