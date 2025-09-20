import java.util.Scanner;

public class day13 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.println("---BIODATA---");

   System.out.println("nama: ");
   String nama = input.nextLine();

   System.out.println("umur: ");
   int umur = input.nextInt();
   input.nextLine();

   System.out.println("alamat: ");
   String alamat = input.nextLine();

   System.out.println("Nama    :" +nama);
   System.out.println("Umur    :" +umur + " tahun");
   System.out.println("Alamat  :" +alamat);


  }


}
