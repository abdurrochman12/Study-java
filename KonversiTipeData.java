/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajars1;

/**
 *
 * @author User
 */
public class KonversiTipeData {
     public static void main(String[] args) {
          //wedening casting (kecil ke besar)
        // byte -> short -> int dst
        byte tipeByte = 10;
        short tipeShort = tipeByte;
        
        // narwing casting
        //long -> byte
        int typeInt = 10;
        short tipeShort2 = (short) typeInt;
     }
}
