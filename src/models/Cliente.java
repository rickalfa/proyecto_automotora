/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.ResultSet;
import java.util.ArrayList;

import conexion.ConexionSingleton;
import observers.IObserver;


/**
 *
 * @author rb__s
 */
public class Cliente extends Model implements IModels, IObserver {
    
    private String rut;
    private String nombre;
    private String apellido;
    
    public Cliente(){
    
      super();
        
      super.conexionDb();
        
    
        
    }
    
    public Cliente(String _rut, String _nombre, String _apellido){
    
       
        
        this.rut = _rut;
        this.apellido = _apellido;
        this.nombre = _nombre;
        
    
    
    }
    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getDates() {
       
        String dates_cliente = "name : " + this.nombre + this.apellido;
        
        return dates_cliente;
       
    }

    @Override
    public String getId() {
    
        return this.rut;
    
    }

    @Override
    public boolean Update() {

        
        
        return true;
    
    }

    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String[]> select(int id) {

        String query;
        
        ArrayList<String[]> Clientes_ar = new ArrayList<String[]>();
        
         try{
             
              if(id == 0 || id < 0){
                
               query = "SELECT * FROM cliente";
         
              }else{
        
               query = "SELECT * FROM cliente WHERE id="+id;
         
        
              }
         
          ResultSet rs = super.executerQry(query);
         
                while(rs.next()){
              
                    String nombre = rs.getString("nombre");
                     String rut = rs.getString("rut");
                     String apellido = rs.getString("apellido");
                    
                    String[] Clienteadd = {rut, nombre, apellido};
                    
                    Clientes_ar.add(Clienteadd);
                    
             
         
                }
                
                return Clientes_ar;
                
                
                
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
