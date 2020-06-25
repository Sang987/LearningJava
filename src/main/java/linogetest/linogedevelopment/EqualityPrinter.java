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
public class EqualityPrinter {
    public static void printEqual(int x, int y, int z){
        if ((x >= 0)&&(y >= 0)&&(z>=0)){
            if ((x == y)&& (x == z)) {
                System.out.println("All numbers are equal");
            
            }else if ((x != y)&&(x != z)&&(y != z)){
                System.out.println("All numbers are different");
            
            }else{ 
                System.out.println("Neither all are equal or different");
            }
        
        
        
        }else{
            System.out.println("Invalid Value");
        
        }
    }
}
