package usuario;

import integrante.IntegranteException;
import usuario.Usuario;
import usuario.UsuarioService;

import java.util.Collection;

public class UsuarioServiceMapImpl implements UsuarioService {

    @Override
    public void addUsuario(Usuario usuario) {

    }

    @Override
    public Collection<Usuario> getUsuarios() {
        return null;
    }

    @Override
    public Usuario getUsuario(int id) {
        return null;
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) throws IntegranteException {
        return null;
    }

    @Override
    public void deleteUsuario(int id) {

    }

    @Override
    public boolean existUsuario(int id) {
        return false;
    }
}
