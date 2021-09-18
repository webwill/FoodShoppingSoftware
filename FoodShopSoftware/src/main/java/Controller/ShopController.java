/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ShopModel;
import View.ShopView;


/**
 *
 * @author willi
 */
public class ShopController {
    
    private ShopModel model;
    private ShopView view;
    
    public ShopController(ShopView view, ShopModel model) {
        this.view = view;
        this.model = model;
        
        startView();
        
    }
    
    private void startView(){
        view.getAddFoodButton().addActionListener(e -> addFoodToList());
    }

    private void addFoodToList() {
        String item = view.getFoodItemField().getText();
        System.out.println("The food is " + item);
        
        //Passes through the user new Food Item to the model
        model.addFoodItem(item);
        
        updateAmount();
    }
    
    public void updateAmount(){
        view.getAmountLabel().setText("Total: £" + model.getTotalAmount());
       
        
    }
    
    
    
}
