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
    
    public ShopModelTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTotalAmount method, of class ShopModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetTotalAmount() {
        System.out.println("getTotalAmount");
        ShopModel instance = new ShopModel();
        double expResult = 0.0;
        double result = instance.getTotalAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFoodItem method, of class ShopModel.
     */
    @org.junit.jupiter.api.Test
    public void testAddFoodItem() {
        System.out.println("addFoodItem");
        String name = "";
        ShopModel instance = new ShopModel();
        instance.addFoodItem(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListLength method, of class ShopModel.
     */
    @org.junit.jupiter.api.Test
    public void testGetListLength() {
        System.out.println("getListLength");
        ShopModel instance = new ShopModel();
        int expResult = 0;
        int result = instance.getListLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
