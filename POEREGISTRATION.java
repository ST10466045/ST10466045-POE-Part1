/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe.registration;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class POEREGISTRATION {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("enter username:");
       String username = scanner.nextLine();
       
       System.out.print("enter password:");
       String password = scanner.nextLine();
       
       System.out.print("enter South African cellphone Number:");
       String phone = scanner.nextLine();
       
       if(username.isEmpty()){
          System.out.println("Username cannot ne empty.");
       }else if(!isValidPassword(password)){
          System.out.println("password must at least be 8 charaters long and include a letter and a number."); 
       }else if(!isValidPhoneNumber(phone)){
           System.out.println("phoneNumber must be a valid South African number ");
       }else{
           System.out.println("Account created successfully!");
       }
       scanner.close();
    }

    private static boolean isValidPassword(String password) {
        return password.length() >=8&&
               password.matches(".*[A-Za-z].*")&&
               password.matches(".*\\d.*");
    }

    private static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+27\\d{9}")|| phone.matches("0\\d{9}");
    }
}
