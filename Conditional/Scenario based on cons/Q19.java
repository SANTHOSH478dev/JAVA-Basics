import java.util.Scanner;
public class Q19 {
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        if(data<=20){
            System.out.println("Low data");
        }
        else if(data>20 && data<=50){
            System.out.println("Half data consumed");
        }
        else{
            System.out.println("Full data consumed");
        }
    }}