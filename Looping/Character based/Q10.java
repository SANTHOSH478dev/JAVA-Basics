
import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            char lowerCh=(char)(ch + 32);
            System.out.println("Lowercase: " + lowerCh);
        } else {
            System.out.println("Input character is not an uppercase letter.");
        }
    }
}