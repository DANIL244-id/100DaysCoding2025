import java.util.Scanner;
public class day45 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nama hari : ");
    String hari = input.nextLine();

    switch (hari) {
        case "senin":
        case "selasa":
        case "rabu":
        case "kamis":
        case "jumat":
      System.out.println(hari + " adalah hari kerja.");
      break;

        case "sabtu":
        case "minggu":
      System.out.println(hari + " adalah hari libur.");
      break;

      default:
        System.out.println("nama hari tidak valid.");

    }

  }

}
