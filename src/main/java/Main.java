import Clases.Auto;
import Clases.Direccion;
import Clases.Marca;
import Clases.Propietario;
import Clases.Utils.Constans;
import Clases.Utils.ConstansMarca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String Nombre=null,CPF=null,RG=null;
        String calle=null, vecindario=null, ciudad=null;

        System.out.println("Bienvenido al acompañante de viaje Luna ");
        System.out.println("en todo momento podra observar el estado de su viaje ");
        System.out.println("para acelerar solo precione enter. Si desea subir de marcha agregar la letra M junto a la marcha que desea, solo si el auto es mecanico");
        System.out.println("aqui un par de ejemplos:"+"\nM1"+"\nM2"+"\nM3"+"\nMR");
        System.out.println("para frenar ingrese la letra F ");
        System.out.println("Ingrese sus datos personales ");
        while(true) {

            if(Nombre==null||Nombre.equals("")) {
                System.out.println("Ingrese nombre(Obligatorio): ");
                Nombre = in.readLine();
            }

            if(Nombre.equals("")){
                continue;
            }

            if(CPF==null||CPF.equals("")) {
                System.out.println("Ingrese CPF (Obligatorio)");
                CPF = in.readLine();
            }
            if(CPF.equals("")){
                continue;
            }

            if(RG==null||RG.equals("")) {
                System.out.println("Ingrese RG(Obligatorio)");
                RG = in.readLine();
            }
            if(RG.equals("")){
                continue;
            }
            if(calle==null||calle.equals("")) {
                System.out.println("Ingrese calle de recidencia(Obligatorio)");
                calle = in.readLine();
            }
            if(calle.equals("")){
                continue;
            }
            if(vecindario==null||vecindario.equals("")) {
                System.out.println("Ingrese vecindario(Obligatorio)");
                vecindario = in.readLine();
            }
            if(vecindario.equals("")){
                continue;
            }
            if(ciudad==null||ciudad.equals("")) {
                System.out.println("Ingrese ciudad(Obligatorio)");
                ciudad = in.readLine();
            }
            if(ciudad.equals("")){
                continue;
            }
            break;
        }
        Direccion direccion= new Direccion(calle,vecindario,ciudad);
        Propietario propietario =new Propietario(Nombre,CPF,RG,direccion);
        System.out.println("Ingrese su fecha de nacimiento dd/mm/yyyy");
        try {
            propietario.setFechaDeNacimiento(new Date(in.readLine()));
        }catch (Exception e){
            System.out.println("ingreso mal formato de fecha o no la ingreso");
        }
        Auto auto= new Auto(propietario);
        auto.setChasis(Constans.chasisDefault);
        auto.setColor(Constans.colorDefault);
        auto.setModelo(Constans.nrModeloDefault);
        auto.setVelocidadMaxima(Constans.velocidadMaximaDefault);
        auto.setNumeroDePuertos(Constans.numeroDepuestosDefault);
        auto.setTechoSolar(Constans.techoSolarDefault);
        auto.setNumeroDeMarchas(Constans.numeroDeMarchasDefault);
        auto.setTransmisionAutomatica(Constans.transmisionAutomaticaDefault);
        Marca marca = new Marca(ConstansMarca.marcaNombreDefault,ConstansMarca.nrModeloDefault,ConstansMarca.ano,ConstansMarca.codIdentificado);
        marca.setNrDeModelo(ConstansMarca.nrModeloDefault);
        auto.setMarca(marca);
        System.out.println("las caracteristicas de su auto son "+auto);
        System.out.println("iniciando viaje");
        while (true){
            if(auto.getMarchaActual()==null){
                auto.setMarchaActual(1);
            }
            System.out.println("velocidad ="+auto.getVelocidadActual());
            if (auto.getMarchaActual()>0) {
                System.out.println("marcha =" + auto.getMarchaActual());
            }else{
                System.out.println("marcha =R");
            }
            System.out.println("tanque ="+auto.getCapacidadTanque());
            System.out.println(" autonomia="+auto.calcularAutonomia(134.0));

            String entrada= in.readLine();
            if (entrada.equals("")){
                auto.acelerar();
            }else if(entrada.contains("M")&&!entrada.equals("MR")){
                auto.cambioDeMarcha(Integer.parseInt(entrada.replaceAll("M","")));
            }else if(entrada.equals("F")){
                auto.frenar();
            }else if(entrada.equals("MR")){
                auto.cambioDeMarcha(-1);
            }
        }
    }
}
