/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k11;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Parqueadero extends Puesto {

    public static final int TAMANO = 40;
    public static final int NO_HAY_PUESTO = 1;
    public static final int PARQUEADERO_CERADO = -2;
    public static final int CARRO_NO_EXISTE = -3;
    public static final int CARRO_YA_EXISTE = -4;
    public static final int HORA_INICIAL = 6;
    public static final int HORA_CIERRE = 20;
    public static final int TARIFA_INICIAL = 1200;
    public ArrayList<Puesto> objetopuesto;
    private int tarifa;
    private int caja;
    private int horaActual;
    private boolean abierto;

    public Parqueadero() {
        objetopuesto = new ArrayList<>();
    }

    public String darPlacaCarro(int a) {
        return "a";
    }

    public int entrarCarro(String carro) {
        return 0;
    }

    public int sacarCarro(String carro) {
        return 0;
    }

    public int darMontoCaja() {
        return 0;
    }

    public int calcularPuestosLibres() {
        return 0;
    }

    public void cambiarTarifa(int a) {

    }

    private int buscarPuestoLibre() {
        return 0;
    }

    private int buscarPuestoCarro(String c) {
        return 0;
    }

    public void avanzarHora() {

    }

    public int darHoraActual() {
        return 0;
    }

    public boolean estaAbierto() {
        return true;
    }

    public int darTatifa() {
        return 0;
    }

    public boolean estaOcupado(int a) {
        return true;
    }

    public String metodo1() {
        return "a";
    }

    public String metodo2() {
        return "a";
    }

    public int darTiempoEnParqueadero(int pHoraSalida) {
        Puesto puesto = new Puesto();
        return puesto.darTiempoEnParqueadero(pHoraSalida);
    }

    public double darTiempoPromedio() {
        double promedio=0;
        int contador =0;
        
        for (int i = 0; i < objetopuesto.size(); i++) { 
            
            contador += HORA_CIERRE-objetopuesto.get(i).darHoraLlegada();
            
        }
        promedio = contador/objetopuesto.size();
        
        return promedio;
    }

    public Carro darCarroConMayorTiempo() {
        int mayor = 0, aux = 0, indice =0;
        
        for (int i = 0; i < objetopuesto.size(); i++) {         
        
            if (objetopuesto.get(i).darHoraLlegada() < HORA_CIERRE) {
                mayor = objetopuesto.get(i).darHoraLlegada();
                
            }
            if (aux > mayor) {
                aux = mayor;
                indice = i;
            }

        }
        return objetopuesto.get(indice).getObjetoCarro() ;
    }

    public boolean hayCarroMasDeOchoHoras() {
        
        boolean bandera = false;
        for (int i = 0; i < objetopuesto.size(); i++) {         
        
            if (HORA_CIERRE-objetopuesto.get(i).darHoraLlegada() > 8 ) {
                bandera = true;
            }
        }
        return bandera;
    }

    public ArrayList<Carro> darCarrosMasDeTresHorasParqueados() {
        
        ArrayList<Carro> carros = new ArrayList<>();
        for (int i = 0; i < objetopuesto.size(); i++) {         
        
            if (HORA_CIERRE-objetopuesto.get(i).darHoraLlegada() > 3 ) {
                carros.add(objetopuesto.get(i).getObjetoCarro());
            }
        }
        return carros;
    }
    

    public boolean hayCarrosPlacaIgual() {
        
        boolean bandera = false; 
        for (int i = 0; i < objetopuesto.size()-1; i++) {         
            if (objetopuesto.get(i).darPlaca() == objetopuesto.get(i+1).darPlaca()){
                 bandera = true ;
            }
        } 
        return bandera;

    }

}
