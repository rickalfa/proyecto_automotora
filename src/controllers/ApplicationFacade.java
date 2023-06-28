/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import factoryobjects.*;
import java.util.ArrayList;
import java.util.Scanner;
import models.*;
import observers.SubjectObsManager;

/**
 *
 * @author rb__s
 */
public class ApplicationFacade {
    
    private SubjectObsManager ObserverManipulador = new SubjectObsManager();
    
    private IModels Model;
    
    private Cliente clientedat;
    
    public ApplicationFacade(FactoryModel FactorModel){
    
        this.Model =  FactorModel.createModel();
        
         
    }
    
    public void printDat( ArrayList<String[]> List_ar){
    
      
        
         ArrayList<String[]> Models_ar = List_ar;
        
        
        for(int i =0; i < Models_ar.size(); i++){
        
            String[] ModelDat = Models_ar.get(i);
            
             System.out.print("\n");
            
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
            
           // System.out.print(ModelDat);
            
            for(String dates : ModelDat){
            
                System.out.printf(dates+ "\n", ModelDat);
            
            }
        }
          
        
    }
    
    public void ventaVehiculo(){
    
        
        
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
      
        this.clientedat = new Cliente();
        Financiera Finan = new Financiera();
        Segmento Seg = new Segmento();
        Vehiculo Vehiculos = new Vehiculo();
        
        
         this.ObserverManipulador.subcribeOb(this.clientedat);
         this.ObserverManipulador.subcribeOb(Finan);
         this.ObserverManipulador.subcribeOb(Seg);
         this.ObserverManipulador.subcribeOb(Vehiculos);
        
            this.printDat(  this.clientedat.select(0));
         
         int select_cliente = this.seleccionarCliente();
         
          this.printDat(Vehiculos.select(0));
         
     
         int select_idvehiculo = this.seleccionarVehiculo();
        
        
         
         int select_pago = this.seleccionarpago();
        
        switch(select_pago){
        
            case 1:
                
                 int select_credit = this.seleccionarCredito();
                
                 this.printDat(Finan.select(select_credit));
                
                 ArrayList<String[]> finan_dat = Finan.select(select_credit);
                 
                 ArrayList<String[]> vehiculo_dat = Vehiculos.select(select_idvehiculo);
                  
                 ArrayList<String[]> cliente_dat = this.clientedat.select(select_cliente);
                  
                  this.mostrarBoleta(cliente_dat, vehiculo_dat, cliente_dat);
                 
                 
                               
                // this.ObserverManipulador.notifyObservers("venta_finalizada");
                     
                           
                 break;
              
            case 2:
                
                System.out.print(" pago efectivo");
                
                this.ObserverManipulador.notifyObservers("venta_finalizada");
                
                
                break;
            
            default:
                
                
                break;
             
        
        
        }
         
       
         
  
        
    }
    
    private int seleccionarCliente(){
    
       System.out.println(" Selecione el Cliente : \n");
    
        Scanner input_sel_vehiculo = new Scanner(System.in);
        
        int inputdat = input_sel_vehiculo.nextInt();
        
        return inputdat;
    
    }
    
    private int seleccionarVehiculo(){
    
        System.out.println(" Selecione un vehiculo del catalogo : \n");
    
        Scanner input_sel_vehiculo = new Scanner(System.in);
        
        int inputdat = input_sel_vehiculo.nextInt();
        
        return inputdat;
    
    }
    
    private int seleccionarpago(){
    
        
        System.out.println(" Selecione metodo de pago \n "
                   + " 1.- Credito \n 2.- efectivo ");
    
        Scanner input_sel_vehiculo = new Scanner(System.in);
        
        int inputdat = input_sel_vehiculo.nextInt();
        
        return inputdat;
        
        
    }
    
    
    private int seleccionarCredito(){
    
        int select = 0;
        
        System.out.print(" Seleccionar entidad financiera credito banco \n "
                + " 1.- gambaBank \n 2.- DolaruBank \n 3.- BreakBank ");
        
        Scanner input_sel = new Scanner(System.in);
        
        select = input_sel.nextInt();
        
        return select;   
        
       
    }
    
    private void mostrarBoleta(ArrayList<String[]> finan_dat, ArrayList<String[]> vehiculo_dat, ArrayList<String[]> cliente_dat ){
        
        
       
        if(finan_dat != null ){
        
        String[] dates_finan = finan_dat.get(0);
        
        String[] dates_vehiculo = vehiculo_dat.get(0);
        
        String[] dates_cliente = cliente_dat.get(0);
        
        Venta ventacompleta = new Venta(dates_finan[3]);
        
        double valor_bruto_vehi = Double.parseDouble(dates_vehiculo[3]);
        
        ventacompleta.setValor_Bruto(valor_bruto_vehi);
        
        System.out.println(ventacompleta);
        
        System.out.print("nombre - cliente :  " + dates_cliente[2]+ " \n  " );
        
        
        }
    
        
        
        
    }
    
    private void llamarVenta(){
   
        try{
        Class clase = Class.forName("models.Venta");
        
        String metodoName = "getId_Venta";
        
        Class Clases[] = {int.class};
        
        Object obj;
        
        obj = clase.getConstructor(null).newInstance(null);
        
        obj.getClass().getMethod(metodoName, Clases).invoke(obj, Clases);
        
        
        
        
        
        }catch(Exception e){
        
            e.printStackTrace();
        
        }
        
        
    }
    
    
    
}
