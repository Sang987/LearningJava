/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linogetest.linogedevelopment;

/**
 *
 * @author Donut-Eater
 */
public class AllFactors {
    public static void printFactors(int number){
    
    
        if (number < 1){
            System.out.println("Invalid Value");
        
        }else{
            for(int x = 1 ;x <= number; x++){
                if(number % x == 0){
                    System.out.println(x);
                
                }
            }
        }
    }
}
