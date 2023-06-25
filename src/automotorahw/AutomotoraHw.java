/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotorahw;

import java.lang.reflect.Field;

import factoryobjects.*;
import models.*;
import controllers.Application;

/**
 *
 * @author rb__s
 */
public class AutomotoraHw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FactoryModel FactorModel = new ClienteFactory();
        
        Application App = new Application(FactorModel);
        
        App.printDat();
        
        
        
    }
    
}
