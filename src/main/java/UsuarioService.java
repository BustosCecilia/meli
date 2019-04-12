import java.util.Collection;
public interface UsuarioService {

    public void addUsuario(Usuario usuario);

    public Collection <Usuario> getUsuario(); //Preguntar q es esto y q tiene q ver con spark

    public Usuario getUsuario(String id);

    public Usuario modifyUsuario(Usuario usuario) throws IntegranteException;

    public void deleteUsuario(String id);

    public boolean existUsuario(String id);

    //ver de crear un metodo agraga proyecto e incidente
}
