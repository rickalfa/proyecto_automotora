/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;



/**
 *
 * @author rb__s
 */
public class ConexionSingleton {
    
    private static ConexionSingleton instance;
    
    Database db_conex = new Database();
    
    private static Connection Conn;
    
    private ConexionSingleton(){
    
    
        
    }
    
    public static ConexionSingleton getInstance(){
    
        if(instance == null){
        
            instance = new ConexionSingleton();
            
        }
        
        return instance;
        
    }
    
    
    public Connection ConectarDb(){
    
   
           try{
            
            Class.forName(db_conex.getDriver());
        
            Conn = DriverManager.getConnection(db_conex.getUrl(),db_conex.getUser(),db_conex.getPass());
            
        
            System.out.print(" \n conexion establecida con la base de datos \n");
            
           } catch(Exception e){
        
            System.err.println("Error Conexion base de datos : " + e.getMessage());
        
           }
             
           return Conn;  
    
    }
    
    private static void desconectarDb(){
    
        Conn = null;
    
    
    
    }
    
}
