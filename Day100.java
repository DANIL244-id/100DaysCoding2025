import java.util.Scanner;
public class day100 {
  public static void main (String[] args) {
    Scanner p = new Scanner(System.in);
    String s = p.nextLine().toUpperCase();
    boolean huruf_i = false;
    boolean huruf_s = false;
    boolean huruf_c = false;
        
    for (int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if (c == 'I' && !huruf_i){
            huruf_i = true;
        }else if (c == 'S' && huruf_i && !huruf_s){
             huruf_s = true;
        }else if (c == 'C' && huruf_i && huruf_s && !huruf_c){
            huruf_c = true;
            break;
        }
    }
    if (huruf_i && huruf_s && huruf_c){
        System.out.println("CANTIK");
    }else {
        System.out.println("TIDAK CANTIK");
   }
  }
}
