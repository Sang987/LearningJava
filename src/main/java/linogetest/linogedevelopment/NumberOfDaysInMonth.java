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
public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year){
        if((year>=1)&&(year<=9999)){
            if ((year % 4)==0){
                if ((year % 100)==0){
                    if ((year % 400)==0){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static int getDaysInMonth (int month, int year){
        if ((month>=1)&&(month<=12)&&(year>=1)&&(year<=9999)){
            switch(month){
                case 1:
                    return 31;
                case 2:
                    if (NumberOfDaysInMonth.isLeapYear(year) == true){
                        return 29;
                    }else{
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;

            }
            
        }else{
            return -1;
        }
    }
}
