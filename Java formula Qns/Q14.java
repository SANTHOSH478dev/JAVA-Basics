import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double surface = 4*3.14*r*r;
        double volume = (4/3)*3.14*r*r*r;
        System.out.println("Surface Area = " + surface);
        System.out.println("Volume = " + volume);
    }
}
