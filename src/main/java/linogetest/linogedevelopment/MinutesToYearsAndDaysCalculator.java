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
public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays (long minutes){
        int years = 0;
        int days = 0;
        int hours = 0;
        int remDays = 0;
        int remHours = 0;
        int remMinutes = 0;
        
        
        String sYears = "";
        String sDays = "";
        String sMinutes = "";
        
        
        
        if (minutes >=0 ){
            hours = (int) (minutes/60);
            remMinutes = (int)(minutes %60);
            days = (int)(hours /24);
            remHours = (int)(hours % 24);
            years = (int)(days /365 );
            remDays = (int)(days % 365);
            
            if (years < 10){
                sYears = 0 + years + " y and ";
            }else{
                sYears = years + " y and ";
            }
            
            if (remDays < 10){
                sDays = 0 + remDays + " d";
            }else{
                sDays = remDays + " d";
            }
            
            if (remMinutes < 10){
                sMinutes = 0 + minutes + " min = ";
            }else{
                sMinutes = minutes + " min = ";
            }
            
            System.out.println(sMinutes + sYears + sDays);
        }else{
            System.out.println("Invalid Value");
        
        }
    }
}
