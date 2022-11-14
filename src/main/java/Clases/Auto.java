package Clases;

public class Auto {
    private String modelo;
    private String color;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private Integer velocidadMaxima;
    private Integer velocidadActual=0;
    private Integer numeroDePuestos;
    private Boolean TechoSolar ;
    private Integer numeroDeMarchas;
    private Boolean transmisionAutomatica;
    private Integer marchaActual=1;
    private Double tanque=28000.0;



    public Auto(Propietario propietario) {
        this.propietario = propietario;
    }

    public Integer acelerar(){
        if(velocidadActual<=velocidadMaxima)
        this.velocidadActual+=marchaActual;
        this.tanque-=1;
        return this.velocidadActual;
    }
    public void frenar(){
        this.velocidadActual=0;
    }
    public Integer cambioDeMarcha (Integer marcha){
        if(marcha>0&&marcha<=numeroDeMarchas) {
            this.marchaActual = marcha;
        }else if(velocidadActual==0&&marcha<0){
            return marchaActual=marcha;
        }
        return this.marchaActual;
    }

    public Double calcularAutonomia(Double consumo){
        return tanque/consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Integer getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Integer velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Integer getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(Integer velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Integer getNumeroDePuestos() {
        return numeroDePuestos;
    }

    public void setNumeroDePuertos(Integer numeroDePuestos) {
        this.numeroDePuestos = numeroDePuestos;
    }

    public Boolean getTechoSolar() {
        return TechoSolar;
    }

    public void setTechoSolar(Boolean techoSolar) {
        TechoSolar = techoSolar;
    }

    public Integer getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(Integer numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public Boolean getTransmisionAutomatica() {
        return transmisionAutomatica;
    }

    public void setTransmisionAutomatica(Boolean transmisionAutomatica) {
        this.transmisionAutomatica = transmisionAutomatica;
    }
    public Integer getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(Integer marchaActual) {
        this.marchaActual = marchaActual;
    }
    public Double getCapacidadTanque() {
        return tanque;
    }

    public void setCapacidadTanque(Double capacidadTanque) {
        this.tanque = capacidadTanque;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", marca=" + marca +
                ", chasis='" + chasis + '\'' +
                ", propietario=" + propietario +
                ", velocidadMaxima=" + velocidadMaxima +
                ", velocidadActual=" + velocidadActual +
                ", numeroDePuestos=" + numeroDePuestos +
                ", TechoSolar=" + TechoSolar +
                ", numeroDeMarchas=" + numeroDeMarchas +
                ", transmisionAutomatica=" + transmisionAutomatica +
                ", marchaActual=" + marchaActual +
                ", tanque=" + tanque +
                '}';
    }
}
