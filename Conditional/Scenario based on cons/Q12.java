
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = sc.nextDouble();

        if (temperature < 10) {
            System.out.println("Weather Condition: Cold");
        } else if (temperature >= 10 && temperature < 25) {
            System.out.println("Weather Condition: Pleasant");
        } else if (temperature >= 25 && temperature < 35) {
            System.out.println("Weather Condition: Hot");
        } else {
            System.out.println("Weather Condition: Heatwave");
        }
    }
}