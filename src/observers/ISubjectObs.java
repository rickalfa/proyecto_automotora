/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observers;

/**
 *
 * @author rb__s
 */
public interface ISubjectObs {
    
    void subcribeOb(IObserver observer);
    void unsubcribeob(IObserver observer);
    void notifyObservers(String eventType);
    
    
}
