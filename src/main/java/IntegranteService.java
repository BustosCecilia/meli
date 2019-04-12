import java.util.Collection;

public interface IntegranteService {

    public void addIntegrante(Integrante integrante);

    public Collection <Integrante> getIntegrantes(); //Preguntar q es esto y q tiene q ver con spark

    public Integrante getIntegrante(String id);

    public Integrante modifyIntegrante(Integrante integrante) throws IntegranteException;

    public void deleteIntegrante(String id);

    public boolean existIntegrante(String id);

}