/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe.registration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LOGINTest {
    
    public LOGINTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    
     
    @Test
    public void testMain() {
    }
    
    @Test
    public void testCheckUsernameCorrectFormat() {
        assertTrue(LOGIN.checkUsername("kyl_1"));
    }
    @Test
    public void testCheckUsernameIncorrectFormat(){
        assertFalse(LOGIN.checkUsername("kyle!!!!!!!"));              
    }
    
    
    
    @Test
    public void testCheckPasswordCorrectFormat() {
        assertTrue(LOGIN.checkPassword("Ch&&sec@ke99!"));
    }
    @Test
    public void testCheckPasswordComplexityIncorrectFormat(){
        assertFalse(LOGIN.checkPasswordComplexity("Password"));
    }
    
    
    
    @Test
    public void testcheckPhoneNumberCorrectFormat() {
        assertTrue(LOGIN.checkCellPhoneNumber("+27838968976"));
    }
    @Test void testcheckPhoneNumberIncorrectFormat(){
        assertFalse(LOGIN.checkCellphoneNumber("08966553"));
       
    }
    
    
    
    
    @Test
    public void testRegisteruser(){         
    }

    @Test
    public void testLoginUser() {
    }

    @Test
    public void testReturnLoginStatus() {
    }    

    
}
