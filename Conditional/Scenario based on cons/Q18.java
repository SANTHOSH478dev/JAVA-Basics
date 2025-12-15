import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter water consumption in liters: ");
        int slabrates = scanner.nextInt();
        double billAmount = 0.0;

        if (slabrates <= 1000) {
            billAmount = 0.0;
        } else if (slabrates <= 2000) {
            billAmount = (slabrates - 1000) * 5.0 / 1000;
        } else {
            billAmount = (2000 - 1000) * 5.0 / 1000 + (slabrates - 2000) * 10.0 / 1000;
        }

        System.out.println("Total water bill: " + billAmount);
    }
}