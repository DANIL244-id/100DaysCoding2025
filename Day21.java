public class day21 {
  public static void main (String[] args) {
    int a = 50;
    int b = 10;

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("a = " +a);
    System.out.println("b = " +b);
    
  }

}
