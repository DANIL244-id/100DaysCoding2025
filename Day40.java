import java.util.Scanner;
public class day40 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("### KALKULATOR SEDERHANA ###");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        if (op == '+') {
            System.out.println("HASIL : " + (angka1 + angka2));
        } else if (op == '-') {
            System.out.println("HASIL : " + (angka1 - angka2));
        } else if (op == '*') {
            System.out.println("HASIL : " + (angka1 * angka2));
        } else if (op == '/') {
            if (angka2 != 0) {
                System.out.println("HASIL : " + (angka1 / angka2));
            } else {
                System.out.println("ERROR! Pembagian dengan nol tidak bisa.");
            }
        } else {
            System.out.println("Operator tidak valid!!");
        }
    }
}
