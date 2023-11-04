/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan_if_else;

/**
 *
 * @author TUF
 */
public class Perulangan_if_else {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah angka genap.");
            } else {
                System.out.println(i + " adalah angka ganjil.");
            }
            i++;
        }
    }
}    
