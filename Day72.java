import java.util.Scanner;
public class day72 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
        System.out.print("Masukkan tinggi(N): ");
        int tinggi = p.nextInt();
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
               System.out.print("* ");
            }
          System.out.println();
        }
  }
}
