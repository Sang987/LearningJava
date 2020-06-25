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
public class AreaCalculator {
    public static double area(double radius){
        
        if (radius >= 0){
            return Math.PI * Math.pow(radius,2);
        }else{
            return -1.0;
        
        }
    }
    public static double area(double x, double y){
        
        if ((x >= 0) && (y >=0 )){
            return x * y;
        }else{
            return -1.0;
        
        }
    }
}
