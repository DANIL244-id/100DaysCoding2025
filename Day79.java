import java.util.Scanner;
public class day79 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
    String user = "admin";
    String pass = "123";
    boolean login = false;
    while (!login){
         System.out.print("Masukkan username: ");
         String username = p.nextLine();
         System.out.print("Masukkan password: ");
         String password = p.nextLine();
         if (username.equals(user) && password.equals(pass)) {
           System.out.println("Login berhasil");
           login = true;
         }else{
           System.out.println("Username atau password salah. Coba lagi.");
         }

    }
    
    }
}
