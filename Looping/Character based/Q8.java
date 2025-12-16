
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            System.out.print(n % 2);
            n = n / 2;
        }
    }
}
