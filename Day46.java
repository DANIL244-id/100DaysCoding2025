import java.util.Scanner;
public class day46 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("=== DAFTAR MENU ===");
    System.out.println("1. Bakso");
    System.out.println("2. Mie ayam");
    System.out.println("3. Ayam kecap");
    System.out.println("4. Ayam geprek");
    
    System.out.print("Masukkan menu pilihan(1-4) : ");
    int menu = input.nextInt();
    double harga = 0;

    switch (menu) {
        case 1:
        harga = 10000;
        System.out.println("Menu : Bakso");
        break;
      case 2:
        harga = 12000;
        System.out.println("Menu : Mie ayam");
        break;
      case 3:
        harga = 11000;
        System.out.println("Menu : Ayam kecap");
        break;
      case 4:
        harga = 10000;
        System.out.println("Menu : Ayam geprek");
        break;

      default:
        System.out.println("Pilihan tidak valid.");

    }
      System.out.print("Masukkan jumlah porsi : ");
      int porsi = input.nextInt();
      double total = harga * porsi;
      System.out.println("Total harga : Rp"+total);
  }

}
