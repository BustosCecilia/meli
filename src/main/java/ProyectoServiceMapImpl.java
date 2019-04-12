import java.util.Collection;
import java.util.HashMap;

public class ProyectoServiceMapImpl implements ProyectoService {
    private HashMap<String, Proyecto> proyectoMap;

    public ProyectoServiceMapImpl() {
        proyectoMap = new HashMap<String, Proyecto>();
    }

    @Override
    public void addProyecto(Proyecto proyecto) {

    }

    @Override
    public Collection<Proyecto> getProyecto() {
        return null;
    }

    @Override
    public Integrante getProyecto(String id) {
        return null;
    }

    @Override
    public Integrante modifyProyecto(Proyecto proyecto) throws IntegranteException {
        return null;
    }

    @Override
    public void deleteProyecto(String id) {

    }

    @Override
    public boolean existProyecto(String id) {
        return false;
    }
}
