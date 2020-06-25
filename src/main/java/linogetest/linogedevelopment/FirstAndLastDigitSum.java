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
public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int count = 0;
        int sum = 0;
        
        if (number <0){        
            return -1;
                
        }else if (number == 0){
            return 0;
            
        }
        
        while (number > 0){
            if((number <10 )&& (count < 1)){
                sum = sum + number;
                count ++;

            }else if ((number <10 )&& (count == 1)){
                sum = sum + number;
                count ++;
                    
            }else if ((number >=10 )&& (count < 1)){
                sum = sum + (number % 10);
                count ++;
            }else{
                number = number / 10;
            
            }
        }
        return sum;
    }
}
