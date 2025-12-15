//adam number
import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        int revsquare=rev*rev;
        int revofrevsquare=0;
        while(revsquare!=0){
            revofrevsquare=revofrevsquare*10+(revsquare%10);
            revsquare=revsquare/10;
        }
        if(square==revofrevsquare){
            System.out.println("Adam Number");
        }
        else{
            System.out.println("Not an Adam Number");
        }}}