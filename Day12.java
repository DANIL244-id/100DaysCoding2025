import java.util.Scanner;

public class day12 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("...Biodata...");
   
    System.out.println("Nama : ");
    String Nama = input.nextLine();

    System.out.println("Umur : ");
    int Umur = input.nextInt();

    System.out.println("Alamat : ");
    String Alamat = input.nextLine();

    System.out.println("Tanggal_Lahir : ");
    short Tanggal_Lahir = input.nextShort();

    System.out.println("Uama.  :" +Nama);
    System.out.println("Umur   :" +Umur);
    System.out.println("Alamat :" +Alamat);
    System.out.println("Tanggal_Lahir :" +Tanggal_Lahir);


   }


}
