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
public class isPrime {
    public static boolean prime(int n){
        if (n == 1){
            return false;
        
        }
        for (int i = 2; i<=n/2; i++){
            if (n % i == 0){
                return false;
                
            }
        
        }
        return true;
    
    
    }
}
