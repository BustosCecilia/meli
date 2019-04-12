import java.util.Collection;
import java.util.HashMap;

public class IntegranteServiceMapImpl implements IntegranteService {

    private HashMap<String, Integrante> integranteMap;

    public IntegranteServiceMapImpl() {
        integranteMap = new HashMap<String, Integrante>();
    }

    @Override // Esto indica como notacion, que este metodo es algun metodo de la interfaz que implementa.
    public void addIntegrante(Integrante integrante) {
        integranteMap.put(integrante.getId(), integrante);
    }

    @Override
    public Collection<Integrante> getIntegrantes() {
        return integranteMap.values();
    }

    @Override
    public Integrante getIntegrante(String id) {
        return integranteMap.get(id);
    }

    @Override
    public Integrante modifyIntegrante(Integrante integrante) throws IntegranteException {
        try {
            if(integrante == null){
                throw new IntegranteException("El id del integrante no puede ser nulo");
            }
            Integrante integranteaEditar = integranteMap.get(integrante.getId());
            if(integrante.getNombre() != null){
                integranteaEditar.setNombre(integrante.getNombre());
            }
            if(integrante.getApellido() != null){
                integranteaEditar.setApellido(integrante.getApellido());
            }
            if(integrante.getEmail() != null){
                integranteaEditar.setEmail(integrante.getEmail());
            }
            return integranteaEditar;
        } catch (Exception exception) {
            throw new IntegranteException(exception.getMessage());
        }
    }

    @Override
    public void deleteIntegrante(String id) {
        integranteMap.remove(id);
    }

    @Override
    public boolean existIntegrante(String id) {
        return integranteMap.containsKey(id);
    }
}
