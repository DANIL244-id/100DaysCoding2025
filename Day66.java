import java.util.Scanner;
public class day66 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
        System.out.print("Masukkan tinggi pola(N): ");
        int n = p.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("#");
        }
  }
}
