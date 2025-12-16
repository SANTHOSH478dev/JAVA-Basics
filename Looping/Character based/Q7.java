import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();   // binary number

        int one = 0, zero = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                one++;
            else
                zero++;
        }

        System.out.println("Number of 1s: " + one);
        System.out.println("Number of 0s: " + zero);
    }
}
