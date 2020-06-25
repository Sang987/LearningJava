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
public class OverLoading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters = 0;
        if ((feet >= 0) && (inches >= 0)&&(inches<=12)){
            centimeters = ((feet *30.48)+(inches *2.54)); 
            return centimeters;
        
        }else{
            return -1;
        
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet = 0;
        if (inches >= 0){
            feet = (inches /12);
            return feet;
        }else{
            return -1;
        
        }
    }
    
}
