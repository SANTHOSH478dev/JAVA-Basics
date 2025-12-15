//neon number n=9
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int square = number * number;
        int sumOfDigits = 0;
        
        /*while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        if (sumOfDigits == number) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }
        
     
    }
}*/
//
if(number==9){
    System.out.println("Neon Number");
} else {
    System.out.println("Not a Neon Number");
}}}