/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


import java.sql.ResultSet;
import conexion.ConexionSingleton;


/**
 *
 * @author rb__s
 */
public class Model {
    
    private  ConexionSingleton ConnDb = ConexionSingleton.getInstance();
        
    
    public Model(){
        
     
    
    }
    
    protected void conexionDb(){
    
      
        
          ConnDb.ConectarDb();
        
    
    }
    
    protected ResultSet executerQry(String queryStr){
        
       ResultSet Rs = ConnDb.executeQry(queryStr);
        
        return Rs;
        
    }
    
}
