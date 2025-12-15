//reverse a given number
import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,rev=0;
    System.out.println("Enter a number:");
    n=sc.nextInt();
    while(n!=0){
        rev=rev*10+(n%10);
        n=n/10;
    }
    System.out.println("Reversed Number is:"+rev);
}}
