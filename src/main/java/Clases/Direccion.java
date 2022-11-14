package Clases;

public class Direccion {
    private String calle;
    private String vecindario;
    private String ciudad;
    private String expresar;
    private String codigoPostal;
    private String complemento;

    public Direccion(String calle, String vecindario, String ciudad) {
        this.calle = calle;
        this.vecindario = vecindario;
        this.ciudad = ciudad;
    }

    public Direccion(String calle, String vecindario, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.vecindario = vecindario;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public Direccion(String calle, String vecindario, String ciudad, String expresar, String codigoPostal, String complemento) {
        this.calle = calle;
        this.vecindario = vecindario;
        this.ciudad = ciudad;
        this.expresar = expresar;
        this.codigoPostal = codigoPostal;
        this.complemento = complemento;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getVecindario() {
        return vecindario;
    }

    public void setVecindario(String vecindario) {
        this.vecindario = vecindario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getExpresar() {
        return expresar;
    }

    public void setExpresar(String expresar) {
        this.expresar = expresar;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", vecindario='" + vecindario + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", expresar='" + expresar + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
