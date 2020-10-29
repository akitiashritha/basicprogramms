import java.text.NumberFormat;
import java.util.Locale;
public class Demoj {
   public static void main(String[] args) {
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
      System.out.println(n);
   }
}