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
public class EvenNumber {
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        
        }else{
            return false;
        }    
    }
    
    public static void whileStatment(){
        int number = 4;
        int finishNumber = 20;
        
        while (number != finishNumber){
            number++;
            if (EvenNumber.isEvenNumber(number)){
                System.out.println("Even number " + number);
            }else{
                continue;
            }
        }
    }
}
