import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234; 
        int entered = sc.nextInt();
        if (entered == storedPin) {
            System.out.println("PIN OK - Allow Withdrawal");
            int amt = sc.nextInt();
            System.out.println("Withdrawn = " + amt);
        } else {
            System.out.println("Wrong PIN");
        }
    }
}
