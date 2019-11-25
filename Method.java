package lab;

public class Method {
    public static void main(String[] args) {
        method1(); //pemanggilan method
        System.out.println(method2());
        int arr[] = method4();
        int x = 5;
        int y = 19;
        System.out.println(tambah(method2(), y));
    }
    
    static void method1(){ //method void
        System.out.println("Method 1");
    }
    static int method2(){ // method non void
        return 5;
    }
    static String method3(){
        return "Halo";
    }
    static int[] method4(){ //parameter return array
        int[] arr = new int[4];
        return arr;
    }
    
    static int tambah(int a, int b){ //parameter method
        return a + b;
    }
    static int[] sort(int[][] arr){
       
    }
    
    
}
