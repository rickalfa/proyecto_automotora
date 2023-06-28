/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.ResultSet;
import java.util.ArrayList;
import observers.IObserver;

/**
 *
 * @author rb__s
 */
public class Financiera extends Model implements IObserver, IModels {

    
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
        
         System.out.print(" Financiera NOtificado");
    
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
                
               query = "SELECT * FROM financiera";
         
              }else{
        
               query = "SELECT * FROM financiera WHERE id_financiera="+id;
         
        
              }
         
          ResultSet rs = super.executerQry(query);
         
                while(rs.next()){
              
                     String id_f = String.valueOf( rs.getInt("id_financiera"));
                     String nombre = rs.getString("nombre");
                     String porcentaje_desc = rs.getString("porcentaje_descuento");
                   
                    
                    String[] financieraadd = {id_f, nombre, porcentaje_desc};
                    
                    vehiculos_ar.add(financieraadd);
                    
             
         
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
    
 
    
    
    
}
