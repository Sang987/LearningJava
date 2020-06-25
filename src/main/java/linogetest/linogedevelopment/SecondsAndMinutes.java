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
public class SecondsAndMinutes {
        public static String getDurationString(int minutes, int seconds){
        String time = "";
        int hours = 0;
        int remMinutes = 0;

        
        
        if ((minutes>= 0)&&(seconds>=0)&&(seconds<=59)){
           hours = (int)(minutes / 60);
           remMinutes = (minutes % 60);
            
            time = hours + "h " + remMinutes + "m " + seconds + "s";
            
            return time;
        }else{
            return "Invalid Value";
                
                
        }
    }
        public static String getDurationString(int seconds){
        int minutes = 0;
        int remSeconds = 0;

        if (seconds>=0){
           minutes = (int)(seconds / 60);
           remSeconds = (seconds % 60);
           
            return SecondsAndMinutes.getDurationString(minutes, remSeconds);
        }else{
            return "Invalid Value";
                
        }
    }
}
