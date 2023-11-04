/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zodiac;

/**
 *
 * @author TUF
 */
import java.util.Scanner;

public class Zodiac {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
                System.out.println("Masukkan tanggal lahir Anda (dd-mm-yyyy): ");
        String[] dateParts = ab.nextLine().split("-");
        int tanggal = Integer.parseInt(dateParts[0]);
        int bulan = Integer.parseInt(dateParts[1]);

        String zodiacSign;

        if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            zodiacSign = "Aquarius";
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            zodiacSign = "Pisces";
        } else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            zodiacSign = "Aries";
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            zodiacSign = "Taurus";
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            zodiacSign = "Gemini";
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            zodiacSign = "Cancer";
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            zodiacSign = "Leo";
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            zodiacSign = "Virgo";
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            zodiacSign = "Libra";
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            zodiacSign = "Sagittarius";
        } else {
            zodiacSign = "Capricorn";
        }

        System.out.println("Zodiak Anda adalah: " + zodiacSign);
        
        
    }
}
