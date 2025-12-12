import java.util.Scanner;
public class day96 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka pertama : ");
    int c = input.nextInt();
    System.out.print("Masukkan angka kedua   : ");
    int d = input.nextInt();
    System.out.println("Penjumlahan : "+tambah(c,d));
    System.out.println("Pengurangan : "+kurang(c,d));
    System.out.println("Perkalian   : "+kali(c,d));
    System.out.println("Pembagian   : "+bagi(c,d));
  }
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(int a, int b) {
        if (b == 0){
           System.out.println("\nERROR! Pembagian dengan nol tidak bisa.");
           return 0;
     }
      return (double) a / b;
    }
}
