import java.util.Scanner;
public class day73 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
        int total = 0;
        int angka;
    while (true) {
      System.out.print("Masukkan angka: ");
      angka = p.nextInt();

    if (angka < 0){
        break;
    }
      total += angka;
    }
    System.out.println("Total penjumlahan: "+total);

  }

}
