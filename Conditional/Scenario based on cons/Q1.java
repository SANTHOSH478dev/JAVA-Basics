import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount = 0;

        if (bill > 5000) discount = 0.20;
        else if (bill >= 500) discount = 0.10;
        else discount = 0.0;

        double finalAmount = bill - bill * discount;
        System.out.println("Discount = " + (int)(discount*100) + "%");
        System.out.println("Final Amount = " + finalAmount);
    }
}
