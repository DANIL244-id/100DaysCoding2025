import java.util.Scanner;
public class day61 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai kelipatan M : ");
    int m = input.nextInt();
    System.out.print("Masukkan nilai N : ");
    int n = input.nextInt();
    System.out.println("\nBilangan kelipatan " +m +" dari 1 sampai " +n +": ");
    for (int i = 1; i <= n; i++){
      if (i % m == 0){
        System.out.println(i + " ");
      }
    }

  }
}
