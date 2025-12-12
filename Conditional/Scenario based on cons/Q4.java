import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percent = sc.nextInt(); 
        if (percent <= 20) 
        System.out.println("Low Battery");
        else if (percent <= 50) 
        System.out.println("50% Consumed");
        else 
        System.out.println("Battery Full");
    }
}
