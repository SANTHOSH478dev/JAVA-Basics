import java.util.*;
class Q2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  while(n>=10) n/=10;
  System.out.println(n%2==0?"Even":"Odd");
 }
}
