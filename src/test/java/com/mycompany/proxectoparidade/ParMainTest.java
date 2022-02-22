/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectoparidade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author A21MARTINAS
 */
public class ParMainTest {
    
    public ParMainTest() {
    }

    /**
     * Test of main method, of class ParMain.
     */
    @Test
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ParMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarParidade method, of class ParMain.
     */
    @Test
    public void testComprobarParidade0() {
        System.out.println("comprobarParidade do cero");
        int numeroProba = 0;
        String expResult = "o numero e par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidadeParPositivo() {
        System.out.println("comprobarParidade dun mumero par positivo");
        int numeroProba = 2;
        String expResult = "o numero e par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    @Test
    public void testComprobararidadeImparPositivo() {
        System.out.println("comprobarParidade dun numero Impar Positivo");
        int numeroProba = 1;
        String expResult = "o numero e impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    @Test
    public void testComprobararidadeImparNegativo() {
        System.out.println("comprobarParidade dun numero Impar negativo");
        int numeroProba = -1;
        String expResult = "o numero e impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    @Test
    public void testComprobararidadeParNegativo() {
        System.out.println("comprobarParidade dun numero Impar negativo");
        int numeroProba = -1;
        String expResult = "o numero e impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
}
