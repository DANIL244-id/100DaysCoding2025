import java.util.Scanner;
public class day44 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = input.nextInt();
    System.out.println("Nilai anda: "+nilai);
    if (nilai < 0 || nilai > 100) {
      System.out.println("Nilai tidak valid");
    }else if (nilai >= 90) {
      System.out.println("Predikat: A");
    }else if (nilai >= 80) {
      System.out.println("Predikat: B");
    }else if (nilai >= 70) {
      System.out.println("Predikat: C");
    }else if (nilai >= 65) {
      System.out.println("Predikat: D");
    }else {
      System.out.println("Predikat: E");
    }

  }

}
    
