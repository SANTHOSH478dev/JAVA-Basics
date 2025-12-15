//factorial number
import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,fact=1;
    System.out.println("Enter a number:");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    System.out.println("Factorial of "+n+" is:"+fact);
}}