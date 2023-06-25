/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;



/**
 *
 * @author rb__s
 */
public class Venta {

    private Cliente Cliente_venta;
    private int id_Venta;
    private double valor_Bruto;
    private double valor_neto;
    private String financiamiento;
    
    public Venta(String Segmento_de_Vehiculo){
    
        
    }
    
    
    
    
    /**
     * @return the Cliente_venta
     */
    public Cliente getCliente_venta() {
        return Cliente_venta;
    }

    /**
     * @param Cliente_venta the Cliente_venta to set
     */
    public void setCliente_venta(Cliente Cliente_venta) {
        this.Cliente_venta = Cliente_venta;
    }

    /**
     * @return the id_Venta
     */
    public int getId_Venta() {
        return id_Venta;
    }

    /**
     * @param id_Venta the id_Venta to set
     */
    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    /**
     * @return the valor_Bruto
     */
    public double getValor_Bruto() {
        return valor_Bruto;
    }

    /**
     * @param valor_Bruto the valor_Bruto to set
     */
    public void setValor_Bruto(double valor_Bruto) {
        this.valor_Bruto = valor_Bruto;
    }

    /**
     * @return the valor_neto
     */
    public double getValor_neto() {
        return valor_neto;
    }

    /**
     * @param valor_neto the valor_neto to set
     */
    public void setValor_neto(double valor_neto) {
        this.valor_neto = valor_neto;
    }

    /**
     * @return the financiamiento
     */
    public String getFinanciamiento() {
        return financiamiento;
    }

    /**
     * @param financiamiento the financiamiento to set
     */
    public void setFinanciamiento(String financiamiento) {
        this.financiamiento = financiamiento;
    }
    

    
}
