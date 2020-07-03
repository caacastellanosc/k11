/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k11;

/**
 *
 * @author Alejandro
 */
public class Carro {
    
    private String placa;
    private int horaLlegada;

    public Carro() {
    }

    
    
    public Carro(String placa, int horaLlegada) {
        this.placa = placa;
        this.horaLlegada = horaLlegada;
    }

    public String darPlaca() {
        return placa;
    }
    
    public int darHoraLlegada() {
        return horaLlegada;
    }

    public boolean tienePlaca(String placa){
        return true;
    }
    
    public int darTiempoEnParqueadero(int tiempo){
        int hora=0;
        if (tiempo >= this.horaLlegada) {
            hora= tiempo-horaLlegada;
            
        }
        return hora;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
    
    
    
}
