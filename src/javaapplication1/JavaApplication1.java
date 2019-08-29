/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

/**
 *
 * @author Takayuki Kamiyama
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        
        // Localdatetime
        System.out.println(localDateTime);
        
        // dateTime
        System.out.println(dateTime);
    }
}
