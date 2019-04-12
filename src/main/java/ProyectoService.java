import java.util.Collection;

public interface ProyectoService {

    public void addProyecto(Proyecto proyecto);

    public Collection<Proyecto> getProyecto(); //Preguntar q es esto y q tiene q ver con spark

    public Integrante getProyecto(String id);

    public Integrante modifyProyecto(Proyecto proyecto) throws IntegranteException;

    public void deleteProyecto(String id);

    public boolean existProyecto(String id);
}
