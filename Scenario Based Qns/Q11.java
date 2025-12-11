// Selling Price Calculation
import java.util.Scanner;
public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int profit = sc.nextInt();
        int sp = cp + profit;
        System.out.println("Selling Price: " + sp);
    }
}
