/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author willi
 */
public class Food {
    
    private String name;
    private double unitCost;
    private int quality;
    
    public Food(String name, double unitCost, int quality){
        this.name = name;
        this.unitCost = unitCost;
        this.quality = quality;
    }
    
}
