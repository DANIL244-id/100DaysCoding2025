import java.util.Scanner;
public class day31 {
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai a: ");
    int a = input.nextInt();

    System.out.println("Hasil : " + (a >= 75 && a <= 100));

  }

}
