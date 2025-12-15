import java.util.Scanner;
public class Q14{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the passenger age: ");
        int age = sc.nextInt();

        if (age < 12) {
            System.out.println("Ticket Price Category: Child(25 rs)");
        } else if (age >= 12 && age < 60) {
            System.out.println("Ticket Price Category: Adult(100 rs)");
        } else {
            System.out.println("Ticket Price Category: Senior(50 rs)");
        }
    }
}