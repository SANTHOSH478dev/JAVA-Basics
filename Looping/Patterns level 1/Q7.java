import java.util.Scanner;
public class Q6{    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;    
        int k=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j>=n-1){
                 if(i==0)
                    System.out.print(k++);
                else if(k%2==0){
                    System.out.print(k++ + "  ");
                    k++;
                }
                else{
                    System.out.print("   ");
                }
                k--;}}

               for(int j=0;j<n;j++){
                if(i>j){
                    if(k%2!=0)
                    System.out.print(k++ + "  ");
                    --k;
                }
                else{
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }}
