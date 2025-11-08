import java.util.Scanner;
public class day62 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
    System.out.print("Masukkan nilai N: ");
        int n = p.nextInt();
        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            jumlah = jumlah + i;
        }
        System.out.println("Jumlah dari 1 sampai " +n + " adalah: " + jumlah);
  }
}
