/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author willi
 */
public class ShopModel {
    
    private ArrayList<Food> shoppingList;
    private double amount;
    
    public ShopModel(){
        shoppingList = new ArrayList();
        amount = 0.0;
    }
    
    public double getTotalAmount(){
        return amount;
    }

    public void addFoodItem(String name) {
        shoppingList.add(new Food(name, 2.50, 1));
        
        updateAmount(2.50);
    }
    
    private void updateAmount(double itemCost){
        amount += itemCost;
    }
    
    public int getListLength(){
        return shoppingList.size();
    }
    
    
    
    
}
