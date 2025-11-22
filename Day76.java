public class day76 {
  public static void main (String[] args) {
    String teks = "Meguru Java";
    String teks2 = "java";

    System.out.println("Apakah sama? : " + teks.equals(teks2));
    System.out.println("equalsIgnoreCase? : " + teks.equalsIgnoreCase(teks2));
    System.out.println("contains? : " + teks.contains(teks2));
    System.out.println("Apakah String kosong? : " + teks.isEmpty());

  }

}
