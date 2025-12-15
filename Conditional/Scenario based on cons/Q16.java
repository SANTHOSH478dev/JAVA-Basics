
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        if (mobileNumber.length() == 10 && mobileNumber.matches("\\d+")) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number (not exactly  10 digits)");
        }
    }

}