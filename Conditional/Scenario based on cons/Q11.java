// discount based on purchase Amount:
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        double discount =sc.nextDouble();
        double finalAmount=amt-discount;
        if (amt >= 500) 
              
        System.out.println("Final Amount = " + finalAmount);
        else if (amt>= 1500)
       
        System.out.println("Final Amount = " + finalAmount);
        else{
            System.out.println("NO discount applicable for this purchase amount:"+amt);
        }
    }
}
