/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author willi
 */
public class ShopModelTest {
    

    @org.junit.jupiter.api.Test
    public void testAddFoodItem() {
        System.out.println("addFoodItem");
        String name = "";
        ShopModel instance = new ShopModel();
        instance.addFoodItem(name);
        
        int expResult = 1;
        int result = instance.getListLength();
       
       assertEquals(expResult, result);
            
        
        
        
        // TODO review the generated test code and remove the default call to fail.
    }

      @org.junit.jupiter.api.Test
      public void subFoodAmountTest(){
          
      }
      
      public void addingFoodAmount(){
            
      }
      

}
