//   total cakes made
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakesPerHour = sc.nextInt();
        int hours = sc.nextInt();
        int total = cakesPerHour*hours;
        System.out.println("Total Cakes: " + total);
    }
}
