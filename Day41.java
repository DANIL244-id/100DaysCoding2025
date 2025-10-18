import java.util.Scanner;
public class day41 {
  public static void main (String[] args) {
        System.out.println("Pilihan menu");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Goreng - Rp12.000");
        System.out.println("3. Ayam Bakar - Rp18.000");
        
        int nasi = 15000;
        int mie = 12000;
        int ayam = 18000;
                
        System.out.print("masukkan pilihan menu = ");
        int menu = input.nextInt();
        System.out.print("masukkan jumlah porsi = ");
        int porsi = input.nextInt();
        
        double diskon, total_diskon, total_diskon2;
        
        if (menu == 1){
            System.out.println("Menu: Nasi Goreng");
            int t_porsi = nasi * porsi;
            if (porsi > 2){
                diskon = t_porsi * 0.05;
                total_diskon = t_porsi - diskon;
                System.out.println("Jumlah: "+porsi);
                if (total_diskon > 50000){
                 diskon = t_porsi * 0.10;
                 total_diskon2 = t_porsi - diskon;
                    System.out.println("total harga = "+total_diskon2);
                }else{
                    System.out.println("total harga = "+total_diskon);
                } 
               
            }else if (porsi <= 2) {
                if (t_porsi > 50000){
                    diskon = t_porsi * 0.05;
                    total_diskon = t_porsi - diskon;
                    System.out.println("total harga = "+total_diskon);
                }else {
                    System.out.println("total harga = "+t_porsi);
                }
                
            }
                
        }else if (menu == 2){
            System.out.println("Menu: mie Goreng");
            int t_porsi = mie * porsi;
            if (porsi > 2){
                diskon = t_porsi * 0.05;
                total_diskon = t_porsi - diskon;
                System.out.println("Jumlah: "+porsi);
                if (total_diskon > 50000){
                 diskon = t_porsi * 0.10;
                 total_diskon2 = t_porsi - diskon;
                    System.out.println("total harga = "+total_diskon2);
                }else{
                    System.out.println("total harga = "+total_diskon);
                } 
               
            }else if (porsi <= 2) {
                if (t_porsi > 50000){
                    diskon = t_porsi * 0.05;
                    total_diskon = t_porsi - diskon;
                    System.out.println("total harga = "+total_diskon);
                }else {
                    System.out.println("total harga = "+t_porsi);
                }
            }
        }else if (menu == 3){
            System.out.println("Menu: Ayam Bakar");
            int t_porsi = ayam * porsi;
            if (porsi > 2){
                diskon = t_porsi * 0.05;
                total_diskon = t_porsi - diskon;
                System.out.println("Jumlah: "+porsi);
                if (total_diskon > 50000){
                 diskon = t_porsi * 0.10;
                 total_diskon2 = t_porsi - diskon;
                    System.out.println("total harga = "+total_diskon2);
                }else{
                    System.out.println("total harga = "+total_diskon);
                } 
               
            }else if (porsi <= 2) {
                if (t_porsi > 50000) {
                    diskon = t_porsi * 0.05;
                    total_diskon = t_porsi - diskon;
                    System.out.println("total harga = "+total_diskon);
                }else {
                    System.out.println("total harga = "+t_porsi);
                }
                
            }
        }else {
           System.out.println("TIDAK VALID!");
        }
        
        
    }
}
