package proyecto;
import java.util.Collection;

public interface ProyectoService {

    public void addProyecto(Proyecto proyecto);

    public Collection<Proyecto> getProyectos(); //Preguntar q es esto y q tiene q ver con spark

    public Proyecto getProyecto(int id);

    public Proyecto modifyProyecto(Proyecto proyecto) throws ProyectoException;

    public void deleteProyecto(int id);

    public boolean existProyecto(int id);
}
