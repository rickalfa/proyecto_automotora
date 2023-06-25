/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryobjects;

import observers.ClienteObserver;
import observers.IObserver;

/**
 *
 * @author rb__s
 */
public class ClienteObserverFactory extends FactoryObjectAbs {

    @Override
    public IObserver CreateObserver() {
       
        return new ClienteObserver();
    }

 
    
}
