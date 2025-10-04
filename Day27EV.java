import java.util.Scanner;
public class day27 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("");
    int a = input.nextInt();
    System.out.println("");
    int b = input.nextInt();

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("" +a);
    System.out.println("" +b);

  }

}
