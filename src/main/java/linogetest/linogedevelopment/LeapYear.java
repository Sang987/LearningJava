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
public class LeapYear {
    public static boolean isLeapYear(int year){
        if ((year >= 1) && (year <= 9999)){
            if ((year % 4)==0){
                if ((year % 100)== 0){
                    if ((year % 400) == 0){
                        return true;
                    
                    }else{
                        return false;
                    }
                }else {
                    return true;
            
                }
            }else{
                return false;
            
            }
        }else {
            return false;
        
        }
    }
}
