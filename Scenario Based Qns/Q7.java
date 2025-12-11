import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int students = sc.nextInt();
        int e= candies / students;
        int r = candies % students;
        
        System.out.println("Each Gets: " + e);
        System.out.println("Remaining: " + r);
    }
}
