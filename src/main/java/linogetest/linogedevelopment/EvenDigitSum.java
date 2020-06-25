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
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum = 0;
        int evenN = 0;
        
        if (number < 0){
            return -1;
            
        }
        
        while (number > 0){
            evenN = number %10;
            if (evenN % 2 == 0){
                sum = sum + evenN;
                evenN = 0;
                number = number / 10;
            } else {
                number = number / 10;           
            
            }
        }
        return sum;
    }
}
