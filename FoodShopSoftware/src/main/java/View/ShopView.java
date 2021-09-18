/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author willi
 */
public class ShopView {
    
    private JButton button;
    private JTextField foodItemField;
    private JLabel foodAmount;
    private JFrame frame;
    
    public ShopView(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        
        frame.setLayout(new java.awt.GridLayout(1, 1));
        
        button = new JButton("Add Food");
        foodItemField = new JTextField("Enter Food Item");
        foodItemField.setSize(100, 50);
        foodAmount = new JLabel("Total: £" + 0);
        
        
        
       
        frame.add(foodItemField);
        frame.add(button);
        frame.add(foodAmount);
    }
    
    public JButton getAddFoodButton(){
        return button;
    }
    
    public JTextField getFoodItemField(){
        return foodItemField;
    }

    public JLabel getAmountLabel() {
        return foodAmount;
    }
    
   
    
    
    
}
