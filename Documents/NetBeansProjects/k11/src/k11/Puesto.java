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
public class Puesto extends Carro{
    
    private int nuevoPuesto;
    public Carro ObjetoCarro;

    public Puesto() {
        ObjetoCarro = new Carro();
    }

    public Puesto(int nuevoPuesto) {
        this.nuevoPuesto = nuevoPuesto;
    }
    
    public Carro getObjetoCarro() {
        return ObjetoCarro;
    }
    
    public boolean estaOcupado(){
        return true;
    }
    
    public void parquearCarro(Carro c){
    }
    
    public void sacarCarro(){
        
    }

    public int getNuevoPuesto() {
        return nuevoPuesto;
    }

    
    public boolean tieneCarroConPlaca(String placa){
        return this.ObjetoCarro.tienePlaca(placa);
    }
            
    
    
    
    
    
    
    
}
