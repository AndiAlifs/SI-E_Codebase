package lab;

import java.util.Scanner;

public class Labb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        char pilihan = 'Y';
//        do{
//            System.out.println("Selamat datang di program");
//            System.out.println("1. Bujur sangkar");
//            System.out.println("2. Lingkaran");
//            System.out.println("3. Segitiga");
//            int pil = in.nextInt();
//            switch(pil){
//                case 1:
//                    System.out.print("Panjang: ");
//                    int p = in.nextInt();
//                    System.out.print("Lebar: ");
//                    int l = in.nextInt();
//                    System.out.println("Lebar: " + p*l);
//                    break;
//                case 2:
//                    System.out.print("Jari jari: ");
//                    int r = in.nextInt();
//                    System.out.println("Luas: " + Math.PI*r*r);
//                    break;
//                case 3:
//                    System.out.print("Alas: ");
//                    int a = in.nextInt();
//                    System.out.print("Tinggi: ");
//                    int t = in.nextInt();
//                    System.out.println("Luas: " + 0.5*a*t);
//                    break;
//            }
//            System.out.print("Apakah ingin lagi? ");
//            pilihan = in.next().charAt(0);
//        }while(pilihan == 'Y');
        int a = 5;
        double hasil = a*3/2.0;
        System.out.println(hasil);
    }
}
