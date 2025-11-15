import java.util.Scanner;
public class day69 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int h_dsr = 5000;
        System.out.print("");
        int berat = input.nextInt();
        int total_harga = h_dsr * berat;
        System.out.print("");
        int kualitas = input.nextInt();
        double harga2 = 0;
        int t_harga_a = 0;
        if (kualitas == 1){
            double naik = total_harga + (total_harga * 0.20);
            harga2 = naik;
        }else if (kualitas == 2){
            harga2 = total_harga; 
        }else if (kualitas == 3){
            double diskon = total_harga - (total_harga * 0.15);
            harga2 = diskon;
        }
        System.out.print("");
        int bersih = input.nextInt();
        if (bersih >= 70){
             t_harga_a = (int) harga2;
        }else{
            double diskon2 = harga2 - (harga2 * 0.10);
            t_harga_a = (int) diskon2;
        }
        System.out.println("Total yang diterima petani: Rp"+t_harga_a);
    }
}
