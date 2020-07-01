/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linogetest.linogedevelopment;

import java.util.Scanner;

/**
 *
 * @author Donut-Eater
 */
public class MinMaxFunction {
    public static void minMaxExcercise(){
        Scanner scanner = new Scanner(System.in);
        boolean isNumber =false;
        int value = 0;
        int counter = 0;
        int minValue = 0;
        int maxValue = 0;
        int inputNumber = 0;
        
        
        System.out.println("Enter the number of integers for min and max function.");
        isNumber = scanner.hasNextInt();
        if (isNumber){
            inputNumber = scanner.nextInt();
        
        }
        isNumber = false;
        System.out.println("Enter integers now.");
        while (true){
            isNumber = scanner.hasNextInt();
            if (isNumber){

                value = scanner.nextInt();
                if((maxValue == 0)&& (counter < 2)){
                    maxValue = value;
                    counter ++;

                }else if((maxValue < value )&& (minValue == 0)&& (counter < 2)){
                    minValue = maxValue;
                    maxValue = value;
                    counter++;

                }else if((maxValue < value )&& (minValue > maxValue)&& (counter >= 2)){
                    minValue = maxValue;
                    maxValue = value;
                    counter++;

                }else if((maxValue < value )&& (minValue < maxValue)&& (counter >= 2)){
                    maxValue = value;
                    counter++;

                }else if((minValue > value)&& (counter >= 2)){
                    minValue = value;
                    counter++;

                }else {
                    counter++;

                }
            }else{
                System.out.println("Invaid Number");

            }
            scanner.nextLine();
            if(counter == inputNumber){
                break;
            
            }
        }
        if (counter <2){
            System.out.println(
            "No minimum number was entered and "
            + "the maximum number entered was " + maxValue + ".");

        }else{
            System.out.println(
            "The minimum number entered was " + minValue +
            ", and the maximum number entered was " + maxValue + ".");
            
        }
        scanner.close(); 
    
    
    
    }
}
