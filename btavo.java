import java.util.*;
public class btavo{
public static void main(String[] args) {
   int[] nilai = {7, 10, 8, 6, 9, 7};
   int[] absen = {1, 2, 3, 4, 5, 6};
   Scanner input = new Scanner(System.in);
       System.out.print("Masukan nilai: ");
       int data = input.nextInt();
       System.out.print("absen yang memiliki nilai " + data + " adalah ");
       cetak(search(nilai, absen, data));
}

static void cetak(int[] data) {
   for (int i=0;i<data.length;i++){
     if (data[i]==0) break; else System.out.print(data[i]+" ");
   }
}

static int[] search(int [] nilai, int [] absen,int data) {
  int[] res = new int[nilai.length];
  int l=0;
  for (int i=0;i<nilai.length;i++){
    if (data == nilai[i]){
      res[l] = absen[i];
      l++;
    }
  }
  return res;
}

}
