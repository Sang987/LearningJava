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
public class FlourPackProblem {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        
        int numberBCK = 0;
        numberBCK = goal / 5;   //5 Kilo bag
        
        if ((bigCount < 0)|| (smallCount < 0)|| (goal <0 )){
            return false;
        
        } else {
            if (numberBCK <= bigCount){
                goal = goal % 5;
                if (goal == 0){
                    return true;

                }else if (goal <= smallCount){
                    return true;

                } else if (goal > smallCount){
                    return false;

                }
            } else if (numberBCK > bigCount){
                goal = goal - (5 * bigCount);
                System.out.println(goal);
                if (goal <= smallCount){
                    return true;

                }else{
                    return false;
                }

            }
        }
        return false;
    }
}

