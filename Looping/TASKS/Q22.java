
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        int result = 0;
        for(int i=0; i<num2; i++){
            result += num1;
        }

        System.out.println("Product is: " + result);
    }
}