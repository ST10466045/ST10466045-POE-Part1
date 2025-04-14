/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe.registration;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class LOGIN {

    static boolean checkUsername;

    static boolean checkPasswordComplexity(String Password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean checkusername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean checkPhoneNumber(String PhoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean loginUser(String loginName, String loginPass, String username, String Password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean checkUsername(String kyl_1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    static boolean checkPassword(String chsecke99) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    

    

    static boolean checkCellPhoneNumber(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // atribute
    private String firstName;
    private String lastName;
    private String Username;
    private String Password;
    private String cellNumber;
    
    
    //constructor
    public LOGIN (String firstName,String lastName, String Username, String Password, String cellNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Username = Username;
        this.Password = Password;
        this.cellNumber = cellNumber;
    }    
        
        //getter methods
        public String getfirstName(String firstName){
            return firstName;
        }
        
        //setter Method
        public void setfirstName(String firstName){
            this.firstName = firstName;
        }
        
        //getter methods
        public String getlastName(String lastName){
            return lastName;
        }
        
        //setter Method
        public void setlastName(String lastName){
            this.lastName = lastName;
        }
        
        //getter method
         public String getUsername(String Username){
            return Username;
        }
         
         //setter method
         public void setUsername(String username){
            this.Username = Username;
        }
         
         //getter method
         public String getPassword(String Password){
            return Password;
        }
         
         //setter method 
          public void setPassword(String Password){
            this.Password = Password;
        }   
          
          //getter method
         public String getcellNumber(String cellNumber){
            return cellNumber;
        }
         
         //setter method
         public void setcellNumber(String cellNumber){
            this.cellNumber = cellNumber;
        }
         
         
         
         
         
         //instance Method
         public boolean checkUsername(){
             return Username.contains("_")&&Username.length()<=5;
        }
         
         //password method
         public void setusername(){
             System.out.println(firstName + lastName);
        }    
        private boolean isValidUsername(String username){
            return !username.isEmpty();
        }
        private static boolean isValidPassword(String password) {
        return password.length() >=8&&
               password.matches(".*[A-Za-z].*")&&
               password.matches(".*\\d.*");
    }

    private static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+27\\d{9}")|| phone.matches("0\\d{9}");
    }
    
    
    
    
    
    public static String registeruser(String username,String Password, String PhoneNumber ){
        if (checkusername(username)){
            return"username successfully captured.";
        }
        else if (checkPasswordComplexity(Password)){
            return "PhoneNumber successfully captured.";
        }
        else if (checkPhoneNumber(PhoneNumber)){
            
        }
        else if(!checkusername(username)){
            return "username is not correctly formatted,please make sure that your username contains an underscore and is no more than five characters in length";
    
        }
        else if (!checkPasswordComplexity(Password)){
            return "Password is not formatted correctly, please make sure that the password contains at least eight characters,a capital letter,a number,and a special character.";
        }
        
        else
            
            return "PhoneNumber incorrectly formatted or does not contain international code";   return null;
 }
       
    //login method
    public static boolean LoginUser(String loginName, String loginPass, String username, String Password ){
        if (loginName.equals(username)&& loginPass.equals(Password)){
          return true;
        }  
        else{
          return false;
        }

    }
    
    //
    public static String returnLoginStatus(String loginName, String loginPass, String username, String Password, String firstname, String lastname){
        if(loginUser(loginName, loginPass, username, Password)){
         return "welcome" + firstname + "," + lastname + "it is great to see you.";  
        }
        else{
          return"username or password incorrect,please try again.";  
        }
        
    }
}    
           
        
            
           
                
              
        
    
        
         
         
         
         
         
         
    
    
    


