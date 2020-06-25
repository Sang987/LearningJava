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
public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if ((temperature >=25)&&(temperature <=35)&&(summer == false)){
            return true;
        
        }else if((temperature >=25)&&(temperature <=45)&&(summer == true)){
            return true;
    
        }else{
            return false;

        }
    }
}
