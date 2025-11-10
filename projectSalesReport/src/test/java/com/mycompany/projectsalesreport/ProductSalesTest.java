/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.projectsalesreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class ProductSalesTest {
    
    public ProductSalesTest() {
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

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalAverage method, of class ProductSales.
     */
    @Test
    public void testTotalAverage() {
        System.out.println("totalAverage");
        int reportNumber = 0;
        int sumOfSales = 0;
        ProductSales instance = new ProductSales();
        int expResult = 0;
        int result = instance.totalAverage(reportNumber, sumOfSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxProductSales method, of class ProductSales.
     */
    @Test
    public void testMaxProductSales() {
        System.out.println("maxProductSales");
        int[][] product_Sales = null;
        ProductSales instance = new ProductSales();
        int expResult = 0;
        int result = instance.maxProductSales(product_Sales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minProductSales method, of class ProductSales.
     */
    @Test
    public void testMinProductSales() {
        System.out.println("minProductSales");
        int[][] product_Sales = null;
        ProductSales instance = new ProductSales();
        int expResult = 0;
        int result = instance.minProductSales(product_Sales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
