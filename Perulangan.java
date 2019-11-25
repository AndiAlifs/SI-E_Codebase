package lab;

public class Perulangan {
    
    public static void main(String[] args) {
        String hariIni; //Aturan penamaan variable, camelCase
        int i = 5;
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < j + 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < i; j++) {
            for (int k = i - j; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*j-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        while (i > 10) {
            System.out.println(i);
            i++;
        }
    }
}
//0             baris j 0
//0 1          baris j 1
//0 1 2         baris j 2
//0 1 2 3       baris j 3
//0 1 2 3 4     baris j 4
//    *
//   ***
//  *****