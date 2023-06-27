/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryobjects;

import observers.ClienteObserver;
import observers.IObserver;

import models.*;


/**
 *
 * @author rb__s
 */
public class ClienteObserverFactory extends FactoryObjectAbs {

    @Override
    public IObserver CreateObserver() {
               
        return new ClienteObserver();
     
        
    }

    
    public IObserver CreateObserver(String nameObs){
    
        
        switch(nameObs){
                case "cliente":
                    
                    return new Cliente();
                                         
                case "financiera":
                    
                    return new Financiera();
                    
                    
                case "vehiculo":
                    
                    return new Vehiculo();
                
                case "segmento":
                    
                    return new Segmento();      
                    
                default:
                    
                    return null;
                
        }
         
        
      
    }
 
    
    
}
