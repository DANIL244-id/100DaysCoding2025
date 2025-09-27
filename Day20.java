public class day20 {
 public static void main(String[] args) {
   byte angka1 = 123;
   short angka2 = 1000;
   int angka3 = 2000;

  String a = String.valueOf(angka1);
  String b = Short.toString(angka2);
  String c = angka3 + "";

  System.out.println("byte ke String   = " +a);
  System.out.println("short ke String  = " +b);
  System.out.println("int ke String    = " +c);
   
 }

}
