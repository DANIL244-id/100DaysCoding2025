import java.util.Scanner;
public class day47 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("== PROGRAM UNTUK MENENTUKAN HARI ==");
    System.out.print("Masukkan angka(1-7) : ");
    int angka = input.nextInt();
    String hari;
    switch (angka) {
        case 1:
        hari = "Senin.";
        System.out.println("Hari ke-" +angka + " adalah hari " +hari);
        break;
        case 2:
        hari = "Selasa.";
        System.out.println("Hari ke-" +angka + " adalah hari " +hari);
        break;
        case 3:
        hari = "Rabu.";
        System.out.println("Hari ke-" +angka + " adalah hari " +hari);
        break;
        case 4:
        hari = "Kamis.";
        System.out.println("Hari ke-" +angka + " adalah hari " +hari);
        break;
        case 5:
        hari = "Jumat.";
        System.out.println("Hari ke-" +angka + " adalah hari " +hari);
        break;
        case 6:
        hari = "Sabtu.";
        System.out.println("Hari ke-" +angka + " adalah hari " +hari);
        break;
        case 7:
        hari = "Minggu.";
        System.out.println("Hari ke-" +angka + " adalah hari " +hari);
        break;
      
      default:
        hari = "Angka tidak valid!!";
        System.out.println(hari);
    }

  }

}
