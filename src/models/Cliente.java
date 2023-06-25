/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import conexion.ConexionSingleton;

/**
 *
 * @author rb__s
 */
public class Cliente extends Model implements IModels {
    
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

    
    
    
}
