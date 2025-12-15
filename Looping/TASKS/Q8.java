
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        int max = (num1 > num2) ? num1 : num2;
        int lcm = max;

        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                break;
            }
            lcm++;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}