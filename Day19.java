import java.util.Scanner;

public class day19 {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   System.out.println("masukkan int = ");
   long nilai_long = input.nextLong();
   byte nilai_byte = (byte) nilai_long;

  System.out.println("nilai long = " + nilai_long);
  System.out.println("long ke byte = " + nilai_byte);

  //Untuk menampilkan nilai MIN&MAX dari type data;
  System.out.println("\nnilai_min long: " + Long.MIN_VALUE);
  System.out.println("nilai_max long: " + Long.MAX_VALUE);
  System.out.println("\nnilai_min byte: " + Byte.MIN_VALUE);
  System.out.println("nilai_max byte: " + Byte.MAX_VALUE);

 }
  

}
