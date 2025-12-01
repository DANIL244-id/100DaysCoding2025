import java.util.Scanner;
public class day85 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah array: ");
        int n = input.nextInt();

        int[] angka = new int[n];
        System.out.println("Masukkan nilai elemen array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Elemen ke-"+(i + 1)+" : ");
            angka[i] = input.nextInt();
        }

        int max = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Angka max dalam array adalah : "+max);
    }
}
