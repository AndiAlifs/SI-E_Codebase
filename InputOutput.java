package lab;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, jurusan, asal;

        nama = in.nextLine();
        jurusan = in.nextLine();
        asal = in.nextLine();
        System.out.println("Nama saya " + nama + ", saya berkuliah di FILKOM UB jurusan " + jurusan + " dan saya berasal dari " + asal);
    }
}
