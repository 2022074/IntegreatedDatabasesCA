/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integreateddatabasesca;

import java.util.Scanner;

/**
 *
 * @author achap
 */
public class GUI {
    
    public void useGUI(){
        int i = 0;
        
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to 'EaturSoul' \n" +
                                   "The best application for your tax calculations, what would you like to do?: \n" +
                                   "1. Login \n" + 
                                   "2. Register");
                int choice1 = sc.nextInt();
                
                switch(choice1){
                    case 1:
                        System.out.println("Please enter your username and password: ");
                        //Databse validation still pending
                        i++;
                        break;
                    
                    case 2:
                        System.out.println("Please enter the username you will like to use and a password for your new account:");
                        //Databse validation still pending
                        i++;
                        break;
                        
                    default:
                        System.out.println("Oh uh, that was not an available option, try again.");
                }
          
            }catch(Exception e){
                System.out.println("Oh uh, that was not a number, try again.");
            }  
        }while(i == 0);
    }
    
}
