import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char start = sc.next().charAt(0);
        char end = sc.next().charAt(0);

        System.out.print("Vowels: ");
        for (char ch = start; ch <= end; ch++) {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.print(ch+" ");
        }

        System.out.print("\nConsonants: ");
        for (char ch = start; ch <= end; ch++) {
            if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                if (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                      ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
                    System.out.print(ch+" ");
        }
    }
}

