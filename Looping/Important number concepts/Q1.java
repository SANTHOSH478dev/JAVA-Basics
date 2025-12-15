
public class Q1 {
    public static void main(String[] args){
     
        int sum=0;
        int pro=1;
        int n;
        int a=0;
        for(int i=100;i<=2000;i++){
            a=0;
            n=i;
            sum=0;
            pro=1;
            while(n!=0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            } 
            pro=sum;
            while(pro!=0){
                int rem=pro%10;
                a=a*10+rem;
                pro=pro/10;
            }
            if((sum*a)==i){
                System.out.println("Magic Number: "+i);}}

    }
}