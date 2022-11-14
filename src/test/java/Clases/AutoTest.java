package Clases;

import Clases.Utils.Constans;
import Clases.Utils.ConstansMarca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

Auto auto;
Marca marca;
Direccion direccion;
    Propietario propietario;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        String Nombre="Carlos",CPF="1234sd",RG="asdas22334";
        String calle="45b", vecindario="bosa", ciudad="Bogota";

         direccion= new Direccion(calle,vecindario,ciudad);
         propietario =new Propietario(Nombre,CPF,RG,direccion);
        auto= new Auto(propietario);
        auto.setChasis(Constans.chasisDefault);
        auto.setColor(Constans.colorDefault);
        auto.setModelo(Constans.nrModeloDefault);
        auto.setVelocidadMaxima(Constans.velocidadMaximaDefault);
        auto.setNumeroDePuertos(Constans.numeroDepuestosDefault);
        auto.setTechoSolar(Constans.techoSolarDefault);
        auto.setNumeroDeMarchas(Constans.numeroDeMarchasDefault);
        auto.setTransmisionAutomatica(Constans.transmisionAutomaticaDefault);
        marca = new Marca(ConstansMarca.marcaNombreDefault,ConstansMarca.nrModeloDefault,ConstansMarca.ano,ConstansMarca.codIdentificado);
        marca.setNrDeModelo(ConstansMarca.nrModeloDefault);
        auto.setMarca(marca);


    }

    @Test
    void acelerar() {
        assertEquals(1,auto.acelerar());
    }

    @Test
    void frenar() {
        auto.setVelocidadActual(100);
        assertEquals(100, auto.getVelocidadActual());
        auto.frenar();
        assertEquals(0,auto.getVelocidadActual());
    }

    @Test
    void cambioDeMarcha() {
        auto.setMarchaActual(1);
        auto.setVelocidadActual(12);
        auto.cambioDeMarcha(-1);
        assertEquals(1,auto.getMarchaActual());
        auto.setVelocidadActual(0);
        auto.cambioDeMarcha(-1);
        assertEquals(-1,auto.getMarchaActual());
        assertEquals(3,auto.cambioDeMarcha(3));
    }

    @Test
    void calcularAutonomia() {
        assertEquals(28000.0/30.0, auto.calcularAutonomia(30.0));
    }
}