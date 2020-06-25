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
public class SumOdd {
    public static boolean isOdd(int number){
        if (number > 0){
            if (number%2 != 0){
                return true;
            
            }else{
                return false;
            
            }
        }else{
            return false;
        }
    }
    
    
    public static int sumOdd(int start, int end){
        int sum = 0;
        if ((start>0)&&(end >0)&&(start <= end)){
            for (int i = start; i <= end; i++){
//                System.out.println(i);
                if(SumOdd.isOdd(i)){
                    sum = sum + i;
                }
            }
        }else{
            return -1;
        }
        return sum;
    }
}
