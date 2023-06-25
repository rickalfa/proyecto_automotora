/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import factoryobjects.FactoryModel;
import models.*;

/**
 *
 * @author rb__s
 */
public class Application {
    
    private IModels Model;
    
    public Application(FactoryModel FactorModel){
    
        this.Model =  FactorModel.createModel();
        
        
    }
    
    
    public void printDat(){
    
       String dates_model = this.Model.getDates();
        
        System.out.print(dates_model);
        
    }
    
    
}
