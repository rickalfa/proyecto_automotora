/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observers;

/**
 *
 * @author rb__s
 */
public class ClienteObserver implements IObserver {

    @Override
    public void update(String eventType) {
      
        System.out.print("cliente observer Notificado");
    
    }
    
}
