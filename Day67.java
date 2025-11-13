import java.util.Scanner;
public class day67 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
        System.out.print("Masukkan panjang pola(N): ");
        int n = p.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("#");
        }
  }
}
