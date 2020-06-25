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
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double y, double x){
        int intY = (int) (1000 * y);
        int intX = (int) (1000 * x);
        
        if (intY == intX){
            return true;
        
        }else{
            return false;
        
        }
    }
}
