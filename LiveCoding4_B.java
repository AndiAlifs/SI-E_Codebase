import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[6];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();
        }
        cetak(terbesar(nilai));
    }
  
  static int[] terbesar(int [] nilai) {
        int[] max3 = nilai;
        for (int i = 0; i < max3.length; i++) {
            for (int j = i; j < max3.length; j++) {
                if (max3[j] > max3[i]) {
                    int temp = max3[i];
                    max3[i] = max3[j];
                    max3[j] = temp;
                }
            }
        }
      return max3;
  }

    static void cetak(int[] data) {
       for (int i=0;i<3;i++){
           System.out.print(data[i]+" ");
       }
    }
}
