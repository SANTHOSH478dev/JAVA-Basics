// Mango Purchase Calculation
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int buy = sc.nextInt();
        int free = buy / 3;
        int total = buy + free;
        int amount = buy * price;

        System.out.println("Total Mangoes: " + total);
        System.out.println("Amount: " + amount);
    }
}
