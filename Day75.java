import java.util.Scanner;
public class day75 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
    System.out.print("Masukkan teks: ");
    String teks = p.nextLine();

    int panjang = teks.length();
    String h_besar = teks.toUpperCase();
    String h_kecil = teks.toLowerCase();
    System.out.println("Panjang teks : "+panjang);
    System.out.println("Huruf besar  : "+h_besar);
    System.out.println("Huruf kecil  : "+h_kecil);

  }

}
