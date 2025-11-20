import java.util.Scanner;
public class day74 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
    int pilih;
    do {
      System.out.println("## MENU ##");
      System.out.println("1.Nasi");
      System.out.println("2.Lontong");
      System.out.println("3.Buras");
      System.out.println("4.Keluar");
      System.out.print("Pilih menu (1-4): ");
      pilih = p.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Anda memilih Nasi");
                    break;
                case 2:
                    System.out.println("Anda memilih Lontong");
                    break;
                case 3:
                    System.out.println("Anda memilih Buras");
                    break;
                case 4:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        } while (pilih != 4);
    }
}
