import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double surface = 2*3.14*r*(r+h);
        double volume = 3.14*r*r*h;
        System.out.println("Surface Area = " + surface);
        System.out.println("Volume = " + volume);
    }
}
