package enums;

public enum Criterio {
    address_line ("address_line"),
    agency_code ("agency_code"),
    distance ("distance");

    private String criterio;

    Criterio(String criterio){
        this.criterio = criterio;
    }

    public String getClasificacion() {
        return criterio;
    }

    public void setClasificacion(String criterio) {
        this.criterio = criterio;
    }
}
