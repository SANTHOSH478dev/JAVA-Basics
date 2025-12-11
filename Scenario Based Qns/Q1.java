//Price After Discount
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = sc.nextDouble();
        
        double discountAmt = price * discount / 100;
        double finalPrice = price - discountAmt;
        
        System.out.println("Discount Amount: " + discountAmt);
        System.out.println("Final Price: " + finalPrice);
    }
}
