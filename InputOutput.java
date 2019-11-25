package lab;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int var1; //Deklarasi variable
//        var1 = 2; //Inisialisasi Variable
//        int var3 = 4; //Inisialisasi
//        
//        String teks = in.nextLine();// Aku Adalah Orang
//        //teks = Aku Adalah Orang
//        String teks2 = in.next();// Aku Adalah Orang
//        //teks2 = Aku
//        
//        int umur = in.nextInt();
//        in.nextLine(); //menghilangkan karakter \n
//        String nama = in.nextLine();
//        System.out.println("umur: " + umur );
//        System.out.println("nama: " + nama);
//        System.out.println("asdas \n asadas");
//        
//        int angka1 = 2;
//        double angka2 = 2.9;
//        int angka3 = (int)angka2;
//        //misal angka2 = 3.5 -> int angka3 = 3;
//        System.out.println(angka1);
//        System.out.println(angka3);
//           
//            //Convert Ascii - Char
//          char huruf = 'A';
//          int ascii = huruf;
//          int ascii2 = 68;
//          char huruf2 = (char)ascii2;
//          System.out.println(huruf2);
          
          //printf
          String kata = "Saya";
          System.out.printf("%10s%n", kata); //Menyiapkan 10 karakter, menggunakan dari belakang
          System.out.printf("%-10s", kata);//Menyiapkan 10 karakter, menggunakan dari depan
          System.out.println("Aku");
    }
}
