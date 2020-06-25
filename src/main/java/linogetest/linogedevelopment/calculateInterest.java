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
public class calculateInterest {
    public static void forInterest (){
        for (int i = 2; i <=8; i++){
            System.out.println("10,000 at " + i + "% interest = " + (10000 *i)/100);       
        }
    }
    public static void backInterest (){
        for (int i = 8; i >=2; i--){
            System.out.println("10,000 at " + i + "% interest = " + (10000 *i)/100);       
        }
    }
}
 