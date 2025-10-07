import java.util.Scanner;
public class day30 {
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai a: ");
    int c = input.nextInt();
    System.out.print("Masukkan nilai b: ");
    int d = input.nextInt();

    System.out.println("Hasil >= : " + (c >= d));
    System.out.println("Hasil <= : " + (c <= d));

  }

}
