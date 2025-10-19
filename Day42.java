import java.util.Scanner;
public class day42 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Gaji Pokok : ");
    double gaji_pokok = input.nextDouble();
    double pajak = 0.05;

    double gaji_bersih = gaji_pokok - (gaji_pokok * pajak);
    System.out.println("Gaji Bersih : Rp"+gaji_bersih);

  }
  
}
