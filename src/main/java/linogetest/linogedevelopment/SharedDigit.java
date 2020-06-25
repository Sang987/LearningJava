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
public class SharedDigit {
    public static boolean hasSharedDigit (int x, int y){
        int digX = 0;
        int digY = 0;
        int numY = 0;
        
        if ((x< 10)||(x>99)||(y< 10)||(y>99)){
            return false;
        
        
        }

        while (x > 0 ){
            digX = x % 10;
            numY = y;
            while (numY > 0){
                digY = numY % 10;
                if (digX == digY){
                    return true;
                
                }
                numY = numY / 10;
            }
            x = x / 10;
        }
        
        return false;
    
    
    }
}
