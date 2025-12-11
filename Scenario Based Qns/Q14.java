// Pen purchase calculation with "Buy 5 Pay for 3" offer
import java.util.Scanner;
class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();   
        int buy = sc.nextInt();     
        int sets = buy / 5;         
        int rem = buy % 5;          
        int payFor = (sets * 3) + rem;
        int amount = payFor * price;
        System.out.println("Pay For: " + payFor);
        System.out.println("Total Amount: " + amount);
    }
}
