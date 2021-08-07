import java.util.Scanner;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        //According to price food finder:

      Scanner give = new Scanner(System.in);
      System.out.println("Enter Your Amount (from 20 to 1000)");
      int amount = give.nextInt();
      System.out.print(" Your Can Buy :");
      give.close();

      if (20<=amount && 40>amount){
        System.out.println(" Drinks");
      }
      else if (40<=amount && 80>amount){
        System.out.println(" Burgers");
      }
      else if (80<=amount && 120>amount){
        System.out.println(" Breads");
      }
      else if (120<=amount && 200>amount){
        System.out.println(" Combo Packs");
      }
      else if (200<=amount && 500>amount){
        System.out.println(" Pizza's");
      }
      else if (500<=amount && 1000>amount){
        System.out.println(" king's Treat");
      }
      else{
        System.out.println("Whatever You want.");
      }
    }
}