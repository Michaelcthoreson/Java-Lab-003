/**
 * @author Trevor Hartman
 * @author Michael Thoreson
 *
 * @since 1.0
 */
import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();
        double numberC = (number - (double)32) * (double)5 / (double)9;
        System.out.println(number + "°F");
        System.out.println(numberC);
        System.out.printf("%.0f \n", numberC);
        System.out.println("If it were 2°C warmer it would be: " + (numberC+2));
    }
}
