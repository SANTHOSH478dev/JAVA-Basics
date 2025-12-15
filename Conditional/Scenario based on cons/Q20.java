import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the vehicle speed in km/h: ");
        int speed = scanner.nextInt();

        if (speed > 100) {
            System.out.println("Overspeeding! Fine imposed.");
        } else {
            
            System.out.println("Speed is within the limit.");
        }
    }
}