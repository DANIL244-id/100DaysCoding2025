import java.util.Scanner;
public class day35 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = input.nextInt();
    if (nilai < 0 || nilai > 100) {
        System.out.println("NILAI TIDAK VALID!");
    }else if (nilai >= 70) {
        System.out.println("LULUS");
    }else {
        System.out.println("TIDAK LULUS");
    }

    
  }

}
