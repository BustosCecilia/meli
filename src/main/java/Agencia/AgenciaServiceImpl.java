package Agencia;

import java.util.Collection;
import java.util.HashMap;

public class AgenciaServiceImpl implements AgenciaService{

    private HashMap<String, Agencia> agenciaMap;

    public AgenciaServiceImpl() {
        agenciaMap = new HashMap<String, Agencia>();
    }

    @Override
    public Collection<Agencia> getAgencia() {
            return agenciaMap.values();
    }
}
