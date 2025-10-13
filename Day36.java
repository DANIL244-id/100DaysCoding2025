import java.util.Scanner;
public class day36 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = input.nextInt();
    if (nilai >= 70) {
        if (nilai > 79) {
         System.out.println("LULUS, nilai: A"); 
        }else {
          System.out.println("LULUS");
       }
     }else {
         System.out.println("TIDAK LULUS");
    }
  }

}
