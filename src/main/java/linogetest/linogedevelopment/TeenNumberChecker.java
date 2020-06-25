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
public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z){
         
        
        if ((x>=13)&&(x<=19)||(y>=13)&&(y<=19)||(z>=13)&&(z<=19)){
            return true;
        
        }else{
            return false;
        
        }
    }
    public static boolean isTeen(int x){
        if ((x>=13)&&(x<=19)){
            return true;
        
        }else{
            return false;
        
        }
    }
    
}
