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
public class Array {
   public static void main(String[] args) {
        // TODO code application logic here
        //Cara membuat array 
        String[] name;
        name = new String[10];
        name[0] = "abdur";
        System.out.println("0");
        
        //array cara 2
        int[] umur = new int []{
            2,4,9,10,30
        };
        // cara 3
        String[] mahasiswa = {
            "abdur", "rochman", "rzd"
        };
        System.out.println(mahasiswa[1]); //mengambil
        var result  = mahasiswa[0] = "abdur"; // mengubah
        System.out.println(result);
        System.out.println(mahasiswa.length); //mengambil panjang array
        
        String[][] data = {
            
            {
                "abdur", "rochman", "wachid"
            },
            {
                "wau", "lagi","makankah"
            }
        };
        //cara mengambil data
        //cara pertama
        String[] hasil = data[0];
        System.out.println(hasil[2]);
        
        //cara ke2
        System.out.println(data[1][2]);
    }
      
}
