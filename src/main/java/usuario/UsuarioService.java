package usuario;

import integrante.IntegranteException;
import usuario.Usuario;

import java.util.Collection;
public interface UsuarioService {

    public void addUsuario(Usuario usuario);

    public Collection <Usuario> getUsuarios(); //Preguntar q es esto y q tiene q ver con spark

    public Usuario getUsuario(int id);

    public Usuario modifyUsuario(Usuario usuario) throws IntegranteException;

    public void deleteUsuario(int id);

    public boolean existUsuario(int id);

    //ver de crear un metodo agraga proyecto e incidente
}
