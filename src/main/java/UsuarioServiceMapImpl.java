import java.util.Collection;
import java.util.HashMap;

public class UsuarioServiceMapImpl implements UsuarioService {
    private HashMap<String, Usuario> usuarioMap;

    public UsuarioServiceMapImpl() {
        usuarioMap = new HashMap<String, Usuario>();
    }
    @Override
    public void addUsuario(Usuario usuario) {

    }

    @Override
    public Collection<Usuario> getUsuario() {
        return null;
    }

    @Override
    public Usuario getUsuario(String id) {
        return null;
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) throws IntegranteException {
        return null;
    }

    @Override
    public void deleteUsuario(String id) {

    }

    @Override
    public boolean existUsuario(String id) {
        return false;
    }
}
