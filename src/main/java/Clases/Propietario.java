package Clases;

import java.util.Date;

public class Propietario {
    private String nombre;
    private String CPF;
    private String RG;
    private Date fechaDeNacimiento;
    private Direccion direccion;


    public Propietario(String nombre, String CPF, String RG) {
        this.nombre = nombre;
        this.CPF = CPF;
        this.RG = RG;
    }

    public Propietario(String nombre, String CPF, String RG, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.CPF = CPF;
        this.RG = RG;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Propietario(String nombre, String CPF, String RG, Date fechaDeNacimiento, Direccion direccion) {
        this.nombre = nombre;
        this.CPF = CPF;
        this.RG = RG;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
    }

    public Propietario(String nombre, String CPF, String RG, Direccion direccion) {
        this.nombre = nombre;
        this.CPF = CPF;
        this.RG = RG;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", direccion=" + direccion +
                '}';
    }
}
