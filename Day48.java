import java.util.Scanner;
public class day48 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        double angka = input.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /) : ");
        char op = input.next().charAt(0);
        System.out.print("Masukkan angka kedua   : ");
        double angka2 = input.nextDouble();
        switch (op){
            case '+':
                System.out.println("Hasil : "+(angka + angka2));
                break;
            case '-':
                System.out.println("Hasil : "+(angka - angka2));
                break;
            case '*':
                System.out.println("Hasil : "+(angka * angka2));
                break;
            case '/':
                if (angka2 != 0 ){
                    System.out.println("Hasil : "+(angka / angka2));
                }else {
                    System.out.println("ERROR! Pembagian dengan nol tidak bisa");
                }
                break;
            default:
                System.out.println("Operator tidak valid!!");
                    
        }
    }
}
