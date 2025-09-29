import java.util.Scanner;
public class day22 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("masukkan panjang sisi persegi: ");
  int sisi = input.nextInt();

  int luas = sisi*sisi;
   
  System.out.println("luas persegi: "+luas);

 }

}
