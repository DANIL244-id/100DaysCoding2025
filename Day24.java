import java.util.Scanner;
public class day24 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Masukkan jari-jari lingkaran: ");
      double r = input.nextDouble();
        
      double luas = Math.PI * r * r;
        
      System.out.println("Luas lingkaran dengan jari-jari " + r + "adalah = " +luas);

   }

}
