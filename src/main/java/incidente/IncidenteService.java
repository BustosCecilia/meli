package incidente;
import integrante.IntegranteException;
import incidente.Incidente;

import java.util.Collection;

public interface IncidenteService {

    public void addIncidente(Incidente incidente);

    public Collection<Incidente> getIncidentes(); //Preguntar q es esto y q tiene q ver con spark

    public Incidente getIncidente(int id);

    public Incidente modifyIncidente(Incidente incidente) throws IncidenteException;

    public void deleteIncidente(int id);

    public boolean existIncidente(int id);
}
