import java.util.Scanner;
public class day38 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = input.nextInt();
    if (angka > 0) {
        System.out.println(angka + " Adalah Bilangan Positif");
    }else if (angka < 0) {
        System.out.println(angka + " Adalah Bilangan Negatif");
    }else {
        System.out.println(angka + " Angka yang anda masukkan Adalah NOL");
    }

  }

}
