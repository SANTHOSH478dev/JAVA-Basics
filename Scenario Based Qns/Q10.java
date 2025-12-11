// Total Salary Calculation
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Basic = sc.nextInt();
        int HRA = sc.nextInt();
        int allowance = sc.nextInt();
        int total = Basic + HRA + allowance;
        System.out.println("Total Salary: " + total);
    }
}
