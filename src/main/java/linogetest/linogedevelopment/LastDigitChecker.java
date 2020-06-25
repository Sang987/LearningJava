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
public class LastDigitChecker {
    public static boolean hasSameLastDigit (int x, int y, int z){
        int digX = x % 10;
        int digY = y % 10;
        int digZ = z % 10;
        
        if ((x< 10)||(x>1000)||(y< 10)||(y>1000)||(z< 10)||(z>1000)){
            return false;
        
        }
        if ((digX == digY)||(digX == digZ) || (digY == digZ)){
            return true;
        
        }else{
            return false;
        
        }
    }
    
    public static boolean isValid (int x){
        if ((x>= 10)&&(x<= 1000)){
            return true;
        
        }else{
            return false;
        
        }
    }
}
