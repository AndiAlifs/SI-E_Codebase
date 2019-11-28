import java.util.Scanner;

public class Solution {

    static int maxSubsquare(int[][] square) {
        
        int total = 0;
        total+=square[0][0];
        total+=square[0][0+1];
        total+=square[0+1][0];
        total+=square[0+1][0+1];
        int total_max = total;
        for (int i=0;i<=square.length-2;i++){
            for (int j=0;j<=square[0].length-2;j++){
                total = 0;
                total+=square[i][j];
                total+=square[i][j+1];
                total+=square[i+1][j];
                total+=square[i+1][j+1];
                if(total > total_max) total_max = total;
            }
        }
        return total_max;
	}

    public static void main(String[] args) {
        int i, j;
        Scanner in;
        int arr[][];
        in = new Scanner(System.in);
        arr = new int[10][10];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maxSubsquare(arr));
    }
}
