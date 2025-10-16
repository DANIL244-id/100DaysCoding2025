import java.util.Scanner;
public class day39 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("### WARUNG PA'BALU ###");
    System.out.println("=== MENU ===");
    System.out.println("1. Jalan kote");
    System.out.println("2. Paccal");
    System.out.println("3. Buras");
    System.out.println("4. Jepa");
    System.out.println("Silahkan pilih menu (1-4) : ");
    int pilih = input.nextInt();
    if (pilih == 1) {
        System.out.println("Anda memilih Jalan kote");
    }else if (pilih == 2) {
        System.out.println("Anda memilih Paccal");
    }else if (pilih == 3) {
        System.out.println("Anda memilih Buras");
    }else if (pilih == 4) {
        System.out.println("Anda memilih Jepa");
    }else {
        System.out.println("Pilihan anda tidak valid");
    }

  }

}
