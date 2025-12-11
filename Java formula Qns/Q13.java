import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double surface = 2 * (l*b + b*h + h*l);
        double volume = l * b * h;
        System.out.println("Surface Area = " + surface);
        System.out.println("Volume = " + volume);
    }
}
