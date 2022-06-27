package pe.edu.upeu.modelo;

public class CategoriaTO {
public String idcat;
public String nombrecat;

    public CategoriaTO(String idcat, String nombrecat) {
    this.idcat = idcat;
    this.nombrecat = nombrecat;
}
    public String getIdcat() {
        return idcat;
    }
    public void setIdcat(String idcat) {
        this.idcat = idcat;
    }
    public String getNombrecat() {
        return nombrecat;
    }
    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }



    
}
