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
public class OperasiAritmatika {
     public static void main(String[] args) {
          int a = 10;
        int b = 100;
        int hasil = a+b;
        System.out.println(hasil);
        System.out.println(a*b);
        int c = 0;
        int result = c += 10;
        System.out.println(c);
        
        int angka= -19;
        int angka1= +19;
        //incroment
        System.out.println(angka1++);
        System.out.println(++angka1);
        //decrement
        System.out.println(angka--);
        System.out.println(--angka);
        
        //operasi perbandingan
        //int angka22= 8;
        //int angka23= 11;
        //System.out.println(angka22 > angka23);
        //System.out.println(angka22 < angka23);
        //System.out.println(angka22 >= angka23);
        //System.out.println(angka22 <= angka23);
        //System.out.println(angka22 == angka23);
        //System.out.println(angka22 != angka23);
        
        //Operator Boolean
        
        //|| ATAU
        // && DAN
        // ! KEMBALIKAN
        int angka5= 90;
        int angka7= 80;
        
        boolean lulusUts = angka5 > 75;
        boolean lulusUas = angka7 > 75;
        boolean lulus = lulusUts && lulusUas;
        System.out.println(lulus);
        
        boolean lulusUts1 = angka5 > 75;
        boolean lulusUas1 = angka7 > 75;
        boolean lulus1 = lulusUts1 || lulusUas1;
        System.out.println(lulus1);
        //KEBALIKAN
     }
}
