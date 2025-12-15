
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vehicle speed in km/hr: ");
        int speed = sc.nextInt();

        if (speed > 100) {
            System.out.println("Speed Exceeded: Yes");
        } else {
            System.out.println("Speed Exceeded: No");
        }
    }
}