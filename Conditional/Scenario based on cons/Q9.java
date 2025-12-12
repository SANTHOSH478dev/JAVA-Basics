import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        int amt = sc.nextInt();

        if (amt > balance)
            System.out.println("No Money");
        else if (amt % 100 != 0)
            System.out.println("Enter 100 Multiple");
        else {
            balance = balance - amt;
            System.out.println("Balance = " + balance);
        }
    }
}

