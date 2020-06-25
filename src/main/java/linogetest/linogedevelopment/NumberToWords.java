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
public class NumberToWords {
    public static void numberToWords (int number){
        int digNum = 0;
        int count = 0;
        
        count = NumberToWords.getDigitCount(number);
        number = NumberToWords.reverse(number);

        int numberRev = number;        
        do{
            count --;
            numberRev = numberRev / 10;

        } while (numberRev > 0);
                
        if (number < 0 ){
            System.out.println("Invalid Value");
        
        }else{

            do{

                digNum = number %10;
                number = number /10;

                switch(digNum){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid day");
                        break;
                }     
            } while(number >0);

            while (count > 0){
                count --;
                System.out.println("Zero");

            }
        }
    }
    
    public static int reverse (int number){
        int revNum = 0;
        int negPos = 1;
        
        if (number < 0){
            number = number * -1;
            negPos = -1;
        }
        
        while (number > 0){
            revNum = revNum * 10;
            revNum = revNum + number % 10;
            number = number / 10;
            
        }
        return (revNum * negPos);
    }
    
    public static int getDigitCount (int number){
        int count = 0;
        
        if(number < 0){
            return -1;
        
        }
        do {
            count ++;
            number = number / 10;
        } while (number >0);
        return count;
    }
}
