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
public class MegaBytes_Converter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int remKiloBytes;
        int megaBytes;
        
        if (kiloBytes >= 1024 ){
            remKiloBytes =kiloBytes % 1024; 
            megaBytes = (kiloBytes - remKiloBytes)/ 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");

        }else if(kiloBytes >= 0){
            remKiloBytes =kiloBytes % 1024;
            megaBytes = 0;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");
        
        }else {
            System.out.println("Invalid Value");
        }
    }
}
