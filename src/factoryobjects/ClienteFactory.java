/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryobjects;

import models.Cliente;
import models.IModels;

/**
 *
 * @author rb__s
 */
public class ClienteFactory extends FactoryModel {

    @Override
    public IModels createModel() {
     
        return new Cliente();
    
    }
    
    
    
}
