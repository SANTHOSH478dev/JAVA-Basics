// Split the Bill
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int each = bill / 3;
        System.out.println("Each Friend Pays: " + each);
    }
}
