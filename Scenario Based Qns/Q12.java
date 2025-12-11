// Cost Price Calculation
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sp = sc.nextInt();
        int loss = sc.nextInt();
        int cp = sp + loss;
        System.out.println("Cost Price: " + cp);
    }
}
