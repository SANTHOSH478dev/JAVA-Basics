Q6. Write a Java program to print ASCII values from A–Z.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        for(char ch='A'; ch<='Z'; ch++){
            int asciiValue = (int) ch;
            System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        }
    }
}