import java.util.Scanner;
public class day82 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
    System.out.print("Masukkan nilai array : ");
    int a = p.nextInt();
    int[] angka = new int[a];
    
    for (int i = 0; i < angka.length; i++) {
       System.out.print("Masukkan nilai ke " + (i+1) + " : ");
       angka[i] = p.nextInt();
    }
    
    System.out.println("Isi Array :");
    for (int i = 0; i < angka.length; i++) {
       System.out.println(angka[i]);
    }

  }
}
