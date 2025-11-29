import java.util.Scanner;
public class day83 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        int n = input.nextInt();    

        int[] angka = new int[n];
        int total = 0;

        System.out.println("\nMasukkan nilai elemen array : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Elemen array ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i];
        }

        System.out.println("\nJumlah semua array = " + total);

    }
}
