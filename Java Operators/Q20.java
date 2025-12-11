import java.util.Scanner;
public class Q20{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int avg=(a+b+c)/3;
    if(avg>60){
        System.out.println("PASS");
    }
    else{
        System.out.println("FAIL");
    }
    }
}