/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observers;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author rb__s
 */
public class SubjectObsManager implements ISubjectObs {

    private List<IObserver> ObserversList = new ArrayList<>();
    
    
    public SubjectObsManager(){
    
    
    }
            
    @Override
    public void subcribeOb(IObserver observer) {
        
        this.ObserversList.add(observer);

    
    }

    @Override
    public void unsubcribeob(IObserver observer) {
       
      this.ObserversList.remove(observer);
    
    }

    @Override
    public void notifyObservers(String eventType) {
      
        for(IObserver observer : this.ObserversList){
        
            observer.update(eventType);
        }
    
    }
    
}
