package lab;

public class SeleksiKondisi {

    public static void main(String[] args) {

        boolean isTrue = !false;
        int angka; //deklarasi
        angka = 6;
        switch (angka) {
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            default:
                System.out.println("Bukan empat atau lima");
                break;
        }
        String status = (angka > 3)? "Ya" : "Tidak";
        boolean isEnam = angka == 6;
        System.out.println();
    }
}
