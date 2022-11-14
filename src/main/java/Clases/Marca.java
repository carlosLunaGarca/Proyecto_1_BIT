package Clases;

public class Marca {
    private String nombre;
    private String nrDeModelo;
    private String ano;
    private String codIdentificador;

    public Marca(String nombre, String nrDeModelo, String ano, String codIdentificador) {
        this.nombre = nombre;
        this.nrDeModelo = nrDeModelo;
        this.ano = ano;
        this.codIdentificador = codIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNrDeModelo() {
        return nrDeModelo;
    }

    public void setNrDeModelo(String nrDeModelo) {
        this.nrDeModelo = nrDeModelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(String codIdentificador) {
        this.codIdentificador = codIdentificador;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", nrDeModelo='" + nrDeModelo + '\'' +
                ", ano='" + ano + '\'' +
                ", codIdentificador='" + codIdentificador + '\'' +
                '}';
    }
}
