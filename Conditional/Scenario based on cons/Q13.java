//display mobile battery status (full,moderate,low)
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the battery percentage: ");
        int batteryPercentage = sc.nextInt();

        if (batteryPercentage >= 75) {
            System.out.println("Battery Status: Full");
        } else if (batteryPercentage >= 30 && batteryPercentage < 75) {
            System.out.println("Battery Status: Moderate");
        } else {
            System.out.println("Battery Status: Low");
        }
    }
}