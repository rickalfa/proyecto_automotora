/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import observers.IObserver;

/**
 *
 * @author rb__s
 */
public class Financiera implements IObserver {

    
    private String nombre_financiera;
    private double porcentaje_descuento;
    
    public Financiera(){
    
    }
    
    public Financiera(String segmento_vehiculo){
        
    }
    
    
    
    
    /**
     * @return the nombre_financiera
     */
    public String getNombre_financiera() {
        return nombre_financiera;
    }

    /**
     * @param nombre_financiera the nombre_financiera to set
     */
    public void setNombre_financiera(String nombre_financiera) {
        this.nombre_financiera = nombre_financiera;
    }

    /**
     * @return the porcentaje_descuento
     */
    public double getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    /**
     * @param porcentaje_descuento the porcentaje_descuento to set
     */
    public void setPorcentaje_descuento(double porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }

    @Override
    public void updateOB(String eventType) {
        
        
    
    }
    
 
    
    
    
}
