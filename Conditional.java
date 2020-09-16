import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        System.out.println("<===Awal operasi===>");

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka :");
        int angka = input.nextInt();

        if (angka % 2 == 0){
            System.out.println("Hasil : " + angka + " Adalah bilangan genap");
        }else {
            System.out.println("Hasil : " + angka + " Adalah bilangan ganjil");
        }

        System.out.println("<===Akhir operasi===>");
    }
}
