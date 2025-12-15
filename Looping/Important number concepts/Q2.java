import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        int temp2=n;
        int digit=0;
        while(temp2!=0){
            temp2=temp2/10;
            digit++;
        }

        while(n!=0){
            int rem=n%10;
            sum+=Math.pow(rem,digit);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not an Amstrong Number");
        }}}