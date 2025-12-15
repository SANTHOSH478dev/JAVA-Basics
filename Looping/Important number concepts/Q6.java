import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }}
            if(count==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
            int c=0;
            while(n!=0){
            c=c*10+(n%10);
            n=n/10;
            count=1;
            for(int i=2;i<=c/2;i++){
                if(c%i==0){
                    count=0;
                }
            }
            if(count==1){
                System.out.println("Twisted Prime");
            }
            else{
            System.out.println(" not Twisted Prime");
            }
    }}}