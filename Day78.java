public class day78 {
  public static void main (String[] args) {
    String teks = " Meguru Java ";

    System.out.println(teks.substring(1, 12));
    System.out.println(teks.replace("Java", "Python"));
    System.out.println(teks.trim());
    System.out.println(teks.equals("Meguru phyton"));
    System.out.println(teks.equalsIgnoreCase("Meguru Java"));
    System.out.println(teks.contains("Java"));
    System.out.println(teks.isEmpty());

  }

}
