import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int last =a%10;
        if(last%3==0){
            System.out.println("Last Divisble by 3");
        }
        else{
            System.out.println("Not divisble by 3");
        }
    }}