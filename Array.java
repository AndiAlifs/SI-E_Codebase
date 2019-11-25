package lab;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]; //deklarasi array
        arr = new int[4];
        // | |
        // |x| 0
        // |x| 1
        // |x| 2
        // |x| 3
        arr[0] = 2;
        // | |
        // |2| 0
        // |x| 1
        // |x| 2
        // |x| 3
        System.out.println(arr[1]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int arr1[][] = new int[2][5];
        // | |
        // |x||x||x||x||x| 0
        // |x||x||x||x||x|
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                
            }
        }
    }
    //input : array = 10 elemen
    //input : 5
    //output: 
    
    //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    
   // 1
   // 2
   // 3
   // 4
   // 5
}
