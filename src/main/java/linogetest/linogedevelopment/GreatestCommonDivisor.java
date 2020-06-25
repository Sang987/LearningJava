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
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second){
        int x = 0;
        
        
        if ((first <10 )||(second <10)){
            return -1;
        
        }else if (first > second){
            x = first;
        
        }else if (first < second){
            x = second;
        
        }
        for (; x > 0; x--){
            if ((first % x == 0) && (second % x == 0)){
                return x;
            }
        }
        return -1;
    }
}
