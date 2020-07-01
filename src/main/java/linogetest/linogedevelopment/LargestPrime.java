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
public class LargestPrime {
    public static int getLargestPrime (int number){
        int primeNum = number;
        int count = 1;
        
        if (number >= 2){
            for(int i = 1; i < number; i++){
                count ++;
                if ((primeNum % count == 0)&&(primeNum != count)){
                    primeNum = primeNum /count;
                    count = 1;
                }
            }
            return primeNum;
        }
        return -1;
    }
}
