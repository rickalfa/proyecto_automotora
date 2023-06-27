/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import factoryobjects.*;
import java.util.ArrayList;
import models.*;
import observers.SubjectObsManager;

/**
 *
 * @author rb__s
 */
public class ApplicationFacade {
    
    private SubjectObsManager ObserverManipulador = new SubjectObsManager();
    
    private IModels Model;
    
    public ApplicationFacade(FactoryModel FactorModel){
    
        this.Model =  FactorModel.createModel();
        
         
    }
    
    public void printDat( ArrayList<String[]> List_ar){
    
      
        
         ArrayList<String[]> Models_ar = List_ar;
        
        
        for(int i =0; i < Models_ar.size(); i++){
        
            String[] ModelDat = Models_ar.get(i);
            
            System.out.print(ModelDat);
            
            for(String dates : ModelDat){
            
                System.out.println(dates);
            
            }
        }
        
    }
    
    
    public void printDat(){
    
       String dates_model = this.Model.getDates();
        
        System.out.println(Model.select(0));
        
        ArrayList<String[]> Models_ar = Model.select(0);
        
        
        
        for(int i =0; i < Models_ar.size(); i++){
        
            String[] ModelDat = Models_ar.get(i);
            
            System.out.print(ModelDat);
            
            for(String dates : ModelDat){
            
                System.out.println(dates);
            
            }
        }
          
        
    }
    
    public void ventaVehiculo(){
    
        
        System.out.println(" eliga un vehiculo \n de estos : ");
        
        /// contruimos los objetos que se necsitan para la venta  
        this.ventaCreaciondeObjetos();
        
             
        /// seleccionamos vehiculos
        
        
        /// seleccionamos financiamento en caso de solicitar credito o si
        /// Pagamos al contado
        /// realizamos la Venta  
        /// notificamos a los Modelos Observadores 
        
  
    }
    
    
    public void ventaCreaciondeObjetos(){
    
        
        ClienteObserverFactory clFactoryObs;
      
        Cliente ClienteComprador = new Cliente();
        Financiera Finan = new Financiera();
        Segmento Seg = new Segmento();
        Vehiculo Vehiculos = new Vehiculo();
        
        
         this.printDat(Vehiculos.select(0));
        
         
         this.ObserverManipulador.subcribeOb(ClienteComprador);
         this.ObserverManipulador.subcribeOb(Finan);
         this.ObserverManipulador.subcribeOb(Seg);
         this.ObserverManipulador.subcribeOb(Vehiculos);
        
        
    }
    
    
    
    
    
    
}
