import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next().toLowerCase();
        if (c.equals("red"))
            System.out.println("Stop");
        else if (c.equals("yellow"))
            System.out.println("Ready");
        else if (c.equals("green"))
            System.out.println("Go");
        else
            System.out.println("Invalid");
    }
}
