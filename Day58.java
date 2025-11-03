import java.util.Scanner;
public class day58 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai N : ");
    int n = input.nextInt();
    System.out.println("Angka 1 sampai " +n +": ");
    for (int i = 1; i <= n; i++){
      System.out.print(i + " ");
    }
    System.out.println("\nAngka " +n + " sampai 1: ");
    for (int i = n; i >= 1; i--){
      System.out.print(i + " ");
    }

  }
}
