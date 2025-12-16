import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dec = 0, place = 1;

        while (n > 0) {
            dec = dec + (n % 10) * place;
            place = place * 2;
            n = n / 10;
        }

        System.out.println(dec);
    }
}
