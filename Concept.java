import java.util.Scanner;

public class Concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int treeno = sc.nextInt();
        int col = treeno % cols;
        if (col == 0) {
            col = cols;
        }
        if (col == 2 || col == cols - 1) {
            System.out.println("It is a mango tree");
        } else {
            System.out.println("It is not a mango tree");
        }

    }
}
