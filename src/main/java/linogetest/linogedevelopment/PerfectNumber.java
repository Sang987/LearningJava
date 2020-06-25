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
public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if (number < 1){
            return false;
        
        }
        
        for (int x = 1; x< number; x++){
            if (number % x == 0){
                sum = sum + x;
            
            }
        }
        
        if (number == sum){
            return true;
        
        }else{
            return false;
        }
    }
}
