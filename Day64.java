import java.util.Scanner;
public class day64 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int m = p.nextInt();
        System.out.print("Masukkan nilai N: ");
        int n = p.nextInt();
        int jumlah = 1;

        for (int i = 1; i <= n; i++) {
            jumlah = jumlah * m;
        }
        System.out.println(m+" pangkat " +n + " adalah: " + jumlah);
  }
}
