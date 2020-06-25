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
public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour > 0){
            return Math.round(kilometersPerHour / 1.609);
        
        } else if(kilometersPerHour == 0){
            return 0;
            
        } else {
            return -1;
    
        }
    }
    public static void printConversion (double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");    
        } else {
            System.out.println("Invalid Value");
        }
    }
}
