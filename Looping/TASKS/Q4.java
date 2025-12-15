//prd of digits of a given number
import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prd=1;
        while(n!=0){
            prd=prd*(n%10);
            n=n/10;
        }
        System.out.println(prd);
    }}