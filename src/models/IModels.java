/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author rb__s
 */
public interface IModels {
    
    public String getDates();
    
    public String getId();
    
    public boolean Update();
    
    public void create();
    
    public ArrayList<String[]> select(int id); 
    
    public boolean delete();
    
    
    
}
