
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().toLowerCase();
        double ticketPrice;
        switch (day) {
            case "saturday":
            case "sunday":
                ticketPrice = 20.00; 
                break;
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                ticketPrice = 10.00; 
                break;
                
            default:
                System.out.println("Invalid day entered.");
                return;
    
        }System.out.println("Ticket price for " + day + " is $" + ticketPrice);
        }}

