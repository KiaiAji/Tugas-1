# Tugas-1

1. Penjelasan "Perulangan hingga 100 menggunakan Java"

Inisialisasi variable "name" menggunakan "Ghazi Al-Ghifari". "String" atau disebut juga untaian dalam pemrograman komputer adalah sebuah deret simbol. Tipe data string adalah tipe data yang digunakan untuk menyimpan barisan karakter.
    
    public class Angka {

        public static void main(String[] args) {
            String name = "Ghazi Al-Ghifari";
Kemudian, string "Nama : " diikuti oleh nilai dari variabel name dicetak. Mencetak nama menggunakan "System.out.println". "System.out.println()" adalah metode yang digunakan untuk mencetak argumen ke output standar, yang biasanya adalah konsol.

    System.out.println("Nama : " + name);/
Looping dari 0-100. Dalam bahasa pemrograman Java, pernyataan "for" digunakan untuk membuat sebuah perulangan, yang memungkinkan Anda untuk mengeksekusi blok kode secara berulang selama kondisi tertentu terpenuhi.

    for (int i = 0 ; i<=100 ; i++){
Penggunaan "if" "else" untuk mencetak apakah i>10 ataupun i<10. Jika i>10 maka akan mencetak "name", jika i<10 maka akan mencetak nilai dari i. Dalam bahasa pemrograman Java, pernyataan if-else digunakan untuk memberikan kontrol alur program berdasarkan kondisi tertentu. Pernyataan if digunakan untuk mengeksekusi blok kode jika kondisi yang ditentukan benar, sedangkan pernyataan else (bersama dengan if) digunakan untuk mengeksekusi blok kode alternatif jika kondisi yang ditentukan tidak benar.
    
                if (i>= 10 ){
                    System.out.println(name);
                }
                else{
                    System.out.println(i);
                }
                }
        }
    }

2. Penjelasan penerapan if else dalam perulangan while

inisialisasikan variable "i" menggunakan nilai "1".

    public class Perulangan_if_else {

        public static void main(String[] args) {
            int i = 1;
Penggunaan "while" untuk melakukan operasi nilai i mencapai angka 10. Dalam bahasa pemrograman Java, perulangan while digunakan untuk mengeksekusi blok kode secara berulang selama kondisi tertentu terpenuhi.

    while (i <= 10) {
Penggunaan "if" "else" untuk mencetak apakah i adalah genap atau ganjil. Jika i adalah ganjil, maka akan mencetak pesan "... adalah angka ganjil". Jika i adalah genap, maka akan mencetak pesan "... adalah angka genap". Penggunaan i++ adalah untuk memastikan perulangan akan berhenti pada suatu titik.

    if (i % 2 == 0) {
                    System.out.println(i + " adalah angka genap.");
                } else {
                    System.out.println(i + " adalah angka ganjil.");
                }
                i++;
            }
        }
    }

3. Penjelasan Program Zodiac menggunakan Java

Import class yang diperlukan dalam coding ini adalah Import "Scanner". Buat object "Scanner" dan minta input pengguna untuk tanggal lahir dalam format dd-mm-yyyy. Kemudian Extract bagian tanggal, bulan, dan tahun yang diberikan pengguna.

    import java.util.Scanner;
    
    public class Zodiac {
    
        public static void main(String[] args) {
            Scanner ab = new Scanner(System.in);
                    System.out.println("Masukkan tanggal lahir Anda (dd-mm-yyyy): ");
            String[] dateParts = ab.nextLine().split("-");
                    int tanggal = Integer.parseInt(dateParts[0]);
                    int bulan = Integer.parseInt(dateParts[1]);
Penggunaan "if" "else" untuk menentukan zodiac sesuai tanggal, bulan, dan tahun pengguna.

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
Setelah menentukan tanggal, bulan dan tahun, zodiac akan otomatis mencetak sesuai dengan yang sudah di input. Bahasa pemrograman "System.out.println()" akan mencetak "Zodiak Anda adalah: " + zodiacSign".

            System.out.println("Zodiak Anda adalah: " + zodiacSign);
            
            
        }
    }
Jalankan program dan uji coba hasilnya. Ketika di run akan muncul seperti dibawah.

    --------------------------------[ jar ]---------------------------------
    
    --- resources:3.3.1:resources (default-resources) @ Zodiac ---
    skip non existing resourceDirectory C:\Users\TUF\OneDrive\Documents\NetBeansProjects\Zodiac\src\main\resources
    
    --- compiler:3.11.0:compile (default-compile) @ Zodiac ---
    Nothing to compile - all classes are up to date
    
    --- exec:3.1.0:exec (default-cli) @ Zodiac ---
    Masukkan tanggal lahir Anda (dd-mm-yyyy): 
Ketika tanggal, bulan dan tahun di input, akan keluar zodiac seperti dibawah.

    Masukkan tanggal lahir Anda (dd-mm-yyyy): 
    10-10-2010
    Zodiak Anda adalah: Libra

4. Penjelasan Variable dengan tipe data array menggunakan perulangan for

Inisialisasikan array "Makanan" yang berisi beberapa "String" makanan.

    public class Array {
    
        public static void main(String[] args) {
    
            String[] Makanan = {"Ayam Geprek", "Nasi Padang", "Mie Ayam","Nasi Goreng", "Ayam Bakar"};
Penggunaan perulangan "for" untuk mengiterasi setiap elemen dalam array Makanan menggunakan variabel penghitung i. Penggunaan i++ untuk memastikan perulangan akan berhenti pada suatu titik.

    for (int i = 0; i < Makanan.length; i++) {
Di setiap iterasi, program mencetak teks "Makanan Terenak di UNIB ke-" diikuti dengan nomor urutan dan nilai dari array Makanan pada indeks ke-i. Selama setiap iterasi, nilai i akan meningkat dari 0 hingga panjang array Makanan - 1 untuk memastikan bahwa setiap elemen dalam array dicetak dengan nomor urutan yang benar.

                System.out.println("Makanan Terenak di UNIB ke-" + (i + 1) + ": " + Makanan[i]);
            }
        }
    }
