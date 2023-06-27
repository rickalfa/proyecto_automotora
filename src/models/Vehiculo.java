/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.sql.ResultSet;

import observers.IObserver;
import conexion.ConexionSingleton;



/**
 *
 * @author rb__s
 */
public class Vehiculo extends Model implements IModels, IObserver {

     private String patente;
    private String marca;
    private double valor;
    private String modelo;
    
    public Vehiculo(String Segmento_de_Vehiculo){
    
         
         super.conexionDb();
        
            
    }
    
    public Vehiculo(){
    
          super.conexionDb();
        
         
    
    }
    
    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    
    
    @Override
    public String getDates() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String[]> select(int id) {
       String query;
        
        ArrayList<String[]> vehiculos_ar = new ArrayList<String[]>();
        
         try{
             
              if(id == 0 || id < 0){
                
               query = "SELECT * FROM vehiculo";
         
              }else{
        
               query = "SELECT * FROM vehiculo WHERE id="+id;
         
        
              }
         
          ResultSet rs = super.executerQry(query);
         
                while(rs.next()){
              
                    String patente = rs.getString("patente");
                     String marca = rs.getString("marca");
                     String valor = rs.getString("valor");
                     String modelo = rs.getString("modelo");
                    
                    String[] vehiculoadd = {patente, marca, valor, modelo};
                    
                    vehiculos_ar.add(vehiculoadd);
                    
             
         
                }
                
                return vehiculos_ar;
                
                
                
          }catch(Exception ex){
          
              ex.printStackTrace();
              
              return null;
              
          }
        
   }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateOB(String eventType) {
    
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    
    }
    
}
