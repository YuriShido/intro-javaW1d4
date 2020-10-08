
public class ConvertMileToKilometers {

    public static void main(String[] args) {

      System.out.println("Miles   Kilometers");

      for(int i = 1; i < 10; i++) {
        double Kilometers = i * 1.609;
        System.out.println(i + "       "  + Kilometers);
      }
      System.out.println(10 + "      " + 10 * 1.609);

    }
}