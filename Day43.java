import java.util.Scanner;
public class day43 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka : ");
    int a = input.nextInt();
    if (a % 3 == 0 && a % 5 == 0){
      System.out.println("angka: "+a +" adalah kelipatan dari 3 dan 5");
    }else if (a % 3 == 0){
      System.out.println("angka: "+a +" adalah kelipatan dari 3");
    }else if (a % 5 == 0){
      System.out.println("angka: "+a +" adalah kelipatan dari 5");
    }else {
      System.out.println("angka: "+a +" bukan kelipatan dari 3 atau 5");
    }

  
   }

}
