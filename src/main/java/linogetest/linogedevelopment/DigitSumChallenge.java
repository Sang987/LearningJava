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
public class DigitSumChallenge {
    public static int sumDigits(int number){
        int sum = 0;
        
        
        
        if (number < 10){
            return -1;
        }else{
            
            while (number >0){
                sum = sum + number % 10;
                number = number / 10;
            }
            return sum;
        }
    }
}
