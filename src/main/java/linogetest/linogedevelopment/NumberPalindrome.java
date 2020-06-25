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
public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;
        
        while (num != 0){
            reverse = (reverse * 10);
            reverse = reverse + num % 10;
            num = num / 10;
            
        }
        if (reverse == number){
            return true;
        }
            return false;
    }
}
