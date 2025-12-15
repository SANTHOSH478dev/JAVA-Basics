import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0;
        int c=n;
        while(n!=0){
            b=b+(n%10);
            n/=10;
        }
        if(c%b==0){
            System.out.println("Hashad no");

        }
        else{
             System.out.println(" not Hashad no");
        }}}
    