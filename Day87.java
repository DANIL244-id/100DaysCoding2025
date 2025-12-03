import java.util.Scanner;
public class day87 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int[] angka = {11, 22, 33, 44, 55};

    System.out.print("Masukkan angka yang ingin dicari : ");
    int cari = input.nextInt();
    boolean t = false;

    for (int i = 0; i < angka.length; i++) {
        if (angka[i] == cari) {
           t = true;
           System.out.println("Ditemukan di index : "+i);
           break;
       }
    }

        if (!t) {
            System.out.println("Angka tidak ditemukan!!");
        }
    }
}
