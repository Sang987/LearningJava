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
public class DiagonalStar {
    public static void printSquareStar (int number){
        int x = 1;
        int y = 2;
        if (number < 5){
            System.out.println("Invalid Value");
            
        }else{
            for (;x <= number; x++){
                if (y == 2){
                    System.out.print("*");
            
                }
                for (;y <= number; y++){
                    if ((x==1)||(x==number)){
                        System.out.print("*");
                        
                    }else if(y==number){
                        System.out.print("*");
                        
                    }else if (x == y){
                        System.out.print("*");
                    
                    }else if(y == (number - x +1)){
                        System.out.print("*");
                        
                    }else if (y!=number){
                        System.out.print(" ");
                    
                    }
                }
                System.out.println("");
                y = 2;
            }
        }
    }
}
