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
public class TipeDataBukanPrimitif {
     public static void main(String[] args) {
         //TipeDataBukanPrimitif
        //Byte, Short, Integer, Long, Float
        //Double, Character, Boolean
        int primitif = 30; //prmitif
        Integer nonPrimitif = 30; //bukan primitif
        
        // konversi dari primint if ke bukan primitif
        int umur = 19;
        Integer umurNonprimitif = umur;
        
        //konversi dari bukan primitf ke print if
        Integer old = 10;
        short printifShort = old.shortValue();
     }
}
