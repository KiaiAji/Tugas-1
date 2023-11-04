/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author TUF
 */
public class Array {

    public static void main(String[] args) {

        String[] Makanan = {"Ayam Geprek", "Nasi Padang", "Mie Ayam","Nasi Goreng", "Ayam Bakar"};
        

        for (int i = 0; i < Makanan.length; i++) {
            System.out.println("Makanan Terenak di UNIB ke-" + (i + 1) + ": " + Makanan[i]);
        }
    }
}
    

