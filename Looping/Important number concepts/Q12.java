import java.util.Scanner;
public class Q12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        int sq=n*n;//5=25
        int t=sq;//25
        int d=0;
        while(t>0){
            d++;
            t=t/10;//2>0
        }
        int p=(int)Math.pow(10,d);
        int r=sq%p;
        int q=sq/p;
        if((r+q)==n){
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n +  " is not a Kaprekar number.");
        }}}  