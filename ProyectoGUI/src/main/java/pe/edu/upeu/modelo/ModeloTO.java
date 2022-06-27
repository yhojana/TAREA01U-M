package pe.edu.upeu.modelo;

public class ModeloTO {
    public String idmodelo;
    public String nombremodelo;
    
    public ModeloTO(String idmodelo, String nombremodelo) {
        this.idmodelo = idmodelo;
        this.nombremodelo = nombremodelo;
    }

    public String getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(String idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getNombremodelo() {
        return nombremodelo;
    }

    public void setNombremodelo(String nombremodelo) {
        this.nombremodelo = nombremodelo;
    }

    
}
