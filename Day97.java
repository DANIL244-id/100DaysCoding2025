import java.util.Scanner;
public class day97 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan sisi persegi : ");
    int sisi = input.nextInt();
    int hasil = luaspersegi(sisi);
    System.out.println("Luas persegi = "+hasil);
 }
  public static int luaspersegi(int s) {
    return s * s;
 }
}
