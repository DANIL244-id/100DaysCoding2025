import java.util.Scanner;
public class day79 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
    String pass = "123";
    boolean login = false;
    while (!login){
         System.out.print("Masukkan password: ");
         String password = p.nextLine();
         if (password.equals(pass)) {
           System.out.println("Login berhasil");
           login = true;
         }else{
           System.out.println("Password salah. Coba lagi.");
         }

    }
    
    }
}
