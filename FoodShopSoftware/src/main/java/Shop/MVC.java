/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import View.ShopView;
import Model.ShopModel;
import Controller.ShopController;



/**
 *
 * @author willi
 */
public class MVC {
    
    public static void main(String[] args) {
        
        ShopView view = new ShopView();
        ShopModel model = new ShopModel();
        
        
        ShopController controller = new ShopController(view, model);
        
    }


    
}
