import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(i==n-1||j==n-1||i==0||j==0){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
                System.out.println();
        }int a=1;
                for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                if(i==n-1||j==n-1||i==0||j==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print((a++)+" ");
                }
            }

        
            
            System.out.println();
        }
    }
}