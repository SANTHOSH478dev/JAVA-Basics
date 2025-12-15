
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int n=sc.nextInt();
        int sum=0;
        int temp=n;

        while(n!=0){
            int rem=n%10;//145/5
            int fact=1;
            for(int i=1;i<=rem;i++){//i<=5
                fact=fact*i;//i=1 fact=1*1=1; i=2 fact=1*2=2; i=3 fact=2*3=6; i=4 fact=6*4=24; i=5 fact=24*5=120
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp){//
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        }
}